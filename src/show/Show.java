package show;

import person.Actor;
import person.Director;
import java.util.ArrayList;

//Класс спектакль (переменные - название спектакля, длительность в минутах, имя режиссера, список актеров)
public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.print("Актер уже в списке");
            return;
        }
        listOfActors.add(actor);
    }

    public void printActors() {
        System.out.printf("Список актеров %s:\n", title);
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void printDirector() {

    }

    public void replaceActorBySurname(String surname, Actor newActor) {
        int count = 0;
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Найдено несколько актёров с фамилией " + surname + ". Замена отменена.");
        } else if (count == 1) {
            for (int i = 0; i < listOfActors.size(); i++) {
                Actor actor = listOfActors.get(i);
                if (actor.getSurname().equals(surname)) {
                    listOfActors.set(i, newActor);
                    System.out.println("Актёр с фамилией " + surname + " успешно заменён.");
                    break;
                }
            }
        } else {
            System.out.println("Актёр с фамилией " + surname + " не найден в списке.");
        }
    }
}
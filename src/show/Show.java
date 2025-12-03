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
        //   System.out.println(director.toString());
    }

    public void replaceActorBySurname(String surname, Actor newActor) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                found = true;
            } else {
                System.out.println("Найдено несколько актёров с фамилией " + surname + ". Замена отменена.");
                return;
            }
        }
        if (!found) {
            System.out.println("Актёр с фамилией " + surname + " не найден в списке.");
        } else {
            System.out.println("Актёры с фамилией " + surname + " успешно заменены.");
        }
    }

}
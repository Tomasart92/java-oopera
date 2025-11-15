package show;

import person.Actor;
import person.Director;
import java.util.ArrayList;

//Класс спектакль (переменные - название спектакля, длительность в минутах, имя режиссера, список актеров)
public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    ArrayList<Actor> listOfActors;

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
}
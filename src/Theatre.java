import person.Actor;
import person.Director;
import person.Gender;
import show.Ballet;
import show.MusicalShow;
import show.Show;
import java.util.ArrayList;

public class Theatre {

    public static void main (String[] args) {

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 200);
        Actor actor2 = new Actor("Анастасия", "Настасьева", Gender.FEMALE, 155);
        Actor actor3 = new Actor("Николай", "Николаев", Gender.MALE, 170);

        Director director1 = new Director("Дарья", "Данцова", Gender.FEMALE, 6);
        Director director2 = new Director("Александр", "Александров", Gender.MALE, 12);

        ArrayList<Actor> actorsList = new ArrayList<>();
        actorsList.add(actor1);
        actorsList.add(actor2);

        ArrayList<Actor> actorsList2 = new ArrayList<>();
        actorsList2.add(actor2);
        actorsList2.add(actor3);

        Show drama = new Show("Шоу драма", 187, director1, actorsList);

        MusicalShow musiccalDrama = new MusicalShow("Мыльная драма", 120, director2, actorsList2,
                "Александр Есенин", "Здесь должен быть текст либретто");

        Ballet ballet = new Ballet("Балет балетный", 140, director1, actorsList2, "Александр Есенин",
                "Здесь должен быть текст либретто", "Джимми Ача");

        drama.printActors();
        musiccalDrama.printActors();
        musiccalDrama.printDetails();
        ballet.printActors();
        musiccalDrama.printDetails();
        drama.printDirector();
    }
}
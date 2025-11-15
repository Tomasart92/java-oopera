package show;

import person.Actor;
import person.Director;
import java.util.ArrayList;

public class Opera extends MusicalShow {

    //Класс наследник от MusicalShow, с переменной количества человек в хоре
    private int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                 String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}

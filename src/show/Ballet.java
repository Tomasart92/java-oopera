package show;

import person.Actor;
import person.Director;
import java.util.ArrayList;

public class Ballet extends MusicalShow { //Класс наследник от MusicalShow с переменной Хореограф

    private String choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, String musicAuthor, //конструктор класса
                  String librettoText, String choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }
}

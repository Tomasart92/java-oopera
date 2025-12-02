package show;

import person.Actor;
import person.Director;
import java.util.ArrayList;

public class MusicalShow extends Show {
    // Создаём класс (родитель с наследниками Opera и Ballet) музыкальных постановок, с переменными - автор музыки, текст либретто
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                       String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }
    public void printDetails() {
            System.out.println("Автор музыки: " + musicAuthor);
            System.out.println("Текст либретто: " + librettoText);
        }
    }
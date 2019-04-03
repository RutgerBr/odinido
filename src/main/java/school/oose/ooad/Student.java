package school.oose.ooad;

import java.util.ArrayList;

public class Student
{
    private String naam;
    private ArrayList<Antwoord> antwoorden = new ArrayList<Antwoord>();

    public Student(String naam)
    {
        this.naam = naam;
    }

    public void vulVraagIn(String gegevenAntwoord)
    {
        Antwoord antwoord = new Antwoord(gegevenAntwoord);

        voegAntwoordToe(antwoord);
    }

    private void voegAntwoordToe(Antwoord antwoord)
    {
        antwoorden.add(antwoord);
    }
}

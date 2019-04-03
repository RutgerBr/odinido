package school.oose.ooad;

import java.util.ArrayList;

public class OpenVraag extends Vraag
{
    private ArrayList<Antwoord> antwoorden;

    public OpenVraag(String vraag)
    {
        super(vraag);
        antwoorden = new ArrayList<Antwoord>();
    }

    public void voegAntwoordToe(String antwoord)
    {
        this.antwoorden.add(new Antwoord(antwoord));
    }
}
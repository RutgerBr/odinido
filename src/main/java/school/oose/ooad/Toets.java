package school.oose.ooad;

import java.util.ArrayList;

public class Toets
{
    private String code;
    private String naam;

    private ArrayList<Vraag> vragen;

    public Toets(String code, String naam)
    {
        this.code = code;
        this.naam = naam;
        this.vragen = new ArrayList<Vraag>();
    }

    public void voegVraagToe(Vraag Vraag)
    {
        vragen.add(Vraag);
    }

    public Vraag getVraag(int vraagnr)
    {
        if (vraagnr >= vragen.size())
        {
            return null;
        }
        else
        {
            return vragen.get(vraagnr);
        }
    }

    public ArrayList<Vraag> getVragen()
    {
        return vragen;
    }
}

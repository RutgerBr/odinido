package school.oose.ooad;

import java.util.ArrayList;

public class ToetsUitvoering
{
    private String toetscode;
    private String datum;
    private int huidigeVraag;
    private ArrayList<Student> deelnemers;

    public ToetsUitvoering(String toetscode, String datum, ArrayList<Student> deelnemers)
    {
        this.toetscode = toetscode;
        this.datum = datum;
        this.deelnemers = deelnemers;
    }


    public String geefVraag(Toets toets)
    {
        Vraag vraag = toets.getVraag(huidigeVraag++);
        String returnVraag;

        if (vraag == null)
        {
            return null;
        }

        returnVraag = huidigeVraag + ": " + vraag.getVraag() + "\n\n";

        if (vraag instanceof Meerkeuzevraag)
        {
            returnVraag += ((Meerkeuzevraag) vraag).getKeuzes();
        }

        return returnVraag;
    }
}
package school.oose.ooad;

import java.util.ArrayList;

public class Meerkeuzevraag extends Vraag
{
    private ArrayList<Keuze> keuzes;

    public Meerkeuzevraag(String vraag)
    {
        super(vraag);
        keuzes = new ArrayList<Keuze>();
    }

    public void voegAlternatiefToe(String antwoord, boolean correctAntwoord)
    {
        keuzes.add(new Keuze(antwoord));
    }

    public String getKeuzes()
    {
        StringBuilder returnString = new StringBuilder();

        for (int i = 0; i < keuzes.size(); i++)
        {
            returnString.append("- ").append(keuzes.get(i).getKeuze()).append("\n");
        }
        return returnString.toString();
    }
}
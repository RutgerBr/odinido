package school.oose.ooad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Odinido
{
    public static void main(String[] args)
    {
        Odinido console = new Odinido();
        console.vulVraagIn();
    }

    private void vulVraagIn()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        OdinidoToetsbank toetsbank = new OdinidoToetsbank();
        Toets toets = toetsbank.maakToetsODI23644129();

        Student student = new Student("Rutger");
        ArrayList<Student> studenten = new ArrayList<Student>();
        studenten.add(student);

        ToetsUitvoering toetsUitvoering = new ToetsUitvoering("ODI23644129", "15:00:00:01-04-2019", studenten);

        String volgendeVraag;
        while ((volgendeVraag = toetsUitvoering.geefVraag(toets)) != null)
        {
            System.out.println(volgendeVraag);
            try
            {
                input = reader.readLine();
            } catch (IOException e)
            {
                e.printStackTrace();
            }

            if ("Stop toets".equalsIgnoreCase(input))
            {
                break;
            }
            student.vulVraagIn(input);
        }

        System.out.println("Einde toets");
    }
}

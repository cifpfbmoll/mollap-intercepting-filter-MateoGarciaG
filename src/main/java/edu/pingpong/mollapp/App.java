package edu.pingpong.mollapp;

import edu.pingpong.mollapp.administrator.ProgrammerTasks;
import edu.pingpong.mollapp.clients.Mollapp;
import edu.pingpong.mollapp.filters.Authentication;
import edu.pingpong.mollapp.filters.Autorization;
import edu.pingpong.mollapp.targets.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.
         */
        ProgrammerTasks programmerTasks = new ProgrammerTasks(new Vehicle());

        /**
         * Afegir al sistema les tasques que volem que el sistema
         * executi al rebre la petició del client.
         */
        programmerTasks.setTask(new Authentication());
        programmerTasks.setTask(new Autorization());

        /**
         * Configuració de l'app client per a que
         * executi les tasques programades i
         * enviï el misstage al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setProgrammerTasks(programmerTasks);
        mollapp.sendRequest("Francesc");
    }
}

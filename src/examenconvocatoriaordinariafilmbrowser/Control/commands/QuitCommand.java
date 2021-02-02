package examenconvocatoriaordinariafilmbrowser.Control.commands;

import static java.lang.System.exit;

/**
 *
 * @author Antonio Miguel Martel
 */
public class QuitCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Cerrando aplicacion.");
        exit(0);
    }
    
    
    
}

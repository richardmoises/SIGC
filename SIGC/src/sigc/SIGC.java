package sigc;

import Vistas.Principal;
import java.io.File;

/**
 * @author RICHARD Modificado por Richard
 */
public class SIGC {

    public static void main(String[] args) {
        // mostrando la ventana principal de nuestra aplicacion
        Principal oPrincipal = new Principal();
        oPrincipal.setVisible(true);

        File fichero = new File("");
        System.out.println("La ruta del fichero es: " + fichero.getAbsolutePath());

    }

}

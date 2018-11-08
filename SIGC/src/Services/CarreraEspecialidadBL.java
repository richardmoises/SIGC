package Services;

import Beans.CarreraEspecialidadBE;
import DAO.CarreraEspecialidadDA;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CESDEDOCLAB04
 */
public class CarreraEspecialidadBL {

    public List<CarreraEspecialidadBE> listarCarrera() {

        CarreraEspecialidadDA oCarreraEspecialidadDA = new CarreraEspecialidadDA();
        //se guarda la lista en oListaUsuarioBE
        List<CarreraEspecialidadBE> oListaCarreraEspecialidadBE = oCarreraEspecialidadDA.listarCarreras();

        //retornando la lista UsuarioBE
        return oListaCarreraEspecialidadBE;

    }

    public CarreraEspecialidadBE findcarrerasById(int id) {

        CarreraEspecialidadDA oCarreraEspecialidadDA = new CarreraEspecialidadDA();
        CarreraEspecialidadBE oCarreraEspecialidadBE = new CarreraEspecialidadBE();

        oCarreraEspecialidadBE = oCarreraEspecialidadDA.findCarreraById(id);

        return oCarreraEspecialidadBE;
    }

    public CarreraEspecialidadBE updateCarrera(CarreraEspecialidadBE oCarreraEspecialidadBE) {

        CarreraEspecialidadDA oCarreraEspecialidadDA = new CarreraEspecialidadDA();
        //extraer los compos para realizar las modificaciones 
        String carrera, descripcion, estado;

        carrera = (oCarreraEspecialidadBE.getCarrera());
        descripcion = (oCarreraEspecialidadBE.getDescripcion());
        estado = (oCarreraEspecialidadBE.getEstado() + "");

        // si al menos un   campo no debe  estár vacio, el foco apunta a q debe 
        //tener los datos  para poder actualizar.
        if (carrera.equals("") || descripcion.equals("")
                || estado.equals("")) {
            //realiza la comparacion para poder hacer la actualizacion
            oCarreraEspecialidadBE.setIndOpSp(3);
            return oCarreraEspecialidadBE;
        } else {
            CarreraEspecialidadBE resultados = oCarreraEspecialidadDA.updatecarrera(oCarreraEspecialidadBE);
            return resultados;
        }
    }

    public CarreraEspecialidadBE addCarrera(CarreraEspecialidadBE oCarreraEspecialidadBE) {

        CarreraEspecialidadDA oCarreraEspecialidadDA = new CarreraEspecialidadDA();
        String carrera, descripcion;
        boolean estado;

        carrera = (oCarreraEspecialidadBE.getCarrera());
        descripcion = (oCarreraEspecialidadBE.getDescripcion());
        estado = (oCarreraEspecialidadBE.getEstado());

        if (carrera.equals("") || descripcion.equals("")) {

            oCarreraEspecialidadBE.setIndOpSp(2);
            return oCarreraEspecialidadBE;
        } else {
            return oCarreraEspecialidadDA.addCarrera(oCarreraEspecialidadBE);
        }
    }

}

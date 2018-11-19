/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.CarreraEspecialidadBE;
import Services.RolBL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CESDEDOCLAB04
 */
public class CarreraEspecialidadDA {

     //se realiza la coneccion a la base de datos 
    
    
    UtilDAO utilDao = new UtilDAO();

    public List<CarreraEspecialidadBE> listarCarreras() {

        ArrayList<CarreraEspecialidadBE> listarCarrera = new ArrayList<>();
        UtilDAO oUtilDAO = new UtilDAO();

        oUtilDAO.ejecutarQuery("select * from especialidad  ");

        ResultSet resultados = oUtilDAO.ejecutarQuery("select * from especialidad  ");

        try {
            while (resultados.next()) {

                CarreraEspecialidadBE oCarreraEspecialidadBE = new CarreraEspecialidadBE();

                int id = resultados.getInt("id");
                String carrera = resultados.getString("carrera");
                String descripcion = resultados.getString("descripcion");
                boolean estado = resultados.getBoolean("estado");

                oCarreraEspecialidadBE.setId(id);
                oCarreraEspecialidadBE.setCarrera(carrera);
                oCarreraEspecialidadBE.setDescripcion(descripcion);
                oCarreraEspecialidadBE.setEstado(estado);

                listarCarrera.add(oCarreraEspecialidadBE);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        //retorna listarCarrera
        return listarCarrera;

    }

    public CarreraEspecialidadBE findCarreraById(int id) {

        //se realiza la coneccion a la base de datos y 
        //se obtiene una carrera en la cual tiene 
        //el id enviado
        CarreraEspecialidadBE oCarreraEspecialidadBE = new CarreraEspecialidadBE();

        ResultSet resultados = utilDao.ejecutarQuery(
                "select * from especialidad where id = " + id + ";");

        try {

            while (resultados.next()) {

                int idCarrera = resultados.getInt("id");
                String carrera = resultados.getString("carrera");
                String descripcion = resultados.getString("descripcion");
                boolean estado = resultados.getBoolean("estado");

                oCarreraEspecialidadBE.setId(idCarrera);
                oCarreraEspecialidadBE.setCarrera(carrera);
                oCarreraEspecialidadBE.setDescripcion(descripcion);
                oCarreraEspecialidadBE.setEstado(estado);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//retorna oCarreraEspecialidadBE
        return oCarreraEspecialidadBE;
    }

    public CarreraEspecialidadBE updatecarrera(CarreraEspecialidadBE oCarreraEspecialidadBE) {

        //se realiza la coneccion a la base de datos 
        UtilDAO oUtilDAO = new UtilDAO();

        try {
            String cadquery = ("update especialidad "
                    + " set carrera = '" + oCarreraEspecialidadBE.getCarrera() + "' "
                    + " ,descripcion = '" + oCarreraEspecialidadBE.getDescripcion() + "' "
                    + " ,estado = '" + oCarreraEspecialidadBE.getEstado() + "' "
                    + " where id= " + oCarreraEspecialidadBE.getId() + ";");

            int cad = oUtilDAO.ejecutarUpdate(cadquery);

            System.out.println("resultado" + cad);

            oCarreraEspecialidadBE.setIndOpSp(1);

            //se realiza la comprobacion de la actualizacion.
            //  retorna uno (1) cuando la insercion se completa
            //   y dos (2) cuando la insercion falla
            if (cad == 1) {
                oCarreraEspecialidadBE.setIndOpSp(1);
            } else {
                oCarreraEspecialidadBE.setIndOpSp(2);
            }

        } catch (Exception e) {
            oCarreraEspecialidadBE.setIndOpSp(2);
        }
        //retorna oCarreraEspecialidadBE
        return oCarreraEspecialidadBE;
    }

    public CarreraEspecialidadBE addCarrera(CarreraEspecialidadBE cCarreraEspecialidadBE) {

        //se realiza la coneccion a la base de datos 
        CarreraEspecialidadBE oCarreraEspecialidadBE = new CarreraEspecialidadBE();

        try {

            int resultados = utilDao.ejecutarInsert("insert into "
                    + " especialidad(carrera,descripcion,estado) values ("
                    + "'" + cCarreraEspecialidadBE.getCarrera() + "'"
                    + ", '" + cCarreraEspecialidadBE.getDescripcion() + "'"
                    + ", '" + cCarreraEspecialidadBE.getEstado() + "');");

            oCarreraEspecialidadBE = findCarreraById(resultados);

        //se realiza la comprobacion de una nueva carrera.
        //  retorna uno (1) cuando la insercion se completa
        //   y dos (2) cuando la insercion falla
            oCarreraEspecialidadBE.setIndOpSp(1);

        } catch (Exception e) {
            oCarreraEspecialidadBE.setIndOpSp(2);
        }

        //retorna oCarreraEspecialidadBE
        return oCarreraEspecialidadBE;
    }

}

package Services;

import Beans.RolBE;
import Beans.UsuarioBE;
import DAO.RolDA;
import DAO.UsuarioDA;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RolBL {
    
    // REALIZADO POR CURI VEGA FRANZ

    public RolBL() {
    }

    public RolBE listarRolBE(RolBE oRolBE1) {
        RolBE oRolBE = null;
        RolDA oRolDA = null;
        try {
            oRolDA = new RolDA();
            oRolBE = oRolDA.listarRolBE(oRolBE1);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            oRolBE1 = null;
            oRolDA = null;
        }
        return oRolBE;
    }

    public ArrayList<RolBE> listarRegistrosRolBE(RolBE oRolBE) {
        ArrayList<RolBE> oListaRolBE = null;
        RolDA oRolDA = null;
        try {
            oRolDA = new RolDA();
            oListaRolBE = oRolDA.listarRegistroRolBE(oRolBE);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            oRolBE = null;
            oRolDA = null;
        }
        return oListaRolBE;
    }

    public int insertarRolBE(RolBE oRolBE) {
        int resultado = 0;
        RolDA oRolDA = null;

        try {
            oRolDA = new RolDA();
            resultado = oRolDA.insertarRolBE(oRolBE);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            oRolBE = null;
            oRolDA = null;
        }
        return resultado;
    }

    public int insertarRegistrosRolBE(ArrayList<RolBE> oListaRolBE) {
        int resultado = 0;
        RolDA oRolDA = null;

        try {
            oRolDA = new RolDA();
            resultado = oRolDA.insertarRegistrosRolBE(oListaRolBE);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            oListaRolBE = null;
            oRolDA = null;
        }
        return resultado;
    }

    public int actualizarRolBE(RolBE oRolBE1) {
        int resultado = 0;
        RolDA oRolDA = null;
        try {
            oRolDA = new RolDA();
            resultado = oRolDA.actualizarRolBE(oRolBE1);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            oRolBE1 = null;
            oRolDA = null;
        }

        return resultado;
    }

    public ResultSet listarRS(String cad) {
        ResultSet rs = null;
        RolDA oRolDA = null;
        try {
            oRolDA = new RolDA();
            rs = oRolDA.listarRS(cad);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            oRolDA = null;
        }
        return rs;
    }

    public RolBE addRol(RolBE oRolBE) {
        RolDA oRolDA = new RolDA();

        String nombre, descripcion;
        boolean estado;

        nombre = (oRolBE.getNombrerol());
        descripcion = (oRolBE.getDescripcion());
        estado = (oRolBE.getEstado());

        if (nombre.equals("")
                || descripcion.equals("") || nombre.equals("")) {

            oRolBE.setIndOpSp(3);
            return oRolBE;
        } else {
            return oRolDA.addRol(oRolBE);
        }
    }

    public List<RolBE> listarRoles() {
        // Medina Jayo y Roca

        RolDA oRolDA = new RolDA();
        RolBE oRolBE = new RolBE();
        //se guarda la lista en oListaUsuarioBE
        List<RolBE> oListaRolBE = oRolDA.listarRoles();
        
        String nombre, descripcion;
        boolean estado;
        
        nombre = (oRolBE.getNombrerol());
        descripcion = (oRolBE.getDescripcion());
        estado = (oRolBE.getEstado());

        if (nombre.equals("")
                || descripcion.equals("") || nombre.equals("")) {

            oRolBE.setIndOpSp(3);
            
        } 

        //retornando la lista UsuarioBE
        return oListaRolBE;

    }

//LISTA    
//    public List<RolBE> listarRoles() {
//        RolDA oRolDA = new RolDA();
//        RolBE oRolBE = new RolBE();
//        String nombre, descripcion;
//        boolean estado;
//
//        nombre = (oRolBE.getNombrerol());
//        descripcion = (oRolBE.getDescripcion());
//        estado = (oRolBE.getEstado());
//        if (nombre.equals("")
//                || descripcion.equals("") || nombre.equals("")) {
//
//            oRolBE.setIndOpSp(3);
//            return (List<RolBE>) oRolBE;
//        } else {
//            return (List<RolBE>) (RolBE) oRolDA.listarRoles(oRolBE);
//        }
//    }
//ACTUALIZAR
    public RolBE updateRol(RolBE oRolBE) {
        RolDA oRolDA = new RolDA();
       
        String nombre, descripcion;
        boolean estado;
        nombre = (oRolBE.getNombrerol());
        descripcion = (oRolBE.getDescripcion());
        estado = (oRolBE.getEstado());

        if (nombre.equals("")
                || descripcion.equals("") || nombre.equals("")) {

            oRolBE.setIndOpSp(3);
            return oRolBE;
        } else {
            return oRolDA.updateRol(oRolBE);
        }
    }

}

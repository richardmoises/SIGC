package Services;

import Beans.RolBE;
import DAO.RolDA;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RolBL {

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

    public List<RolBL> listarRolBL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public RolBE addRol(RolBE oRolBE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public RolBE updateRol(RolBE oRolBE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<RolBE> listarRoles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


/*Modificado por Breisci MC*/
package DAO;

import Beans.UsuarioBE;
import Services.RolBL;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDA extends BaseDA {

    String cadenaConexion;
    String DriverConnection;
    String user;
    String password;

    public UsuarioDA() {
        cadenaConexion = super.getConnectionString();
        DriverConnection = super.getDriverConnection();
        user = super.getUser();
        password = super.getPassword();
    }

    public List<Integer> obtenerIdVistaByUsuario(UsuarioBE oUsuarioBE) {

        List<Integer> listaIds = new ArrayList<>();

        try {
            String cad = "select vista.idvista from "
                    + "rol inner join usuario on usuario.idrol = rol.idrol "
                    + "inner join rolvista on rol.idrol = rolvista.idrol "
                    + "inner join vista on vista.idvista = rolvista.idvista "
                    + "where usuario.usuario = '" + oUsuarioBE.getUsuario() + "' and rolvista.estado = '1'";
            
            RolBL oRolBL = new RolBL();
            ResultSet rs = oRolBL.listarRS(cad);
            System.out.println(cad);
            while (rs.next()) {
                int idvista = rs.getInt("idvista");

                listaIds.add(idvista);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listaIds;
    }

    public UsuarioBE listarUsuarioBE(UsuarioBE oUsuarioBE1) throws SQLException {
        UsuarioBE oUsuarioBE = null;
        Connection cn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;

        try {
            oUsuarioBE = new UsuarioBE();
            Class.forName(DriverConnection);
            cn = DriverManager.getConnection(cadenaConexion, user, password);
            cn.setAutoCommit(false);
            String sql = "";
            if (oUsuarioBE1.getIndOpSp() == 1) {

                sql = " SELECT idusuario,usuario,contrasenia,nrodocumento,nombre,appaterno,apmaterno,telefonofijo,telefonomovil,direccion,email,idtiposexo,estado,idrol FROM usuario WHERE idusuario=? and estado=true";
                pst = cn.prepareStatement(sql);
                pst.setInt(1, oUsuarioBE1.getIdusuario());
                rs = pst.executeQuery();
            }
            if (oUsuarioBE1.getIndOpSp() == 2) {

                sql = " SELECT idusuario,usuario,contrasenia,nrodocumento,nombre,appaterno,apmaterno,telefonofijo,telefonomovil,direccion,email,idtiposexo,estado,idrol FROM usuario WHERE usuario=? and estado=true";
                pst = cn.prepareStatement(sql);
                pst.setString(1, oUsuarioBE1.getUsuario());
                rs = pst.executeQuery();
            }
            if (oUsuarioBE1.getIndOpSp() == 3) {

                sql = " SELECT idusuario,usuario,contrasenia,nrodocumento,nombre,appaterno,apmaterno,telefonofijo,telefonomovil,direccion,email,idtiposexo,estado,idrol FROM usuario WHERE idusuario=?";
                pst = cn.prepareStatement(sql);
                pst.setInt(1, oUsuarioBE1.getIdusuario());
                rs = pst.executeQuery();
            }

            while (rs.next()) {
                oUsuarioBE.setIdusuario(rs.getInt("idusuario"));
                oUsuarioBE.setUsuario(rs.getString("usuario"));
                oUsuarioBE.setContrasenia(rs.getString("contrasenia"));
                oUsuarioBE.setNrodocumento(rs.getString("nrodocumento"));
                oUsuarioBE.setNombre(rs.getString("nombre"));
                oUsuarioBE.setAppaterno(rs.getString("appaterno"));
                oUsuarioBE.setApmaterno(rs.getString("apmaterno"));
                oUsuarioBE.setTelefonofijo(rs.getString("telefonofijo"));
                oUsuarioBE.setTelefonomovil(rs.getString("telefonomovil"));
                oUsuarioBE.setDireccion(rs.getString("direccion"));
                oUsuarioBE.setEmail(rs.getString("email"));
                oUsuarioBE.setIdtiposexo(rs.getInt("idtiposexo"));
                oUsuarioBE.setEstado(rs.getBoolean("estado"));
                oUsuarioBE.setIdrol(rs.getInt("idrol"));
            }

            cn.commit();
            cn.setAutoCommit(true);
        } catch (Exception ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {

            rs.close();
            rs = null;
            cn.close();
            cn = null;

        }
        return oUsuarioBE;
    }

    public ArrayList<UsuarioBE> listarRegistroUsuarioBE(UsuarioBE oUsuarioBE1) throws SQLException {
        ArrayList<UsuarioBE> listaUsuarioBE = null;
        Connection cn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;

        try {
            listaUsuarioBE = new ArrayList<UsuarioBE>();
            Class.forName(DriverConnection);
            cn = DriverManager.getConnection(cadenaConexion, user, password);
            cn.setAutoCommit(false);
            String sql = "";
            if (oUsuarioBE1.getIndOpSp() == 1) {
                sql = " SELECT idusuario,usuario,contrasenia,nrodocumento,nombre,appaterno,apmaterno,telefonofijo,telefonomovil,direccion,email,idtiposexo,estado,idrol FROM usuario WHERE estado=true";
                pst = cn.prepareStatement(sql);
                rs = pst.executeQuery();
            }
            if (oUsuarioBE1.getIndOpSp() == 2) {
                sql = " SELECT idusuario,usuario,contrasenia,nrodocumento,nombre,appaterno,apmaterno,telefonofijo,telefonomovil,direccion,email,idtiposexo,estado,idrol FROM usuario WHERE idusuario=? and estado=true";
                pst = cn.prepareStatement(sql);
                pst.setInt(1, oUsuarioBE1.getIdusuario());
                rs = pst.executeQuery();
            }
            if (oUsuarioBE1.getIndOpSp() == 3) {

                sql = "SELECT idusuario,usuario,contrasenia,nrodocumento,nombre,appaterno,apmaterno,telefonofijo,telefonomovil,direccion,email,idtiposexo,estado,idrol FROM usuario order by idusuario asc ";
                pst = cn.prepareStatement(sql);
                rs = pst.executeQuery();
            }

            while (rs.next()) {
                UsuarioBE oUsuarioBE = new UsuarioBE();
                oUsuarioBE.setIdusuario(rs.getInt("idusuario"));
                oUsuarioBE.setUsuario(rs.getString("usuario"));
                oUsuarioBE.setContrasenia(rs.getString("contrasenia"));
                oUsuarioBE.setNrodocumento(rs.getString("nrodocumento"));
                oUsuarioBE.setNombre(rs.getString("nombre"));
                oUsuarioBE.setAppaterno(rs.getString("appaterno"));
                oUsuarioBE.setApmaterno(rs.getString("apmaterno"));
                oUsuarioBE.setTelefonofijo(rs.getString("telefonofijo"));
                oUsuarioBE.setTelefonomovil(rs.getString("telefonomovil"));
                oUsuarioBE.setDireccion(rs.getString("direccion"));
                oUsuarioBE.setEmail(rs.getString("email"));
                oUsuarioBE.setIdtiposexo(rs.getInt("idtiposexo"));
                oUsuarioBE.setEstado(rs.getBoolean("estado"));
                oUsuarioBE.setIdrol(rs.getInt("idrol"));
                listaUsuarioBE.add(oUsuarioBE);
            }

            cn.commit();
            cn.setAutoCommit(true);
        } catch (Exception ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            rs.close();
            rs = null;
            cn.close();
            cn = null;
            oUsuarioBE1 = null;
        }
        return listaUsuarioBE;
    }

    public int insertarRegistrosUsuarioBE(ArrayList<UsuarioBE> oListaUsuarioBE) throws SQLException {
        int resultado = 0;
        Connection cn = null;
        CallableStatement cs = null;

        try {
            Class.forName(DriverConnection);
            cn = DriverManager.getConnection(cadenaConexion, user, password);

            cn.setAutoCommit(false);

            for (UsuarioBE oUsuarioBE : oListaUsuarioBE) {
                cs = cn.prepareCall("{call uspInsertarUsuario(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                cs.setString(1, oUsuarioBE.getUsuario());
                cs.setString(2, oUsuarioBE.getContrasenia());
                cs.setString(3, oUsuarioBE.getNrodocumento());
                cs.setString(4, oUsuarioBE.getNombre());
                cs.setString(5, oUsuarioBE.getAppaterno());
                cs.setString(6, oUsuarioBE.getApmaterno());
                cs.setString(7, oUsuarioBE.getTelefonofijo());
                cs.setString(8, oUsuarioBE.getTelefonomovil());
                cs.setString(9, oUsuarioBE.getDireccion());
                cs.setString(10, oUsuarioBE.getEmail());
                cs.setInt(11, oUsuarioBE.getIdtiposexo());
                cs.setBoolean(12, oUsuarioBE.isEstado());
                cs.setInt(13, oUsuarioBE.getIdrol());
                cs.registerOutParameter(14, java.sql.Types.INTEGER);
                cs.execute();
                resultado = cs.getInt(14);
                cs.close();
                cs = null;
            }
            cn.commit();
            cn.setAutoCommit(true);
        } catch (Exception ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            cn.close();
            cn = null;

        }
        return resultado;
    }

    public int insertarUsuarioBE(UsuarioBE oUsuarioBE) throws SQLException {
        int resultado = 0;
        Connection cn = null;
        CallableStatement cs = null;

        try {
            Class.forName(DriverConnection);
            cn = DriverManager.getConnection(cadenaConexion, user, password);

            cn.setAutoCommit(false);

            cs = cn.prepareCall("{call uspInsertarUsuario(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, oUsuarioBE.getUsuario());
            cs.setString(2, oUsuarioBE.getContrasenia());
            cs.setString(3, oUsuarioBE.getNrodocumento());
            cs.setString(4, oUsuarioBE.getNombre());
            cs.setString(5, oUsuarioBE.getAppaterno());
            cs.setString(6, oUsuarioBE.getApmaterno());
            cs.setString(7, oUsuarioBE.getTelefonofijo());
            cs.setString(8, oUsuarioBE.getTelefonomovil());
            cs.setString(9, oUsuarioBE.getDireccion());
            cs.setString(10, oUsuarioBE.getEmail());
            cs.setInt(11, oUsuarioBE.getIdtiposexo());
            cs.setBoolean(12, oUsuarioBE.isEstado());
            cs.setInt(13, oUsuarioBE.getIdrol());
            cs.registerOutParameter(14, java.sql.Types.INTEGER);
            cs.execute();
            resultado = cs.getInt(14);
            cs.close();
            cs = null;
            cn.commit();
            cn.setAutoCommit(true);
        } catch (Exception ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            cn.close();
            cn = null;

        }
        return resultado;
    }

    public int actualizarUsuarioBE(UsuarioBE oUsuarioBE) throws SQLException {
        int resultado = 0;
        Connection cn = null;
        CallableStatement cs = null;

        try {
            Class.forName(DriverConnection);
            cn = DriverManager.getConnection(cadenaConexion, user, password);

            cn.setAutoCommit(false);

            cs = cn.prepareCall("{call uspActualizarUsuario(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, oUsuarioBE.getIdusuario());
            cs.setString(2, oUsuarioBE.getUsuario());
            cs.setString(3, oUsuarioBE.getContrasenia());
            cs.setString(4, oUsuarioBE.getNrodocumento());
            cs.setString(5, oUsuarioBE.getNombre());
            cs.setString(6, oUsuarioBE.getAppaterno());
            cs.setString(7, oUsuarioBE.getApmaterno());
            cs.setString(8, oUsuarioBE.getTelefonofijo());
            cs.setString(9, oUsuarioBE.getTelefonomovil());
            cs.setString(10, oUsuarioBE.getDireccion());
            cs.setString(11, oUsuarioBE.getEmail());
            cs.setInt(12, oUsuarioBE.getIdtiposexo());
            cs.setBoolean(13, oUsuarioBE.isEstado());
            cs.setInt(14, oUsuarioBE.getIdrol());
            cs.registerOutParameter(15, java.sql.Types.INTEGER);
            cs.executeUpdate();
            resultado = cs.getInt(15);
            cs.close();
            cs = null;
            cn.commit();
            cn.setAutoCommit(true);
        } catch (Exception ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            cn.close();
            cn = null;

        }
        return resultado;
    }

    public ResultSet listarRS(String query) throws SQLException {
        Connection cn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            Class.forName(DriverConnection);
            cn = DriverManager.getConnection(cadenaConexion, user, password);
            cn.setAutoCommit(false);
            String sql = query;
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            cn.commit();
            cn.setAutoCommit(true);
        } catch (Exception ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            cn.close();
            cn = null;
        }
        return rs;
    }

    public UsuarioBE findUsuarioByUserAndPass(String usuario,
            String contrasenia) {

        // buscar utilizando los query necesarios
        // utilizando el usuario y contraseña luego
        // llenar todos los datos de la persona 
        // en el bean oUsuarioBE 
        UsuarioBE oUsuarioBE = new UsuarioBE();
        try {
            String cad = "select * from usuario where usuario.usuario = '" 
                    + usuario + "' and usuario.contrasenia=('" + contrasenia + "');";

            RolBL oRolBL = new RolBL();
            ResultSet rs = oRolBL.listarRS(cad);
            System.out.println(cad);
            while (rs.next()) {
                int idusuario = rs.getInt("idusuario");
                String nombre = rs.getString("nombre");
                String apeMaterno = rs.getString("appaterno");
                String apePaterno = rs.getString("apmaterno");

                oUsuarioBE.setIdusuario(idusuario);
                oUsuarioBE.setNombre(nombre);
                oUsuarioBE.setAppaterno(apePaterno);
                oUsuarioBE.setApmaterno(apeMaterno);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return oUsuarioBE;
    }



       /* 
        ResultSet resultados = oUsuarioBE.ejecutarQuery(
                "select * from usuario where usuario.usuario = "+usuario+" and usuario.contrasenia=('%" + contrasenia + "%');");

        try {
            while (resultados.next()) {
                int id = resultados.getInt("idusuario");
                String nombre = resultados.getString("nombre");
                String apeMaterno = resultados.getString("appaterno");
                String apePaterno = resultados.getString("apmaterno");

                oUsuarioBE.setIdusuario(id);
                oUsuarioBE.setNombre(nombre);
                oUsuarioBE.setAppaterno(apePaterno);
                oUsuarioBE.setApmaterno(apeMaterno);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return oUsuarioBE;*/
    
}

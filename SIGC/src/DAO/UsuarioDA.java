
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
                cs.setBoolean(12, oUsuarioBE.getEstado());
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
            cs.setBoolean(12, oUsuarioBE.getEstado());
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
            cs.setBoolean(13, oUsuarioBE.getEstado());
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
                String usuariodb = rs.getString("usuario");
                String contraseniadb = rs.getString("contrasenia");

                oUsuarioBE.setIdusuario(idusuario);
                oUsuarioBE.setNombre(nombre);
                oUsuarioBE.setAppaterno(apePaterno);
                oUsuarioBE.setApmaterno(apeMaterno);
                oUsuarioBE.setUsuario(usuariodb);
                oUsuarioBE.setContrasenia(contraseniadb);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return oUsuarioBE;
    }

    public List<UsuarioBE> listarPersonas() {

        // Arce y Zarate
        // Arce y Zarate
        // modificado po Zarate Y arce
        ArrayList<UsuarioBE> listarPersona = new ArrayList<>();
        UtilDAO oUtilDAO = new UtilDAO();

        oUtilDAO.ejecutarQuery("select * from usuario  ");

        ResultSet resultados = oUtilDAO.ejecutarQuery("select * from usuario  ");

        try {
            while (resultados.next()) {

                UsuarioBE oUsuarioBE = new UsuarioBE();

                int id = resultados.getInt("idusuario");
                String usuario = resultados.getString("usuario");
                String contrasenia = resultados.getString("contrasenia");
                String nrodocumento = resultados.getString("nrodocumento");
                String nombre = resultados.getString("nombre");
                String appaterno = resultados.getString("appaterno");
                String apmaterno = resultados.getString("apmaterno");
                String telefonofijo = resultados.getString("telefonofijo");
                String telefonomovil = resultados.getString("telefonomovil");
                String direccion = resultados.getString("direccion");
                String email = resultados.getString("email");
                short idtiposexo = resultados.getShort("idtiposexo");
                boolean estado = resultados.getBoolean("estado");
                boolean inExist = resultados.getBoolean("inExist");
                int idrol = resultados.getInt("idrol");
                //Error al digitar la columna fecha_nacimiento
                String fecha_nacimiento = resultados.getString("fecha_nacimiento");
                String estado_civil = resultados.getString("estado_civil");
                String cuenta_facebook = resultados.getString("cuenta_facebook");

                oUsuarioBE.setIdusuario(id);
                oUsuarioBE.setUsuario(usuario);
                oUsuarioBE.setContrasenia(contrasenia);
                oUsuarioBE.setNrodocumento(nrodocumento);
                oUsuarioBE.setNombre(nombre);
                oUsuarioBE.setAppaterno(appaterno);
                oUsuarioBE.setApmaterno(apmaterno);
                oUsuarioBE.setTelefonofijo(telefonofijo);
                oUsuarioBE.setTelefonomovil(telefonomovil);
                oUsuarioBE.setDireccion(direccion);
                oUsuarioBE.setEmail(email);
                oUsuarioBE.setIdtiposexo(idtiposexo);
                oUsuarioBE.setEstado(estado);
                oUsuarioBE.setInExist(inExist);
                oUsuarioBE.setIdrol(idrol);
                oUsuarioBE.setFecha_nacimiento(fecha_nacimiento);
                oUsuarioBE.setEstado_civil(estado_civil);
                oUsuarioBE.setCuenta_facebook(cuenta_facebook);

                listarPersona.add(oUsuarioBE);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listarPersona;

    }

    public UsuarioBE findUsuarioById(int id) {

        // limache y Narciso
        // Buscando a usuario por id
        int contador = 0;

        UsuarioBE oUsuarioBE = new UsuarioBE();
        try {

            String cad = "select * from usuario where usuario.idusuario = (" + id + ");";

            RolBL oRolBL = new RolBL();
            ResultSet rs = oRolBL.listarRS(cad);
            System.out.println(cad);

            while (rs.next()) {

                int idusuario = rs.getInt("idusuario");
                String nombre = rs.getString("nombre");
                String apeMaterno = rs.getString("appaterno");
                String apePaterno = rs.getString("apmaterno");
                String contrasenia = rs.getString("contrasenia");
                String usuario = rs.getString("usuario");
                String nrodocumento = rs.getString("nrodocumento");
                String telefonofijo = rs.getString("telefonofijo");
                String telefonomovil = rs.getString("telefonomovil");
                String direccion = rs.getString("Direccion");
                String email = rs.getString("Email");
                int idtiposexo = rs.getInt("idtiposexo");
                boolean estado = rs.getBoolean("estado");
                boolean inExist = rs.getBoolean("inExist");
                int idrol = rs.getInt("idrol");
                String fecha_nacimiento = rs.getString("fecha_nacimiento");
                String estado_civil = rs.getString("estado_civil");
                String cuenta_facebook = rs.getString("cuenta_facebook");

                oUsuarioBE.setIdusuario(idusuario);
                oUsuarioBE.setNombre(nombre);
                oUsuarioBE.setAppaterno(apePaterno);
                oUsuarioBE.setApmaterno(apeMaterno);
                oUsuarioBE.setContrasenia(contrasenia);
                oUsuarioBE.setUsuario(usuario);
                oUsuarioBE.setNrodocumento(nrodocumento);
                oUsuarioBE.setTelefonofijo(telefonofijo);
                oUsuarioBE.setTelefonomovil(telefonomovil);
                oUsuarioBE.setDireccion(direccion);
                oUsuarioBE.setEmail(email);
                oUsuarioBE.setIdtiposexo(idtiposexo);
                oUsuarioBE.setEstado(estado);
                oUsuarioBE.setInExist(inExist);
                oUsuarioBE.setIdrol(idrol);
                oUsuarioBE.setFecha_nacimiento(fecha_nacimiento);
                oUsuarioBE.setEstado_civil(estado_civil);
                oUsuarioBE.setCuenta_facebook(cuenta_facebook);

                //al ingrsar el contador suma en uno 
            }
            //no encontrando el usuario con su id
            //coso contrario el contador queda en cero y retorna nulo
            if (contador == 0) {
                oUsuarioBE = null;
            }

        } catch (Exception e) {
            //sea el caso que haiga un error retornara nulo
            System.out.println(e.getMessage());
            oUsuarioBE = null;
        }
        return oUsuarioBE;
    }

    public UsuarioBE updateUser(UsuarioBE oUsuarioBE) {

        // Berrocal y Casas
        // actualizando los datos de la persona
        //UsuarioBE oUsuarioBEresp = new UsuarioBE();
        //Retorna 0 cuando no ha realizado la actualizacion.
        //Retorna 1 cuando si ha realizado la actualizacion.
        UtilDAO oUtilDAO = new UtilDAO();
        try {
            String cadquery = ("update usuario "
                    //                    + " set usuario = '" + oUsuarioBE.getUsuario() + "' "
                    //                    + " ,contrasenia = '" + oUsuarioBE.getContrasenia() + "' "
                    + " set nrodocumento = '" + oUsuarioBE.getNrodocumento() + "' "
                    + " ,nombre = '" + oUsuarioBE.getNombre() + "' "
                    + " ,appaterno = '" + oUsuarioBE.getAppaterno() + "' "
                    + " ,apmaterno = '" + oUsuarioBE.getApmaterno() + "' "
                    //                    + " ,telefonofijo = '" + oUsuarioBE.getTelefonofijo() + "' "
                    + " ,telefonomovil = '" + oUsuarioBE.getTelefonomovil() + "' "
                    + " ,direccion = '" + oUsuarioBE.getDireccion() + "' "
                    + " ,email = '" + oUsuarioBE.getEmail() + "' "
                    + " ,idtiposexo = '" + oUsuarioBE.getIdtiposexo() + "' "
                    + " ,estado = '" + oUsuarioBE.getEstado() + "' "
                    + " ,inexist = '" + oUsuarioBE.isInExist() + "' "
                    + " ,fecha_nacimiento = '" + oUsuarioBE.getFecha_nacimiento() + "' "
//                    + " ,estado_civil = '" + oUsuarioBE.getEstado_civil() + "' "
                    + " ,cuenta_facebook = '" + oUsuarioBE.getCuenta_facebook() + "' "
                    + " where idusuario= " + oUsuarioBE.getIdusuario() + ";");

            int cad = oUtilDAO.ejecutarUpdate(cadquery);

            System.out.println("resultado" + cad);

            oUsuarioBE.setIndOpSp(1);

            //se realiza la comprobacion de la actualizacion.
            if (cad == 1) {
                oUsuarioBE.setIndOpSp(1);
            } else {
                oUsuarioBE.setIndOpSp(2);
            }

        } catch (Exception e) {
            oUsuarioBE.setIndOpSp(2);
        }

        return oUsuarioBE;
    }

    public UsuarioBE addUser(UsuarioBE oUsuarioBE) {

              // Mora y Huaycha
        // realizando el registro de una nuevo usuario
//        UsuarioBE oUsuarioBE = new UsuarioBE();
        UtilDAO oUtilDAO = new UtilDAO();

        String cadquery = ("insert into "
                + " usuario(nrodocumento,nombre,appaterno,apmaterno,"
                + "telefonomovil,direccion,email,idtiposexo,estado,inExist,fecha_nacimiento,"
                + "cuenta_facebook ) values ("
                + " '" + oUsuarioBE.getNrodocumento() + "'"
                + ", '" + oUsuarioBE.getNombre() + "'"
                + ", '" + oUsuarioBE.getAppaterno() + "'"
                + ", '" + oUsuarioBE.getApmaterno() + "'"
                + ", '" + oUsuarioBE.getTelefonomovil() + "'"
                + ", '" + oUsuarioBE.getDireccion() + "'"
                + ", '" + oUsuarioBE.getEmail() + "'"
                + ", '" + oUsuarioBE.getIdtiposexo() + "'"
                + ", " + oUsuarioBE.isInExist() + ""
                + ", " + oUsuarioBE.getEstado() + ""
                + ", '" + oUsuarioBE.getFecha_nacimiento() + "'"
                + ", '" + oUsuarioBE.getCuenta_facebook() + "');");

        int cad = oUtilDAO.ejecutarUpdate(cadquery);
//        oUsuarioBE = findUsuarioById(resultados);
        System.out.println("resultado" + cad);
        try {

            oUsuarioBE.setIndOpSp(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            oUsuarioBE.setIndOpSp(2);
        }

        return oUsuarioBE;
    }

}

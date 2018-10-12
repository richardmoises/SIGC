package DAO;

import util.Configuracion;
import util.LeerFichero;
import java.sql.Connection;
import java.sql.DriverManager;

//modificado por Maly & Limache
public class BaseDA {

    private Connection cn;
    private String connectionString;
    //private String driverConnection;
    private String usuario;
    private String password;
    private String host;
    private String bd;
    private String driver;
    private String url;
    private String port;
    private Configuracion configuracion = new Configuracion();
    private LeerFichero leerFichero = new LeerFichero();

    public BaseDA() {
        configuracion = leerFichero.leerLineaConfiguracion(Commons.Common.c_pathConfiguracion);
        this.usuario = configuracion.getUsuario();
        this.password = configuracion.getPassword();
        this.host = configuracion.getHost();
        this.port = configuracion.getPort();
        this.bd = configuracion.getBd();
        this.driver = configuracion.getDriver();
        this.url = configuracion.getUrl();

        connectionString = this.url + this.host + ":" + this.port + "/" + this.bd;
        //driverConnection = "org.postgresql.Driver";
        //user = "unsch";
        //password = "unsch";
    }

    public Connection conectar() throws Exception {
        Class.forName(connectionString);
        cn = DriverManager.getConnection(driver, usuario, password);
        return cn;
    }

    public void cerrarConexion() throws Exception {
        cn.close();
        cn = null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return usuario;
    }

    public void setUser(String user) {
        this.usuario = user;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getDriverConnection() {
        return driver;
    }

    public void setDriverConnection(String driverConnection) {
        this.driver = driverConnection;
    }

}

package Beans;
/*
modificado por ruben y roca

*/
public class UsuarioBE {

    private int IndOpSp;
    private int idusuario;
    private String usuario;
    private String contrasenia;
    private String nrodocumento;
    private String nombre;
    private String appaterno;
    private String apmaterno;
    private String telefonofijo;
    private String telefonomovil;
    private String direccion;
    private String email;
    private int idtiposexo;
    private boolean estado;
    private boolean inExist;
    private int idrol;
    private String fecha_nacimiento;
    private String estado_civil;
    private String cuenta_facebook;

    public UsuarioBE() {
        this.IndOpSp = 0;
        this.idusuario = 0;
        this.usuario = "";
        this.contrasenia = "";
        this.nrodocumento = "";
        this.nombre = "";
        this.appaterno = "";
        this.apmaterno = "";
        this.telefonofijo = "";
        this.telefonomovil = "";
        this.direccion = "";
        this.email = "";
        this.idtiposexo = 0;
        this.estado = false;
        this.inExist = false;
        this.idrol = 0;
    }

    public UsuarioBE(int pIndOpSp, int pidusuario, String pusuario, String pcontrasenia, String pnrodocumento, String pnombre, String pappaterno, String papmaterno, String ptelefonofijo, String ptelefonomovil, String pdireccion, String pemail, int pidtiposexo, boolean pestado, boolean pinExist, int pidrol) {
        this.IndOpSp = pIndOpSp;
        this.idusuario = pidusuario;
        this.usuario = pusuario;
        this.contrasenia = pcontrasenia;
        this.nrodocumento = pnrodocumento;
        this.nombre = pnombre;
        this.appaterno = pappaterno;
        this.apmaterno = papmaterno;
        this.telefonofijo = ptelefonofijo;
        this.telefonomovil = ptelefonomovil;
        this.direccion = pdireccion;
        this.email = pemail;
        this.idtiposexo = pidtiposexo;
        this.estado = pestado;
        this.inExist = pinExist;
        this.idrol=pidrol;
    }

    public int getIndOpSp() {
        return IndOpSp;
    }

    public int getIdusuario() {
        return idusuario;

    }

    public String getUsuario() {
        return usuario;

    }

    public String getContrasenia() {
        return contrasenia;

    }

    public String getNrodocumento() {
        return nrodocumento;

    }

    public String getNombre() {
        return nombre;

    }

    public String getAppaterno() {
        return appaterno;

    }

    public String getApmaterno() {
        return apmaterno;

    }

    public String getTelefonofijo() {
        return telefonofijo;

    }

    public String getTelefonomovil() {
        return telefonomovil;

    }

    public String getDireccion() {
        return direccion;

    }

    public String getEmail() {
        return email;

    }

    public int getIdtiposexo() {
        return idtiposexo;

    }

    public boolean isEstado() {
        return estado;

    }

    public void setIndOpSp(int IndOpSp) {
        this.IndOpSp = IndOpSp;
    }

    public void setIdusuario(int idusuario) {

        this.idusuario = idusuario;
    }

    public void setUsuario(String usuario) {

        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {

        this.contrasenia = contrasenia;
    }

    public void setNrodocumento(String nrodocumento) {

        this.nrodocumento = nrodocumento;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setAppaterno(String appaterno) {

        this.appaterno = appaterno;
    }

    public void setApmaterno(String apmaterno) {

        this.apmaterno = apmaterno;
    }

    public void setTelefonofijo(String telefonofijo) {

        this.telefonofijo = telefonofijo;
    }

    public void setTelefonomovil(String telefonomovil) {

        this.telefonomovil = telefonomovil;
    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setIdtiposexo(int idtiposexo) {

        this.idtiposexo = idtiposexo;
    }

    public void setEstado(boolean estado) {

        this.estado = estado;
    }

    public boolean isInExist() {
        return inExist;
    }

    public void setInExist(boolean inExist) {
        this.inExist = inExist;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @return the estado_civil
     */
    public String getEstado_civil() {
        return estado_civil;
    }

    /**
     * @return the cuenta_facebook
     */
    public String getCuenta_facebook() {
        return cuenta_facebook;
    }
}

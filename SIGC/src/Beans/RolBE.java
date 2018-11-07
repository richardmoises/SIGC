package Beans;

/*
 *
 *MODIFICADO POR KATIUSKA Y DIEGO
 *
 */
import java.util.Date;

public class RolBE {

    private int IndOpSp;
    private int idrol;
    private String nombrerol;
    private boolean estado;
    private String Descripcion;

    public RolBE() {
        this.IndOpSp = 0;
        this.idrol = 0;
        this.nombrerol = "";
        this.estado = false;
        this.Descripcion = "";

    }

    public RolBE(int IndOpSp, int idrol, String nombrerol, boolean estado, String Descripcion) {
        this.IndOpSp = IndOpSp;
        this.idrol = idrol;
        this.nombrerol = nombrerol;
        this.estado = estado;
        this.Descripcion = Descripcion;
    }

    public int getIndOpSp() {
        return IndOpSp;
    }

    public int getIdrol() {
        return idrol;

    }

    public String getNombrerol() {
        return nombrerol;

    }

    public boolean isEstado() {
        return estado;

    }

    public void setIndOpSp(int IndOpSp) {
        this.IndOpSp = IndOpSp;
    }

    public void setIdrol(int idrol) {

        this.idrol = idrol;
    }

    public void setNombrerol(String nombrerol) {

        this.nombrerol = nombrerol;
    }

    public void setEstado(boolean estado) {

        this.estado = estado;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String setEstado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

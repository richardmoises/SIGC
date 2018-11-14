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
    private String descripcion;

    public RolBE() {
        this.IndOpSp = 0;
        this.idrol = 0;
        this.nombrerol = "";
        this.estado = false;
        this.descripcion = "";

    }

    public RolBE(int IndOpSp, int idrol, String nombrerol, boolean estado, String descripcion) {
        this.IndOpSp = IndOpSp;
        this.idrol = idrol;
        this.nombrerol = nombrerol;
        this.estado = estado;
        this.descripcion = descripcion;
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

    public boolean getEstado() {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

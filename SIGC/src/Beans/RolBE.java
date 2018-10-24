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

    public RolBE() {
        this.IndOpSp = 0;
        this.idrol = 0;
        this.nombrerol = "";
        this.estado = false;

    }

    public RolBE(int pIndOpSp, int pidrol, String pnombrerol, boolean pestado) {
        this.IndOpSp = pIndOpSp;
        this.idrol = pidrol;
        this.nombrerol = pnombrerol;
        this.estado = pestado;
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

}

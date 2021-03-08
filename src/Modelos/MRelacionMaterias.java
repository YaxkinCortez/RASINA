
package Modelos;

/**
 *
 * @author yaxkin-pc
 */
public class MRelacionMaterias {
    int idMaterias;
    String nombreMaterias;

    public MRelacionMaterias(int idMaterias, String nombreMaterias) {
        this.idMaterias = idMaterias;
        this.nombreMaterias = nombreMaterias;
    }

    public int getIdMaterias() {
        return idMaterias;
    }

    public void setIdMaterias(int idMaterias) {
        this.idMaterias = idMaterias;
    }

    public String getNombreMaterias() {
        return nombreMaterias;
    }

    public void setNombreMaterias(String nombreMaterias) {
        this.nombreMaterias = nombreMaterias;
    }

    @Override
    public String toString() {
        return nombreMaterias ;
    }
    
    
}

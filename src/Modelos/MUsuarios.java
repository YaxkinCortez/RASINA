package Modelos;

/**
 *
 * @author yaxkin-pc
 */
public class MUsuarios {

    public static String insertarRegistro = "INSERT INTO maestros (nombre, contra, tipo) VALUES (?,?,?)";

    public static String actualizarFull = "UPDATE maestros SET nombre=?, contra=?, tipo=? WHERE id=?";

    public static String borrar = "DELETE FROM maestros WHERE nombre=?";

    public static String seleccionar = "SELECT nombre, contra, tipo FROM maestros";

    public static String tablaActualizar = "SELECT * FROM maestros";

    private String nombre;
    private String contra;
    private String tipo;
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

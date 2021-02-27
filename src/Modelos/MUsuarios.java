package Modelos;

/**
 *
 * @author yaxkin-pc
 */
public class MUsuarios {

    public static String insertarRegistro = "INSERT INTO maestros (nombre, contra, tipo) VALUES (?,?,?)";

    public static String actualizarNombre = "UPDATE maestros SET nombre=? WHERE nombre=?";

    public static String actualizarContra = "UPDATE maestros SET contra=? WHERE nombre=?";

    public static String actualizarTipo = "UPDATE maestros SET tipo=? WHERE nombre=?";

    public static String actualizarNombreContra = "UPDATE maestros SET nombre=?, contra=? WHERE nombre=?";

    public static String actualizarNombreTipo = "UPDATE maestros SET nombre=?, tipo=? WHERE nombre=?";

    public static String actualizarContraTipo = "UPDATE maestros SET contra=?, tipo=? WHERE nombre=?";

    public static String actualizarFull = "UPDATE maestros SET nombre=?, contra=?, tipo=? WHERE nombre=?";

    public static String borrar = "DELETE FROM maestros WHERE nombre=?";

    public static String seleccionar = "SELECT nombre FROM maestros";

    private String nombre;
    private String contra;
    private int tipo;

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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}

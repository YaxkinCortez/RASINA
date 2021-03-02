package Modelos;

/**
 *
 * @author yaxkin-pc
 */
public class MAlumno {

    public static String insertarRegistro = "INSERT INTO alumnos (nombreAlumnos) VALUES (?)";

    public static String actualizarFull = "UPDATE alumnos SET nombreAlumnos=? WHERE idAlumnos=?";

    public static String borrar = "DELETE FROM alumnos WHERE nombreAlumnos=?";

    public static String seleccionar = "SELECT nombreAlumnos FROM alumnos";

    public static String tablaActualizar = "SELECT * FROM alumnos";

    private String nombre;
    private String ID;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}

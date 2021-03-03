package Modelos;

/**
 *
 * @author yaxkin-pc
 */
public class MMateria {

    public static String insertar = "INSER INTO materias (nombreMaterias) VALUES (?)";

    public static String actualizar = "UPDATE materias SET nombreMaterias=? WHERE idMaterias=?";

    public static String seleccionarTablaActualizar = "SELECT * FROM materias";

    public static String seleccionarTablaEliminar = "SELECT nombreMaterias FROM materias";

    public static String eliminar = "DELETE FROM materias WHERE nombreMaterias=?";

    private String id;
    private String nombrematerias;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombrematerias() {
        return nombrematerias;
    }

    public void setNombrematerias(String nombrematerias) {
        this.nombrematerias = nombrematerias;
    }

}

package Modelos;

/**
 *
 * @author yaxkin-pc
 */
public class MRelacionMateria {

    public static String comboBoxAlumno = "SELECT * FROM alumnos";

    public static String comboBoxMateria = "SELECT * FROM materias";

    public static String llenarAsistentes = "INSERT INTO asistentes (idAlumno, idMaterias) VALUES (?,?)";

    public static String seleccionarIdAlumno = "SELECTE idAlumnos FROM alumnos WHERE nombreAlumnos=?";

    int idAlumno;
    String nombreAlumno;

    public MRelacionMateria(int idAlumno, String nombreAlumno) {
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public String toString() {
        return nombreAlumno;
    }
}

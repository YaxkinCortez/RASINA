package Controlador;

import Conexion.Conexion;
import Modelos.MAlumno;
import Vistas.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yaxkin-pc
 */
public class CAlumno extends Conexion {

    static Conexion cc = new Conexion();
    static Connection cn = cc.GetConexion();
    static PreparedStatement ps;
    static ResultSet rs;
    static Statement st;

    public static int registrar(MAlumno mr) {
        int rsu = 0;
        String sql = MAlumno.insertarRegistro;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, mr.getNombre());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        System.out.println(sql);
        return rsu;
    }

    public static int actualizarFull(MAlumno mr) {
        int rsu = 0;
        String sql = MAlumno.actualizarFull;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, mr.getNombre());
            ps.setString(2, mr.getID());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminarUsuario(String id) {
        int rsu = 0;
        String sql = MAlumno.borrar;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    public static void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) ActualizarAlumno.tb.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = MAlumno.tablaActualizar;
        String datos[] = new String[2];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idAlumnos");
                datos[1] = rs.getString("nombreAlumnos");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void llenarTablaEliminar() {
        DefaultTableModel modelo = (DefaultTableModel) EliminarAlumno.tb.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = MAlumno.seleccionar;
        String datos[] = new String[1];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("nombreAlumnos");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

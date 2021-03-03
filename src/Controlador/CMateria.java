package Controlador;

import Conexion.Conexion;
import Modelos.MMateria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Vistas.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yaxkin-pc
 */
public class CMateria extends Conexion {

    static Conexion cc = new Conexion();
    static Connection cn = cc.GetConexion();
    static PreparedStatement ps;
    static ResultSet rs;
    static Statement st;

    public static int insertarMaterias(MMateria mm) {
        int rsu = 0;
        String sql = MMateria.insertar;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, mm.getNombrematerias());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CMateria.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return rsu;
    }

    public static int actualizarMaterias(MMateria mm) {
        int rsu = 0;
        String sql = MMateria.actualizar;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, mm.getNombrematerias());
            ps.setString(2, mm.getId());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CMateria.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rsu;
    }

    public static int eliminarMaterias(String id) {
        int rsu = 0;
        String sql = MMateria.eliminar;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CMateria.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rsu;
    }

    public static void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) ActualizarMateria.tb.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = MMateria.seleccionarTablaActualizar;
        String datos[] = new String[2];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idMaterias");
                datos[1] = rs.getString("nombreMaterias");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public static void llenarTablaElminiar() {
        DefaultTableModel modelo = (DefaultTableModel) ActualizarMateria.tb.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = MMateria.seleccionarTablaEliminar;
        String datos[] = new String[1];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("nombreMaterias");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}

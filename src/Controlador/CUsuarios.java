package Controlador;

import Conexion.Conexion;
import Modelos.MUsuarios;
import Vistas.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import static Vistas.EliminarMaestro.bus;
//import static Vistas.EliminarMaestro.tipo;

/**
 *
 * @author yaxkin-pc
 */
public class CUsuarios extends Conexion {

    static Conexion cc = new Conexion();
    static Connection cn = cc.GetConexion();
    static PreparedStatement ps;
    static ResultSet rs;
    static Statement st;

    public static int registrar(MUsuarios mr) {
        int rsu = 0;
        String sql = MUsuarios.insertarRegistro;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, mr.getNombre());
            ps.setString(2, mr.getContra());
            ps.setString(3, mr.getTipo());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        System.out.println(sql);
        return rsu;
    }

    /*public static void llenarCombo() {
        String sql = MUsuarios.seleccionar;
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                bus.addItem(rs.getString("nombre")); //aqui ponemos el campo de la BD
            }

            //cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }*/
 /*public static void llenarComboTipoUsuario() {
        String sql = MUsuarios.seleccionar;
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                tipo.addItem(rs.getString("tipo")); //aqui ponemos el campo de la BD
            }

            //cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }*/
    public static int actualizarFull(MUsuarios mr) {
        int rsu = 0;
        String sql = MUsuarios.actualizarFull;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, mr.getNombre());
            ps.setString(2, mr.getContra());
            ps.setString(3, mr.getTipo());
            ps.setString(4, mr.getID());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminarUsuario(String id) {
        int rsu = 0;
        String sql = MUsuarios.borrar;

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
        DefaultTableModel modelo = (DefaultTableModel) ActualizarMaestro.tb.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = MUsuarios.tablaActualizar;
        String datos[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("contra");
                datos[3] = rs.getString("tipo");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void llenarTablaEliminar() {
        DefaultTableModel modelo = (DefaultTableModel) EliminarMaestro.tb.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = MUsuarios.seleccionar;
        String datos[] = new String[3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("contra");
                datos[2] = rs.getString("tipo");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

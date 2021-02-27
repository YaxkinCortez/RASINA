package Controlador;

import Conexion.Conexion;
import Modelos.MUsuarios;
import Vistas.Actualizar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static Vistas.Actualizar.bus;

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

    Actualizar ac = new Actualizar();

    public static int registrar(MUsuarios mr) {
        int rsu = 0;
        String sql = MUsuarios.insertarRegistro;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, mr.getNombre());
            ps.setString(2, mr.getContra());
            ps.setInt(3, mr.getTipo());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        System.out.println(sql);
        return rsu;
    }

    public static void llenarCombo() {
        String sql = MUsuarios.seleccionar;
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                bus.addItem(rs.getString("nombre")); //aqui ponemos el campo de la BD
            }

            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static int actualizarNombre(MUsuarios mr) {
        int rsu = 0;

        return rsu;
    }

    public static int actualizarContra(MUsuarios mr) {
        int rsu = 0;

        return rsu;
    }

    public static int actualizarNombreContra(MUsuarios mr) {
        int rsu = 0;

        return rsu;
    }

    public static int actualizarNombreTipo(MUsuarios mr) {
        int rsu = 0;

        return rsu;
    }

    public static int actualizarContraTipo(MUsuarios mr) {
        int rsu = 0;

        return rsu;
    }

    public static int actualizarFull(MUsuarios mr) {
        int rsu = 0;

        return rsu;
    }
}

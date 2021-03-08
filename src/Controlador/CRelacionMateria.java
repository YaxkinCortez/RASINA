package Controlador;

import Conexion.Conexion;
import Modelos.MRelacionMateria;
import Modelos.MRelacionMaterias;
import static Vistas.RegistrarAlumnoMateria.comboAlumno;
import static Vistas.RegistrarAlumnoMateria.comboMateria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author yaxkin-pc
 */
public class CRelacionMateria {

    static Conexion cc = new Conexion();
    static Connection cn = cc.GetConexion();
    static PreparedStatement ps;
    static ResultSet rs;
    static Statement st;

    /*public DefaultComboBoxModel llenarCombo() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("ALUMNO");
        String sql = MRelacionMateria.comboBoxAlumno;
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addElement(rs.getString("nombreAlumnos"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return modelo;
    }*/
    
    public void llenarComboAlumno(){
         String sql = MRelacionMateria.comboBoxAlumno;
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                comboAlumno.addItem(new MRelacionMateria(Integer.parseInt(rs.getString("idAlumnos")),
                rs.getString("nombreAlumnos")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void llenarComboMaterias(){
         String sql = MRelacionMateria.comboBoxMateria;
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                comboMateria.addItem(new MRelacionMaterias(Integer.parseInt(rs.getString("idMaterias")),
                rs.getString("nombreMaterias")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    /*public DefaultComboBoxModel llenarComboMateria() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("MATERIA");
        String sql = MRelacionMateria.comboBoxMateria;
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addElement(rs.getString("nombreMaterias"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return modelo;
    }*/
    
    public int registrar(MRelacionMateria mr){
        int rsu = 0;
        String sql =MRelacionMateria.seleccionarIdAlumno;
        
        return rsu;
    }
}

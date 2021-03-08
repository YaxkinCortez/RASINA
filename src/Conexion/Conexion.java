package Conexion;

import ConfiguracionInicialBD.config_inicial;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author yaxkin-pc
 */
public class Conexion {

    private static boolean abierta = false;
    String locacion;
    String usuario;
    String contra;

    public void leer() {
        File file = new File("config.txt");

        if (file.length() == 0) {
            //config_inicial confi = new config_inicial();
            /*if (confi.isVisible()==false) {
                confi.setVisible(true);
                //confi.dispose();
            }*/
            EjecutarError();
        } else {
            try {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(file).useDelimiter("\\s*,\\s*");
                locacion = sc.next();
                usuario = sc.next();
                contra = sc.next();
                //close the scanner     
                sc.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Connection GetConexion() {
        leer();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conect = DriverManager.getConnection(locacion, usuario, contra);
            return conect;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            EjecutarError();
        }
        return null;
    }

    public void EjecutarError() {
        if (abierta == false) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos");
            config_inicial confi = new config_inicial();
            confi.setVisible(true);
            abierta = true;
        }
    }
}

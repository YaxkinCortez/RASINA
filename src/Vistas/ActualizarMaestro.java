/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.CUsuarios;
import Modelos.MUsuarios;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author yaxkin-pc
 */
public class ActualizarMaestro extends javax.swing.JInternalFrame {

    MUsuarios mu = new MUsuarios();

    /**
     * Creates new form Eliminar
     */
    public ActualizarMaestro() {
        initComponents();
        tb.getTableHeader().setDefaultRenderer(new Escritorio.EstiloTablaHeader());
        tb.setDefaultRenderer(Object.class, new Escritorio.EstiloTablaRenderer());
        //CUsuarios.llenarCombo();
        //CUsuarios.llenarComboTipoUsuario();
        limpiaCampos();
        tb.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (tb.getSelectedRow() != -1) {
                    cambiaDatos();
                    selecionRegistro = true;
                }
            }
        });
    }

    void cambiaDatos() {
        int fila = tb.getSelectedRow();
        ID.setText(tb.getValueAt(fila, 0).toString());
        nombre.setText(tb.getValueAt(fila, 1).toString());
        contra.setText(tb.getValueAt(fila, 2).toString());
        tipo.setSelectedItem(tb.getValueAt(fila, 3).toString());
    }

    boolean selecionRegistro = false;

    void limpiaCampos() {
        nombre.setText("");
        ID.setText("");
        contra.setText("");
        tipo.setSelectedItem("TIPO");
        selecionRegistro = false;
        CUsuarios.llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        ID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 115, 144, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("NOMBRE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 113, 92, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 173, 92, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("TIPO USUARIO");
        jLabel3.setMaximumSize(new java.awt.Dimension(92, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(92, 17));
        jLabel3.setPreferredSize(new java.awt.Dimension(92, 17));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 238, -1, 31));

        tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TIPO", "ADMINISTRADOR", "MAESTRO" }));
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 238, 144, 31));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ACTUALIZAR USUARIOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 27, 254, 40));

        aceptar.setBackground(new java.awt.Color(255, 255, 255));
        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aceptar.png"))); // NOI18N
        aceptar.setText("ACEPTAR");
        aceptar.setBorderPainted(false);
        aceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 321, 100, -1));

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.setBorderPainted(false);
        cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 321, -1, -1));

        contra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 175, 144, 31));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 410));

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Contraseña", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb);
        if (tb.getColumnModel().getColumnCount() > 0) {
            tb.getColumnModel().getColumn(0).setMinWidth(40);
            tb.getColumnModel().getColumn(0).setMaxWidth(40);
            tb.getColumnModel().getColumn(1).setResizable(false);
            tb.getColumnModel().getColumn(2).setResizable(false);
            tb.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 390, 410));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        actualizar();
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        limpiaCampos();
    }//GEN-LAST:event_cancelarActionPerformed

    private void actualizar() {
        if (contra.getText().equals("") && nombre.getText().equals("") && tipo.getSelectedItem().equals("TIPO")) {
            JOptionPane.showMessageDialog(null, "Seleccione un usuarios de la tabla", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            mu.setNombre(nombre.getText());
            mu.setContra(contra.getText());
            mu.setTipo(tipo.getSelectedItem().toString());
            mu.setID(ID.getText());
            int op = CUsuarios.actualizarFull(mu);
            if (op != 0) {
                limpiaCampos();
                JOptionPane.showMessageDialog(this, "Actualizacion éxitosa.", "ACTUALIZADO", 0,
                        new ImageIcon(getClass().getResource("/img/realizado.png")));
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JPasswordField contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    public static javax.swing.JTable tb;
    public static javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}

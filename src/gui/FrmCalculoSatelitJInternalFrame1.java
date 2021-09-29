/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.CalculoSatelite;
import controlador.Arreglo_CalculoSatelite;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCalculoSatelitJInternalFrame1 extends javax.swing.JInternalFrame {

    Arreglo_CalculoSatelite obj = new Arreglo_CalculoSatelite();

    public FrmCalculoSatelitJInternalFrame1() {
        initComponents();
        muestra();
    }

    void muestra() {
        DefaultTableModel dt = (DefaultTableModel) tblSatelite.getModel();
        dt.setRowCount(0);
        for (CalculoSatelite x : obj.getList()) {
            Object v[] = {x.getNombre(), x.getApellido(), x.getPeso(), x.Modelo(), x.resultado()};
            dt.addRow(v);
        }
    }

    private void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtPesoTerrestre.setText("");
        cboSatelite.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtFgs = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtPesoTerrestre = new javax.swing.JTextField();
        lblSatelite = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboSatelite = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnCalcularp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSatelite = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(542, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fuerza de Gravedad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        txtFgs.setEnabled(false);
        getContentPane().add(txtFgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 110, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa tu Nombre :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 65, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa tu Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 91, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresa tu Peso:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 122, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 62, 130, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 88, 130, -1));

        txtPesoTerrestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoTerrestreKeyTyped(evt);
            }
        });
        getContentPane().add(txtPesoTerrestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 119, 130, -1));

        lblSatelite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblSatelite, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 220, 161));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Selecciona el Satelite:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        cboSatelite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "luna" }));
        cboSatelite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSateliteActionPerformed(evt);
            }
        });
        getContentPane().add(cboSatelite, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 157, 130, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Satelite");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 11, -1, -1));

        btnCalcularp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calcular.png"))); // NOI18N
        btnCalcularp.setText("Calcular");
        btnCalcularp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularpActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 110, 40));

        tblSatelite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Peso", "Satelite", "Resultado"
            }
        ));
        jScrollPane1.setViewportView(tblSatelite);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 161));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panel2.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cboSateliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSateliteActionPerformed
        //SELECCIONA EL COMBO Y MUESTRA LA INAGEN EN EL LABEL
        int ind = cboSatelite.getSelectedIndex();

        //VECTORES IMAGEN X PLANETA
        String cad[] = {"", "luna"};
        verImagen(cad[ind]);

        //VECTOR
        double s[] = {0, .166};
        txtFgs.setText("" + s[cboSatelite.getSelectedIndex()]);


    }//GEN-LAST:event_cboSateliteActionPerformed

    private void btnCalcularpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularpActionPerformed

        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty()
                || txtPesoTerrestre.getText().isEmpty() || cboSatelite.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Complete Campos");

        } else {

            String nom = txtNombre.getText();
            String ape = txtApellido.getText();
            int pes = Integer.parseInt(txtPesoTerrestre.getText());
            int cad = cboSatelite.getSelectedIndex();
            CalculoSatelite ca = new CalculoSatelite(nom, ape, pes, cad);
            obj.adicionar(ca);
            muestra();
            limpiar();
        }

    }//GEN-LAST:event_btnCalcularpActionPerformed

    private void txtPesoTerrestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoTerrestreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresa tu peso");
        }
    }//GEN-LAST:event_txtPesoTerrestreKeyTyped
    void verImagen(String pic) {
        //detectar la ruta del proyecto
        String ruta = new File("src").getAbsolutePath();
        ruta = ruta + "/img/" + pic + ".jpg";
        //Verificar la Ruta
        //JOptionPane.showMessageDialog(this, ruta);
        //Levar la imagen detectada a memoria
        ImageIcon img1 = new ImageIcon(ruta);
        //dar una escala a la imagen en memoria
        Image imesc = img1.getImage().getScaledInstance(lblSatelite.getWidth(), lblSatelite.getHeight(), Image.SCALE_SMOOTH);
        lblSatelite.setIcon(new ImageIcon(imesc));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularp;
    private javax.swing.JComboBox<String> cboSatelite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSatelite;
    private javax.swing.JTable tblSatelite;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtFgs;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPesoTerrestre;
    // End of variables declaration//GEN-END:variables
}

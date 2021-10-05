/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.CalculoEstrella;
import controlador.Arreglo_CalculoEstrella;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class FrmCalculoEstrellaJInternalFrame1 extends javax.swing.JInternalFrame {

    Arreglo_CalculoEstrella obj = new Arreglo_CalculoEstrella();

    public FrmCalculoEstrellaJInternalFrame1() {
        initComponents();
        muestra();
    }

    void muestra() {
        DefaultTableModel dt = (DefaultTableModel) tblEstrella.getModel();
        dt.setRowCount(0);
        for (CalculoEstrella x : obj.getList()) {
            Object v[] = {x.getNombre(), x.getApellido(), x.getPeso(), x.Modelo(), x.resultado()};
            dt.addRow(v);
        }
    }

    private void limpiar() {
        txtNombree.setText("");
        txtApellidoe.setText("");
        txtPesoe.setText("");
        cboEstrella.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtFG = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombree = new javax.swing.JTextField();
        txtApellidoe = new javax.swing.JTextField();
        txtPesoe = new javax.swing.JTextField();
        lblEstrella = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboEstrella = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnCalculare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstrella = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(542, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fuerza de Gravedad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        txtFG.setEnabled(false);
        getContentPane().add(txtFG, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 90, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa tu Nombre :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 65, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa tu Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 91, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresa tu Peso:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 122, -1, -1));

        txtNombree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombree, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 62, 130, -1));
        getContentPane().add(txtApellidoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 88, 130, -1));

        txtPesoe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoeKeyTyped(evt);
            }
        });
        getContentPane().add(txtPesoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 119, 130, -1));

        lblEstrella.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblEstrella, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 220, 161));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Selecciona la Estrella:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        cboEstrella.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "sol" }));
        cboEstrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstrellaActionPerformed(evt);
            }
        });
        getContentPane().add(cboEstrella, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 157, 130, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estrellas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 11, -1, -1));

        btnCalculare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calcular.png"))); // NOI18N
        btnCalculare.setText("Calcular");
        btnCalculare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculareActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculare, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        tblEstrella.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Peso", "Estrella", "Resultado"
            }
        ));
        jScrollPane1.setViewportView(tblEstrella);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 161));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panel2.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreeActionPerformed

    private void cboEstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstrellaActionPerformed
        //SELECCIONA EL COMBO Y MUESTRA LA INAGEN EN EL LABEL
        int ind = cboEstrella.getSelectedIndex();

        //VECTORES IMAGEN X PLANETA
        String cad[] = {"", "sol"};
        verImagen(cad[ind]);

        //VECTOR
        double s[] = {0, 27.072};
        txtFG.setText("" + s[cboEstrella.getSelectedIndex()]);

    }//GEN-LAST:event_cboEstrellaActionPerformed

    private void btnCalculareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculareActionPerformed

        if (txtNombree.getText().isEmpty() || txtApellidoe.getText().isEmpty()
                || txtPesoe.getText().isEmpty() || cboEstrella.getSelectedIndex() == 0) {
             JOptionPane.showMessageDialog(null, "Por favor, complete los campos", "AVISO", JOptionPane.WARNING_MESSAGE);
            txtNombree.requestFocus();

        } else {

            String nom = txtNombree.getText();
            String ape = txtApellidoe.getText();
            int pes = Integer.parseInt(txtPesoe.getText());
            int cad = cboEstrella.getSelectedIndex();
            CalculoEstrella ca = new CalculoEstrella(nom, ape, pes, cad);
            obj.adicionar(ca);
            muestra();
            limpiar();
        }

    }//GEN-LAST:event_btnCalculareActionPerformed

    private void txtPesoeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoeKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresa tu peso");
        }
    }//GEN-LAST:event_txtPesoeKeyTyped

    void verImagen(String pic) {
        //detectar la ruta del proyecto
        String ruta = new File("src").getAbsolutePath();
        ruta = ruta + "/img/" + pic + ".jpg";
        //Verificar la Ruta
        //JOptionPane.showMessageDialog(this, ruta);
        //Levar la imagen detectada a memoria
        ImageIcon img1 = new ImageIcon(ruta);
        //dar una escala a la imagen en memoria
        Image imesc = img1.getImage().getScaledInstance(lblEstrella.getWidth(), lblEstrella.getHeight(), Image.SCALE_SMOOTH);
        lblEstrella.setIcon(new ImageIcon(imesc));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculare;
    private javax.swing.JComboBox<String> cboEstrella;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstrella;
    private javax.swing.JTable tblEstrella;
    private javax.swing.JTextField txtApellidoe;
    private javax.swing.JTextField txtFG;
    private javax.swing.JTextField txtNombree;
    private javax.swing.JTextField txtPesoe;
    // End of variables declaration//GEN-END:variables
}

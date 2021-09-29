/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.CalculoPlaneta;
import controlador.Arreglo_CalculoPlaneta;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saul
 */
public class FrmCalculoPlanetasJInternalFrame extends javax.swing.JInternalFrame {
 
    
    
    Arreglo_CalculoPlaneta  obj = new Arreglo_CalculoPlaneta();
    public FrmCalculoPlanetasJInternalFrame() {
        initComponents();
        muestra();
    }

      void muestra() {
        DefaultTableModel dt = (DefaultTableModel) tblPlaneta.getModel();
        dt.setRowCount(0);
        for (CalculoPlaneta x : obj.getList()) {
            Object v[] = {x.getNombre(),x.getApellido(), x.getPeso(), x.Modelo(), x.resultado()};
            dt.addRow(v);
        }
    }
      
      
      private void limpiar() {
        txtNombree.setText("");
        txtApellidoe.setText("");
        txtPesoe.setText("");
        cboPlanetas.setSelectedIndex(0);

    }
      
      
      
      
      
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtFgP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombree = new javax.swing.JTextField();
        txtApellidoe = new javax.swing.JTextField();
        txtPesoe = new javax.swing.JTextField();
        lblPlaneta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboPlanetas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnCalcularp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlaneta = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(542, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fuerza de Gravedad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        txtFgP.setEnabled(false);
        getContentPane().add(txtFgP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 90, -1));

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
        getContentPane().add(txtPesoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 119, 130, -1));

        lblPlaneta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblPlaneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 220, 161));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Selecciona el Planeta:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        cboPlanetas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "mercurio", "venus", "jupiter", "marte", "saturno", "urano", "neptuno" }));
        cboPlanetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPlanetasActionPerformed(evt);
            }
        });
        getContentPane().add(cboPlanetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 157, 130, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PLANETAS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 11, -1, -1));

        btnCalcularp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calcular.png"))); // NOI18N
        btnCalcularp.setText("Calcular");
        btnCalcularp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularpActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        tblPlaneta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Peso", "Planeta", "Resultado"
            }
        ));
        jScrollPane1.setViewportView(tblPlaneta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 161));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panel2.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreeActionPerformed

    private void cboPlanetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPlanetasActionPerformed
        //SELECCIONA EL COMBO Y MUESTRA LA INAGEN EN EL LABEL
        int ind = cboPlanetas.getSelectedIndex();

        //VECTORES IMAGEN X PLANETA
        String cad[] = {"","mercurio","venus","jupiter","marte","saturno","urano","neptuno"};
        verImagen(cad[ind]);
        
        //VECTOR
        double s[]={0, .378,.906,2.533,.379,1.066,.905,1.133};
        txtFgP.setText(""+s[cboPlanetas.getSelectedIndex()]);                                      
     
    }//GEN-LAST:event_cboPlanetasActionPerformed

    private void btnCalcularpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularpActionPerformed
      String nom = txtNombree.getText();
         String ape = txtApellidoe.getText();
        int pes = Integer.parseInt(txtPesoe.getText());
        int cad = cboPlanetas.getSelectedIndex();
        CalculoPlaneta ca = new CalculoPlaneta(nom,ape, pes, cad);
        obj.adicionar(ca);
        muestra();
        limpiar();
    }//GEN-LAST:event_btnCalcularpActionPerformed

    
    void verImagen(String pic) {
        //detectar la ruta del proyecto
        String ruta = new File("src").getAbsolutePath();
        ruta = ruta + "/img/" + pic + ".jpg";
        //Verificar la Ruta
        //JOptionPane.showMessageDialog(this, ruta);
        //Levar la imagen detectada a memoria
        ImageIcon img1 = new ImageIcon(ruta);
        //dar una escala a la imagen en memoria
        Image imesc = img1.getImage().getScaledInstance(lblPlaneta.getWidth(), lblPlaneta.getHeight(), Image.SCALE_SMOOTH);
        lblPlaneta.setIcon(new ImageIcon(imesc));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularp;
    private javax.swing.JComboBox<String> cboPlanetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaneta;
    private javax.swing.JTable tblPlaneta;
    private javax.swing.JTextField txtApellidoe;
    private javax.swing.JTextField txtFgP;
    private javax.swing.JTextField txtNombree;
    private javax.swing.JTextField txtPesoe;
    // End of variables declaration//GEN-END:variables
}

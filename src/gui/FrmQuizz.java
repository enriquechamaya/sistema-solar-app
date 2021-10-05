/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.Quizz;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author echamaya
 */
public class FrmQuizz extends javax.swing.JInternalFrame {

    private final int CANTIDAD_BANCO_PREGUNTAS = 10;
    private final int CANTIDAD_PREGUNTAS_QUIZZ = 5;
    private ArrayList<Quizz> listaPreguntas = new ArrayList<>();
    private ArrayList<Quizz> listaPreguntasSeleccionadas = new ArrayList<>();
    private int contadorPregunta = 0;

    public static int respuestasCorrectas = 0;
    public static int respuestasIncorrectas = 0;
    public static int puntaje = 0;
    public static String nombresApellidos = "";

    /**
     * Creates new form FrmQuizz
     */
    public FrmQuizz() {
        initComponents();
        agruparAlternativas();
        llenarPreguntas();
        seleccionarPreguntasAleatorias();
        reiniciarContabilizadores();
        mostrarPregunta();
    }

    void reiniciarContabilizadores() {
        respuestasCorrectas = 0;
        respuestasIncorrectas = 0;
        puntaje = 0;
    }

    void agruparAlternativas() {
        bgAlternativas.add(rbtAlternativa1);
        bgAlternativas.add(rbtAlternativa2);
        bgAlternativas.add(rbtAlternativa3);
    }

    void llenarPreguntas() {
        Quizz pregunta1 = new Quizz("¿CUÁL ES LA GRAVEDAD EN URANO?", "0.99", new String[]{"2.55", "0.99", "0.38"}, 4);
        Quizz pregunta2 = new Quizz("¿CUÁL ES LA GRAVEDAD EN MARTE?", "0.38", new String[]{"0.93", "0.38", "0.17"}, 4);
        Quizz pregunta3 = new Quizz("¿EL PESO Y LA MASA SON LO MISMO?", "falso", new String[]{"verdadero", "falso", ""}, 4);
        Quizz pregunta4 = new Quizz("¿EL PLANETA SATURNO ES GASEOSO?", "verdadero", new String[]{"falso", "verdadero", ""}, 4);
        Quizz pregunta5 = new Quizz("¿EL PLANETA TIERRA ES GASEOSO?", "falso", new String[]{"verdadero", "falso", ""}, 4);
        Quizz pregunta6 = new Quizz("¿CUÁL ES EL PLANETA MÁS PEQUEÑO?", "Mercurio", new String[]{"Marte", "Mercurio", "Plutón"}, 4);
        Quizz pregunta7 = new Quizz("¿CUÁL ES EL PLANETA MAS CERCANO AL SOL?", "Mercurio", new String[]{"Saturno", "Mercurio", "Júpiter"}, 4);
        Quizz pregunta8 = new Quizz("LA LUNA ES UN(A)...", "Satélite", new String[]{"Planeta", "Estrella", "Satélite"}, 4);
        Quizz pregunta9 = new Quizz("¿CUÁL ES LA FÓRMULA PARA HALLAR EL PESO DE UNA PERSONA?", "p=m*g", new String[]{"p=m*g", "p=m/g", "p=p*m"}, 4);
        Quizz pregunta10 = new Quizz("¿QUÉ PLANETA POSEE ANILLOS?", "Urano", new String[]{"Marte", "Urano", "Plutón"}, 4);
        listaPreguntas.add(pregunta1);
        listaPreguntas.add(pregunta2);
        listaPreguntas.add(pregunta3);
        listaPreguntas.add(pregunta4);
        listaPreguntas.add(pregunta5);
        listaPreguntas.add(pregunta6);
        listaPreguntas.add(pregunta7);
        listaPreguntas.add(pregunta8);
        listaPreguntas.add(pregunta9);
        listaPreguntas.add(pregunta10);
    }

    void seleccionarPreguntasAleatorias() {
        Random rnd = new Random();
        for (int i = 0; i < CANTIDAD_PREGUNTAS_QUIZZ; i++) {
            int rndIndex = rnd.nextInt(CANTIDAD_PREGUNTAS_QUIZZ);
            Quizz preguntaAleatoria = listaPreguntas.get(rndIndex);
            listaPreguntas.remove(rndIndex);
            listaPreguntasSeleccionadas.add(preguntaAleatoria);
        }
    }

    boolean esValidoNombreApellidos() {
        if (txtNombresApellidos.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese sus nombres y apellidos", "AVISO", JOptionPane.WARNING_MESSAGE);
            txtNombresApellidos.requestFocus();
            return false;
        }
        return true;
    }

    void mostrarResultadoQuizz() {
        nombresApellidos = txtNombresApellidos.getText().toUpperCase();
        frmMenuPrincipal.mostrarResultadoQuizz();
    }

    boolean haSeleccionadoAlternativa() {
        return bgAlternativas.getSelection() != null;
    }

    boolean quizzCompletado() {
        return ((contadorPregunta + 1) > CANTIDAD_PREGUNTAS_QUIZZ);
    }

    void mostrarNumeroPregunta() {
        panelPreguntas.setBorder(javax.swing.BorderFactory.createTitledBorder(
                null,
                "PERGUNTA N° " + (contadorPregunta + 1),
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 12),
                new java.awt.Color(255, 255, 255)));
    }

    String obtenerRespuestaSeleccionada() {
        if (rbtAlternativa1.isSelected()) {
            return rbtAlternativa1.getText();
        }
        if (rbtAlternativa2.isSelected()) {
            return rbtAlternativa2.getText();
        }
        if (rbtAlternativa3.isSelected()) {
            return rbtAlternativa3.getText();
        }
        return "";
    }

    boolean esPrimeraPregunta() {
        return contadorPregunta == 0;
    }

    void limpiarSeleccion() {
        bgAlternativas.clearSelection();
    }

    void mostrarPregunta() {
        if (quizzCompletado()) {
            mostrarResultadoQuizz();
            return;
        }

        mostrarNumeroPregunta();
        Quizz quizz = listaPreguntasSeleccionadas.get(contadorPregunta);
        lblPregunta.setText(quizz.getPregunta());

        String[] alternativas = quizz.getAlternativas();
        
        if (!alternativas[0].isEmpty()) {
            rbtAlternativa1.setVisible(true);
            rbtAlternativa1.setText(alternativas[0]);
        } else {
            rbtAlternativa1.setVisible(false);
        }

        if (!alternativas[1].isEmpty()) {
            rbtAlternativa2.setVisible(true);
            rbtAlternativa2.setText(alternativas[1]);
        } else {
            rbtAlternativa2.setVisible(false);
        }

        if (!alternativas[2].isEmpty()) {
            rbtAlternativa3.setVisible(true);
            rbtAlternativa3.setText(alternativas[2]);
        } else {
            rbtAlternativa3.setVisible(false);
        }
    }

    boolean esRespuestaCorrecta() {
        Quizz quizz = listaPreguntasSeleccionadas.get(contadorPregunta);
        return (obtenerRespuestaSeleccionada().equals(quizz.getRespuesta()));
    }

    void contabilizarRespuestas() {
        Quizz quizz = listaPreguntasSeleccionadas.get(contadorPregunta);
        if (quizzCompletado()) {
            return;
        }
        if (obtenerRespuestaSeleccionada().isEmpty()) {
            respuestasIncorrectas++;
        } else {
            if (esRespuestaCorrecta()) {
                respuestasCorrectas++;
                puntaje += quizz.getPuntaje();
            } else {
                respuestasIncorrectas++;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAlternativas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNombresApellidos = new javax.swing.JTextField();
        panelPreguntas = new javax.swing.JPanel();
        lblPregunta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbtAlternativa1 = new javax.swing.JRadioButton();
        rbtAlternativa2 = new javax.swing.JRadioButton();
        rbtAlternativa3 = new javax.swing.JRadioButton();
        btnSiguiente = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setClosable(true);
        setTitle("QUIZZ");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRES Y APELLIDOS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 36));

        txtNombresApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNombresApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 410, 36));

        panelPreguntas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PERGUNTA N", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        panelPreguntas.setOpaque(false);

        lblPregunta.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblPregunta.setForeground(new java.awt.Color(0, 255, 51));
        lblPregunta.setText("¿ CUÁL ES LA GRAVEDAD EN EL PLANETA SATURNO ?");

        javax.swing.GroupLayout panelPreguntasLayout = new javax.swing.GroupLayout(panelPreguntas);
        panelPreguntas.setLayout(panelPreguntasLayout);
        panelPreguntasLayout.setHorizontalGroup(
            panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPreguntasLayout.setVerticalGroup(
            panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 610, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESPUESTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        rbtAlternativa1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtAlternativa1.setForeground(new java.awt.Color(255, 255, 51));
        rbtAlternativa1.setText("0.93");
        rbtAlternativa1.setOpaque(false);
        rbtAlternativa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAlternativa1ActionPerformed(evt);
            }
        });

        rbtAlternativa2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtAlternativa2.setForeground(new java.awt.Color(255, 255, 51));
        rbtAlternativa2.setText("0.39");
        rbtAlternativa2.setOpaque(false);

        rbtAlternativa3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtAlternativa3.setForeground(new java.awt.Color(255, 255, 51));
        rbtAlternativa3.setText("0.99");
        rbtAlternativa3.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbtAlternativa1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(rbtAlternativa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtAlternativa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtAlternativa1)
                .addGap(18, 18, 18)
                .addComponent(rbtAlternativa2)
                .addGap(18, 18, 18)
                .addComponent(rbtAlternativa3)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 610, 150));

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sgte-pregunta.png"))); // NOI18N
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.setBorder(null);
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setOpaque(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 164, 44));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img-quizz.jpg"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (!esValidoNombreApellidos()) {
            return;
        }
        contabilizarRespuestas();
        contadorPregunta++;
        mostrarPregunta();
        limpiarSeleccion();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        frmMenuPrincipal.internalFrameQuizz = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void rbtAlternativa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAlternativa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtAlternativa1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgAlternativas;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JPanel panelPreguntas;
    private javax.swing.JRadioButton rbtAlternativa1;
    private javax.swing.JRadioButton rbtAlternativa2;
    private javax.swing.JRadioButton rbtAlternativa3;
    private javax.swing.JTextField txtNombresApellidos;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGraficaPVsZ3;

import Clases.User;
import java.awt.Frame;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author daniel
 */
public class InicioSesion extends javax.swing.JFrame {

    private PantallaPrincipal pp;
    private JuegoDinamica jd;
    private String dificultad; // Recoge la dificultad.

    /**
     * Creates new form InicioDeSesion
     */
    public InicioSesion(PantallaPrincipal PP) {
        this.pp = PP;
        initComponents();
        setLocationRelativeTo(null); // Coloca el JFrame en el centro de la pantalla
    }

    public JTextField getJTextFieldDNI() {
        return JTextFieldDNI;
    }

    public void setJTextFieldDNI(JTextField JTextFieldDNI) {
        this.JTextFieldDNI = JTextFieldDNI;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
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
        JButtonVolver = new javax.swing.JButton();
        JLabelLG = new javax.swing.JLabel();
        JTextFieldDNI = new javax.swing.JTextField();
        JLabelDNI = new javax.swing.JLabel();
        JButtonInicioSesion = new javax.swing.JButton();
        JButtonEliminarUsuario = new javax.swing.JButton();
        JButtonRanking = new javax.swing.JButton();
        JComboBoxDificultad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        JButtonVolver.setBackground(new java.awt.Color(102, 0, 0));
        JButtonVolver.setText("Volver");
        JButtonVolver.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonVolverActionPerformed(evt);
            }
        });

        JLabelLG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPVsZ3/pea_shooter.gif"))); // NOI18N

        JLabelDNI.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JLabelDNI.setText("DNI");

        JButtonInicioSesion.setBackground(new java.awt.Color(153, 153, 153));
        JButtonInicioSesion.setText("Jugar");
        JButtonInicioSesion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JButtonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInicioSesionActionPerformed(evt);
            }
        });

        JButtonEliminarUsuario.setBackground(new java.awt.Color(153, 153, 153));
        JButtonEliminarUsuario.setText("Eliminar");
        JButtonEliminarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JButtonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEliminarUsuarioActionPerformed(evt);
            }
        });

        JButtonRanking.setBackground(new java.awt.Color(0, 102, 0));
        JButtonRanking.setText("Ranking");
        JButtonRanking.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JButtonRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRankingActionPerformed(evt);
            }
        });

        JComboBoxDificultad.setBackground(new java.awt.Color(153, 153, 153));
        JComboBoxDificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAJA", "MEDIA", "ALTA", "IMPOSIBLE" }));
        JComboBoxDificultad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JComboBoxDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxDificultadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JLabelDNI)
                        .addGap(352, 352, 352))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JLabelLG)
                        .addGap(322, 322, 322))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JButtonRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JButtonEliminarUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JButtonInicioSesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JButtonVolver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                        .addGap(62, 62, 62)
                        .addComponent(JComboBoxDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(JLabelLG, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JComboBoxDificultad)
                    .addComponent(JButtonInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(JButtonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.pp.setVisible(true);
    }//GEN-LAST:event_JButtonVolverActionPerformed

    private void JButtonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInicioSesionActionPerformed
        jd = new JuegoDinamica(this);
        jd.setVisible(true);
        dificultad = (String) JComboBoxDificultad.getSelectedItem();
        this.setDificultad(dificultad);
        /**
         * Inicia juego.
         */
        /*String dni = JTextFieldDNI.getText();
        Serializacion.cargarDatos();
        boolean existe = false;
        for (User u : Serializacion.getUsuarios().keySet()) {
            if (u.getDni().equals(dni)) {
                dificultad = (String) JComboBoxDificultad.getSelectedItem();
                existe = true;
                this.setVisible(false);
                jd = new JuegoDinamica(this);
                jd.setVisible(true);
            }
        }
        if (existe == false) {
            JOptionPane.showMessageDialog(new Frame(), "Usuario no registrado o DNI no válido.");
        }*/
    }//GEN-LAST:event_JButtonInicioSesionActionPerformed

    private void JButtonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEliminarUsuarioActionPerformed
        /**
         * Elimina al usuario seleccionado en base al DNI.
         */
        Serializacion.cargarDatos();
        String dniUsuario = JTextFieldDNI.getText();
        Serializacion.cargarDatos();
        User usuarioAEliminar = null;
        for (User u : Serializacion.getUsuarios().keySet()) {
            if (u.getDni().equals(dniUsuario)) {
                usuarioAEliminar = u; // Almacenamos usuario a eliminar
            }
        }
        if (usuarioAEliminar != null) {
            Serializacion.eliminarUsuario(usuarioAEliminar); // Eliminamos usuario.
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Usuario no registrado o DNI no válido.");
        }
    }//GEN-LAST:event_JButtonEliminarUsuarioActionPerformed

    private void JButtonRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRankingActionPerformed
        /**
         * Abrirá un nuevo RankingUsuarios para asi actualizarse en el momento si se añade o elimina un usuario. Si no hay usuarios registrados, mostrará un mensaje indicándolo.
         */
        Serializacion.cargarDatos();
        if(!Serializacion.getUsuarios().isEmpty()){
            RankingUsuarios ranking = new RankingUsuarios(this);
            String dni = JTextFieldDNI.getText();
            this.setVisible(false);
            ranking.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "No hay usuarios registrados.");
        }
    }//GEN-LAST:event_JButtonRankingActionPerformed

    private void JComboBoxDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxDificultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxDificultadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonEliminarUsuario;
    private javax.swing.JButton JButtonInicioSesion;
    private javax.swing.JButton JButtonRanking;
    private javax.swing.JButton JButtonVolver;
    private javax.swing.JComboBox<String> JComboBoxDificultad;
    private javax.swing.JLabel JLabelDNI;
    private javax.swing.JLabel JLabelLG;
    private javax.swing.JTextField JTextFieldDNI;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
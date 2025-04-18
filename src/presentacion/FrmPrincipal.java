/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import datos.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import datos.ListaEstudiantes;

/**
 *
 * @author USER
 */
public class FrmPrincipal extends javax.swing.JFrame {
    ListaEstudiantes lista;
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.lista = new ListaEstudiantes();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo.png"));
        Image image = icon.getImage();
        dspEscritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        panForm = new RoundedPanel();
        lblSubtitulo = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        btnRegistro = new FlatButton("Registro");
        btnHistorial = new FlatButton("Eliminar");
        btnEliminar = new FlatButton("Historial");
        lblLogo = new javax.swing.JLabel();
        panContacto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        dspEscritorio.setBackground(new java.awt.Color(11, 55, 97));

        panForm.setBackground(new java.awt.Color(255, 255, 255));
        panForm.setForeground(new java.awt.Color(255, 255, 255));

        lblSubtitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        lblSubtitulo.setText("Control de Registros");

        lblBienvenida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bienvenida.png"))); // NOI18N

        btnRegistro.setBackground(new java.awt.Color(11, 55, 97));
        btnRegistro.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrar");
        btnRegistro.setToolTipText("");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnHistorial.setBackground(new java.awt.Color(11, 55, 97));
        btnHistorial.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("Historial");
        btnHistorial.setPreferredSize(new java.awt.Dimension(79, 23));
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(11, 55, 97));
        btnEliminar.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(79, 23));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-unt.png"))); // NOI18N

        javax.swing.GroupLayout panFormLayout = new javax.swing.GroupLayout(panForm);
        panForm.setLayout(panFormLayout);
        panFormLayout.setHorizontalGroup(
            panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFormLayout.createSequentialGroup()
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFormLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFormLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSubtitulo)))
                .addGap(111, 111, 111))
            .addGroup(panFormLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo)
                    .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panFormLayout.createSequentialGroup()
                            .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panFormLayout.setVerticalGroup(
            panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFormLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(lblBienvenida)
                .addGap(57, 57, 57)
                .addComponent(lblSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(lblLogo)
                .addGap(120, 120, 120))
        );

        panContacto.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Central Telefonica: +51 (044) 209020");

        javax.swing.GroupLayout panContactoLayout = new javax.swing.GroupLayout(panContacto);
        panContacto.setLayout(panContactoLayout);
        panContactoLayout.setHorizontalGroup(
            panContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panContactoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(43, 43, 43))
        );
        panContactoLayout.setVerticalGroup(
            panContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        dspEscritorio.setLayer(panForm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspEscritorio.setLayer(panContacto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dspEscritorioLayout = new javax.swing.GroupLayout(dspEscritorio);
        dspEscritorio.setLayout(dspEscritorioLayout);
        dspEscritorioLayout.setHorizontalGroup(
            dspEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dspEscritorioLayout.createSequentialGroup()
                .addGap(24, 300, Short.MAX_VALUE)
                .addComponent(panForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        dspEscritorioLayout.setVerticalGroup(
            dspEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dspEscritorioLayout.createSequentialGroup()
                .addComponent(panContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(panForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dspEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        IfrmEliminar ventana = new IfrmEliminar();
        dspEscritorio.add(ventana);
        ventana.setLocation(
            (dspEscritorio.getWidth() - ventana.getWidth()) / 2,
            (dspEscritorio.getHeight() - ventana.getHeight()) / 2
        );
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        String[] opciones = {"Estudiante", "Maestro"};
        int seleccion = JOptionPane.showOptionDialog(this,
            "¿Qué tipo de registro deseas hacer?",
            "Seleccionar tipo de usuario",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]

        );
        if(seleccion == 0){
            IfrmEstudiante ventanaEst = new IfrmEstudiante();
            dspEscritorio.add(ventanaEst);
            ventanaEst.setLocation(
                (dspEscritorio.getWidth() - ventanaEst.getWidth()) / 2,
                (dspEscritorio.getHeight() - ventanaEst.getHeight()) / 2
            );
            ventanaEst.setVisible(true);
        } else if(seleccion == 1){
            ifrmDocente ventanaDoc = new ifrmDocente();
            dspEscritorio.add(ventanaDoc);
            ventanaDoc.setLocation(
                (dspEscritorio.getWidth() - ventanaDoc.getWidth()) / 2,
                (dspEscritorio.getHeight() - ventanaDoc.getHeight()) / 2
            );
            ventanaDoc.setVisible(true);
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        IfrmHistorialProfesor historial= new IfrmHistorialProfesor();
        dspEscritorio.add(historial);
        historial.setLocation(
            (dspEscritorio.getWidth() - historial.getWidth()) / 2,
            (dspEscritorio.getHeight() - historial.getHeight()) / 2
        );
        historial.setVisible(true);
    }//GEN-LAST:event_btnHistorialActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JDesktopPane dspEscritorio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JPanel panContacto;
    private javax.swing.JPanel panForm;
    // End of variables declaration//GEN-END:variables

}

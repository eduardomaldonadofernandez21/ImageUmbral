/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imageumbral;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;

/**
 *
 * @author eduma
 */
public class Interfaz extends javax.swing.JFrame {

    private JFileChooser fc = new JFileChooser();
    private JOptionPane dialog = new JOptionPane();
    private FileNameExtensionFilter filter = null;
    
    public Interfaz() {
        initComponents();
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public void initFiltros(){
        filter = new FileNameExtensionFilter("Images (*.jpg,*.png)","jpg", "png");
        fc.addChoosableFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo1 = new com.mycompany.imageumbral.Lienzo();
        labelTitulo = new javax.swing.JLabel();
        labelCopyFer = new javax.swing.JLabel();
        labelCopyEdu = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        abrirMenuItem = new javax.swing.JMenuItem();
        guardarMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        cerrarMenuItem = new javax.swing.JMenuItem();
        FilterMenu = new javax.swing.JMenu();
        umbralMenuItem = new javax.swing.JMenuItem();
        restoreMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        inforMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lienzo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setText("Imagen Umbralizada");
        labelTitulo.setPreferredSize(new java.awt.Dimension(850, 500));

        labelCopyFer.setText("© Fernando Marcelo Alonso");

        labelCopyEdu.setText("    Eduardo Maldonado Fernández");

        fileMenu.setText("File");

        abrirMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        abrirMenuItem.setText("Open");
        abrirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(abrirMenuItem);

        guardarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        guardarMenuItem.setText("Save");
        guardarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(guardarMenuItem);
        fileMenu.add(jSeparator1);

        cerrarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cerrarMenuItem.setText("Exit");
        cerrarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(cerrarMenuItem);

        menuBar.add(fileMenu);

        FilterMenu.setText("Filter");

        umbralMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        umbralMenuItem.setText("Threshold");
        umbralMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umbralMenuItemActionPerformed(evt);
            }
        });
        FilterMenu.add(umbralMenuItem);

        restoreMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        restoreMenuItem.setText(" Restore original image");
        restoreMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreMenuItemActionPerformed(evt);
            }
        });
        FilterMenu.add(restoreMenuItem);

        menuBar.add(FilterMenu);

        helpMenu.setText("Help");

        inforMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        inforMenuItem.setText("About");
        inforMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inforMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(inforMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCopyFer, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCopyEdu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(labelCopyFer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCopyEdu)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inforMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inforMenuItemActionPerformed
        dialog.showMessageDialog(null,"Mediante esta aplicación:\n1. Usted puede seleccionar una imagen '.jpg' o '.png' en el menu File en la opción Open.\n2. Una vez escogida la imagen, se muestra por pantalla.\n3. Para umbralizar la imagen, seleccione el menu Filter y su opción Threshold.\n4. Para guardar la imagen umbralizar, seleccionamos el menu File la opción Save. ","Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_inforMenuItemActionPerformed

    private void abrirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirMenuItemActionPerformed
        initFiltros();
        if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            lienzo1.updateImage(fc.getSelectedFile());   
        }
    }//GEN-LAST:event_abrirMenuItemActionPerformed

    private void guardarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarMenuItemActionPerformed
        if(lienzo1.isImage()){
            if(fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
                lienzo1.saveImage(fc.getSelectedFile());
            }
        }else{
            dialog.showMessageDialog(null,"No se está visualizando ninguna imagen actualmente en la aplicación","Imagen no encontrada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarMenuItemActionPerformed

    private void cerrarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarMenuItemActionPerformed
        int conf = dialog.showConfirmDialog(null, "¿Deseas salir y cerrar la aplicación?", "Cierre del programa", JOptionPane.OK_CANCEL_OPTION);
        if(conf ==JFileChooser.APPROVE_OPTION){
            dispose();
        }
    }//GEN-LAST:event_cerrarMenuItemActionPerformed

    private void restoreMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreMenuItemActionPerformed
        if(lienzo1.isImage()){
            lienzo1.restoreImage();
        }else{
            dialog.showMessageDialog(null, "Hay que abrir una imagen para poder restaurarla","No hay imagen", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_restoreMenuItemActionPerformed

    private void umbralMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umbralMenuItemActionPerformed
        if(lienzo1.isImage()){
            String umbral = dialog.showInputDialog(null,"Introduzca el valor del umbral para la imagen","Valor umbral", JOptionPane.QUESTION_MESSAGE);
            if(!checkUmbral(umbral) && umbral != null ){
                dialog.showMessageDialog(null,"Error al introducir el valor umbral: Debe ser un número entero y con un rango de 0 a 255","Dato inválido", JOptionPane.ERROR_MESSAGE);
            }else if(umbral != null){
                lienzo1.umbralizar(Integer.parseInt(umbral));
            }
        }else{
             dialog.showMessageDialog(null,"Hay que abrir una imagen para poder umbralizarla","No hay imagen", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_umbralMenuItemActionPerformed
    
    private boolean checkUmbral(String input){
        int umbral;
        try { 
        umbral = Integer.parseInt(input); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        return !(umbral > 255 || umbral < 0);
    }
    
    
 
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FilterMenu;
    private javax.swing.JMenuItem abrirMenuItem;
    private javax.swing.JMenuItem cerrarMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem guardarMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem inforMenuItem;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel labelCopyEdu;
    private javax.swing.JLabel labelCopyFer;
    private javax.swing.JLabel labelTitulo;
    private com.mycompany.imageumbral.Lienzo lienzo1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem restoreMenuItem;
    private javax.swing.JMenuItem umbralMenuItem;
    // End of variables declaration//GEN-END:variables
}
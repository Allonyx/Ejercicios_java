/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio__11;

import java.awt.Color;

/**
 *
 * @author aleja
 */
public class Barra_Menus extends javax.swing.JFrame {

    /**
     * Creates new form Barra_Menus
     */
    public Barra_Menus() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barras_menus = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        Itm_abrir = new javax.swing.JMenuItem();
        Itm_guardar = new javax.swing.JMenuItem();
        separator1 = new javax.swing.JPopupMenu.Separator();
        Itm_salir = new javax.swing.JMenuItem();
        menu_editar = new javax.swing.JMenu();
        sb_menu_colores = new javax.swing.JMenu();
        Itm_rojo = new javax.swing.JMenuItem();
        Itm_azul = new javax.swing.JMenuItem();
        Itm_verde = new javax.swing.JMenuItem();
        menu_insertar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_archivo.setText("Archivo");

        Itm_abrir.setText("Abrir");
        menu_archivo.add(Itm_abrir);

        Itm_guardar.setText("Guardar");
        menu_archivo.add(Itm_guardar);
        menu_archivo.add(separator1);

        Itm_salir.setText("Salir");
        menu_archivo.add(Itm_salir);

        Barras_menus.add(menu_archivo);

        menu_editar.setText("Editar");

        sb_menu_colores.setText("Colores");

        Itm_rojo.setText("Rojo");
        Itm_rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_rojoActionPerformed(evt);
            }
        });
        sb_menu_colores.add(Itm_rojo);

        Itm_azul.setText("Azul");
        Itm_azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_azulActionPerformed(evt);
            }
        });
        sb_menu_colores.add(Itm_azul);

        Itm_verde.setText("Verde");
        Itm_verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_verdeActionPerformed(evt);
            }
        });
        sb_menu_colores.add(Itm_verde);

        menu_editar.add(sb_menu_colores);

        Barras_menus.add(menu_editar);

        menu_insertar.setText("Insertar");
        Barras_menus.add(menu_insertar);

        setJMenuBar(Barras_menus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Itm_rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Itm_rojoActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.red);
    }//GEN-LAST:event_Itm_rojoActionPerformed

    private void Itm_azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Itm_azulActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.blue);
    }//GEN-LAST:event_Itm_azulActionPerformed

    private void Itm_verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Itm_verdeActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.green);
    }//GEN-LAST:event_Itm_verdeActionPerformed

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
            java.util.logging.Logger.getLogger(Barra_Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barra_Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barra_Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barra_Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barra_Menus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barras_menus;
    private javax.swing.JMenuItem Itm_abrir;
    private javax.swing.JMenuItem Itm_azul;
    private javax.swing.JMenuItem Itm_guardar;
    private javax.swing.JMenuItem Itm_rojo;
    private javax.swing.JMenuItem Itm_salir;
    private javax.swing.JMenuItem Itm_verde;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenu menu_editar;
    private javax.swing.JMenu menu_insertar;
    private javax.swing.JMenu sb_menu_colores;
    private javax.swing.JPopupMenu.Separator separator1;
    // End of variables declaration//GEN-END:variables
}


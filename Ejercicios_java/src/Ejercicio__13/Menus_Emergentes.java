/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio__13;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Menus_Emergentes extends javax.swing.JFrame {

    /**
     * Creates new form Menus_Emergentes
     */
    public Menus_Emergentes() {
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

        menu_emerge = new javax.swing.JPopupMenu();
        Itm_rojo = new javax.swing.JMenuItem();
        Itm_azul = new javax.swing.JMenuItem();
        Itm_verde = new javax.swing.JMenuItem();

        Itm_rojo.setText("Rojo");
        Itm_rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_rojoActionPerformed(evt);
            }
        });
        menu_emerge.add(Itm_rojo);

        Itm_azul.setText("Azul");
        Itm_azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_azulActionPerformed(evt);
            }
        });
        menu_emerge.add(Itm_azul);

        Itm_verde.setText("Verde");
        Itm_verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_verdeActionPerformed(evt);
            }
        });
        menu_emerge.add(Itm_verde);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
       
        menu_emerge.show(this,evt.getX(),evt.getY());
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(Menus_Emergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus_Emergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus_Emergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus_Emergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus_Emergentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Itm_azul;
    private javax.swing.JMenuItem Itm_rojo;
    private javax.swing.JMenuItem Itm_verde;
    private javax.swing.JPopupMenu menu_emerge;
    // End of variables declaration//GEN-END:variables
}


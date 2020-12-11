/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author aleja
 */
public class Modelos_Cuadros_Lista_2 extends javax.swing.JFrame {

    /**
     * Creates new form Modelos_Cuadros_Lista
     */
    public Modelos_Cuadros_Lista_2() {
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

        numeros = new javax.swing.JComboBox<>();
        pares = new javax.swing.JButton();
        impares = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        vaciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numerosMouseClicked(evt);
            }
        });
        numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerosActionPerformed(evt);
            }
        });

        pares.setText("Pares");
        pares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paresActionPerformed(evt);
            }
        });

        impares.setText("Impares");
        impares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imparesActionPerformed(evt);
            }
        });

        vaciar.setText("Vaciar");
        vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numeros, 0, 216, Short.MAX_VALUE)
                    .addComponent(resultado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(pares, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vaciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(impares)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pares)
                    .addComponent(impares)
                    .addComponent(vaciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paresActionPerformed
        // TODO add your handling code here:
        
        int i;
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (i = 2; i < 11; i += 2){
        modelo.addElement("Numero: " + i);   
        }
        numeros.setModel(modelo);
    }//GEN-LAST:event_paresActionPerformed

    private void imparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imparesActionPerformed
        // TODO add your handling code here:
        int i;
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (i = 1; i < 11; i += 2){
        modelo.addElement("Numero: " + i);   
        }
        numeros.setModel(modelo);
        
    }//GEN-LAST:event_imparesActionPerformed

    private void vaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        numeros.setModel(modelo);
        resultado.setText("");
    }//GEN-LAST:event_vaciarActionPerformed

    private void numerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numerosMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_numerosMouseClicked

    private void numerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerosActionPerformed
        // TODO add your handling code here:
        String mensaje = "Usted selecciono el ";
        
        mensaje = mensaje + numeros.getSelectedItem().toString();
        
        resultado.setText(mensaje);
    }//GEN-LAST:event_numerosActionPerformed

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
            java.util.logging.Logger.getLogger(Modelos_Cuadros_Lista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modelos_Cuadros_Lista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modelos_Cuadros_Lista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modelos_Cuadros_Lista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modelos_Cuadros_Lista_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton impares;
    private javax.swing.JComboBox<String> numeros;
    private javax.swing.JButton pares;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton vaciar;
    // End of variables declaration//GEN-END:variables
}


package combination;

import admin.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GrandCombination extends javax.swing.JFrame {

    public GrandCombination() {
        initComponents();
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adminp = new javax.swing.JButton();
        userp = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 20, 470, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Noakhali-3814, Bangladesh");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 50, 370, 30);

        adminp.setBackground(new java.awt.Color(88, 110, 159));
        adminp.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        adminp.setForeground(new java.awt.Color(255, 255, 255));
        adminp.setText("Admin Panel");
        adminp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminpActionPerformed(evt);
            }
        });
        jPanel1.add(adminp);
        adminp.setBounds(170, 220, 160, 30);

        userp.setBackground(new java.awt.Color(88, 110, 159));
        userp.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        userp.setForeground(new java.awt.Color(255, 255, 255));
        userp.setText("User Panel");
        userp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userpActionPerformed(evt);
            }
        });
        jPanel1.add(userp);
        userp.setBounds(170, 280, 160, 30);

        cancel.setBackground(new java.awt.Color(88, 110, 159));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Exit");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(170, 340, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/nstu (3).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 520, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminpActionPerformed
        
        new Admin();
        
    }//GEN-LAST:event_adminpActionPerformed

    private void userpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userpActionPerformed
       
        new CombinedClass();
        
    }//GEN-LAST:event_userpActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       
        System.exit(0);
        
    }//GEN-LAST:event_cancelActionPerformed

    
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
            java.util.logging.Logger.getLogger(GrandCombination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrandCombination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrandCombination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrandCombination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrandCombination();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminp;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton userp;
    // End of variables declaration//GEN-END:variables
}

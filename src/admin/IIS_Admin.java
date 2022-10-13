
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IIS_Admin extends javax.swing.JFrame {

    public IIS_Admin() {
        initComponents();
        setVisible(true);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        stdi = new javax.swing.JButton();
        trmrs = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        trmrs1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/iis.jpeg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 69);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Institute of Information sciences");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 20, 400, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 50, 370, 30);

        stdi.setBackground(new java.awt.Color(88, 120, 159));
        stdi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stdi.setForeground(new java.awt.Color(255, 255, 255));
        stdi.setText("Student's Information");
        stdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdiActionPerformed(evt);
            }
        });
        jPanel1.add(stdi);
        stdi.setBounds(150, 190, 200, 40);

        trmrs.setBackground(new java.awt.Color(88, 120, 159));
        trmrs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        trmrs.setForeground(new java.awt.Color(255, 255, 255));
        trmrs.setText("Term Final Result");
        trmrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trmrsActionPerformed(evt);
            }
        });
        jPanel1.add(trmrs);
        trmrs.setBounds(150, 310, 200, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText(" Welcome to IIS Admin Panel");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(150, 100, 220, 30);

        jButton1.setBackground(new java.awt.Color(88, 120, 159));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 370, 200, 40);

        trmrs1.setBackground(new java.awt.Color(88, 120, 159));
        trmrs1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        trmrs1.setForeground(new java.awt.Color(255, 255, 255));
        trmrs1.setText("Insert Courses");
        trmrs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trmrs1ActionPerformed(evt);
            }
        });
        jPanel1.add(trmrs1);
        trmrs1.setBounds(150, 250, 200, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/nstu (3).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -50, 530, 620);

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

    private void stdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdiActionPerformed
        
        new IIS_Student_Info11();
        this.dispose();
        
    }//GEN-LAST:event_stdiActionPerformed

    private void trmrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trmrsActionPerformed
       
        new IIS_Result_Panel1();
        this.dispose();
        
    }//GEN-LAST:event_trmrsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void trmrs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trmrs1ActionPerformed

        new IIS_Courses1();
        this.dispose();

    }//GEN-LAST:event_trmrs1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(IIS_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IIS_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IIS_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IIS_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IIS_Admin();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton stdi;
    private javax.swing.JButton trmrs;
    private javax.swing.JButton trmrs1;
    // End of variables declaration//GEN-END:variables
}

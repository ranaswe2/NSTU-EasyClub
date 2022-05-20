
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

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usrnm = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 20, 470, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sonapur, Noakhali-3814, Bangladesh");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 50, 370, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("User Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 270, 110, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 340, 110, 20);

        usrnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrnmActionPerformed(evt);
            }
        });
        jPanel1.add(usrnm);
        usrnm.setBounds(220, 270, 160, 30);
        jPanel1.add(pass);
        pass.setBounds(220, 340, 160, 30);

        submit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(150, 420, 90, 30);

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(263, 420, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("LOGIN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(210, 180, 100, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Admin Panel");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 110, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/nstu (3).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 560, 570);

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

    private void usrnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrnmActionPerformed
        
    }//GEN-LAST:event_usrnmActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
           Connection con= null;
           Statement st= null;
           
           
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/result_admin","root","");
            st=con.createStatement(); 
            
            String query= "SELECT * FROM admin WHERE dpt LIKE '"+usrnm.getText()+"' AND code LIKE '"+pass.getText()+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            if((rs.getString("dpt")).equals("IIT") & (pass.getText()).equals(rs.getString("code"))){
                new IIT_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("IIS") & (pass.getText()).equals(rs.getString("code"))){
                new IIS_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("CSTE") & (pass.getText()).equals(rs.getString("code"))){
                new CSTE_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("ICE") & (pass.getText()).equals(rs.getString("code"))){
                new ICE_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("ACCE") & (pass.getText()).equals(rs.getString("code"))){
                new ACCE_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("PHARMACY") & (pass.getText()).equals(rs.getString("code"))){
                new PHARMACY_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("MBG") & (pass.getText()).equals(rs.getString("code"))){
                new MBG_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("EEE") & (pass.getText()).equals(rs.getString("code"))){
                new EEE_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("FIMS") & (pass.getText()).equals(rs.getString("code"))){
                new FIMS_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("A.MATH") & (pass.getText()).equals(rs.getString("code"))){
                new AMATH_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("FTNS") & (pass.getText()).equals(rs.getString("code"))){
                new FTNS_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("STATISTICS") & (pass.getText()).equals(rs.getString("code"))){
                new STAT_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("ESDM") & (pass.getText()).equals(rs.getString("code"))){
                new ESDM_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("AGRICULTURE") & (pass.getText()).equals(rs.getString("code"))){
                new AGRI_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("BGE") & (pass.getText()).equals(rs.getString("code"))){
                new BGE_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("OCEANOGRAPHY") & (pass.getText()).equals(rs.getString("code"))){
                new IIS_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("BMB") & (pass.getText()).equals(rs.getString("code"))){
                new BMB_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("ZOOLOGY") & (pass.getText()).equals(rs.getString("code"))){
                new ZOO_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("ECONOMICS") & (pass.getText()).equals(rs.getString("code"))){
                new ECONO_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("BLWS") & (pass.getText()).equals(rs.getString("code"))){
                new BLWS_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("SOCIOLOGY") & (pass.getText()).equals(rs.getString("code"))){
                new SOCIO_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("ENGLISH") & (pass.getText()).equals(rs.getString("code"))){
                new ENGLISH_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("BANGLA") & (pass.getText()).equals(rs.getString("code"))){
                new BANGLA_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("SW") & (pass.getText()).equals(rs.getString("code"))){
                new SW_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("DBA") & (pass.getText()).equals(rs.getString("code"))){
                new DBA_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("THM") & (pass.getText()).equals(rs.getString("code"))){
                new THM_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("MIS") & (pass.getText()).equals(rs.getString("code"))){
                new MIS_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("IIS") & (pass.getText()).equals(rs.getString("code"))){
                new IIS_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("EDUCATION") & (pass.getText()).equals(rs.getString("code"))){
                new EDU_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("EDU.ADMIN") & (pass.getText()).equals(rs.getString("code"))){
                new EDUADMIN_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else if((rs.getString("dpt")).equals("LAW") & (pass.getText()).equals(rs.getString("code"))){
                new LAW_Admin();
                this.dispose();
                //System.out.println(rs.getString("dpt")+" "+rs.getString("code"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
            }
            
            }
            rs.close();
            con.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_submitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       
        
        
    }//GEN-LAST:event_backActionPerformed

    
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton submit;
    private javax.swing.JTextField usrnm;
    // End of variables declaration//GEN-END:variables
}

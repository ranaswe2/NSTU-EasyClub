
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class IIT_Courses extends javax.swing.JFrame {

 
    public IIT_Courses() {
        initComponents();
        setVisible(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cCode = new javax.swing.JTextField();
        term = new javax.swing.JTextField();
        cTitle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cCredit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 222, 223));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/nstu.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 80, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 30, 580, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Noakhali-3814, Bangladesh");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 70, 510, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Course of IIT");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 140, 190, 30);

        cCode.setText("CSTE XXXX");
        jPanel1.add(cCode);
        cCode.setBounds(290, 260, 190, 30);

        term.setText("Year-1 Term-1");
        jPanel1.add(term);
        term.setBounds(290, 210, 190, 30);

        cTitle.setText("AAAA BBBBB CCCC DDDD");
        cTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTitleActionPerformed(evt);
            }
        });
        jPanel1.add(cTitle);
        cTitle.setBounds(290, 310, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Term");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 210, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Course Code");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 260, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Course Title");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(170, 310, 110, 30);

        update.setBackground(new java.awt.Color(88, 110, 159));
        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(140, 430, 90, 30);

        reset.setBackground(new java.awt.Color(88, 110, 159));
        reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(320, 430, 90, 30);

        submit.setBackground(new java.awt.Color(88, 110, 159));
        submit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(230, 430, 90, 30);

        delete.setBackground(new java.awt.Color(88, 110, 159));
        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(410, 430, 90, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Course Credit");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(170, 360, 120, 30);

        cCredit.setText("3");
        jPanel1.add(cCredit);
        cCredit.setBounds(290, 360, 190, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
         if( (term.getText()).equals("Year-1 Term-1")){
        theQuery1("INSERT INTO `y-1_t-1` (`code`, `title`, `credit`, `attendence`, `comment`) VALUES ('"+cCode.getText()+"', '"+cTitle.getText()+"', '"+cCredit.getText()+"', '', '')");
        }
        else if(  (term.getText()).equals("Year-1 Term-2")){
        theQuery1("INSERT INTO `y-1_t-2` (`code`, `title`, `credit`, `attendence`, `comment`) VALUES ('"+cCode.getText()+"', '"+cTitle.getText()+"', '"+cCredit.getText()+"', '', '')");
        }
        else if( (term.getText()).equals("Year-2 Term-1")){
        theQuery1("INSERT INTO `y-2_t-1` (`code`, `title`, `credit`, `attendence`, `comment`) VALUES ('"+cCode.getText()+"', '"+cTitle.getText()+"', '"+cCredit.getText()+"', '', '')");
        }
        
        else if( (term.getText()).equals("Year-2 Term-2")){
        theQuery1("INSERT INTO `y-2_t-2` (`code`, `title`, `credit`, `attendence`, `comment`) VALUES ('"+cCode.getText()+"', '"+cTitle.getText()+"', '"+cCredit.getText()+"', '', '')");
        }
        else if( (term.getText()).equals("Year-3 Term-1")){
        theQuery1("INSERT INTO `y-3_t-1` (`code`, `title`, `credit`, `attendence`, `comment`) VALUES ('"+cCode.getText()+"', '"+cTitle.getText()+"', '"+cCredit.getText()+"', '', '')");
        }
        else if( (term.getText()).equals("Year-3 Term-2")){
        theQuery1("INSERT INTO `y-3_t-2` (`code`, `title`, `credit`, `attendence`, `comment`) VALUES ('"+cCode.getText()+"', '"+cTitle.getText()+"', '"+cCredit.getText()+"', '', '')");
        }
        else if( (term.getText()).equals("Year-4 Term-1")){
        theQuery1("INSERT INTO `y-4_t-1` (`code`, `title`, `credit`, `attendence`, `comment`) VALUES ('"+cCode.getText()+"', '"+cTitle.getText()+"', '"+cCredit.getText()+"', '', '')");
        }
        
        else if( (term.getText()).equals("Year-4 Term-2")){
        theQuery1("INSERT INTO `y-4_t-2` (`code`, `title`, `credit`, `attendence`, `comment`) VALUES ('"+cCode.getText()+"', '"+cTitle.getText()+"', '"+cCredit.getText()+"', '', '')");
        }
    }//GEN-LAST:event_submitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if( (term.getText()).equals("Year-1 Term-1")){
        theQuery1("UPDATE `y-1_t-1` SET `title`='"+cTitle.getText()+"',`credit`='"+cCredit.getText()+"',`attendence`=' ',`comment`='' WHERE `code`='"+cCode.getText()+"'");
        }
        else if(  (term.getText()).equals("Year-1 Term-2")){
        theQuery1("UPDATE `y-1_t-2` SET `title`='"+cTitle.getText()+"',`credit`='"+cCredit.getText()+"',`attendence`=' ',`comment`='' WHERE `code`='"+cCode.getText()+"'");
        }
        else if( (term.getText()).equals("Year-2 Term-1")){
        theQuery1("UPDATE `y-2_t-1` SET `title`='"+cTitle.getText()+"',`credit`='"+cCredit.getText()+"',`attendence`=' ',`comment`='' WHERE `code`='"+cCode.getText()+"'");
        }
        else if(  (term.getText()).equals("Year-2 Term-2")){
        theQuery1("UPDATE `y-2_t-2` SET `title`='"+cTitle.getText()+"',`credit`='"+cCredit.getText()+"',`attendence`=' ',`comment`='' WHERE `code`='"+cCode.getText()+"'");
        }
        else if( (term.getText()).equals("Year-3 Term-1")){
        theQuery1("UPDATE `y-3_t-1` SET `title`='"+cTitle.getText()+"',`credit`='"+cCredit.getText()+"',`attendence`=' ',`comment`='' WHERE `code`='"+cCode.getText()+"'");
        }
        else if( (term.getText()).equals("Year-3 Term-2")){
        theQuery1("UPDATE `y-3_t-2` SET `title`='"+cTitle.getText()+"',`credit`='"+cCredit.getText()+"',`attendence`=' ',`comment`='' WHERE `code`='"+cCode.getText()+"'");
        }
        else if( (term.getText()).equals("Year-4 Term-1")){
        theQuery1("UPDATE `y-4_t-1` SET `title`='"+cTitle.getText()+"',`credit`='"+cCredit.getText()+"',`attendence`=' ',`comment`='' WHERE `code`='"+cCode.getText()+"'");
        }
        else if( (term.getText()).equals("Year-4 Term-2")){
        theQuery1("UPDATE `y-4_t-2` SET `title`='"+cTitle.getText()+"',`credit`='"+cCredit.getText()+"',`attendence`=' ',`comment`='' WHERE `code`='"+cCode.getText()+"'");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       
         if((term.getText()).equals("Year-1 Term-1")){
        theQuery1("DELETE FROM `y-1_t-1` WHERE code='"+cCode.getText()+"'");
        }
        else if((term.getText()).equals("Year-1 Term-2")){
        theQuery1("DELETE FROM `y-1_t-2` WHERE code='"+cCode.getText()+"'");
        }
        else if( (term.getText()).equals("Year-2 Term-1")){
        theQuery1("DELETE FROM `y-2_t-1` WHERE code='"+cCode.getText()+"'");
        }
        else if( (term.getText()).equals("Year-2 Term-2")){
        theQuery1("DELETE FROM `y-2_t-2` WHERE code='"+cCode.getText()+"'");
        }
        else if((term.getText()).equals("Year-3 Term-1")){
        theQuery1("DELETE FROM `y-3_t-1` WHERE code='"+cCode.getText()+"'");
        }
        else if(  (term.getText()).equals("Year-3 Term-2")){
        theQuery1("DELETE FROM `y-3_t-2` WHERE code='"+cCode.getText()+"'");
        }
        else if(  (term.getText()).equals("Year-4 Term-1")){
        theQuery1("DELETE FROM `y-4_t-1` WHERE code='"+cCode.getText()+"'");
        }
        else if( (term.getText()).equals("Year-4 Term-2")){
        theQuery1("DELETE FROM `y-4_t-2` WHERE code='"+cCode.getText()+"'");
        }
         
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       
        term.setText(" ");
        cCode.setText(" ");
        cTitle.setText(" ");
        cCredit.setText(" ");
        
    }//GEN-LAST:event_resetActionPerformed

    private void cTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTitleActionPerformed

   
    public void theQuery1(String query){
           
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
           Connection con= null;
           Statement st= null;
           
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/course_iit","root","");
            st=con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Query Executed.");
            
            con.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
           
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
            java.util.logging.Logger.getLogger(IIT_Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IIT_Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IIT_Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IIT_Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IIT_Courses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cCode;
    private javax.swing.JTextField cCredit;
    private javax.swing.JTextField cTitle;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTextField term;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

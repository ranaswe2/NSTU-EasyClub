
package admit_card;

import course_registration.*;
import fees.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class FillUpForm_AdmitCard extends javax.swing.JFrame {

   
    public FillUpForm_AdmitCard() {
        initComponents();
        setSize(650,550);
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        termComb = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        programComb = new javax.swing.JComboBox();
        dpt = new javax.swing.JTextField();
        roll = new javax.swing.JTextField();
        sessionComb = new javax.swing.JComboBox();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 205));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees/nstu.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 80, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 10, 540, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Noakhali-3814, Bangladesh");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 50, 480, 30);

        termComb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        termComb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year-1_Term-1", "Year-1_Term-2", "Year-2_Term-1", "Year-2_Term-2", "Year-3_Term-1", "Year-3_Term-2", "Year-4_Term-1", "Year-4_Term-2", " " }));
        termComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termCombActionPerformed(evt);
            }
        });
        jPanel1.add(termComb);
        termComb.setBounds(340, 330, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Department / Institute :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 180, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Class Roll                       :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 380, 190, 30);

        programComb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        programComb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BSc", "BPharm", "BSS", "BBA", "BA", "MSc", "MA" }));
        programComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programCombActionPerformed(evt);
            }
        });
        jPanel1.add(programComb);
        programComb.setBounds(340, 280, 160, 30);

        dpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptActionPerformed(evt);
            }
        });
        jPanel1.add(dpt);
        dpt.setBounds(340, 180, 160, 30);

        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });
        jPanel1.add(roll);
        roll.setBounds(340, 380, 160, 30);

        sessionComb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sessionComb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016-17", "2017-18", "2018-19", "2019-20", "2020-21" }));
        sessionComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionCombActionPerformed(evt);
            }
        });
        jPanel1.add(sessionComb);
        sessionComb.setBounds(340, 230, 160, 30);

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
        submit.setBounds(180, 450, 110, 30);

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
        reset.setBounds(350, 450, 110, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Login Form ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 140, 210, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Attendence Report & Admit Card");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 100, 360, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Term                              :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 330, 200, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Session                           :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(140, 230, 200, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Program                        :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 280, 200, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void termCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termCombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_termCombActionPerformed

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        
        roll.addKeyListener(new KeyAdapter(){
            
            public void keyTyped(KeyEvent e){
                
                char ch= e.getKeyChar();
                if(!(ch >='0' && ch <='9' || (Character.isAlphabetic(ch)) || (ch==KeyEvent.VK_BACK_SPACE) || (ch==KeyEvent.VK_DELETE))){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Give correct Roll !");
                }
            }
        });
        
    }//GEN-LAST:event_rollActionPerformed

    private void programCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programCombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programCombActionPerformed

    private void sessionCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionCombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionCombActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       
        if(dpt.getText().trim().length()==0 || 
                roll.getText().trim().length()==0 ){
            JOptionPane.showMessageDialog(null, "Fill all fields!");
        }
        else {
            
            String Dpt= dpt.getText();
            String Roll= roll.getText();
            String Stype= "";
          
            String session= (String)sessionComb.getSelectedItem();
            String term= (String)termComb.getSelectedItem();
            String program= (String)programComb.getSelectedItem();
            String Credit= "";
            String fee= "";
             
            try {
                            Class.forName("com.mysql.jdbc.Driver");
                        
            Connection con1= null;
            Statement st1= null;
            
            con1= DriverManager.getConnection("jdbc:mysql://localhost/student_aa","root","");
            st1= con1.createStatement();
            
            String query= "DELETE FROM `login`";
            st1.executeUpdate(query);
            
            String query1= "INSERT INTO `login`(`dpt`, `session`, `program`, `term`, `roll`, `credit`, `stype`, `fee`) VALUES ('"+Dpt+"','"+session+"','"+program+"','"+term+"','"+Roll+"','"+Credit+"','"+Stype+"','"+fee+"')";
            st1.executeUpdate(query1);
            
            st1.close();
            con1.close();
        } catch (Exception ex) {
             ex.printStackTrace();
                        }
                                 
                                 if(Dpt.equals("IIT")){
                                 new IIT_Atendence();
                                 }
                                 else if(Dpt.equals("IIS")){
                                 new IIS_Atendence1();
                                 }
                                 else if(Dpt.equals("ACCE")){
                                 new ACCE_Atendence1();
                                 }
                                 else if(Dpt.equals("AGRICULTURE")){
                                 new AGRI_Atendence1();
                                 }
                                 else if(Dpt.equals("A.MATH")){
                                 new AMATH_CourseReg1();
                                 }
                                 else if(Dpt.equals("BANGLA")){
                                 new BANGLA_Atendence1();
                                 }
                                 else if(Dpt.equals("BGE")){
                                 new BGE_Atendence1();
                                 }
                                 else if(Dpt.equals("BLWS")){
                                 new BLWS_Atendence1();
                                 }
                                 else if(Dpt.equals("BMB")){
                                 new BMB_Atendence1();
                                 }
                                 else if(Dpt.equals("CSTE")){
                                 new CSTE_Atendence();
                                 }
                                 else if(Dpt.equals("DBA")){
                                 new DBA_Atendence1();
                                 }
                                 else if(Dpt.equals("ECONOMICS")){
                                 new ECONO_Atendence1();
                                 }
                                 else if(Dpt.equals("EDU.ADMIN")){
                                 new EDUAD_Atendence1();
                                 }
                                 else if(Dpt.equals("EDUCATION")){
                                 new EDU_Atendence1();
                                 }
                                 else if(Dpt.equals("EEE")){
                                 new EEE_Atendence1();
                                 }
                                 else if(Dpt.equals("ENGLISH")){
                                 new ENGLISH_Atendence1();
                                 }
                                 else if(Dpt.equals("ESDM")){
                                 new ESDM_Atendence1();
                                 }
                                 else if(Dpt.equals("FIMS")){
                                 new FIMS_Atendence1();
                                 }
                                 else if(Dpt.equals("FTNS")){
                                 new FTNS_Atendence1();
                                 }
                                 else if(Dpt.equals("ICE")){
                                 new ICE_Atendence1();
                                 }
                                 else if(Dpt.equals("LAW")){
                                 new LAW_Atendence1();
                                 }
                                 else if(Dpt.equals("MBG")){
                                 new MBG_Atendence1();
                                 }
                                 else if(Dpt.equals("MIS")){
                                 new MIS_Atendence1();
                                 }
                                 else if(Dpt.equals("OCEANOGRAPHY")){
                                 new OCN_Atendence1();
                                 }
                                 else if(Dpt.equals("PHARMACY")){
                                 new PHARM_Atendence1();
                                 }
                                 else if(Dpt.equals("SOCIOLOGY")){
                                 new SOCIO_Atendence1();
                                 }
                                 else if(Dpt.equals("STATISTICS")){
                                 new STAT_Atendence1();
                                 }
                                 else if(Dpt.equals("SW")){
                                 new SW_Atendence1();
                                 }
                                 else if(Dpt.equals("THM")){
                                 new THM_Atendence1();
                                 }
                                 else if(Dpt.equals("ZOOLOGY")){
                                 new ZOO_Atendence1();
                                 }
                                 else{
                                     JOptionPane.showMessageDialog(null, "Incorrect Department Key !");
                                 }
           
            }
           
                
            this.dispose();

    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       
            dpt.setText("");
            roll.setText("");

    }//GEN-LAST:event_resetActionPerformed

    private void dptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptActionPerformed

        dpt.addKeyListener(new KeyAdapter(){

            public void keyTyped(KeyEvent e){

                char ch= e.getKeyChar();
                if(!(Character.isAlphabetic(ch) || ch== ' ' || ch=='\b' || ch==KeyEvent.VK_DELETE)){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"<html>Only A-Z, a-z, Space character<br/> will be allowed!");
                }
            }
        });

    }//GEN-LAST:event_dptActionPerformed

    
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
            java.util.logging.Logger.getLogger(FillUpForm_AdmitCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FillUpForm_AdmitCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FillUpForm_AdmitCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FillUpForm_AdmitCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FillUpForm_AdmitCard();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dpt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox programComb;
    private javax.swing.JButton reset;
    private javax.swing.JTextField roll;
    private javax.swing.JComboBox sessionComb;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox termComb;
    // End of variables declaration//GEN-END:variables
}
// Front-end 305 Lines only
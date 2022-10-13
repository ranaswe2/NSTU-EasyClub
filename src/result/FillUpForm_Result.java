
package result;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class FillUpForm_Result extends javax.swing.JFrame {

 
    public FillUpForm_Result() {
        initComponents();
        
    rollTxt.addKeyListener(new KeyAdapter(){
            
            public void keyTyped(KeyEvent e){
                
                char ch= e.getKeyChar();
                if(!(Character.isAlphabetic(ch)||ch>='0' && ch<='9'|| ch=='\b' || ch==KeyEvent.VK_DELETE)){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"<html>Only A-Z and 0-9<br/> will be allowed!");
                }
            }
        });
    
    rollBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
           
            if(rollTxt.getText().trim().length()==0 ){
                JOptionPane.showMessageDialog(null, "Enter Roll Number !");
            }
            else{
            String Dpt=dptTxt.getText();
             theQuery3("DELETE FROM `login`");
             theQuery3("INSERT INTO `login`(`dpt`, `session`, `term`, `roll`) VALUES  ('"+dptTxt.getText()+"','"+ssn.getSelectedItem()+"','"+trm.getSelectedItem()+"','"+rollTxt.getText()+"')");
        
       
               
                                 if(Dpt.equals("IIT")){
                                 new IIT_Result();
                                 }
                                 else if(Dpt.equals("IIS")){
                                 new IIS_Result1();
                                 }
                                 else if(Dpt.equals("ACCE")){
                                 new ACCE_Result1();
                                 }
                                 else if(Dpt.equals("AGRICULTURE")){
                                 new AGRI_Result1();
                                 }
                                 else if(Dpt.equals("A.MATH")){
                                 new AMATH_Result1();
                                 }
                                 else if(Dpt.equals("BANGLA")){
                                 new BANGLA_Result1();
                                 }
                                 else if(Dpt.equals("BGE")){
                                 new BGE_Result1();
                                 }
                                 else if(Dpt.equals("BLWS")){
                                 new BLWS_Result1();
                                 }
                                 else if(Dpt.equals("BMB")){
                                 new BMB_Result1();
                                 }
                                 else if(Dpt.equals("CSTE")){
                                 new CSTE_Result();
                                 }
                                 else if(Dpt.equals("DBA")){
                                 new DBA_Result1();
                                 }
                                 else if(Dpt.equals("ECONOMICS")){
                                 new ECONO_Result1();
                                 }
                                 else if(Dpt.equals("EDU.ADMIN")){
                                 new EDUAD_Result1();
                                 }
                                 else if(Dpt.equals("EDUCATION")){
                                 new EDU_Result1();
                                 }
                                 else if(Dpt.equals("EEE")){
                                 new EEE_Result1();
                                 }
                                 else if(Dpt.equals("ENGLISH")){
                                 new ENGLISH_Result1();
                                 }
                                 else if(Dpt.equals("ESDM")){
                                 new ESDM_Result1();
                                 }
                                 else if(Dpt.equals("FIMS")){
                                 new FIMS_Result1();
                                 }
                                 else if(Dpt.equals("FTNS")){
                                 new FTNS_Result1();
                                 }
                                 else if(Dpt.equals("ICE")){
                                 new ICE_Result1();
                                 }
                                 else if(Dpt.equals("LAW")){
                                 new LAW_Result1();
                                 }
                                 else if(Dpt.equals("MBG")){
                                 new MBG_Result1();
                                 }
                                 else if(Dpt.equals("MIS")){
                                 new MIS_Result1();
                                 }
                                 else if(Dpt.equals("OCEANOGRAPHY")){
                                 new OCN_Result1();
                                 }
                                 else if(Dpt.equals("PHARMACY")){
                                 new PHARM_Result1();
                                 }
                                 else if(Dpt.equals("SOCIOLOGY")){
                                 new SOCIO_Result1();
                                 }
                                 else if(Dpt.equals("STATISTICS")){
                                 new STAT_Result1();
                                 }
                                 else if(Dpt.equals("SW")){
                                 new SW_Result1();
                                 }
                                 else if(Dpt.equals("THM")){
                                 new THM_Result1();
                                 }
                                 else if(Dpt.equals("ZOOLOGY")){
                                 new ZOO_Result1();
                                 }
                                 else{
                                     JOptionPane.showMessageDialog(null, "Incorrect Department key!");
                                 } 
                 
            }
            }
        });
    
    this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rollTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rollBtn = new javax.swing.JButton();
        ssn = new javax.swing.JComboBox();
        trm = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dptTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Roll");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 350, 120, 30);

        rollTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollTxtActionPerformed(evt);
            }
        });
        jPanel1.add(rollTxt);
        rollTxt.setBounds(320, 350, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result/nstu.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 80, 110);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 20, 560, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Noakhali-3814, Bangladesh");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 50, 500, 40);

        rollBtn.setBackground(new java.awt.Color(88, 110, 159));
        rollBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rollBtn.setForeground(new java.awt.Color(255, 255, 255));
        rollBtn.setText("Submit");
        rollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollBtnActionPerformed(evt);
            }
        });
        jPanel1.add(rollBtn);
        rollBtn.setBounds(260, 410, 150, 40);

        ssn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ssn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016-17", "2017-18", "2018-19", "2019-20", "2020-21" }));
        jPanel1.add(ssn);
        ssn.setBounds(320, 250, 170, 30);

        trm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        trm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year-1_Term-1", "Year-1_Term-2", "Year-2_Term-1", "Year-2_Term-2", "Year-3_Term-1", "Year-3_Term-2", "Year-4_Term-1", "Year-4_Term-2" }));
        jPanel1.add(trm);
        trm.setBounds(320, 300, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Session");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 250, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Term");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 300, 150, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Login for Term Result");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(230, 120, 280, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Department");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 200, 160, 30);
        jPanel1.add(dptTxt);
        dptTxt.setBounds(320, 200, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollBtnActionPerformed
       
        
        this.dispose();
        
    }//GEN-LAST:event_rollBtnActionPerformed

    private void rollTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollTxtActionPerformed
      
    }//GEN-LAST:event_rollTxtActionPerformed

    public void theQuery3(String query){
           
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
           Connection con= null;
           Statement st= null;
           
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/result_aa","root","");
            st=con.createStatement();
            st.executeUpdate(query);
            //JOptionPane.showMessageDialog(null, "Query Executed.");
            
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
            java.util.logging.Logger.getLogger(FillUpForm_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FillUpForm_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FillUpForm_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FillUpForm_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FillUpForm_Result();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dptTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rollBtn;
    private javax.swing.JTextField rollTxt;
    private javax.swing.JComboBox ssn;
    private javax.swing.JComboBox trm;
    // End of variables declaration//GEN-END:variables
}

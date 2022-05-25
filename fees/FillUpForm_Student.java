
package fees;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class FillUpForm_Student extends javax.swing.JFrame {

   
    public FillUpForm_Student() {
                
        initComponents();
        setSize(650,550);
        
        buttonGroup1.add(res);
        buttonGroup1.add(nonRes);
        
         
        roll.addKeyListener(new KeyAdapter(){
            
            public void keyTyped(KeyEvent e){
                
                char ch= e.getKeyChar();
                if(!(ch >='0' && ch <='9' || (Character.isAlphabetic(ch)) || (ch==KeyEvent.VK_BACK_SPACE) || (ch==KeyEvent.VK_DELETE))){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Give correct Roll !");
                }
            }
        });
        
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
        feeComb = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        programComb = new javax.swing.JComboBox();
        dpt = new javax.swing.JTextField();
        roll = new javax.swing.JTextField();
        res = new javax.swing.JRadioButton();
        nonRes = new javax.swing.JRadioButton();
        sessionComb = new javax.swing.JComboBox();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        credit = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

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
        termComb.setBounds(450, 240, 140, 30);

        feeComb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        feeComb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fee_Type", "Short_Course", "Term_Charge", "Exam_Fee", "Registration", "Backlog", "Improvement" }));
        feeComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeCombActionPerformed(evt);
            }
        });
        jPanel1.add(feeComb);
        feeComb.setBounds(450, 290, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Department / Institute :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 140, 200, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Class Roll                         :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 190, 190, 20);

        programComb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        programComb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Program", "BSSE", "MSSE", "MIT", "PGDIT", "SHORT CRS", " " }));
        programComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programCombActionPerformed(evt);
            }
        });
        jPanel1.add(programComb);
        programComb.setBounds(450, 190, 140, 30);

        dpt.setText("IIT");
        dpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptActionPerformed(evt);
            }
        });
        jPanel1.add(dpt);
        dpt.setBounds(250, 140, 160, 30);

        roll.setText("ASH1925001M");
        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });
        jPanel1.add(roll);
        roll.setBounds(250, 190, 160, 30);

        res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        res.setText("Residential");
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });
        jPanel1.add(res);
        res.setBounds(240, 300, 99, 25);

        nonRes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nonRes.setText("Non-Residential");
        jPanel1.add(nonRes);
        nonRes.setBounds(240, 330, 140, 23);

        sessionComb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sessionComb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Session", "2017-18", "2018-19", "2019-20", "2020-21" }));
        sessionComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionCombActionPerformed(evt);
            }
        });
        jPanel1.add(sessionComb);
        sessionComb.setBounds(450, 140, 140, 30);

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
        submit.setBounds(210, 420, 110, 30);

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
        reset.setBounds(330, 420, 110, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Fill all fields carefully .");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(220, 100, 210, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Type of Student             :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 310, 200, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Term Credit                    :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 240, 190, 20);

        credit.setText("21.5");
        credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditActionPerformed(evt);
            }
        });
        jPanel1.add(credit);
        credit.setBounds(250, 240, 160, 30);

        jPanel2.setBackground(new java.awt.Color(205, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(420, 120, 200, 220);

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
       
        
    }//GEN-LAST:event_rollActionPerformed

    private void programCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programCombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programCombActionPerformed

    private void feeCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeCombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeCombActionPerformed

    private void sessionCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionCombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionCombActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       
        if(dpt.getText().trim().length()==0 || 
                roll.getText().trim().length()==0 ||
                credit.getText().trim().length()==0 ||
                buttonGroup1.isSelected(null)){
            JOptionPane.showMessageDialog(null, "Fill all fields!");
        }
        else {
            
            String Dpt= dpt.getText();
            String Roll= roll.getText();
            String Credit= credit.getText();
            String Stype= null;
           if(res.isSelected()){
               Stype=res.getText();
           }
           else if(nonRes.isSelected()){
               Stype=nonRes.getText();
           }
            String fee= (String)feeComb.getSelectedItem();
            String session= (String)sessionComb.getSelectedItem();
            String term= (String)termComb.getSelectedItem();
            String program= (String)programComb.getSelectedItem();
            
             
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
            //new TermFinal();
            if(Stype.equals("Non-Residential") && fee.equals("Term_Charge") && (term.equals("Year-2_Term-1") || term.equals("Year-3_Term-1") || term.equals("Year-4_Term-1"))){
                new TermFee_NonRes_21_31_41();
            }  
            else if(Stype.equals("Residential") && fee.equals("Term_Charge") && (term.equals("Year-2_Term-1") || term.equals("Year-3_Term-1") || term.equals("Year-4_Term-1"))){
                new TermFee_Resident_21_31_41();
            }
            else if(Stype.equals("Non-Residential") && fee.equals("Term_Charge") && (term.equals("Year-1_Term-2")) || (term.equals("Year-2_Term-2") || term.equals("Year-3_Term-2") || term.equals("Year-4_Term-2"))){
                new TermFee_NonRes_12_22_32_42();
            }
            else if(Stype.equals("Residential") && fee.equals("Term_Charge") && (term.equals("Year-1_Term-2")) || (term.equals("Year-2_Term-2") || term.equals("Year-3_Term-2") || term.equals("Year-4_Term-2"))){
                new TermFee_Res_12_22_32_42();
            }
            
          /*  else if(fee.equals("Term_Charge") && (term.equals("Year-1_Term-1"))){
                new TermCharge_NotFound();
            } */
            
            
            else if(fee.equals("Exam_Fee")){
                new ExamFee();
            }
            else if(fee.equals("Short_Course")){
                new ShortCourseFee();
            }
            else{
                JOptionPane.showMessageDialog(null, "Fee not found yet!");
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

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resActionPerformed

    private void creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditActionPerformed
       
        credit.addKeyListener(new KeyAdapter(){
            
            public void keyTyped(KeyEvent e){
                
                char ch= e.getKeyChar();
                if(!(ch >='0' && ch <='9' || (ch==KeyEvent.VK_BACK_SPACE) || (ch==KeyEvent.VK_PERIOD) || (ch==KeyEvent.VK_DELETE))){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Give correct digit !");
                }
            }
        });
        
        
    }//GEN-LAST:event_creditActionPerformed

    
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
            java.util.logging.Logger.getLogger(FillUpForm_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FillUpForm_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FillUpForm_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FillUpForm_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FillUpForm_Student();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField credit;
    private javax.swing.JTextField dpt;
    private javax.swing.JComboBox feeComb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton nonRes;
    private javax.swing.JComboBox programComb;
    private javax.swing.JRadioButton res;
    private javax.swing.JButton reset;
    private javax.swing.JTextField roll;
    private javax.swing.JComboBox sessionComb;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox termComb;
    // End of variables declaration//GEN-END:variables
}
// Front-end 305 Lines only
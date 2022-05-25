
package fees;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import result.IIT_Result;


public class TermFee_NonRes_12_22_32_42 extends javax.swing.JFrame {

                String type=null;
                
                String Dpt= null;
                String Roll= null;
                String Credit= null;
                String Session= null;
                String Stype= null;
                String Fee= null;
                String Term= null;
                String Program= null;
  
    public TermFee_NonRes_12_22_32_42() {
        try {
                            Class.forName("com.mysql.jdbc.Driver");
                        
            Connection con1= null;
            Statement st1= null;
            
            con1= DriverManager.getConnection("jdbc:mysql://localhost/student_aa","root","");
            st1= con1.createStatement();
             String query1= "SELECT * FROM `login`";
            
            ResultSet rs1= st1.executeQuery(query1);
            
            if(rs1.next()){
            
                     Dpt=rs1.getString("dpt");
                     Session= rs1.getString("session");
                     Term= rs1.getString("term");
                     Roll= rs1.getString("roll");
                     Credit= rs1.getString("credit");
                     Stype= rs1.getString("stype");
                     Program= rs1.getString("program"); 
                     Fee= rs1.getString("fee");        
                    
            }
            rs1.close();
            st1.close();
            con1.close();
        } catch (Exception ex) {
             ex.printStackTrace();
                        }
            initComponents();
            
                
                double cr= Double.valueOf(Credit);
                double crFee= cr*50;
                creditL.setText(String.valueOf(crFee));
                double trns= Double.parseDouble(transL.getText());
                double total= crFee + trns ;
                totaL.setText(String.valueOf(total));
                
 //////////////////////****************************************************////////////////////////////////
                                       //Start IIT Student Option//
 //////////////////////****************************************************////////////////////////////////
                    
            
            if(Dpt.equals("IIT")){  
                
                 try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= null;
            Statement st= null;
            
            con= DriverManager.getConnection("jdbc:mysql://localhost/student_info_"+Dpt.toLowerCase()+"","root","");
            st= con.createStatement();
            
            //////////////////////****************************************************////////////////////////////////        
            if(Session.equals("2016-17")){
                
             String query= "SELECT * FROM `session_1617` WHERE `roll` LIKE '"+Roll+"' ";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
                
                name.setText("Name of Student : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Class Roll : "+rs.getString("roll"));
                hall.setText("Hall Name : "+rs.getString("hall"));
                type=rs.getString("stype");
                stype.setText("Type of Student : "+type); 
            
            rs.close();
            }
            
    }
            if(Session.equals("2017-18")){
                
             String query= "SELECT * FROM `session_1718` WHERE `roll` LIKE '"+Roll+"' ";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                 
                name.setText("Name of Student : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Class Roll : "+rs.getString("roll"));
                hall.setText("Hall Name : "+rs.getString("hall"));
                type=rs.getString("stype");
                stype.setText("Type of Student : "+type); 
                
            
            rs.close();
            }
            
    }
            else if(Session.equals("2018-19")){
                
             String query= "SELECT * FROM `session_1819` WHERE `roll` LIKE '"+Roll+"' ";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                 
                name.setText("Name of Student : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Class Roll : "+rs.getString("roll"));
                hall.setText("Hall Name : "+rs.getString("hall"));
                type=rs.getString("stype");
                stype.setText("Type of Student : "+type); 
                
            
            rs.close();
            }
            
    }
            else if(Session.equals("2019-20")){
                
             String query= "SELECT * FROM `session_1920` WHERE `roll` LIKE '"+Roll+"' ";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                 
                name.setText("Name of Student : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Class Roll : "+rs.getString("roll"));
                hall.setText("Hall Name : "+rs.getString("hall"));
                type=rs.getString("stype");
                stype.setText("Type of Student : "+type); 
                
            
            rs.close();
            }
            
    }
 //////////////////////****************************************************////////////////////////////////
           
            con.close();
            st.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            Logger.getLogger(IIT_Result.class.getName()).log(Level.SEVERE, null, ex);
        }
                    }
 //////////////////////****************************************************////////////////////////////////
                                       //End IIT Student Option//
 //////////////////////****************************************************////////////////////////////////
                dpt.setText("Department / Institute : "+Dpt);
                session.setText("Session : "+Session);
                term1.setText("Term Charge of "+Program+" "+Term);
             
  //-----------------------------------------------------------------------//
          jButton1.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                   
                        String path="";
        JFileChooser j= new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x= j.showSaveDialog(null);
        
        if(x== JFileChooser.APPROVE_OPTION){
            path= j.getSelectedFile().getPath();
        }
        
        Document doc= new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"TutionFee_12.pdf"));
            doc.open();
            
            Font font= FontFactory.getFont(FontFactory.COURIER, 18, BaseColor.BLUE);
            Font font1= FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.BLACK);
            Font font2= FontFactory.getFont(FontFactory.HELVETICA, 10, BaseColor.BLACK);
            
            Paragraph p= new Paragraph("Noakhali Science and Technology University\n",font);  
            Paragraph p1= new Paragraph("Noakhali-3814, Bangladesh");
            Paragraph p2= new Paragraph("Bank Account Number : 0200005326540                                      ");
            
            Paragraph p5=new Paragraph("****************************************************************************************************************");
            
            Paragraph p4=new Paragraph(name.getText());
            Paragraph p6= new Paragraph(dpt.getText()+"                                                   "+roll.getText() ,font1);
            Paragraph p7= new Paragraph(fana.getText()+"    "+mona.getText());
            Paragraph p8= new Paragraph(hall.getText()+"     "+stype.getText());
            Paragraph p17=new Paragraph("                  "+term1.getText()+ "( "+session.getText()+" )",font1);
            
            Paragraph p9= new Paragraph("Provost  (Sign & Seal)                                               Director/Chairman  (Sign & Seal)");
            Paragraph p10=new Paragraph("Fee Details",font1);
            Paragraph p11=new Paragraph("Credit Hour Fee (CrX50)          BDT   "+creditL.getText(),font2);
            Paragraph p12=new Paragraph("Transport Fee                           BDT   "+transL.getText(),font2);
            Paragraph p13=new Paragraph("Total :                                        BDT "+totaL.getText(),font2);
            //Paragraph p14=new Paragraph("In word, One thousand three hundrade and twenty Taka only.",font2);
            Paragraph p15=new Paragraph("Officer  (Sign & Seal)                                              Cashier");
            Paragraph p16=new Paragraph(" ");
            
            
            
            for(int i=0;i<6;i++){
                 
            doc.add(p);
            doc.add(p1);
            doc.add(p2);
            doc.add(p17);
            
                 if(i==0){
                     Paragraph p3= new Paragraph("Bank Copy",font1);
                     doc.add(p3);
                 }
                 else if(i==1){
                     Paragraph p3= new Paragraph("Student's Copy",font1);
                     doc.add(p3);
                 }
                 else if(i==2){
                     Paragraph p3= new Paragraph("Provost's Copy",font1);
                     doc.add(p3);
                 }
                 else if(i==3){
                     Paragraph p3= new Paragraph("Department's Copy",font1);
                     doc.add(p3);
                 }
                 else if(i==4){
                     Paragraph p3= new Paragraph("Register's Copy",font1);
                     doc.add(p3);
                 }
                 else if(i==5){
                     Paragraph p3= new Paragraph("Exam-Controler's Copy",font1);
                     doc.add(p3);
                 }
             
                 
                 doc.add(p16);
                 doc.add(p8);
                 doc.add(p6);
                 doc.add(p4);
                 doc.add(p7);
                 doc.add(p16);
                 doc.add(p16);
                 doc.add(p9);
                 doc.add(p10);
                 doc.add(p11);
                 doc.add(p12);
                 doc.add(p13);
                 doc.add(p16);
                 doc.add(p16);
                 doc.add(p15);
                 doc.add(p5);
                 
                 
             }
            
        } catch (DocumentException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        doc.close();
                        
                    }});
   //-----------------------------------------------------------------//                 
           
            this.setSize(650,650);
            
            if(Stype.equals(type)){
                this.setVisible(true);
            }
            else{
                new FillUpForm_Student();
            }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        roll = new javax.swing.JLabel();
        fana = new javax.swing.JLabel();
        mona = new javax.swing.JLabel();
        session = new javax.swing.JLabel();
        stype = new javax.swing.JLabel();
        hall = new javax.swing.JLabel();
        term1 = new javax.swing.JLabel();
        trtrytuu = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        creditL = new javax.swing.JLabel();
        transL = new javax.swing.JLabel();
        totaL = new javax.swing.JLabel();
        dpt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 205));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees/nstu.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 80, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 20, 560, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Noakhali-3814, Bangladesh");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 60, 500, 30);

        name.setText("Name");
        jPanel1.add(name);
        name.setBounds(60, 200, 350, 14);

        roll.setText("Roll");
        jPanel1.add(roll);
        roll.setBounds(420, 200, 220, 14);

        fana.setText("Father's Name");
        jPanel1.add(fana);
        fana.setBounds(60, 220, 350, 14);

        mona.setText("Mother's Name");
        jPanel1.add(mona);
        mona.setBounds(420, 220, 340, 14);

        session.setBackground(new java.awt.Color(255, 255, 205));
        session.setText("Session");
        jPanel1.add(session);
        session.setBounds(420, 180, 150, 14);

        stype.setText("Type of Student");
        jPanel1.add(stype);
        stype.setBounds(420, 240, 230, 20);

        hall.setText("Hall Name");
        jPanel1.add(hall);
        hall.setBounds(60, 240, 360, 20);

        term1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        term1.setText(" Final Examination 2020");
        jPanel1.add(term1);
        term1.setBounds(120, 120, 430, 30);

        trtrytuu.setText("Credit Hour Fee (CrX50)           BDT   ");
        jPanel1.add(trtrytuu);
        trtrytuu.setBounds(180, 340, 210, 14);

        jLabel18.setText("Transport Fee                             BDT   ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(180, 360, 230, 14);

        jLabel20.setText("Total                                              BDT ");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(180, 380, 210, 14);

        jButton1.setBackground(new java.awt.Color(88, 110, 159));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save as PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 460, 120, 30);

        jButton2.setBackground(new java.awt.Color(88, 110, 159));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 460, 120, 30);

        creditL.setText("creditL");
        jPanel1.add(creditL);
        creditL.setBounds(400, 340, 70, 14);

        transL.setText("420.0");
        jPanel1.add(transL);
        transL.setBounds(400, 360, 80, 14);

        totaL.setText("totalL");
        jPanel1.add(totaL);
        totaL.setBounds(400, 380, 80, 14);

        dpt.setText("Dpt / Instt.");
        jPanel1.add(dpt);
        dpt.setBounds(60, 180, 200, 14);

        jPanel2.setBackground(new java.awt.Color(205, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Fee Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(130, 290, 360, 120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        new FillUpForm_Student();
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

  
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
            java.util.logging.Logger.getLogger(TermFee_NonRes_12_22_32_42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TermFee_NonRes_12_22_32_42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TermFee_NonRes_12_22_32_42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TermFee_NonRes_12_22_32_42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TermFee_NonRes_12_22_32_42();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel creditL;
    private javax.swing.JLabel dpt;
    private javax.swing.JLabel fana;
    private javax.swing.JLabel hall;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mona;
    private javax.swing.JLabel name;
    private javax.swing.JLabel roll;
    private javax.swing.JLabel session;
    private javax.swing.JLabel stype;
    private javax.swing.JLabel term1;
    private javax.swing.JLabel totaL;
    private javax.swing.JLabel transL;
    private javax.swing.JLabel trtrytuu;
    // End of variables declaration//GEN-END:variables
}

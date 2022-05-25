
package fees;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import result.IIT_Result;


public class TermCharge_NotFound extends javax.swing.JFrame {

  
    public TermCharge_NotFound() {
        
            initComponents();
            
             try {
            File f1= new File("fee.txt");
            Scanner collect1= new Scanner(f1);
            while(collect1.hasNext()){
                String Dpt= collect1.next();
                String Roll= collect1.next();
                String Credit= collect1.next();
                String Session= collect1.next();
                String Stype= collect1.next();
                String Fee= collect1.next();
                String Term= collect1.next();
                String Program= collect1.next();
                
                
 //////////////////////****************************************************////////////////////////////////
                                       //Start IIT Student Option//
 //////////////////////****************************************************////////////////////////////////
                    
            
            if(Dpt.equals("IIT")){  
                
                 try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= null;
            Statement st= null;
            
            con= DriverManager.getConnection("jdbc:mysql://localhost/student_info_iit","root","");
            st= con.createStatement();
            
            //////////////////////****************************************************////////////////////////////////        
            
            if(Session.equals("2017-18")){
                
             String query= "SELECT * FROM `session_1718` WHERE `roll` LIKE '"+Roll+"' ";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                 
                name.setText("Name : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Roll : "+rs.getString("roll"));
                hall.setText("Hall : "+rs.getString("hall"));
                stype.setText("Type of Student : "+rs.getString("stype"));
                session.setText("Session : "+Session);
                program.setText("Program : "+Program);
                term1.setText(Term+"  Tution Fee 2020");
                
                
            
            rs.close();
            }
            
    }
            else if(Session.equals("2018-19")){
                
             String query= "SELECT * FROM `session_1819` WHERE `roll` LIKE '"+Roll+"' ";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                 
                name.setText("Name : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Roll : "+rs.getString("roll"));
                hall.setText("Hall : "+rs.getString("hall"));
                stype.setText("Type of Student : "+rs.getString("stype"));
                session.setText("Session : "+Session);
                program.setText("Program : "+Program);
                term1.setText(Term+"  Tution Fee 2020");
                
                
            
            rs.close();
            }
            
    }
            else if(Session.equals("2019-20")){
                
             String query= "SELECT * FROM `session_1920` WHERE `roll` LIKE '"+Roll+"' ";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                 
                name.setText("Name : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Roll : "+rs.getString("roll"));
                hall.setText("Hall : "+rs.getString("hall"));
                stype.setText("Type of Student : "+rs.getString("stype"));
                session.setText("Session : "+Session);
                program.setText("Program : "+Program);
                term1.setText(Term+"  Tution Fee 2020");
                
                
            
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
        
 //////////////////////****************************************************////////////////////////////////
                                       //Start IIS Student Option//
 //////////////////////****************************************************////////////////////////////////
                    
            
            else if(Dpt.equals("IIS")){  
                
                 try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= null;
            Statement st= null;
            
            con= DriverManager.getConnection("jdbc:mysql://localhost/student_info_iis","root","");
            st= con.createStatement();
            
            //////////////////////****************************************************////////////////////////////////        
            
            if(Session.equals("2017-18")){
                
             String query= "SELECT * FROM `session_1718` WHERE `roll` LIKE '"+Roll+"' ";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                 
                name.setText("Name : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Roll : "+rs.getString("roll"));
                hall.setText("Hall : "+rs.getString("hall"));
                stype.setText("Type of Student : "+rs.getString("stype"));
                session.setText("Session : "+Session);
                program.setText("Program : "+Program);
                term1.setText(Term+"  Tution Fee 2020");
                
                
            
            rs.close();
            }
            
    }
            else if(Session.equals("2018-19")){
                
             String query= "SELECT * FROM `session_1819` WHERE `roll` LIKE '"+Roll+"' ";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                 
                name.setText("Name : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Roll : "+rs.getString("roll"));
                hall.setText("Hall : "+rs.getString("hall"));
                stype.setText("Type of Student : "+rs.getString("stype"));
                session.setText("Session : "+Session);
                program.setText("Program : "+Program);
                term1.setText(Term+"  Tution Fee 2020");
                
                
            
            rs.close();
            }
            
    }
            else if(Session.equals("2019-20")){
                
             String query= "SELECT * FROM `session_1920` WHERE `roll` LIKE '"+Roll+"' ";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                 
                name.setText("Name : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Roll : "+rs.getString("roll"));
                hall.setText("Hall : "+rs.getString("hall"));
                stype.setText("Type of Student : "+rs.getString("stype"));
                session.setText("Session : "+Session);
                program.setText("Program : "+Program);
                term1.setText(Term+"  Tution Fee 2020");
                
                
            
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
                                       //End IIS Student Option//
 //////////////////////****************************************************////////////////////////////////
   
                
            }
            collect1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TermFee_Res_12_22_32_42.class.getName()).log(Level.SEVERE, null, ex);
        }
            this.setSize(650,650);
            this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        program = new javax.swing.JLabel();
        hall = new javax.swing.JLabel();
        term1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees/nstu.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 80, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setText("Institute of Information Technology");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 10, 560, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 50, 500, 30);

        name.setText("Name");
        jPanel1.add(name);
        name.setBounds(60, 200, 190, 14);

        roll.setText("Roll");
        jPanel1.add(roll);
        roll.setBounds(270, 200, 140, 14);

        fana.setText("Father's Name");
        jPanel1.add(fana);
        fana.setBounds(60, 220, 230, 14);

        mona.setText("Mother's Name");
        jPanel1.add(mona);
        mona.setBounds(270, 220, 170, 14);

        session.setText("Session");
        jPanel1.add(session);
        session.setBounds(450, 200, 150, 14);

        stype.setText("Type of Student");
        jPanel1.add(stype);
        stype.setBounds(270, 240, 230, 20);

        program.setText("Program");
        jPanel1.add(program);
        program.setBounds(450, 220, 160, 14);

        hall.setText("Hall Name");
        jPanel1.add(hall);
        hall.setBounds(60, 240, 200, 20);

        term1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        term1.setText(" Final Examination 2020");
        jPanel1.add(term1);
        term1.setBounds(140, 120, 450, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Fee Details");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(220, 280, 140, 20);

        jLabel17.setText(" List Not Found ! You can go back. Stay home & Stay Safe.");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(120, 320, 400, 14);
        
        jButton1.setText("Save as PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 460, 100, 40);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 460, 100, 40);

        

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
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        new FillUpForm_Student();
        this.dispose();
        
    }                                        

  
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(ExamFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TermCharge_NotFound();
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel fana;
    private javax.swing.JLabel hall;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mona;
    private javax.swing.JLabel name;
    private javax.swing.JLabel program;
    private javax.swing.JLabel roll;
    private javax.swing.JLabel session;
    private javax.swing.JLabel stype;
    private javax.swing.JLabel term1;
    // End of variables declaration                   
}



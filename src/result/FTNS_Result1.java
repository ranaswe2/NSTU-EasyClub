
package result;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FTNS_Result1 extends javax.swing.JFrame {
                    String dpt=null;
                    String session= null;
                    String term= null;
                    String roll= null;
    
    public FTNS_Result1() {
                           try {
                            Class.forName("com.mysql.jdbc.Driver");
                        
            Connection con1= null;
            Statement st1= null;
            
            con1= DriverManager.getConnection("jdbc:mysql://localhost/result_aa","root","");
            st1= con1.createStatement();
             String query1= "SELECT * FROM `login`";
            
            ResultSet rs1= st1.executeQuery(query1);
            
            if(rs1.next()){
            
                     dpt=rs1.getString("dpt");
                     session= rs1.getString("session");
                     term= rs1.getString("term");
                     roll= rs1.getString("roll");
                    
            }
            rs1.close();
            st1.close();
            con1.close();
        } catch (Exception ex) {
             ex.printStackTrace();
                        }
       initComponents();
        setSize(650,600);
        this.setVisible(true);
         
                    
                    
 //////////////////////****************************************************////////////////////////////////
                                       //Start Result Option//
 //////////////////////****************************************************////////////////////////////////
                    
            
           
                
                 try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= null;
            Statement st= null;
            
             //////////////////////****************************************************////////////////////////////////        
            if(session.equals("2016-17")){
                
            con= DriverManager.getConnection("jdbc:mysql://localhost/result_ftns_1617","root","");
            st= con.createStatement();
            
            if(term.equals("Year-1_Term-1")){
                
             String query= "SELECT * FROM `y-1_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-1_Term-2")){
                
             String query= "SELECT * FROM `y-1_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-2_Term-1")){
                
             String query= "SELECT * FROM `y-2_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-2_Term-2")){
                
             String query= "SELECT * FROM `y-2_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            else  if(term.equals("Year-3_Term-1")){
                
             String query= "SELECT * FROM `y-3_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-3_Term-2")){
                
             String query= "SELECT * FROM `y-3_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-4_Term-1")){
                
             String query= "SELECT * FROM `y-4_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-4_Term-2")){
                
             String query= "SELECT * FROM `y-4_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
         }  
    }
      
    //////////////////////****************************************************////////////////////////////////        
                 
            if(session.equals("2017-18")){
                
            con= DriverManager.getConnection("jdbc:mysql://localhost/result_ftns_1718","root","");
            st= con.createStatement();
            
            if(term.equals("Year-1_Term-1")){
                
             String query= "SELECT * FROM `y-1_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-1_Term-2")){
                
             String query= "SELECT * FROM `y-1_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-2_Term-1")){
                
             String query= "SELECT * FROM `y-2_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-2_Term-2")){
                
             String query= "SELECT * FROM `y-2_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            else  if(term.equals("Year-3_Term-1")){
                
             String query= "SELECT * FROM `y-3_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-3_Term-2")){
                
             String query= "SELECT * FROM `y-3_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-4_Term-1")){
                
             String query= "SELECT * FROM `y-4_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-4_Term-2")){
                
             String query= "SELECT * FROM `y-4_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
         }  
    }
      
    //////////////////////****************************************************////////////////////////////////        
            if(session.equals("2018-19")){
                
            con= DriverManager.getConnection("jdbc:mysql://localhost/result_ftns_1819","root","");
            st= con.createStatement();
            
            if(term.equals("Year-1_Term-1")){
                
             String query= "SELECT * FROM `y-1_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-1_Term-2")){
                
             String query= "SELECT * FROM `y-1_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-2_Term-1")){
                
             String query= "SELECT * FROM `y-2_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-2_Term-2")){
                
             String query= "SELECT * FROM `y-2_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            else  if(term.equals("Year-3_Term-1")){
                
             String query= "SELECT * FROM `y-3_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-3_Term-2")){
                
             String query= "SELECT * FROM `y-3_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-4_Term-1")){
                
             String query= "SELECT * FROM `y-4_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-4_Term-2")){
                
             String query= "SELECT * FROM `y-4_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
         }  
    }
            
  //////////////////////****************************************************////////////////////////////////
                    
            if(session.equals("2019-20")){
                
            con= DriverManager.getConnection("jdbc:mysql://localhost/result_ftns_1920","root","");
            st= con.createStatement();
            
            if(term.equals("Year-1_Term-1")){
                
             String query= "SELECT * FROM `y-1_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-1_Term-2")){
                
             String query= "SELECT * FROM `y-1_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-2_Term-1")){
                
             String query= "SELECT * FROM `y-2_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-2_Term-2")){
                
             String query= "SELECT * FROM `y-2_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            else  if(term.equals("Year-3_Term-1")){
                
             String query= "SELECT * FROM `y-3_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-3_Term-2")){
                
             String query= "SELECT * FROM `y-3_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-4_Term-1")){
                
             String query= "SELECT * FROM `y-4_t-1` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
            }
            
            else  if(term.equals("Year-4_Term-2")){
                
             String query= "SELECT * FROM `y-4_t-2` WHERE `roll` LIKE '"+roll+"' ";
            
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                rlab.setText("Roll : "+rs.getString("roll"));
                nm.setText("Name : "+rs.getString("name"));
                tc.setText("Term Credit : "+rs.getString("trmcredit"));
                tg.setText("TGPA : "+rs.getString("tgpa"));
                cc.setText("Completed Credit : "+rs.getString("cmpcredit"));
                cg.setText("CGPA : "+rs.getString("cgpa"));
                
            }
            rs.close();
         }  
    }
            
            
                 
 //////////////////////****************************************************////////////////////////////////
           
            con.close();
            st.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            Logger.getLogger(FTNS_Result1.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
 //////////////////////****************************************************////////////////////////////////
                                       //End IIT Result Option//
 //////////////////////****************************************************////////////////////////////////
                    
 //////////////////////****************************************************////////////////////////////////
                                       //End IIT Result Option//
 //////////////////////****************************************************////////////////////////////////
                  
            
            
                
                    exmL.setText("Result of Undergraduate "+term+" Final Examination");
                    ssnL.setText("Session : "+session);
                     
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rpan = new javax.swing.JPanel();
        rlab = new javax.swing.JLabel();
        tg = new javax.swing.JLabel();
        tc = new javax.swing.JLabel();
        cg = new javax.swing.JLabel();
        cc = new javax.swing.JLabel();
        nm = new javax.swing.JLabel();
        exmL = new javax.swing.JLabel();
        ssnL = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        dptL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 205));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result/nstu.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 80, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 30, 560, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Noakhali-3814, Bangladesh");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 70, 480, 30);

        jButton1.setBackground(new java.awt.Color(88, 110, 159));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search Again");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 480, 120, 40);

        rpan.setBackground(new java.awt.Color(205, 255, 255));

        rlab.setText("----------------------------");

        tg.setText("----------------------------");

        tc.setText("----------------------------");

        cg.setText("----------------------------");

        cc.setText("----------------------------");

        nm.setText("----------------------------");

        javax.swing.GroupLayout rpanLayout = new javax.swing.GroupLayout(rpan);
        rpan.setLayout(rpanLayout);
        rpanLayout.setHorizontalGroup(
            rpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rpanLayout.createSequentialGroup()
                .addGroup(rpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(cg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rlab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rpanLayout.setVerticalGroup(
            rpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rpanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rlab, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nm)
                .addGap(18, 18, 18)
                .addComponent(tg)
                .addGap(18, 18, 18)
                .addComponent(tc)
                .addGap(18, 18, 18)
                .addComponent(cg)
                .addGap(18, 18, 18)
                .addComponent(cc)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(rpan);
        rpan.setBounds(260, 240, 310, 210);

        exmL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exmL.setText("Result of Term Final Examination");
        jPanel1.add(exmL);
        exmL.setBounds(40, 130, 600, 22);

        ssnL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ssnL.setText("Session : 201A-1B");
        jPanel1.add(ssnL);
        ssnL.setBounds(220, 190, 410, 20);

        jButton2.setBackground(new java.awt.Color(88, 110, 159));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(350, 480, 120, 40);

        jPanel2.setBackground(new java.awt.Color(205, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(90, 220, 480, 230);

        dptL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dptL.setText("DEPARTMENT OF FOOD TECHNOLOGY & NUTRITION SCIENCE");
        jPanel1.add(dptL);
        dptL.setBounds(90, 160, 710, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
            Class.forName("com.mysql.jdbc.Driver");
                        
            Connection con1= null;
            Statement st1= null;
            
            con1= DriverManager.getConnection("jdbc:mysql://localhost/result_aa","root","");
            st1= con1.createStatement();
             String query1= "DELETE FROM `login` WHERE `roll`='"+roll+"'";
             st1.executeUpdate(query1);
             
             
             st1.close();
             con1.close();
                 } catch (Exception ex) {
                            ex.printStackTrace();
                        }
         
                          new FillUpForm_Result();
                          this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
                        
            Connection con1= null;
            Statement st1= null;
            
            con1= DriverManager.getConnection("jdbc:mysql://localhost/result_aa","root","");
            st1= con1.createStatement();
             String query1= "DELETE FROM `login` WHERE `roll`='"+roll+"'";
             st1.executeUpdate(query1);
             
             
             st1.close();
             con1.close();
                 } catch (Exception ex) {
                            ex.printStackTrace();
                        }
         System.exit(0);
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
            java.util.logging.Logger.getLogger(FTNS_Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FTNS_Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FTNS_Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FTNS_Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FTNS_Result1();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cc;
    private javax.swing.JLabel cg;
    private javax.swing.JLabel dptL;
    private javax.swing.JLabel exmL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nm;
    private javax.swing.JLabel rlab;
    private javax.swing.JPanel rpan;
    private javax.swing.JLabel ssnL;
    private javax.swing.JLabel tc;
    private javax.swing.JLabel tg;
    // End of variables declaration//GEN-END:variables
}

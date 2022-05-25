
package course_registration;

import admit_card.*;
import course_registration.*;
import com.itextpdf.text.BadElementException;
import fees.*;
import java.awt.Image;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import result.IIT_Result;


public class BANGLA_CourseReg1 extends javax.swing.JFrame {

                String Dpt= null;
                String Roll= null;
                String Credit= null;
                String Session= null;
                String Stype= null;
                String Fee= null;
                String Term= null;
                String Program= null;
    
    public BANGLA_CourseReg1() {
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
             
                 try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= null;
            Statement st= null;
            Connection con1= null;
            Statement st1= null;
            
             
 //////////////////////****************************************************////////////////////////////////
                                       //Start IIS Student Option//
 //////////////////////****************************************************////////////////////////////////
            
          
            con= DriverManager.getConnection("jdbc:mysql://localhost/student_info_bangla","root","");
            st= con.createStatement();
            
            if(Session.equals("2018-19")){
                
             String query= "SELECT * FROM `session_1819` WHERE `roll` LIKE '"+Roll+"'";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                byte[] img=rs.getBytes("photo");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            Image myImg= im.getScaledInstance(imgL.getWidth(),imgL.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
           
                 
                name.setText("Name of Student : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Class Roll : "+rs.getString("roll"));
                hall.setText("Hall Name : "+rs.getString("hall"));
                stype.setText("Type of Student : "+rs.getString("stype")); 
                imgL.setIcon(i);
                
//***********************************************************************************//          
                   
            con1= DriverManager.getConnection("jdbc:mysql://localhost/course_bangla","root","");
            st1= con1.createStatement();
            
            if(Term.equals("Year-1_Term-1")){  
            String query1= "SELECT * FROM `y-1_t-1` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-1_Term-2")){  
            String query1= "SELECT * FROM `y-1_t-2` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-2_Term-1")){  
            String query1= "SELECT * FROM `y-2_t-1` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-2_Term-2")){  
            String query1= "SELECT * FROM `y-2_t-2` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-3_Term-1")){  
            String query1= "SELECT * FROM `y-3_t-1` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-3_Term-2")){  
            String query1= "SELECT * FROM `y-3_t-2` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-4_Term-1")){  
            String query1= "SELECT * FROM `y-4_t-1` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-4_Term-2")){  
            String query1= "SELECT * FROM `y-1_t-2` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            st1.close();
            con1.close();
            
 //*************************************************************************************************************//
 
            }
            rs.close();
            
    }
            else if(Session.equals("2019-20")){
                
             String query= "SELECT * FROM `session_1920` WHERE `roll` LIKE '"+Roll+"'";
                         //SELECT * FROM `session_1819` WHERE `roll` LIKE 'ASH1925001M' 
            //pst=con.prepareStatement(query);
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                byte[] img=rs.getBytes("photo");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            Image myImg= im.getScaledInstance(imgL.getWidth(),imgL.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
         
                 
                name.setText("Name of Student : "+rs.getString("name"));
                fana.setText("Father's Name : "+rs.getString("fname"));
                mona.setText("Mother's name : "+rs.getString("mname"));
                roll.setText("Class Roll : "+rs.getString("roll"));
                hall.setText("Hall Name : "+rs.getString("hall"));
                stype.setText("Type of Student : "+rs.getString("stype")); 
                imgL.setIcon(i);
                
//***********************************************************************************//          
                   
            con1= DriverManager.getConnection("jdbc:mysql://localhost/course_bangla","root","");
            st1= con1.createStatement();
            
            if(Term.equals("Year-1_Term-1")){  
            String query1= "SELECT * FROM `y-1_t-1` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-1_Term-2")){  
            String query1= "SELECT * FROM `y-1_t-2` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-2_Term-1")){  
            String query1= "SELECT * FROM `y-2_t-1` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-2_Term-2")){  
            String query1= "SELECT * FROM `y-2_t-2` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-3_Term-1")){  
            String query1= "SELECT * FROM `y-3_t-1` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-3_Term-2")){  
            String query1= "SELECT * FROM `y-3_t-2` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-4_Term-1")){  
            String query1= "SELECT * FROM `y-4_t-1` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            else if(Term.equals("Year-4_Term-2")){  
            String query1= "SELECT * FROM `y-1_t-2` ";
            ResultSet rs1= st1.executeQuery(query1);
            
            
            while(rs1.next()){
            String code= rs1.getString("code");
            String title= rs1.getString("title");
            String credit= rs1.getString("credit");
            String comment= rs1.getString("comment");
            
            String addTable[]= {code,title,credit,comment};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(addTable);
            
            }
            rs1.close();
               }
            st1.close();
            con1.close();
            
 //*************************************************************************************************************//
 
            }
            rs.close();
            
    }
            
 //////////////////////****************************************************////////////////////////////////
 //////////////////////****************************************************////////////////////////////////
                                       //End IIS Student Option//
//////////////////////****************************************************//////////////////////////////// 
  
            con.close();
            st.close();
            
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        } catch (SQLException ex) {
              ex.printStackTrace();
        }
                    
            
 
                 
 
                dpt.setText("Department / Institute : "+Dpt);
                session.setText("Session : "+Session);
                term1.setText("COURSE REGISTRATION FORM");
                term.setText("Term : "+Term);
                program.setText("Program : "+Program); 
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
        
        Rectangle pageSize= new Rectangle(PageSize.A4);
       // pageSize.setBackgroundColor(new BaseColor(205,255,255));
        pageSize.setBackgroundColor( BaseColor.CYAN);
        
        Document doc= new Document(pageSize);
            
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"CRForm.pdf"));
            doc.open();
            
            
            PdfPTable tbl= new PdfPTable(4);
            
            tbl.addCell("Course Code");
            tbl.addCell("Course Title");
            tbl.addCell("Credit");
            //tbl.addCell("Attendence(%)");
            tbl.addCell("Comment");
            
            float [] colWidth= new float[]{18f,46f,10f,25f};
            tbl.setWidths(colWidth);
            
            
            
            for (int k=0;k<table.getRowCount();k++){
                
                String id=table.getValueAt(k, 0).toString();
                String name=table.getValueAt(k, 1).toString();
                String tele=table.getValueAt(k, 2).toString();
                String tel=table.getValueAt(k, 3).toString();
              //  String te=table.getValueAt(k, 4).toString();
                
                tbl.addCell(id);
                tbl.addCell(name);
                tbl.addCell(tele);
                tbl.addCell(tel);
               //tbl.addCell(te);
                
            }
            
            
            //import com.itextpdf.text.Image img= import com.itextpdf.text.Image.getInstance(x);
            ImageIcon icon= (ImageIcon)imgL.getIcon();
            Image awtImg= icon.getImage();
             com.itextpdf.text.Image image=  com.itextpdf.text.Image.getInstance(awtImg, null);
            image.setAbsolutePosition(480f, 630f);
            
            com.itextpdf.text.Image image1=  com.itextpdf.text.Image.getInstance("src\\admit_card\\NSTU1.png");
            
            Font font= FontFactory.getFont(FontFactory.COURIER, 18, BaseColor.BLUE);
            Font font1= FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.BLACK);
            Font font2= FontFactory.getFont(FontFactory.HELVETICA, 10, BaseColor.BLACK);
            
            Paragraph p=  new Paragraph("             ____________________________________________________________________");  
            Paragraph p1= new Paragraph("TGPA : |________|________|________|________|________|________|________|________|");
            Paragraph p2= new Paragraph("                 Y-1 T-1     Y-1 T-2    Y-2 T-1   Y-2 T-2     Y-3 T-1      Y-3 T-2     Y-4 T-1      Y-4 T-2");
            Paragraph p16=new Paragraph(" ");
            Paragraph p5=new Paragraph("****************************************************************************************************************");
            
            Paragraph p4=new Paragraph(name.getText()+"                 "+roll.getText(),font1);
            Paragraph p6= new Paragraph(dpt.getText()+"                                      "+ session.getText(),font1);
            Paragraph p3=new Paragraph(program.getText()+"                                                        "+term.getText());
            Paragraph p7= new Paragraph(fana.getText()+"    "+mona.getText());
            Paragraph p8= new Paragraph(hall.getText()+"     "+stype.getText());
            Paragraph p17=new Paragraph("                                           "+term1.getText(),font1);
            
            Paragraph p21=new Paragraph("Student :_______________________________________________   Date :_________________");
            Paragraph p22=new Paragraph("Chairman :______________________________________________  Date :_________________");
            Paragraph p23=new Paragraph("Dean / Director :__________________________________________  Date :_________________");
            Paragraph p24=new Paragraph("Provost :________________________________________________  Date :_________________");
            Paragraph p25=new Paragraph("Exam Controler :__________________________________________ Date :_________________");
            
            Paragraph p9= new Paragraph("                                                                                        Course Coordinator(Sign & Seal) ");
           
            
            doc.add(image1);
            doc.add(image);
            doc.add(p16);
            doc.add(p16);
            doc.add(p17);
             doc.add(p16);
            
                 doc.add(p8);
                 doc.add(p6);
                 doc.add(p3);
                 doc.add(p4);
                 doc.add(p7);
                 doc.add(p16);
                 doc.add(tbl);
                 doc.add(p);
                 doc.add(p1);
                 doc.add(p2); 
                 doc.add(p16);
                 doc.add(p16);
                 doc.add(p16);
                 doc.add(p9);
                  doc.add(p5);
                  doc.add(p16);
                  doc.add(p21);
                 // doc.add(p16);
                  doc.add(p22);
                  //doc.add(p16);
                  doc.add(p23);
                 // doc.add(p16);
                  doc.add(p24);
                  //doc.add(p16);
                  doc.add(p25);
                  //doc.add(p16);
                 
             
            
        } catch (DocumentException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }                catch (IOException ex) {
                            Logger.getLogger(BANGLA_CourseReg1.class.getName()).log(Level.SEVERE, null, ex);
                        }
        doc.close();
                        
                    }});   
   //-----------------------------------------------------------------//                 
           
            this.setSize(680,650);
            this.setVisible(true);
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
        stype = new javax.swing.JLabel();
        hall = new javax.swing.JLabel();
        term1 = new javax.swing.JLabel();
        program = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        term = new javax.swing.JLabel();
        session = new javax.swing.JLabel();
        dpt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        imgL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 205));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees/nstu.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 80, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 10, 560, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Noakhali-3814, Bangladesh");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 50, 500, 30);

        name.setText("Name");
        jPanel1.add(name);
        name.setBounds(50, 230, 310, 14);

        roll.setText("Roll");
        jPanel1.add(roll);
        roll.setBounds(360, 230, 250, 14);

        fana.setText("Father's Name");
        jPanel1.add(fana);
        fana.setBounds(50, 250, 310, 14);

        mona.setText("Mother's Name");
        jPanel1.add(mona);
        mona.setBounds(360, 250, 310, 14);

        stype.setText("Type of Student");
        jPanel1.add(stype);
        stype.setBounds(360, 270, 270, 20);

        hall.setText("Hall Name");
        jPanel1.add(hall);
        hall.setBounds(50, 270, 310, 20);

        term1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        term1.setText("COURSE REGISTRATION FORM");
        jPanel1.add(term1);
        term1.setBounds(160, 100, 310, 30);

        program.setText("program");
        jPanel1.add(program);
        program.setBounds(50, 210, 200, 14);

        jButton1.setBackground(new java.awt.Color(88, 110, 159));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save as PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 540, 100, 40);

        jButton2.setBackground(new java.awt.Color(88, 110, 159));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(370, 540, 100, 40);

        term.setText("term");
        jPanel1.add(term);
        term.setBounds(360, 210, 210, 14);

        session.setText("Session");
        jPanel1.add(session);
        session.setBounds(360, 190, 210, 14);

        dpt.setText("Dpt / Instt");
        jPanel1.add(dpt);
        dpt.setBounds(50, 190, 250, 14);

        jPanel2.setBackground(new java.awt.Color(205, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 170, 680, 140);

        imgL.setText("imgL");
        jPanel1.add(imgL);
        imgL.setBounds(560, 60, 90, 100);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Title", "Course Credit", "Comment"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 350, 640, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        new FillUpForm_cregistration();
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
            java.util.logging.Logger.getLogger(BANGLA_CourseReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BANGLA_CourseReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BANGLA_CourseReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BANGLA_CourseReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BANGLA_CourseReg1();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dpt;
    private javax.swing.JLabel fana;
    private javax.swing.JLabel hall;
    private javax.swing.JLabel imgL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mona;
    private javax.swing.JLabel name;
    private javax.swing.JLabel program;
    private javax.swing.JLabel roll;
    private javax.swing.JLabel session;
    private javax.swing.JLabel stype;
    private javax.swing.JTable table;
    private javax.swing.JLabel term;
    private javax.swing.JLabel term1;
    // End of variables declaration//GEN-END:variables



 
}

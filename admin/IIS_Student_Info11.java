
package admin;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class IIS_Student_Info11 extends javax.swing.JFrame {

    String s;
     String Stype;
     
    public IIS_Student_Info11() {
        initComponents();
        setSize(700,635);
        
        buttonGroup1.add(res);
        buttonGroup1.add(nonRes);
        
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        roll = new javax.swing.JTextField();
        faNam = new javax.swing.JTextField();
        moNam = new javax.swing.JTextField();
        res = new javax.swing.JRadioButton();
        nonRes = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        session = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        hall = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        photoL = new javax.swing.JLabel();
        setImage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 205));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees/nstu.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 0, 80, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 20, 550, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 270, 100, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Roll");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 220, 80, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Father's Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 320, 110, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Mother's Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 370, 120, 20);

        name.setText("R. Rana");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(220, 270, 250, 30);

        roll.setText("ASH1925001M");
        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });
        jPanel1.add(roll);
        roll.setBounds(220, 220, 250, 30);

        faNam.setText("MD. Akkas Ali Sikder");
        faNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faNamActionPerformed(evt);
            }
        });
        jPanel1.add(faNam);
        faNam.setBounds(220, 320, 250, 30);

        moNam.setText("Selina Begum");
        moNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moNamActionPerformed(evt);
            }
        });
        jPanel1.add(moNam);
        moNam.setBounds(220, 370, 250, 30);

        res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        res.setText("Residential");
        jPanel1.add(res);
        res.setBounds(370, 480, 99, 25);

        nonRes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nonRes.setText("Non-Residential");
        jPanel1.add(nonRes);
        nonRes.setBounds(220, 480, 140, 23);

        submit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(500, 320, 140, 30);

        reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(500, 370, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText(" Student Information of IIS");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(160, 120, 340, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Type of  Student");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 480, 140, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Noakhali-3814 , Bangladesh");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 50, 390, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Session");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 170, 120, 20);

        session.setText("2018-19");
        jPanel1.add(session);
        session.setBounds(220, 170, 250, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Hall Name");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(70, 430, 100, 17);

        hall.setText(" Bhasha Shahid Abdus Salam Hall");
        jPanel1.add(hall);
        hall.setBounds(220, 420, 250, 30);

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(500, 420, 140, 30);

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(500, 470, 140, 30);

        photoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/asd.jpg"))); // NOI18N
        jPanel1.add(photoL);
        photoL.setBounds(500, 90, 140, 180);

        setImage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        setImage.setText("Set Image");
        setImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setImageActionPerformed(evt);
            }
        });
        jPanel1.add(setImage);
        setImage.setBounds(500, 270, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        
        roll.addKeyListener(new KeyAdapter(){
            
            public void keyTyped(KeyEvent e){
                
                char ch= e.getKeyChar();
                if(!(ch >='0' && ch <='9' || (Character.isAlphabetic(ch)) || (ch==KeyEvent.VK_BACK_SPACE) || (ch==KeyEvent.VK_DELETE))){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Give correct email address!");
                }
            }
        });
        
    }//GEN-LAST:event_rollActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

                name.addKeyListener(new KeyAdapter(){
            
            public void keyTyped(KeyEvent e){
                
                char ch= e.getKeyChar();
                if(!(Character.isAlphabetic(ch) || ch== ' ' || ch=='\b' || ch==KeyEvent.VK_DELETE)){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"<html>Only A-Z, a-z, Space character<br/> will be allowed!");
                }
            }
        });
                
    }//GEN-LAST:event_nameActionPerformed

    private void faNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faNamActionPerformed
        
        faNam.addKeyListener(new KeyAdapter(){
            
            public void keyTyped(KeyEvent e){
                
                char ch= e.getKeyChar();
                if(!(Character.isAlphabetic(ch) || ch== ' ' || ch=='\b' || ch==KeyEvent.VK_DELETE)){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"<html>Only A-Z, a-z, Space character<br/> will be allowed!");
                }
            }
        });
        
    }//GEN-LAST:event_faNamActionPerformed

    private void moNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moNamActionPerformed
        
        moNam.addKeyListener(new KeyAdapter(){
            
            public void keyTyped(KeyEvent e){
                
                char ch= e.getKeyChar();
                if(!(Character.isAlphabetic(ch) || ch== ' ' || ch=='\b' || ch==KeyEvent.VK_DELETE)){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"<html>Only A-Z, a-z, Space character<br/> will be allowed!");
                }
            }
        });
        
    }//GEN-LAST:event_moNamActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       
        if(name.getText().trim().length()==0 || 
                roll.getText().trim().length()==0 ||
                faNam.getText().trim().length()==0 ||
                moNam.getText().trim().length()==0 ||
                buttonGroup1.isSelected(null)){
            JOptionPane.showMessageDialog(null, "Fill all fields!");
        }
        else {
            
            String Name= name.getText();
            String FaNam= faNam.getText();
            String MoNam= moNam.getText();
            String Roll= roll.getText();
           
            
            if(res.isSelected()){
                Stype= res.getText().toString();
            }
            else if(nonRes.isSelected()){
                Stype= nonRes.getText().toString();
            }
            
            String Hall= hall.getText();
            String Session= session.getText();
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
                
           Connection con= null;
           Statement st=null;
           
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/student_info_iis","root","");
           InputStream is = new FileInputStream(new File(s));
                      st = con.createStatement();
                       
                         if(Session.equals("2017-18")){
                             
                        PreparedStatement pst= con.prepareStatement("INSERT INTO `session_1718`(`roll`, `name`, `fname`, `mname`, `hall`, `stype`, `photo`) VALUES (?,?,?,?,?,?,?)" );
                        
                        pst.setString(1,roll.getText());
                        pst.setString(2,name.getText());
                        pst.setString(3,faNam.getText());
                        pst.setString(4,moNam.getText());
                        pst.setString(5,hall.getText());
                        pst.setString(6,Stype);
                        pst.setBlob(7, is);
                        
                        pst.executeUpdate();
                        pst.close();
                         }
            else if(Session.equals("2018-19")){
                             
                        PreparedStatement pst= con.prepareStatement("INSERT INTO `session_1819`(`roll`, `name`, `fname`, `mname`, `hall`, `stype`, `photo`) VALUES (?,?,?,?,?,?,?)" );
                        
                        pst.setString(1,roll.getText());
                        pst.setString(2,name.getText());
                        pst.setString(3,faNam.getText());
                        pst.setString(4,moNam.getText());
                        pst.setString(5,hall.getText());
                        pst.setString(6,Stype);
                        pst.setBlob(7, is);
                        
                        pst.executeUpdate();
                        pst.close();
                          }
            else if(Session.equals("2019-20")){
                             
                        PreparedStatement pst= con.prepareStatement("INSERT INTO `session_1920`(`roll`, `name`, `fname`, `mname`, `hall`, `stype`, `photo`) VALUES (?,?,?,?,?,?,?)" );
                        
                        pst.setString(1,roll.getText());
                        pst.setString(2,name.getText());
                        pst.setString(3,faNam.getText());
                        pst.setString(4,moNam.getText());
                        pst.setString(5,hall.getText());
                        pst.setString(6,Stype);
                        pst.setBlob(7, is);
                        
                        pst.executeUpdate();
                        pst.close();
                          }
                        
                        
                        JOptionPane.showMessageDialog(null, "Query Executed.");
                        con.close();
                    
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            
            }
           
                
            

    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       
            name.setText("");
            faNam.setText("");
            moNam.setText("");
            roll.setText("");
            session.setText("");
            hall.setText("");
            

    }//GEN-LAST:event_resetActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
      
        String Session= session.getText();
         if(res.isSelected()){
                Stype= res.getText().toString();
            }
            else if(nonRes.isSelected()){
                Stype= nonRes.getText().toString();
            }
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
                
           Connection con= null;
           Statement st=null;
           
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/student_info_iis","root","");
           InputStream is = new FileInputStream(new File(s));
                      st = con.createStatement();
                       
                         if(Session.equals("2017-18")){
                             
                        PreparedStatement pst= con.prepareStatement("UPDATE `session_1718` SET `name`=?,`fname`=?,`mname`=?,`hall`=?,`stype`=?,`photo`=? WHERE `roll`=?" );
                        
                        
                        pst.setString(1,name.getText());
                        pst.setString(2,faNam.getText());
                        pst.setString(3,moNam.getText());
                        pst.setString(4,hall.getText());
                        pst.setString(5,Stype);
                        pst.setBlob(6, is);
                        pst.setString(7,roll.getText());
                        
                        pst.executeUpdate();
                        pst.close();
                         }
            else if(Session.equals("2018-19")){
                             
                        PreparedStatement pst= con.prepareStatement("UPDATE `session_1819` SET `name`=?,`fname`=?,`mname`=?,`hall`=?,`stype`=?,`photo`=? WHERE `roll`=?" );
                        
                        pst.setString(1,name.getText());
                        pst.setString(2,faNam.getText());
                        pst.setString(3,moNam.getText());
                        pst.setString(4,hall.getText());
                        pst.setString(5,Stype);
                        pst.setBlob(6, is);
                        pst.setString(7,roll.getText());
                        
                        pst.executeUpdate();
                        pst.close();
                          }
            else if(Session.equals("2019-20")){
                             
                        PreparedStatement pst= con.prepareStatement("UPDATE `session_1920` SET `name`=?,`fname`=?,`mname`=?,`hall`=?,`stype`=?,`photo`=? WHERE `roll`=?" );
                        
                        pst.setString(1,name.getText());
                        pst.setString(2,faNam.getText());
                        pst.setString(3,moNam.getText());
                        pst.setString(4,hall.getText());
                        pst.setString(5,Stype);
                        pst.setBlob(6, is);
                        pst.setString(7,roll.getText());
                        
                        pst.executeUpdate();
                        pst.close();
                          }
                        
                        
                        JOptionPane.showMessageDialog(null, "Query Executed.");
                        con.close();
                    
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            
        
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       
        if((session.getText()).equals("2017-18")){
        theQuery("DELETE FROM session_1718 WHERE roll='"+roll.getText()+"'");
        }
        else if((session.getText()).equals("2018-19")){
        theQuery("DELETE FROM session_1819 WHERE roll='"+roll.getText()+"'");
        }
        else if((session.getText()).equals("2019-20")){
        theQuery("DELETE FROM session_1920 WHERE roll='"+roll.getText()+"'");
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void setImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setImageActionPerformed
        
        JFileChooser filecsr= new JFileChooser();
        filecsr.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter= new FileNameExtensionFilter("*.IMAGE","jpg","png","gif","jpeg");
        filecsr.addChoosableFileFilter(filter);
        int result= filecsr.showSaveDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile= filecsr.getSelectedFile();
            String path= selectedFile.getAbsolutePath();
            photoL.setIcon(new ImageIcon(path));//ResizeImage(path)
            s=path;
        }
        
    }//GEN-LAST:event_setImageActionPerformed

    public void theQuery(String query){
           
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
           Connection con= null;
           Statement st= null;
           
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/student_info_iis","root","");
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
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IIS_Student_Info11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IIS_Student_Info11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IIS_Student_Info11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IIS_Student_Info11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IIS_Student_Info11();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JTextField faNam;
    private javax.swing.JTextField hall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField moNam;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton nonRes;
    private javax.swing.JLabel photoL;
    private javax.swing.JRadioButton res;
    private javax.swing.JButton reset;
    private javax.swing.JTextField roll;
    private javax.swing.JTextField session;
    private javax.swing.JButton setImage;
    private javax.swing.JButton submit;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
// Front-end 305 Lines only
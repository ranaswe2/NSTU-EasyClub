
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class IIS_Result_Panel1 extends javax.swing.JFrame {

   
    public IIS_Result_Panel1() {
        initComponents();
        setVisible(true);
        setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        wlcm = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        term = new javax.swing.JTextField();
        roll = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        tcredit = new javax.swing.JTextField();
        tgpa = new javax.swing.JTextField();
        ccredit = new javax.swing.JTextField();
        cgpa = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ssn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/nstu.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 70, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Noakhali Science and Technology University");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 20, 550, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Noakhali-3814 , Bangladesh");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 50, 260, 30);

        wlcm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        wlcm.setText(" Term Final Result Upload Section");
        jPanel1.add(wlcm);
        wlcm.setBounds(190, 110, 280, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Roll");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 250, 140, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 300, 120, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Term Credit");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 350, 130, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("TGPA");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 400, 110, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Completed Credit");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(150, 450, 140, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("CGPA");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(150, 500, 110, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Term");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(150, 200, 140, 17);

        term.setText("Year-1 Term-1");
        jPanel1.add(term);
        term.setBounds(280, 200, 230, 30);

        roll.setText("ASH1924001M");
        jPanel1.add(roll);
        roll.setBounds(280, 250, 230, 30);

        name.setText("R. Rana");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(280, 300, 230, 30);

        tcredit.setText("21");
        tcredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcreditActionPerformed(evt);
            }
        });
        jPanel1.add(tcredit);
        tcredit.setBounds(280, 350, 230, 30);

        tgpa.setText("4.00");
        jPanel1.add(tgpa);
        tgpa.setBounds(280, 400, 230, 30);

        ccredit.setText("21");
        jPanel1.add(ccredit);
        ccredit.setBounds(280, 450, 230, 30);

        cgpa.setText("4.00");
        jPanel1.add(cgpa);
        cgpa.setBounds(280, 500, 230, 30);

        submit.setBackground(new java.awt.Color(102, 102, 255));
        submit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(240, 560, 90, 23);

        update.setBackground(new java.awt.Color(102, 102, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(150, 560, 90, 23);

        reset.setBackground(new java.awt.Color(102, 102, 255));
        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(330, 560, 90, 23);

        delete.setBackground(new java.awt.Color(102, 102, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(420, 560, 90, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Session");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(150, 160, 120, 20);

        ssn.setText("2018-19");
        jPanel1.add(ssn);
        ssn.setBounds(280, 150, 230, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void tcreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcreditActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-1 Term-1")){
        theQuery1("UPDATE `y-1_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-1 Term-2")){
        theQuery1("UPDATE `y-1_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-2 Term-1")){
        theQuery1("UPDATE `y-2_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-2 Term-2")){
        theQuery1("UPDATE `y-2_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-3 Term-1")){
        theQuery1("UPDATE `y-3_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-3 Term-2")){
        theQuery1("UPDATE `y-3_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-4 Term-1")){
        theQuery1("UPDATE `y-4_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-4 Term-2")){
        theQuery1("UPDATE `y-4_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-1 Term-1")){
        theQuery2("UPDATE `y-1_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-1 Term-2")){
        theQuery2("UPDATE `y-1_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-2 Term-1")){
        theQuery2("UPDATE `y-2_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-2 Term-2")){
        theQuery2("UPDATE `y-2_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-3 Term-1")){
        theQuery2("UPDATE `y-3_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-3 Term-2")){
        theQuery2("UPDATE `y-3_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-4 Term-1")){
        theQuery2("UPDATE `y-4_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-4 Term-2")){
        theQuery2("UPDATE `y-4_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-1 Term-1")){
        theQuery3("UPDATE `y-1_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-1 Term-2")){
        theQuery3("UPDATE `y-1_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-2 Term-1")){
        theQuery3("UPDATE `y-2_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-2 Term-2")){
        theQuery3("UPDATE `y-2_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-3 Term-1")){
        theQuery3("UPDATE `y-3_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-3 Term-2")){
        theQuery3("UPDATE `y-3_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-4 Term-1")){
        theQuery3("UPDATE `y-4_t-1` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-4 Term-2")){
        theQuery3("UPDATE `y-4_t-2` SET name='"+name.getText()+"',trmcredit='"+tcredit.getText()+"',tgpa='"+tgpa.getText()+"',cmpcredit='"+ccredit.getText()+"',cgpa='"+cgpa.getText()+"' WHERE roll='"+roll.getText()+"'");
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
       else {
          JOptionPane.showMessageDialog(null, "You are not eligible to upload this result!");
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-1 Term-1")){
        theQuery1("INSERT INTO `y-1_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-1 Term-2")){
        theQuery1("INSERT INTO `y-1_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-2 Term-1")){
        theQuery1("INSERT INTO `y-2_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-2 Term-2")){
        theQuery1("INSERT INTO `y-2_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-3 Term-1")){
        theQuery1("INSERT INTO `y-3_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-3 Term-2")){
        theQuery1("INSERT INTO `y-3_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-4 Term-1")){
        theQuery1("INSERT INTO `y-4_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-4 Term-2")){
        theQuery1("INSERT INTO `y-4_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-1 Term-1")){
        theQuery2("INSERT INTO `y-1_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-1 Term-2")){
        theQuery2("INSERT INTO `y-1_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-2 Term-1")){
        theQuery2("INSERT INTO `y-2_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-2 Term-2")){
        theQuery2("INSERT INTO `y-2_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-3 Term-1")){
        theQuery2("INSERT INTO `y-3_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-3 Term-2")){
        theQuery2("INSERT INTO `y-3_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-4 Term-1")){
        theQuery2("INSERT INTO `y-4_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-4 Term-2")){
        theQuery2("INSERT INTO `y-4_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-1 Term-1")){
        theQuery3("INSERT INTO `y-1_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-1 Term-2")){
        theQuery3("INSERT INTO `y-1_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-2 Term-1")){
        theQuery3("INSERT INTO `y-2_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-2 Term-2")){
        theQuery3("INSERT INTO `y-2_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-3 Term-1")){
        theQuery3("INSERT INTO `y-3_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-3 Term-2")){
        theQuery3("INSERT INTO `y-3_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-4 Term-1")){
        theQuery3("INSERT INTO `y-4_t-1`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-4 Term-2")){
        theQuery3("INSERT INTO `y-4_t-2`(`roll`, `name`, `trmcredit`, `tgpa`, `cmpcredit`, `cgpa`) VALUES  ('"+roll.getText()+"','"+name.getText()+"','"+tcredit.getText()+"','"+tgpa.getText()+"','"+ccredit.getText()+"','"+cgpa.getText()+"')");
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
         else {
          JOptionPane.showMessageDialog(null, "You are not eligible to upload this result!");
        }
        
    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        
        
        ssn.setText("");
        term.setText("");
        roll.setText("");
        name.setText("");
        tcredit.setText("");
        tgpa.setText("");
        ccredit.setText("");
        cgpa.setText("");
        
        
    }//GEN-LAST:event_resetActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-1 Term-1")){
        theQuery1("DELETE FROM `y-1_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-1 Term-2")){
        theQuery1("DELETE FROM `y-1_t-2` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-2 Term-1")){
        theQuery1("DELETE FROM `y-2_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-2 Term-2")){
        theQuery1("DELETE FROM `y-2_t-2` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-3 Term-1")){
        theQuery1("DELETE FROM `y-3_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-3 Term-2")){
        theQuery1("DELETE FROM `y-3_t-2` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-4 Term-1")){
        theQuery1("DELETE FROM `y-4_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2017-18") && (term.getText()).equals("Year-4 Term-2")){
        theQuery1("DELETE FROM `y-4_t-2` WHERE roll='"+roll.getText()+"'");
        }
         //--------------------------------------------------------------------------------------//
         
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-1 Term-1")){
        theQuery2("DELETE FROM `y-1_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-1 Term-2")){
        theQuery2("DELETE FROM `y-1_t-2` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-2 Term-1")){
        theQuery2("DELETE FROM `y-2_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-2 Term-2")){
        theQuery2("DELETE FROM `y-2_t-2` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-3 Term-1")){
        theQuery2("DELETE FROM `y-3_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-3 Term-2")){
        theQuery2("DELETE FROM `y-3_t-2` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-4 Term-1")){
        theQuery2("DELETE FROM `y-4_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2018-19") && (term.getText()).equals("Year-4 Term-2")){
        theQuery2("DELETE FROM `y-4_t-2` WHERE roll='"+roll.getText()+"'");
        }
         //--------------------------------------------------------------------------------------//
         else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-1 Term-1")){
        theQuery3("DELETE FROM `y-1_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-1 Term-2")){
        theQuery3("DELETE FROM `y-1_t-2` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-2 Term-1")){
        theQuery3("DELETE FROM `y-2_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-2 Term-2")){
        theQuery3("DELETE FROM `y-2_t-2` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-3 Term-1")){
        theQuery3("DELETE FROM `y-3_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-3 Term-2")){
        theQuery3("DELETE FROM `y-3_t-2` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-4 Term-1")){
        theQuery3("DELETE FROM `y-4_t-1` WHERE roll='"+roll.getText()+"'");
        }
        else if((ssn.getText()).equals("2019-20") && (term.getText()).equals("Year-4 Term-2")){
        theQuery3("DELETE FROM `y-4_t-2` WHERE roll='"+roll.getText()+"'");
        }
        //--------------------------------------------------------------------------------------//
    }//GEN-LAST:event_deleteActionPerformed

    public void theQuery1(String query){
           
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
           Connection con= null;
           Statement st= null;
           
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/result_iis_1718","root","");
            st=con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Query Executed.");
            
            con.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
           
       }
    
   public void theQuery2(String query){
           
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
           Connection con= null;
           Statement st= null;
           
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/result_iis_1819","root","");
            st=con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Query Executed.");
            
            con.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
           
       }
    public void theQuery3(String query){
           
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
           Connection con= null;
           Statement st= null;
           
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/result_iis_1920","root","");
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
            java.util.logging.Logger.getLogger(IIS_Result_Panel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IIS_Result_Panel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IIS_Result_Panel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IIS_Result_Panel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new IIS_Result_Panel1();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ccredit;
    private javax.swing.JTextField cgpa;
    private javax.swing.JButton delete;
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
    private javax.swing.JTextField name;
    private javax.swing.JButton reset;
    private javax.swing.JTextField roll;
    private javax.swing.JTextField ssn;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tcredit;
    private javax.swing.JTextField term;
    private javax.swing.JTextField tgpa;
    private javax.swing.JButton update;
    private javax.swing.JLabel wlcm;
    // End of variables declaration//GEN-END:variables
}

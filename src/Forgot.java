

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harshit Goyal
 */
public class Forgot extends javax.swing.JFrame {

    //Database Connection
        Connection conn = null;
    /**
     * Creates new form Forgot
     */
    public Forgot() {
        initComponents();
        
        // set the jform in center of screen
        this.setLocationRelativeTo(null);
        
        setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Control System");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Forgot Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 0, 51))); // NOI18N

        jLabel3.setText("Your Security Question");

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Icon pack\\login\\search.png")); // NOI18N
        jButton1.setText("Search");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\Icon pack\\login\\back.png")); // NOI18N
        jButton3.setText("Back");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel5.setText("Your Password");

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Icon pack\\login\\retrive.png")); // NOI18N
        jButton2.setText("Retrieve");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jLabel4.setText("Answer");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jLabel2.setText("Name");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login page = new Login();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try{
            conn = dbConnection.conn();
            String sql = "select * from logindatabase where Answer=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField4.getText());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                    
                String pass = rs.getString(3);
                jTextField5.setText(pass);
                
                jTextField5.requestFocus();
                }
            else{
                // show message box
                JOptionPane.showMessageDialog(rootPane, "Invalid Answer. \nPlease contact to your administrator. \n\n                 Thankyou!!", "Error", 0);
                jTextField4.setText("");
                jTextField5.setText("");
                
                jTextField4.requestFocus();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Something went wrong "+ e.getMessage());   
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Login obj = new Login();
        
        // Retrive Password
//        String ans = jTextField4.getText();
//        String name = jTextField2.getText();
//        String ques = jTextField3.getText();
        
//        if(name.equals("Admin") && ques.equals("Name of Developer ?")){
//        if(ans.equals("harshit") || ans.equals("HARSHIT") || ans.equals("Harshit") || ans.equals("shruti") || ans.equals("SHRUTI")|| ans.equals("Shruti")){
//            // send password to jTextField5
//            jTextField5.setText(obj.default_pass);
//        }
//        else{
//            JOptionPane.showMessageDialog(rootPane, "Answer is not valid. \nPlease contact to your administrator. \n\n                 Thankyou!!", "Error", 0);
//            jTextField4.setText("");
//            jTextField5.setText("");
//        }
//        }
//        else{
//     JOptionPane.showMessageDialog(rootPane, "Search username first or contact to administrator", "Error", 0);
//            jTextField1.setText("");
//            jTextField2.setText("");
//            jTextField3.setText("");
//            jTextField4.setText("");
//            jTextField5.setText("");
//    }
   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
         try{
            conn = dbConnection.conn();
            String sql = "select * from logindatabase where Username=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField1.getText());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String name = rs.getString(4);
                jTextField2.setText(name);
                
                String security = rs.getString(5);
                jTextField3.setText(security);
                
                jTextField4.requestFocus();
            }
            else{
                // show message box
                JOptionPane.showMessageDialog(rootPane, "Username is not exist. \nPlease contact to your administrator. \n\n                 Thankyou!!", "Error", 0);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                
                jTextField1.requestFocus();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Something wen wrong " + e.getMessage());   
        }
        
        
        
        
        
        
        
        
        

        //Get Password optopn(Search User)
//        String username = jTextField1.getText();

//        if(username.equals("admin")){
//            //Name
//            jTextField2.setText("Admin");
//            // Security Question
//            jTextField3.setText("Name of Developer ?");
//            
//            jTextField4.requestFocus();
//        }else{
//            // show message box
//            JOptionPane.showMessageDialog(rootPane, "Username is not exist. \nPlease contact to your administrator. \n\n                 Thankyou!!", "Error", 0);
//            jTextField1.setText("");
//            jTextField1.requestFocus();
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            jTextField2.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
            jButton1.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             try{
            conn = dbConnection.conn();
            String sql = "select * from logindatabase where Username=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField1.getText());
            //pst.setString(2, jPasswordField1.getText());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String name = rs.getString(4);
                jTextField2.setText(name);
                
                String security = rs.getString(5);
                jTextField3.setText(security);
                
                jTextField4.requestFocus();
            }
            else{
                // show message box
                JOptionPane.showMessageDialog(rootPane, "Username is not exist. \nPlease contact to your administrator. \n\n                 Thankyou!!", "Error", 0);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                
                jTextField1.requestFocus();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Something went wrong " + e.getMessage());   
        }
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            jButton2.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_LEFT){
            jTextField1.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             try{
            conn = dbConnection.conn();
            String sql = "select * from logindatabase where Username=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField1.getText());
            //pst.setString(2, jPasswordField1.getText());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String name = rs.getString(4);
                jTextField2.setText(name);
                
                String security = rs.getString(5);
                jTextField3.setText(security);
            }
            else{
                // show message box
                JOptionPane.showMessageDialog(rootPane, "Username is not exist. \nPlease contact to your administrator. \n\n                 Thankyou!!", "Error", 0);
                 jTextField1.setText("");
                 jTextField2.setText("");
                 jTextField3.setText("");
                 jTextField4.setText("");
                 jTextField5.setText("");
                
                 jTextField1.requestFocus();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Something went wrong " + e.getMessage());   
        }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_UP){
            jTextField1.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_UP){
            jTextField2.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_UP){
            jTextField3.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            jTextField5.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
            jButton2.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             try{
            conn = dbConnection.conn();
            String sql = "select * from logindatabase where Answer=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField4.getText());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                    
                String pass = rs.getString(3);
                jTextField5.setText(pass);
                
                jTextField5.requestFocus();
                }
            else{
                // show message box
                 JOptionPane.showMessageDialog(rootPane, "Invalid Answer. \nPlease contact to your administrator. \n\n                 Thankyou!!", "Error", 0);
                jTextField4.setText("");
                jTextField5.setText("");
                
                jTextField4.requestFocus();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Something went wrong " + e.getMessage());   
        }
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_UP){
            jButton1.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            jButton3.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_LEFT){
            jTextField4.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{
            conn = dbConnection.conn();
            String sql = "select * from logindatabase where Answer=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField4.getText());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                    
                String pass = rs.getString(3);
                jTextField5.setText(pass);
                
                jTextField5.requestFocus();
                }
            else{
                // show message box
                 JOptionPane.showMessageDialog(rootPane, "Invalid Answer. \nPlease contact to your administrator. \n\n                 Thankyou!!", "Error", 0);
                jTextField4.setText("");
                jTextField5.setText("");
                
                jTextField4.requestFocus();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Something went wrong " + e.getMessage());   
        }
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_UP){
            jTextField4.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
            jButton3.requestFocus();
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_UP){
            jButton2.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_LEFT){
            jTextField5.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             Login page = new Login();
             page.setVisible(true);
             this.dispose();
        }
         
    }//GEN-LAST:event_jButton3KeyPressed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}

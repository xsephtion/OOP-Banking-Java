/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javareceipt;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;

/**
 *
 * @author joseph
 */
public class loginForm extends javax.swing.JFrame {
     receiptConfirm wMenu = new receiptConfirm();
     withdrawalMenu nMenu = new withdrawalMenu();
     depositMenu    dMenu = new depositMenu();
     fundsChecker   fMenu = new fundsChecker();
     balances       bal   = new balances();
    private static String unameJonah;
    private static String upassJonah;
    private static String unameGer;
    private static String upassGer;
    private static String unameSeph;
    private static String upassSeph;
    private static String unameXav;
    private static String upassXav;
    private static String unamePatF;
    private static String upassPatF;
    private static String unameBrends;
    private static String upassBrends;
    private static String unamePatC;
    private static String upassPatC;
    
    public void methoduName(){
    }
    
    public loginForm(String uname){
        this.unameJonah = uname;
        this.unameGer = uname;
        this.unameSeph = uname;
        this.unameXav = uname;
        this.unamePatF = uname;
        this.unameBrends = uname;
        this.unamePatC = uname;
        
        this.upassJonah = uname;
        this.upassGer = uname;
        this.upassSeph = uname;
        this.upassXav = uname;
        this.upassPatF = uname;
        this.upassBrends = uname;
        this.upassPatC = uname;
    }
    
    
    public String getUNameJonah(){
        return unameJonah;
    } 
    public String getUNameGer(){
        return unameGer;
    }
    public String getUNameSeph(){
        return unameSeph;
    }
    public String getUNameXav(){
        return unameXav;
    }
    public String getUNamePatF(){
        return unamePatF;
    }
    public String getUNameBrends(){
        return unameBrends;
    }
    public String getUNamePatC(){
        return unamePatC;
    }
    public String getpassJonah(){
        return upassJonah;
    }
    public String getpassGer(){
        return upassGer;
    }
    public String getpassSeph(){
        return upassSeph;
    }
    public String getpassXav(){
        return upassXav;
    }
    public String getpassPatF(){
        return upassPatF;
    }
    public String getpassBrends(){
        return upassBrends;
    }
    public String getpassPatC(){
        return upassPatC;
    }
    
    public void setUName(String uname, String pass){
       unameJonah  = "201610615";
       unameGer    = "201610314";
       unameSeph   = "201610246";
       unameXav    = "201610222";
       unamePatF   = "201610658";
       unameBrends = "201610473";
       unamePatC   = "201530058";
       
       upassJonah  = "02071998";
       upassGer    = "12051998";
       upassSeph   = "05251998";
       upassXav    = "08151998";
       upassPatF   = "02271998";
       upassBrends = "04251998";
       upassPatC   = "11141998";
       
        if (uname.equals(unameJonah) && pass.equals(upassJonah)){
            menuBank mBank = new menuBank();
            nMenu.setName(getUNameJonah());
            nMenu.setPass(getpassJonah());
            dMenu.setName(getUNameJonah());
            dMenu.setPass(getpassJonah());
            wMenu.setName(getUNameJonah());
            fMenu.setName(getUNameJonah());
            bal.setBalanceJonah(0);
            mBank.setVisible(true);
            super.dispose();
        }
        else if (uname.equals(unameGer) && pass.equals(upassGer)){
            menuBank mBank = new menuBank();
            nMenu.setName(getUNameGer());
            nMenu.setPass(getpassGer());
            dMenu.setName(getUNameGer());
            dMenu.setPass(getpassGer());
            wMenu.setName(getUNameGer());
            fMenu.setName(getUNameGer());
            mBank.setVisible(true);
            super.dispose();
        }
        
        else if (uname.equals(unameSeph) && pass.equals(upassSeph)){
            menuBank mBank = new menuBank();
            nMenu.setName(getUNameSeph());
            nMenu.setPass(getpassSeph());
            dMenu.setName(getUNameSeph());
            dMenu.setPass(getpassSeph());
            wMenu.setName(getUNameSeph());
            fMenu.setName(getUNameSeph());
            bal.setBalanceSeph(0);
            mBank.setVisible(true);
            super.dispose();
        }
        
        else if (uname.equals(unameXav) && pass.equals(upassXav)){
            menuBank mBank = new menuBank();
            nMenu.setName(getUNameXav());
            nMenu.setPass(getpassXav());
            dMenu.setName(getUNameXav());
            dMenu.setPass(getpassXav());
            wMenu.setName(getUNameXav());
            fMenu.setName(getUNameXav());
            mBank.setVisible(true);
            super.dispose();
        }
        
        else if (uname.equals(unamePatF) && pass.equals(upassPatF)){
            menuBank mBank = new menuBank();
            nMenu.setName(getUNamePatF());
            nMenu.setPass(getpassPatF());
            dMenu.setName(getUNamePatF());
            dMenu.setPass(getpassPatF());
            wMenu.setName(getUNamePatF());
            fMenu.setName(getUNamePatF());
            mBank.setVisible(true);
            super.dispose();
        }
        
        else if (uname.equals(unameBrends) && pass.equals(upassBrends)){
            menuBank mBank = new menuBank();
            nMenu.setName(getUNameBrends());
            nMenu.setPass(getpassBrends());
            dMenu.setName(getUNameBrends());
            dMenu.setPass(getpassBrends());
            wMenu.setName(getUNameBrends());
            fMenu.setName(getUNameBrends());
            mBank.setVisible(true);
            super.dispose();
        }
        
        else if (uname.equals(unamePatC) && pass.equals(upassPatC)){
            menuBank mBank = new menuBank();
            nMenu.setName(getUNamePatC());
            nMenu.setPass(getpassPatC());
            dMenu.setName(getUNamePatC());
            dMenu.setPass(getpassPatC());
            wMenu.setName(getUNamePatC());
            fMenu.setName(getUNamePatC());
            mBank.setVisible(true);
            super.dispose();
        }
        
        else{
           errorHandle.setText("WRONG CREDENTIALS");
        }
        
        
       
    }
    
    
    
    public loginForm() {
        initComponents();
    }
   
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        errorHandle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(52, 73, 94));

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));
        jPanel1.setForeground(new java.awt.Color(52, 73, 94));

        jLabel3.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JAVA BANKING");

        username.setBackground(new java.awt.Color(52, 73, 94));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account #:");

        passwordField.setBackground(new java.awt.Color(52, 73, 94));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(null);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");

        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.setBorder(null);
        exit.setContentAreaFilled(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(52, 73, 94));
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setBorder(null);
        login.setContentAreaFilled(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        errorHandle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        errorHandle.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(189, 189, 189))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorHandle, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(errorHandle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
   username.getText();
    }//GEN-LAST:event_usernameActionPerformed
    
    
   
    
    
    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        passwordField.getAccessibleContext();
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String name = username.getText().toString();
        String pass = String.valueOf(passwordField.getPassword());
        setUName(name,pass);
    }//GEN-LAST:event_loginActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel jLab;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorHandle;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}

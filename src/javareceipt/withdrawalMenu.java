/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareceipt;

/**
 *
 * @author joseph
 */


public class withdrawalMenu extends javax.swing.JFrame {

    /**
     * Creates new form withdrawalMenu
     */
    public withdrawalMenu() {
        initComponents();
    }
    
    private static String uName;
    private static String uPass;
    private static double balance;
    public String getPass(){
        return uPass;
    }
    public void setPass(String pass){
        this.uPass = pass;
    }
    
    public String getName(){
        return uName;
    } 
    
    public void setName(String name){
        this.uName = name;
    }
    
    
    public double getBal(){
        return balance;
    }
    public void setBal(double bal){
        this.balance = bal;
    }
    
    
   balances bal = new balances();
   fundsChecker fChecker = new fundsChecker();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        amountInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        enter = new javax.swing.JToggleButton();
        cancel = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(52, 73, 94));
        jLabel1.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome,");

        user.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        if ("201610615".equals(getName())){
            user.setText("Jonah Belandres");
        }
        else if("201610314".equals(getName())){
            user.setText("Gerald Egana");
        }
        else if("201610246".equals(getName())){
            user.setText("Joseph Borja");
        }
        else if("201610658".equals(getName())){
            user.setText("Patrick Felipe");
        }
        else if("201610473".equals(getName())){
            user.setText("Brendan Delos Angeles");
        }
        else if("201530058".equals(getName())){
            user.setText("Patrick Corpuz");
        }
        else if("201610222".equals(getName())){
            user.setText("Xavier Crisostomo");
        }

        amountInput.setBackground(new java.awt.Color(52, 73, 94));
        amountInput.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        amountInput.setForeground(new java.awt.Color(255, 255, 255));
        amountInput.setText("Enter the amount");
        amountInput.setBorder(null);
        amountInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amountInputMouseClicked(evt);
            }
        });
        amountInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountInputActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(52, 73, 94));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Input your password:");

        password.setBackground(new java.awt.Color(52, 73, 94));
        password.setForeground(new java.awt.Color(240, 240, 240));
        password.setBorder(null);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        enter.setBackground(new java.awt.Color(52, 73, 94));
        enter.setForeground(new java.awt.Color(255, 255, 255));
        enter.setText("Enter");
        enter.setBorder(null);
        enter.setContentAreaFilled(false);
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(52, 73, 94));
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.setBorder(null);
        cancel.setContentAreaFilled(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(52, 73, 94));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.setBorder(null);
        clear.setContentAreaFilled(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(enter)
                .addGap(18, 18, 18)
                .addComponent(cancel)
                .addGap(18, 18, 18)
                .addComponent(clear)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amountInputMouseClicked
       amountInput.setText("");
    }//GEN-LAST:event_amountInputMouseClicked

    private void amountInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountInputActionPerformed
        amountInput.getText();
    }//GEN-LAST:event_amountInputActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        receiptConfirm rConfirm = new receiptConfirm();
        double diff; 
        
        if("02071998".equals(getPass())){
            bal.setBalanceJonah(0);
            double famount = Double.parseDouble(amountInput.getText());
            double iamount = bal.getBalanceJonah();
            diff = iamount - famount;
            bal.setDifBalanceJonah(diff);
            setBal(famount);
           fChecker.setBal(diff);
            rConfirm.setVisible(true);
            super.dispose();
        }
        
        else if("12051998".equals(getPass())){
            rConfirm.setVisible(true);
        }
        else if("05251998".equals(getPass())){
            rConfirm.setVisible(true);
        }
        else if("08151998".equals(getPass())){
            rConfirm.setVisible(true);
        }
        else if("02271998".equals(getPass())){
            rConfirm.setVisible(true);
        }
        else if("04251998".equals(getPass())){
            rConfirm.setVisible(true);
        }
        else if("11141998".equals(getPass())){
            rConfirm.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_enterActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       menuBank mbank = new menuBank();
       
       mbank.setVisible(true);
       super.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        amountInput.setText("");
        password.setText("");
        System.out.println(getName());
    }//GEN-LAST:event_clearActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        password.getAccessibleContext();
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

   
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
            java.util.logging.Logger.getLogger(withdrawalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdrawalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdrawalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdrawalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new withdrawalMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountInput;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JToggleButton enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

   
}

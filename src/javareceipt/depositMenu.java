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
public class depositMenu extends javax.swing.JFrame {

    /**
     * Creates new form depositMenu
     */
    public depositMenu() {
        initComponents();
    }
    
    private static String uName;
    private static String uPass;
    
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
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        inputAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        jButton3.setText("Exit");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        inputAmount.setBackground(new java.awt.Color(52, 73, 94));
        inputAmount.setForeground(new java.awt.Color(255, 255, 255));
        inputAmount.setText("Enter Amount to Deposit");
        inputAmount.setBorder(null);
        inputAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputAmountMouseClicked(evt);
            }
        });
        inputAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAmountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome,");

        user.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        user.setForeground(new java.awt.Color(240, 240, 240));
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

        enter.setForeground(new java.awt.Color(255, 255, 255));
        enter.setText("Enter");
        enter.setBorder(null);
        enter.setContentAreaFilled(false);
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear)
                        .addGap(122, 122, 122)
                        .addComponent(cancel)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(inputAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enter)
                    .addComponent(clear)
                    .addComponent(cancel))
                .addContainerGap(64, Short.MAX_VALUE))
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

    private void inputAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputAmountMouseClicked
        inputAmount.setText("");
    }//GEN-LAST:event_inputAmountMouseClicked

    private void inputAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAmountActionPerformed
        inputAmount.getText();
    }//GEN-LAST:event_inputAmountActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        balances bal = new balances();
        double ammount = Double.parseDouble(inputAmount.getText());
        
        if ("201610615".equals(getName())     && "02071998".equals(getPass())){
            bal.setBalanceJonah(ammount);
        }
        else if ("201610314".equals(getName())&& "12051998".equals(getPass())){
            bal.setBalanceGer(ammount);
        }
        else if ("201610246".equals(getName())&& "05251998".equals(getPass())){
            bal.setBalanceSeph(ammount);
        }
        else if ("201610222".equals(getName())&& "08151998".equals(getPass())){
            bal.setBalanceXav(ammount);
        }
        else if ("201610658".equals(getName())&& "02271998".equals(getPass())){
            bal.setBalancePatF(ammount);
        }
        else if ("201610473".equals(getName())&& "04251998".equals(getPass())){
            bal.setBalanceBrends(ammount);
        }
        else if ("201530058".equals(getName()) && "11141998".equals(getPass()) ){
            bal.setBalancePatC(ammount);
        }
        menuBank mBank = new menuBank();
        mBank.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_enterActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       inputAmount.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        menuBank wMenu = new menuBank();
        wMenu.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(depositMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(depositMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(depositMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(depositMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new depositMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton enter;
    private javax.swing.JTextField inputAmount;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}

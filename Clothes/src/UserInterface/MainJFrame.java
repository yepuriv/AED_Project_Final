/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Database.ClothesDb;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Properties;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author varunkumar
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private EcoSystem system;
    private ClothesDb dB4OUtil = ClothesDb.getInstance();
    
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        upperContainer = new javax.swing.JPanel();
        txtUsernametoenter = new javax.swing.JTextField();
        txtPasswordenter = new javax.swing.JTextField();
        btnLoginSys = new javax.swing.JButton();
        userid = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        txtPasswordField = new javax.swing.JPasswordField();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        upperContainer.setBackground(new java.awt.Color(255, 0, 102));
        upperContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsernametoenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernametoenterActionPerformed(evt);
            }
        });
        upperContainer.add(txtUsernametoenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 104, -1));

        txtPasswordenter.setUI(null);
        upperContainer.add(txtPasswordenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 37, 3, 0));

        btnLoginSys.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnLoginSys.setText("Login");
        btnLoginSys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginSysActionPerformed(evt);
            }
        });
        upperContainer.add(btnLoginSys, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 104, 20));

        userid.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        userid.setForeground(new java.awt.Color(255, 255, 255));
        userid.setText("UserID");
        upperContainer.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        password.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        upperContainer.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        btnLogout.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        upperContainer.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 130, 120, 20));
        upperContainer.add(txtPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 104, -1));

        enterpriseLabel.setFont(new java.awt.Font("Academy Engraved LET", 1, 36)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("CLOTHES DONATION SYSTEM");
        upperContainer.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 560, 60));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/iconabove.png"))); // NOI18N
        upperContainer.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 180, 180));

        jSplitPane.setTopComponent(upperContainer);

        userProcessContainer.setBackground(new java.awt.Color(0, 0, 0));
        userProcessContainer.setMaximumSize(new java.awt.Dimension(1500, 1000));
        userProcessContainer.setSize(new java.awt.Dimension(1500, 1000));
        userProcessContainer.setLayout(new java.awt.CardLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/background.jpeg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel4.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel4.setPreferredSize(new java.awt.Dimension(1500, 1000));
        jLabel4.setSize(new java.awt.Dimension(1500, 1000));
        userProcessContainer.add(jLabel4, "card2");

        jSplitPane.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginSysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginSysActionPerformed
        
        String uname = txtUsernametoenter.getText();
        char[] password1 = txtPasswordField.getPassword();
        
        if(uname.equalsIgnoreCase("") || password1.equals("") || (uname.equalsIgnoreCase("") && password1.equals(""))){
            
            JOptionPane.showMessageDialog(null, "Fields Cannot Be Empty!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get user name
        String userName = txtUsernametoenter.getText();
        // Get Password
        char[] passwordCharArray = txtPasswordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise=null;
        Organization inOrganization=null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                            userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            userProcessContainer.add("workArea",userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, system));
            layout.next(userProcessContainer);
        }
        
       
        btnLoginSys.setEnabled(false);
        btnLogout.setEnabled(true);
        txtUsernametoenter.setEnabled(false);
        txtPasswordenter.setEnabled(false);

    }//GEN-LAST:event_btnLoginSysActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        
        btnLogout.setEnabled(false);
        txtUsernametoenter.setEnabled(true);
        txtPasswordField.setEnabled(true);
        btnLoginSys.setEnabled(true);

        txtUsernametoenter.setText("");
        txtPasswordField.setText("");

        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        userProcessContainer.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtUsernametoenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernametoenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernametoenterActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginSys;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField txtPasswordField;
    private javax.swing.JTextField txtPasswordenter;
    private javax.swing.JTextField txtUsernametoenter;
    private javax.swing.JPanel upperContainer;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JLabel userid;
    // End of variables declaration//GEN-END:variables
}

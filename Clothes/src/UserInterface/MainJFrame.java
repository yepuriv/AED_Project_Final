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

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Varun
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
        MainContainer = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        UserIdjLabel1 = new javax.swing.JLabel();
        UserIdPassjLabel2 = new javax.swing.JLabel();
        btnLogoutOfProfile = new javax.swing.JButton();
        txtPasswordField = new javax.swing.JPasswordField();
        enterpriseLabel = new javax.swing.JLabel();
        mainIcon = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();
        LowerContainer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        MainContainer.setBackground(new java.awt.Color(255, 51, 102));
        MainContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MainContainer.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 104, -1));

        txtPassword.setUI(null);
        MainContainer.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 37, 3, 0));

        btnLogin.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        MainContainer.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 104, 20));

        UserIdjLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        UserIdjLabel1.setText("UserId");
        MainContainer.add(UserIdjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        UserIdPassjLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        UserIdPassjLabel2.setText("Password");
        MainContainer.add(UserIdPassjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        btnLogoutOfProfile.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnLogoutOfProfile.setText("Logout");
        btnLogoutOfProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutOfProfileActionPerformed(evt);
            }
        });
        MainContainer.add(btnLogoutOfProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 140, 80, 20));
        MainContainer.add(txtPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 104, -1));

        enterpriseLabel.setFont(new java.awt.Font("Academy Engraved LET", 1, 36)); // NOI18N
        enterpriseLabel.setText("FOOD DONATION SYSTEM");
        MainContainer.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 500, 60));

        mainIcon.setBackground(new java.awt.Color(0, 0, 0));
        mainIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/LOGO.png"))); // NOI18N
        MainContainer.add(mainIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 180, 180));

        jSplitPane.setTopComponent(MainContainer);

        userProcessContainer.setBackground(new java.awt.Color(0, 0, 0));
        userProcessContainer.setMaximumSize(new java.awt.Dimension(1500, 1000));
        userProcessContainer.setSize(new java.awt.Dimension(1500, 1000));
        userProcessContainer.setLayout(new java.awt.CardLayout());

        LowerContainer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LowerContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/background.jpeg"))); // NOI18N
        LowerContainer.setMaximumSize(new java.awt.Dimension(1500, 1000));
        LowerContainer.setMinimumSize(new java.awt.Dimension(1500, 1000));
        LowerContainer.setPreferredSize(new java.awt.Dimension(1500, 1000));
        LowerContainer.setSize(new java.awt.Dimension(1500, 1000));
        userProcessContainer.add(LowerContainer, "card2");

        jSplitPane.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        String uname = txtUsername.getText();
        char[] password1 = txtPasswordField.getPassword();
        
        if(uname.equalsIgnoreCase("") || password1.equals("") || (uname.equalsIgnoreCase("") && password1.equals(""))){
            
            JOptionPane.showMessageDialog(null, "Please Enter Proper Id", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get user name
        String userName = txtUsername.getText();
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
            JOptionPane.showMessageDialog(null, "Wrong UserId or Password");
            return;
        }
        else{
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            userProcessContainer.add("workArea",userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, system));
            layout.next(userProcessContainer);
        }
        
       

        btnLogin.setEnabled(false);
        btnLogoutOfProfile.setEnabled(true);
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutOfProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutOfProfileActionPerformed
        
        btnLogoutOfProfile.setEnabled(false);
        txtUsername.setEnabled(true);
        txtPasswordField.setEnabled(true);
        btnLogin.setEnabled(true);

        txtUsername.setText("");
        txtPasswordField.setText("");

        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        userProcessContainer.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutOfProfileActionPerformed

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
    private javax.swing.JLabel LowerContainer;
    private javax.swing.JPanel MainContainer;
    private javax.swing.JLabel UserIdPassjLabel2;
    private javax.swing.JLabel UserIdjLabel1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogoutOfProfile;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel mainIcon;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JPasswordField txtPasswordField;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}

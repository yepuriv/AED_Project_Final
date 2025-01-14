/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.EcoSystem;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DistributorOrganization;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.ShelterOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClothesRequirementRequest;
import Business.WorkQueue.Products;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author varunkumar
 */
public class NGOWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private NGOAdminOrganization ngoOrganization;
    private ShelterOrganization shelterOrganization;

    public NGOWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.enterprise = enterprise;
        this.ngoOrganization = (NGOAdminOrganization) organization;

        populateTable();
    }

    public void populateTable() {
        System.out.println("###########");
        System.out.println("###########" + ngoOrganization.getWorkQueue().getWorkRequestList());
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);

        for (WorkRequest request : ngoOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();

            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignworkJButton = new javax.swing.JButton();
        processworkJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        btnSendtoDist = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignworkJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        assignworkJButton.setText("Assign Work Request");
        assignworkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignworkJButtonActionPerformed(evt);
            }
        });

        processworkJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        processworkJButton.setText("Process Work Request");
        processworkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processworkJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        btnSendtoDist.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnSendtoDist.setText("Send to Distributor");
        btnSendtoDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendtoDistActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Academy Engraved LET", 1, 24)); // NOI18N
        jLabel1.setText("NGO Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignworkJButton)
                        .addGap(18, 18, 18)
                        .addComponent(processworkJButton)
                        .addGap(18, 18, 18)
                        .addComponent(btnSendtoDist))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignworkJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processworkJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendtoDist, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(331, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignworkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignworkJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("Sent")) {
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Request cannot be assigned by " + userAccount, "Warning", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_assignworkJButtonActionPerformed

    private void processworkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processworkJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ClothesRequirementRequest request = (ClothesRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("Sent")) {
            JOptionPane.showMessageDialog(null, "Please assign the request", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (request.getReceiver().equals(userAccount) && (request.getStatus().equalsIgnoreCase("Pending") || request.getStatus().equalsIgnoreCase("Processing"))) {

            request.setStatus("Processing");
            ProcessNWorkRequestJPanel processWorkRequestJPanel = new ProcessNWorkRequestJPanel(userProcessContainer, request);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Request cannot be processed as it is " + request.getStatus(), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_processworkJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        JOptionPane.showMessageDialog(null, "Requests Updated!");
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnSendtoDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendtoDistActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }

        ClothesRequirementRequest distrequest = (ClothesRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (distrequest.getStatus().equalsIgnoreCase("Rejected")) {
            JOptionPane.showMessageDialog(null, "Request has been rejected!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!(distrequest.getStatus().equalsIgnoreCase("Completed"))) {
            JOptionPane.showMessageDialog(null, "Request yet to be approved");
            return;
        }

        distrequest.setMessage(distrequest.getMessage());
        distrequest.setSender(userAccount);
        distrequest.setStatus("Sent to Distributor");
        
        if(distrequest.getReceiver()==userAccount){
            distrequest.setReceiver(null);
            
        }
        
        for (Network n : business.getNetworkList()) {

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                if (e instanceof DistributorEnterprise) {

                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof DistributorOrganization) { //changed from ngo to distributor organization
                            organization.getWorkQueue().getWorkRequestList().add(distrequest);
                            userAccount.getWorkQueue().getWorkRequestList().add(distrequest);
                        }
                    }
                }
            }
        }
        
        populateTable();
        
        JOptionPane.showMessageDialog(null, "Request Sent to Distributor Successfully!");
    }//GEN-LAST:event_btnSendtoDistActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignworkJButton;
    private javax.swing.JButton btnSendtoDist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processworkJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

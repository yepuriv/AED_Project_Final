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
import Business.WorkQueue.FoodRequirementRequest;
import Business.WorkQueue.Products;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akshitvarma
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
        DefaultTableModel model = (DefaultTableModel) workRequestofNGOJTable.getModel();
        
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
        workRequestofNGOJTable = new javax.swing.JTable();
        assignworkreqJButton = new javax.swing.JButton();
        processworkreqJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        btnSendtoDistributorassign = new javax.swing.JButton();
        DisplayProductBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAvailProducts = new javax.swing.JTable();
        ngodash = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        workRequestofNGOJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(workRequestofNGOJTable);

        assignworkreqJButton.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        assignworkreqJButton.setText("Assign Work Request");
        assignworkreqJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignworkreqJButtonActionPerformed(evt);
            }
        });

        processworkreqJButton.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        processworkreqJButton.setText("Process Work Request");
        processworkreqJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processworkreqJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        btnSendtoDistributorassign.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        btnSendtoDistributorassign.setText("Send to Distributor");
        btnSendtoDistributorassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendtoDistributorassignActionPerformed(evt);
            }
        });

        DisplayProductBtn.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        DisplayProductBtn.setText("Display Product");
        DisplayProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayProductBtnActionPerformed(evt);
            }
        });

        tblAvailProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clothes Type", "Product", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAvailProducts);

        ngodash.setFont(new java.awt.Font("Academy Engraved LET", 1, 24)); // NOI18N
        ngodash.setText("NGO Dashboard");

        jLabel2.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        jLabel2.setText("Products");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignworkreqJButton)
                        .addGap(18, 18, 18)
                        .addComponent(processworkreqJButton)
                        .addGap(18, 18, 18)
                        .addComponent(btnSendtoDistributorassign))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ngodash, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(736, 736, 736)
                                .addComponent(DisplayProductBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngodash)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignworkreqJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processworkreqJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendtoDistributorassign, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DisplayProductBtn))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignworkreqJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignworkreqJButtonActionPerformed

        int selectedRow = workRequestofNGOJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest) workRequestofNGOJTable.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("Sent")) {
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Request cannot be assigned by " + userAccount, "Warning", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_assignworkreqJButtonActionPerformed

    private void processworkreqJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processworkreqJButtonActionPerformed

        int selectedRow = workRequestofNGOJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        FoodRequirementRequest request = (FoodRequirementRequest) workRequestofNGOJTable.getValueAt(selectedRow, 0);

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

    }//GEN-LAST:event_processworkreqJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        JOptionPane.showMessageDialog(null, "Requests Updated!");
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnSendtoDistributorassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendtoDistributorassignActionPerformed

        int selectedRow = workRequestofNGOJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }

        FoodRequirementRequest distrequest = (FoodRequirementRequest) workRequestofNGOJTable.getValueAt(selectedRow, 0);

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
    }//GEN-LAST:event_btnSendtoDistributorassignActionPerformed

    private void DisplayProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayProductBtnActionPerformed

        int selectedRow = workRequestofNGOJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblAvailProducts.getModel();
        model.setRowCount(0);
        model.setRowCount(0);

        WorkRequest request = (WorkRequest) workRequestofNGOJTable.getValueAt(selectedRow, 0);

        ArrayList<Products> productList = ((FoodRequirementRequest) request).getProductList();
        if (productList != null) {
            for (Products p : productList) {
                Object row[] = new Object[3];
                row[0] = p;
                row[1] = p.getProductName();
                row[2] = p.getQuantity();
                model.addRow(row);

            }
        }

    }//GEN-LAST:event_DisplayProductBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisplayProductBtn;
    private javax.swing.JButton assignworkreqJButton;
    private javax.swing.JButton btnSendtoDistributorassign;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel ngodash;
    private javax.swing.JButton processworkreqJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable tblAvailProducts;
    private javax.swing.JTable workRequestofNGOJTable;
    // End of variables declaration//GEN-END:variables
}

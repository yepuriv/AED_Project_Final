/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.EcoSystem;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.QualityCheckEnterprise;
import Business.Network.Network;
import Business.Organization.DistributorOrganization;
import Business.Organization.Organization;
import Business.Organization.PackagingOrganization;
import Business.Organization.QualityOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClothesRequirementRequest;
import Business.WorkQueue.Inventory;
import Business.WorkQueue.InventoryDirectory;
import Business.WorkQueue.Products;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author varunkumar
 */
public class DistributorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DistributorWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private DistributorOrganization distributorOrganization;
    private Enterprise enterprise;
    private EcoSystem business;

    public DistributorWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, DistributorOrganization distributorOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.enterprise = enterprise;
        this.distributorOrganization = (DistributorOrganization) distributorOrganization;

        populateTable();
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        
        if(!distributorOrganization.getWorkQueue().getWorkRequestList().isEmpty()) {  
            for (WorkRequest request : distributorOrganization.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[4];
                row[0] = request;
                row[1] = request.getSender().getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = request.getStatus();

                model.addRow(row);
            }
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

        assignWorkJButton = new javax.swing.JButton();
        processWorkJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        btnSendforQualityCheck = new javax.swing.JButton();
        DistributorDash = new javax.swing.JLabel();
        btnSendforPackaging = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        showProductBtn = new javax.swing.JButton();
        ProductsDist = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        assignWorkJButton.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        assignWorkJButton.setText("Assign Work Request");
        assignWorkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignWorkJButtonActionPerformed(evt);
            }
        });

        processWorkJButton.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        processWorkJButton.setText("Process Work Request");
        processWorkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processWorkJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        btnSendforQualityCheck.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        btnSendforQualityCheck.setText("Send for Quality Check");
        btnSendforQualityCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendforQualityCheckActionPerformed(evt);
            }
        });

        DistributorDash.setFont(new java.awt.Font("Academy Engraved LET", 1, 24)); // NOI18N
        DistributorDash.setText("Distributor Dashboard");

        btnSendforPackaging.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        btnSendforPackaging.setText("Send for Packaging");
        btnSendforPackaging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendforPackagingActionPerformed(evt);
            }
        });

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblProducts);

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

        showProductBtn.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        showProductBtn.setText("Display Products");
        showProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductBtnActionPerformed(evt);
            }
        });

        ProductsDist.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        ProductsDist.setText("Products");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProductsDist)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(showProductBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(assignWorkJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(processWorkJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSendforQualityCheck)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSendforPackaging, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(280, 280, 280))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DistributorDash, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DistributorDash))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignWorkJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processWorkJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendforQualityCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendforPackaging, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductsDist)
                    .addComponent(showProductBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignWorkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignWorkJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("Sent to Distributor")) {
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Request cannot be assigned by " + userAccount, "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_assignWorkJButtonActionPerformed

    private void processWorkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processWorkJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Boolean flag = false;
        ArrayList<Boolean> booleanList = new ArrayList<>();
        ArrayList<Products> reqProduct = new ArrayList<>();
        HashMap<String, Integer> reqProductMap = new HashMap<>();

        ClothesRequirementRequest request = (ClothesRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("Sent to Distributor")) {
            JOptionPane.showMessageDialog(null, "Please assign the request", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (request.getStatus().equalsIgnoreCase("Sent to Quality")) {
            JOptionPane.showMessageDialog(null, "Cannot Process the Request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (Inventory inSupp : InventoryDirectory.getInventoryList()) {
            
            for (Products prod : request.getProductList()) {
                if (prod.getProductName().equalsIgnoreCase(inSupp.getProductName())) {
                    System.out.println(prod.getProductName() + "   " + inSupp.getProductName());
                    if (prod.getQuantity() < inSupp.getQuantity()) {
                        booleanList.add(true);

                    } else {
                        reqProductMap.put(prod.getProductName(), prod.getQuantity());
                        System.out.println(reqProductMap + "Request Map");
                        booleanList.add(false);
                    }
                }
            }
        }
        if (booleanList.contains(false)) {
            flag = false;
        } else {
            flag = true;
        }
        request.setStatus("Processing");
        
        ProcessDWorkAreaJPanel processWorkRequestJPanel = new ProcessDWorkAreaJPanel(userProcessContainer, userAccount, request, flag, reqProductMap, enterprise, business);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        populateTable();
    }//GEN-LAST:event_processWorkJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        JOptionPane.showMessageDialog(null, "Requests Updated!");
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnSendforQualityCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendforQualityCheckActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }

        ClothesRequirementRequest quaRequest = (ClothesRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);
        
        if (quaRequest.getStatus().equalsIgnoreCase("Sent to Supplier")) {
            JOptionPane.showMessageDialog(null, "Request pending with Supplier!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (quaRequest.getStatus().equalsIgnoreCase("Sent to Quality")) {
            JOptionPane.showMessageDialog(null, "Request already sent for Quality Check!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (quaRequest.getStatus().equalsIgnoreCase("Completed")) {
            JOptionPane.showMessageDialog(null, "Request is already Completed!");
            return;
        } else if (quaRequest.getStatus().equalsIgnoreCase("Sent to Packaging")) {
            JOptionPane.showMessageDialog(null, "Request already sent for Packaging!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (quaRequest.getStatus().equalsIgnoreCase("Quality Check Approved")) {
            JOptionPane.showMessageDialog(null, "Request already Approved, send for Packaging!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(quaRequest.getReceiver()==userAccount)
        {
            quaRequest.setReceiver(null);
        }

        quaRequest.setMessage(quaRequest.getMessage());
        quaRequest.setSender(userAccount);
        quaRequest.setStatus("Sent to Quality");
        
        for (Network n : business.getNetworkList()) {

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                if (e instanceof QualityCheckEnterprise) {

                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof QualityOrganization) { //changed from distributor to qualityCheck organization
                            organization.getWorkQueue().getWorkRequestList().add(quaRequest);
                            userAccount.getWorkQueue().getWorkRequestList().add(quaRequest);
                        }
                    }
                }
            }
        }
        
        populateTable();

        JOptionPane.showMessageDialog(null, "Request Successfully Sent for Quality Check!");
    }//GEN-LAST:event_btnSendforQualityCheckActionPerformed

    private void btnSendforPackagingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendforPackagingActionPerformed
        // TODO add your handling code here:
         int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }

        ClothesRequirementRequest quaRequest = (ClothesRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);
        
        if (quaRequest.getStatus().equalsIgnoreCase("Sent to Supplier")) {
            JOptionPane.showMessageDialog(null, "Request pending with Supplier!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (quaRequest.getStatus().equalsIgnoreCase("Sent to Quality")) {
            JOptionPane.showMessageDialog(null, "Request sent for Quality Check!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (quaRequest.getStatus().equalsIgnoreCase("Completed")) {
            JOptionPane.showMessageDialog(null, "Request is already Completed!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (quaRequest.getStatus().equalsIgnoreCase("Sent to Packaging")) {
            JOptionPane.showMessageDialog(null, "Request already sent for Packaging!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(quaRequest.getReceiver()==userAccount)
        {
            quaRequest.setReceiver(userAccount);
        }

        quaRequest.setMessage(quaRequest.getMessage());
        quaRequest.setSender(userAccount);
        quaRequest.setStatus("Sent to Packaging");

        for (Network n : business.getNetworkList()) {

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                if (e instanceof DistributorEnterprise) {

                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof PackagingOrganization) { // from Distributor to packaging Organization
                            organization.getWorkQueue().getWorkRequestList().add(quaRequest);
                            userAccount.getWorkQueue().getWorkRequestList().add(quaRequest);
                        }
                    }
                }
            }
        }
        
        populateTable();

        JOptionPane.showMessageDialog(null, "Request Successfully Sent for Packaging!");
    }//GEN-LAST:event_btnSendforPackagingActionPerformed

    private void showProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProductBtnActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a request");
        }

        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        model.setRowCount(0);model.setRowCount(0);

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        ArrayList<Products> productList = ((ClothesRequirementRequest) request).getProductList();
        if (productList!=null){
            for (Products p : productList) {
                Object row[] = new Object[3];
                row[0] = p;
                row[1] = p.getProductName();
                row[2] = p.getQuantity();
                model.addRow(row);
                //((DefaultTableModel) tblProducts.getModel()).addRow(row);
            }
        }
    }//GEN-LAST:event_showProductBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DistributorDash;
    private javax.swing.JLabel ProductsDist;
    private javax.swing.JButton assignWorkJButton;
    private javax.swing.JButton btnSendforPackaging;
    private javax.swing.JButton btnSendforQualityCheck;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processWorkJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton showProductBtn;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

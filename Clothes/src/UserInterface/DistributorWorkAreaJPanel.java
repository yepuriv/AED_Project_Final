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
import Business.WorkQueue.FoodRequirementRequest;
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

        assignworkreqJButton = new javax.swing.JButton();
        processworkreqJButton = new javax.swing.JButton();
        refreshpageJButton = new javax.swing.JButton();
        btnSendforQC = new javax.swing.JButton();
        distributordash = new javax.swing.JLabel();
        btnSendforpackaging = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableforProducts = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        DisplayProductBtn = new javax.swing.JButton();
        ProductsjLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        assignworkreqJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        assignworkreqJButton.setText("Assign Work Request");
        assignworkreqJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignworkreqJButtonActionPerformed(evt);
            }
        });

        processworkreqJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        processworkreqJButton.setText("Process Work Request");
        processworkreqJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processworkreqJButtonActionPerformed(evt);
            }
        });

        refreshpageJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        refreshpageJButton.setText("Refresh");
        refreshpageJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshpageJButtonActionPerformed(evt);
            }
        });

        btnSendforQC.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnSendforQC.setText("Send for Quality Check");
        btnSendforQC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendforQCActionPerformed(evt);
            }
        });

        distributordash.setFont(new java.awt.Font("Academy Engraved LET", 1, 24)); // NOI18N
        distributordash.setText("Distributor Dashboard");

        btnSendforpackaging.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnSendforpackaging.setText("Send for Packaging");
        btnSendforpackaging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendforpackagingActionPerformed(evt);
            }
        });

        tableforProducts.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableforProducts);

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

        DisplayProductBtn.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        DisplayProductBtn.setText("Display Products");
        DisplayProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayProductBtnActionPerformed(evt);
            }
        });

        ProductsjLabel.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        ProductsjLabel.setText("Products");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProductsjLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(distributordash, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshpageJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DisplayProductBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(assignworkreqJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(processworkreqJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSendforQC)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSendforpackaging, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(280, 280, 280)))))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshpageJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distributordash))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignworkreqJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processworkreqJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendforQC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendforpackaging, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductsjLabel)
                    .addComponent(DisplayProductBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignworkreqJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignworkreqJButtonActionPerformed

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

    }//GEN-LAST:event_assignworkreqJButtonActionPerformed

    private void processworkreqJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processworkreqJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Boolean flag = false;
        ArrayList<Boolean> booleanList = new ArrayList<>();
        ArrayList<Products> reqProduct = new ArrayList<>();
        HashMap<String, Integer> reqProductMap = new HashMap<>();

        FoodRequirementRequest request = (FoodRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);

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
    }//GEN-LAST:event_processworkreqJButtonActionPerformed

    private void refreshpageJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshpageJButtonActionPerformed
        populateTable();
        JOptionPane.showMessageDialog(null, "Requests Updated!");
    }//GEN-LAST:event_refreshpageJButtonActionPerformed

    private void btnSendforQCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendforQCActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }

        FoodRequirementRequest quaRequest = (FoodRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);
        
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
    }//GEN-LAST:event_btnSendforQCActionPerformed

    private void btnSendforpackagingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendforpackagingActionPerformed
        // TODO add your handling code here:
         int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }

        FoodRequirementRequest quaRequest = (FoodRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);
        
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
    }//GEN-LAST:event_btnSendforpackagingActionPerformed

    private void DisplayProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayProductBtnActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a request");
        }

        DefaultTableModel model = (DefaultTableModel) tableforProducts.getModel();
        model.setRowCount(0);model.setRowCount(0);

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        ArrayList<Products> productList = ((FoodRequirementRequest) request).getProductList();
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
    }//GEN-LAST:event_DisplayProductBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisplayProductBtn;
    private javax.swing.JLabel ProductsjLabel;
    private javax.swing.JButton assignworkreqJButton;
    private javax.swing.JButton btnSendforQC;
    private javax.swing.JButton btnSendforpackaging;
    private javax.swing.JLabel distributordash;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processworkreqJButton;
    private javax.swing.JButton refreshpageJButton;
    private javax.swing.JTable tableforProducts;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

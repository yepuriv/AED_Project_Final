/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.EcoSystem;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PackagingOrganization;
import Business.Organization.TransportOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodRequirementRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import Business.WorkQueue.Products;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author varunkumar
 */
public class PackagingWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PackagingWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private PackagingOrganization packagingOrganization;
    
    public PackagingWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PackagingOrganization packagingOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise=enterprise;
        this.packagingOrganization = (PackagingOrganization)packagingOrganization;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        showProductBtn = new javax.swing.JButton();
        packagingdash = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();
        btnSentforTransport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProducts2 = new javax.swing.JTable();
        products = new javax.swing.JLabel();
        display2ProductBtn1 = new javax.swing.JButton();

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Type", "Product", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProducts);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Products");

        showProductBtn.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        showProductBtn.setText("Display Products");
        showProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductBtnActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");

        packagingdash.setFont(new java.awt.Font("Academy Engraved LET", 1, 24)); // NOI18N
        packagingdash.setText("Packaging Dashboard");

        refreshJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        btnSentforTransport.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnSentforTransport.setText("Send for Transport");
        btnSentforTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSentforTransportActionPerformed(evt);
            }
        });

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

        tblProducts2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblProducts2);

        products.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        products.setText("Products");

        display2ProductBtn1.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        display2ProductBtn1.setText("Display Products");
        display2ProductBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display2ProductBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(products)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(display2ProductBtn1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSentforTransport)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(packagingdash, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(packagingdash)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(btnSentforTransport, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(display2ProductBtn1)
                    .addComponent(products))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(364, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        JOptionPane.showMessageDialog(null, "Requests Updated!");
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnSentforTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSentforTransportActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        FoodRequirementRequest request = (FoodRequirementRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equalsIgnoreCase("Completed")){
            JOptionPane.showMessageDialog(null, "Request already Completed!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
               

        request.setReceiver(null);
        request.setMessage(request.getMessage());
        request.setSender(userAccount);
        request.setStatus("Sent to Transport");
        
        for (Network n : business.getNetworkList()) {

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                if (e instanceof DistributorEnterprise) {

                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof TransportOrganization) { 
                            organization.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                        }
                    }
                }
            }
        }
        populateTable();
        JOptionPane.showMessageDialog(null, "Request Successfully Sent for Transport !");
    }//GEN-LAST:event_btnSentforTransportActionPerformed

    private void showProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProductBtnActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a request");
        }

        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
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
    }//GEN-LAST:event_showProductBtnActionPerformed

    private void display2ProductBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display2ProductBtn1ActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a request");
        }

        DefaultTableModel model = (DefaultTableModel) tblProducts2.getModel();
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
    }//GEN-LAST:event_display2ProductBtn1ActionPerformed

    
    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
      
        if(packagingOrganization.getWorkQueue().getWorkRequestList().size() > 0) {
            for( WorkRequest request : packagingOrganization.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[4];
                row[0] = request;
                row[1] = request.getSender().getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = request.getStatus();

                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSentforTransport;
    private javax.swing.JButton display2ProductBtn1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel packagingdash;
    private javax.swing.JLabel products;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton showProductBtn;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTable tblProducts2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

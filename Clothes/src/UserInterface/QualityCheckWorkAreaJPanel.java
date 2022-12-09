/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import UserInterface.ProcessQWorkRequestJPanel;
import Business.EcoSystem;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.QualityCheckEnterprise;
import Business.Network.Network;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.PackagingOrganization;
import Business.Organization.QualityOrganization;
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
 * @author varunkumar
 */
public class QualityCheckWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QualityCheckWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private NGOAdminOrganization ngoOrganization;
    private QualityOrganization qualityOrganization; 
    
    //Organization organization,Enterprise enterprise, EcoSystem business
    //JPanel userProcessContainer, UserAccount account, QualityOrganization qualityOrganization, Enterprise enterprise
    public QualityCheckWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, QualityOrganization qualityOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise=enterprise;
        this.qualityOrganization = (QualityOrganization)qualityOrganization;
        
        populateTable();
    }
   
    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
      
        if(!qualityOrganization.getWorkQueue().getWorkRequestList().isEmpty()) {
           
            for( WorkRequest request : qualityOrganization.getWorkQueue().getWorkRequestList())
            {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        showProductBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

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

        assignJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        assignJButton.setText("Assign Work Request");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        processJButton.setText("Process Work Request");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
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
        jScrollPane2.setViewportView(tblProducts);

        showProductBtn.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        showProductBtn.setText("Display Products");
        showProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Products");

        jLabel1.setBackground(new java.awt.Color(255, 51, 102));
        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setText("Quality Check Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(assignJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(processJButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshJButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showProductBtn))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showProductBtn)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the required request!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equalsIgnoreCase("Sent to Quality Check"))
        {
            if(request.getReceiver()==null){
                 request.setReceiver(userAccount);
            }
       
        request.setStatus("Pending");
        populateTable();
        }
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

         if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the required request!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        FoodRequirementRequest request = (FoodRequirementRequest)workRequestJTable.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("Sent to Quality")) {
            JOptionPane.showMessageDialog(null, "Please assign the request", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (request.getReceiver().equals(userAccount) && (request.getStatus().equalsIgnoreCase("Pending") || request.getStatus().equalsIgnoreCase("Processing"))){
            request.setStatus("Processing");
            populateTable();
            ProcessQWorkRequestJPanel processWorkRequestJPanel = new ProcessQWorkRequestJPanel(userProcessContainer, request);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else if(request.getStatus().equalsIgnoreCase("Quality Check Approved")){
            JOptionPane.showMessageDialog(null, "Request already approved!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Request", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        JOptionPane.showMessageDialog(null, "Requests Updated!");
    }//GEN-LAST:event_refreshJButtonActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton showProductBtn;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    
}

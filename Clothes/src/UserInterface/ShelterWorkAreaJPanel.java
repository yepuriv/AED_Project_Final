/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import UserInterface.RequestClothesJPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
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
 * @author akshitvarma
 */
public class ShelterWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShelterWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private ShelterOrganization shelterOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    
    public ShelterWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, ShelterOrganization shelterOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
        this.shelterOrganization=shelterOrganization;
        this.business=business;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
     //   populateData();
    }

     public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) shelterWorkRequestTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
           
           // if (productList!=null){
           //for (Products p : productList) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((ClothesRequirementRequest) request).getRequestResult();
            row[3] = result == null ? "Waiting" : result;
         
                model.addRow(row);
 
        }
        
    }
     
     //adding below method to get product data
    public void populateData() {
    
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        model.setRowCount(0);model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
        ArrayList<Products> productList = ((ClothesRequirementRequest) request).getProductList();
            if (productList!=null){
               for (Products p : productList) {
                   Object row[] = new Object[3];
                   row[0] = p;
                   row[1] = p.getProductName();
                   row[2] = p.getQuantity();
                   ((DefaultTableModel) tblProducts.getModel()).addRow(row);  
                }
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

        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shelterWorkRequestTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        showProductBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 0, 102));

        requestTestJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        requestTestJButton.setText("Request Clothes");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("<value>");

        shelterWorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shelterWorkRequestTable);

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
        showProductBtn.setText("Show Product");
        showProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Products");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 466, Short.MAX_VALUE)
                                .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestClothesJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
    
        populateRequestTable();
        JOptionPane.showMessageDialog(null, "Requests Updated!");

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void showProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProductBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = shelterWorkRequestTable.getSelectedRow();
         if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a request");
        }
       
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        model.setRowCount(0);model.setRowCount(0);

        WorkRequest request = (WorkRequest)shelterWorkRequestTable.getValueAt(selectedRow, 0);

        ArrayList<Products> productList = ((ClothesRequirementRequest) request).getProductList();
        if (productList!=null){
            for (Products p : productList) {
               Object row[] = new Object[3];
               row[0] = p;
               row[1] = p.getProductName();
               row[2] = p.getQuantity();
               ((DefaultTableModel) tblProducts.getModel()).addRow(row);  
            }
        }    
    }//GEN-LAST:event_showProductBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable shelterWorkRequestTable;
    private javax.swing.JButton showProductBtn;
    private javax.swing.JTable tblProducts;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}

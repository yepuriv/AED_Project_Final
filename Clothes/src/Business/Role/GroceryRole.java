/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.GroceryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.ClothesGrocerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author akshitvarma
 */
public class GroceryRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ClothesGrocerWorkAreaJPanel(userProcessContainer, account, (GroceryOrganization)organization, enterprise, business);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PackagingOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PackagingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author akshitvarma
 */
public class PackagingRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PackagingWorkAreaJPanel(userProcessContainer, account, (PackagingOrganization)organization, enterprise, business);
    }
    
    
}
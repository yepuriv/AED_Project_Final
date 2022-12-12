/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.GroceryRole;
import java.util.ArrayList;
/**
 *
 * @author varunkumar
 */
public class GroceryOrganization  extends Organization{
    
    public GroceryOrganization() {
        super(Organization.Type.ClothesGrocerOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GroceryRole());
        return roles;
    }
}

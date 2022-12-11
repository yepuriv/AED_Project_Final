/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author akshitvarma
 */
public class OrganizationDirectory {
    
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.NgoClothesOrganization.getValue())){
            organization = new NGOAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.ShelterClothesOrganization.getValue())){
            organization = new ShelterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.DistributorClothesOrganization.getValue())){
            organization = new DistributorOrganization();
            organizationList.add(organization);
        }    
        else if (type.getValue().equals(Organization.Type.QualityCheckClothesOrganization.getValue())){
            organization = new QualityOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.SupplierClothesOrganization.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }  
        
        else if (type.getValue().equals(Organization.Type.ClothesGrocerOrganization.getValue())){
            organization = new GroceryOrganization();
            organizationList.add(organization);
        } 
        
        else if (type.getValue().equals(Organization.Type.TransportClothesOrganization.getValue())){
            organization = new TransportOrganization();
            organizationList.add(organization);
        } 
                
        else if (type.getValue().equals(Organization.Type.PackagingClothesOrganization.getValue())){
            organization = new PackagingOrganization();
            organizationList.add(organization);
        } 
        
        return organization;
    }
    
}

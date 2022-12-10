/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise;
import Business.Role.Role;
import Business.WorkQueue.InventoryDirectory;
import java.util.ArrayList;


/**
 *
 * @author akshitvarma
 */
public class DistributorEnterprise extends Enterprise {
    
    public DistributorEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Distributor);
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

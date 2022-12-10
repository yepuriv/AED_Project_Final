/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author akshitvarma
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> availenterprise;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return availenterprise;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.availenterprise = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        availenterprise=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.NGO){
            enterprise=new NGOEnterprise(name);
            availenterprise.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.QualityCheck){
            enterprise=new QualityCheckEnterprise(name);
            availenterprise.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Distributor){
            enterprise=new DistributorEnterprise(name);
            availenterprise.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Shelter){
            enterprise=new ShelterEnterprise(name);
            availenterprise.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Supplier){
            enterprise=new SupplierEnterprise(name);
            availenterprise.add(enterprise);
        }
        
        return enterprise;
    }
    
}
    

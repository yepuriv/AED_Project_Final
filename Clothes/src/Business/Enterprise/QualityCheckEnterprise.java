/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akshitvarma
 */
public class QualityCheckEnterprise extends Enterprise {
    
      public QualityCheckEnterprise(String name){
        super(name,Enterprise.EnterpriseType.QualityCheck);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}


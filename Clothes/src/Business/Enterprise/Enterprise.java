/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author akshitvarma
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        NGO("NGO"),
        Shelter("Shelter"),
        Distributor("Distributor"),
        QualityCheck("Quality Check"),
        Supplier("Supplier");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;

    }
    }
    
    public enum EnumType1{
        NGO("NGO"),NgoFoodOrganization("Ngo Clothes Organization");
        private String value;
        private EnumType1(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType2{
       Shelter("Shelter"),ShelterFoodOrganization("Shelter Clothes Organization");
        private String value;
        private EnumType2(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType3{
       Distributor("Distributor"),DistributorFoodOrganization("Distributor Clothes Organization");
        private String value;
        private EnumType3(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType4{
       QualityCheck("Quality Check"),QualityCheckFoodOrganization("QualityCheck Clothes Organization");
        private String value;
        private EnumType4(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType5{
       Supplier("Supplier"),SupplierFoodOrganization("Supplier Clothes Organization");
        private String value;
        private EnumType5(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType6{
       Supplier("Supplier"),GroceryFoodOrganization("Clothes Organization");
        private String value;
        private EnumType6(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
        
    public enum EnumType7{
       Distributor("Distributor"),TransportFoodOrganization("Transport Clothes Organization");
        private String value;
        private EnumType7(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
        
    public enum EnumType8{
       Distributor("Distributor"),PackagingFoodOrganization("Packaging Clothes Organization");
        private String value;
        private EnumType8(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
    
}

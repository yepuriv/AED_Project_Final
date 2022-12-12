/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author akshitvarma
 */
public class InventoryDirectory {
    
    public static ArrayList<Inventory> inventoryList  = new ArrayList<>();
    private InventoryDirectory newInventoryList;
    
    
   static InventoryDirectory iDir=null;
     
    private InventoryDirectory() {
        
     	Inventory inv1  = new Inventory("101", "Shirts","Summer Wear","Available",10);
        Inventory inv2  = new Inventory("102", "Shorts","Summer Wear","Available",100);
        Inventory inv3  = new Inventory("103", "Dresses","Summer Wear","Available",100);
        Inventory inv4  = new Inventory("104", "Coats","Winter Wear","Available",10);
        Inventory inv5  = new Inventory("105", "Gloves","Winter Wear","Available",100);
        Inventory inv6  = new Inventory("106", "Hats","Winter Wear","Available",100);
        Inventory inv7  = new Inventory("107", "Coats","Rainy Wear","Available",100);
        Inventory inv8  = new Inventory("108", "Boots","Rainy Wear","Available",10);
        Inventory inv9  = new Inventory("109", "NA","Rainy Wear","Available",100);
        Inventory inv10 = new Inventory("110", "NA","Women Wear","Available",100);
        Inventory inv11 = new Inventory("111", "NA","Women Wear","Available",100);
        Inventory inv12 = new Inventory("112", "NA","Women Wear","Available",100);
        Inventory inv13 = new Inventory("113", "Field Jackets","Jackets","Available",100);
        Inventory inv14 = new Inventory("114", "Denim","Jackets","Available",100);
        Inventory inv15 = new Inventory("115", "Bomber","Jackets","Available",100);
        Inventory inv16 = new Inventory("116", "Sandals","FootWear","Available",100);
        Inventory inv17 = new Inventory("117", "Flips Flops","FootWear","Available",100);
        Inventory inv18 = new Inventory("118", "Shoes","FootWear","Available",100);
        
        inventoryList.add(inv1);
        inventoryList.add(inv2);
        inventoryList.add(inv3);
        inventoryList.add(inv4);
        inventoryList.add(inv5);
        inventoryList.add(inv6);
        inventoryList.add(inv7);
        inventoryList.add(inv8);
        inventoryList.add(inv9);
        inventoryList.add(inv10);
        inventoryList.add(inv11);
        inventoryList.add(inv12);
        inventoryList.add(inv13);
        inventoryList.add(inv14);
        inventoryList.add(inv15);
        inventoryList.add(inv16);
        inventoryList.add(inv17);
        inventoryList.add(inv18);

    }

    public static ArrayList<Inventory> getInventoryList() {
        
        if(iDir==null)
        {
            iDir=new InventoryDirectory();
           // inventoryList=new ArrayList<>();
        }
        return inventoryList;
    }

    public static void setInventoryList(ArrayList<Inventory> inventoryList) {
        InventoryDirectory.inventoryList = inventoryList;
    }
    
    public  ArrayList<Inventory> getArrayUniqueList() {
        return inventoryList;
    }

}

    



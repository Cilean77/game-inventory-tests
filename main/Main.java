import inventory.*;
import inventory.Item;

public class Main{

    public static void main(String[] artgs){
        
        Inventory bag = new Inventory();
        bag.addItem(new Item("Stone Knife", 2));

        bag.displayItems();      //items wont display properly FIX!!!!
    }
}
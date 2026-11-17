package inventory;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items;

    public Inventory(){
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void displayItems(){    
        for(Item item: items){
            System.out.print(item);
        }
    }
}

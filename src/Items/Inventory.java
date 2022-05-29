package Items;
import java.util.ArrayList;

public class Inventory extends ArrayList<Items>{

    @Override
    public boolean add(Items items){
        if (this.size()<8){
            return super.add(items);

        }
        return false;
    }

    public void showInventory(Inventory Inventory){
        System.out.println("Here are the items in your inventory: " + Inventory);

    }
    public void swapWeapons(Inventory Inventory, Equipment Equipment, Sword sword, Wand wand, Shield shield) {
        if (Inventory.contains(sword)) {
            if (Equipment.contains(wand)) {
                Inventory.remove(sword);
                Equipment.remove(wand);
                Inventory.add(wand);
                Equipment.add(sword);
                System.out.println("You equipped: "+sword.getName());
                System.out.println(wand.getName() + " added to your inventory.");
            }

        }
        else if( Inventory.contains(shield)){
            if (Equipment.contains(sword)){
                Inventory.remove(shield);
                Equipment.remove(sword);
                Inventory.add(sword);
                Equipment.add(shield);
                System.out.println("You equipped: " + shield.getName());
                System.out.println(sword.getName() + " added to your inventory.");
            }
        }


    }


        }


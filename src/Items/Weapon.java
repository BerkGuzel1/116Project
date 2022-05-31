package Items;

import Items.Items;

public class Weapon extends Items {

    public Weapon(String name, int weight, int value,double damage) {
        super(name, weight, value,damage);
    }


    public void specialAction(){

    }


    @Override
    public String toString() {
        return String.format("%-20sName: %-6dWeight: %-6d(Damage)",getName(),getWeight());
    }

}

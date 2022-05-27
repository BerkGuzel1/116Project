package Items;

import Items.Items;

public class Weapon extends Items {
 private int damage;


    public int getDamage() {
        return damage;
    }

    public Weapon(String name, int weight, int value,int damage) {
        super(name, weight, value);
        this.damage =damage;
    }


    public void specialAction(){

    }


    @Override
    public String toString() {
        return String.format("%-20sName: %-6dWeight: %-6d(Damage)",getName(),getWeight());
    }

    public void keepEnemiesAway() {
//giving the character that wields it to not take damage, but also not to cause any damage for a few turns.
    }
}
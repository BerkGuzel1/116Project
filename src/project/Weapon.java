package project;

public class Weapon extends Items {

    public Weapon(String name, int weight, int value,int damage,boolean wield) {
        super(name, weight, value,wield);
    }

    public void specialAction(){
     String wType;
     if (getName().contains("sword")){
         wType = "sword";
     }
     else if (getName().contains("shield")){
         wType = "shield";
     }
     else wType= "wand";
        System.out.println(wType);
    }


    @Override
    public String toString() {
        return String.format("%-20sName: %-6dWeight: %-6d(Damage)",getName(),getWeight());
    }

    public void keepEnemiesAway() {
//giving the character that wields it to not take damage, but also not to cause any damage for a few turns.
    }
}

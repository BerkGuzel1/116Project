package project;

public class Weapon extends Items {
   protected int damage;

    public Weapon(String name, int weight, int value, int damage) {
        super(name, weight, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return String.format("%-20sName: %-6dWeight: %-6d(Damage)",getName(),getWeight(),damage);
    }

    public void keepEnemiesAway() {
//giving the character that wields it to not take damage, but also not to cause any damage for a few turns.
    }
}

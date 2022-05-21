package project;

public class weapon extends items {
   private int damage;

    public weapon(String name, int weight, int value, int damage) {
        super(name, weight, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return String.format("%-20sWeight: %-6dDamage: %-6dRange: %-6d(Weapon)",getName(),getWeight(),damage);
    }

    public void keepEnemiesAway() {
//giving the character that wields it to not take damage, but also not to cause any damage for a few turns.
    }
}

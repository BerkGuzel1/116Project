package project;

public class Lshield extends Weapon{
    public Lshield(String name, int weight, int value, int damage) {
        super(name, weight, value, damage);
        name = "Long Shield";
        weight = 8;
        value = 3;
        this.damage = 6;
    }
}

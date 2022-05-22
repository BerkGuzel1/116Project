package project;

public class Wband extends Weapon {
    public Wband(String name, int weight, int value, int damage) {
        super(name, weight, value, damage);

        Character character;
        name = "Wood Band";
        weight = 6;
        value = 4;
        this.damage = 3;
    }
}
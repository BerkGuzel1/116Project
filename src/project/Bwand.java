package project;

public class Bwand extends Weapon{
    public Bwand(String name, int weight, int value, int damage) {
        super(name, weight, value,damage);

        Character character;
        name = "Bone Wand";
        weight = 6;
        value = 5;
        this.damage = 3;
    }
}

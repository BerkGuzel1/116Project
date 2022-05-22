package project;

public class Ssword extends Weapon {

    public Ssword(String name, int weight, int value, int damage) {
        super(name, weight, value, damage);

        Character character;
        name = "Short sword";
        weight = 5;
        value = 2;
        //damage = 10 * character.getMaxStrength();
    }
}

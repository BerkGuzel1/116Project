package project;

public class sSword extends weapon {

    public sSword(String name, int weight, int value, int damage) {
        super(name, weight, value, damage);
        name = "Short sword";
        weight = 5;
        value = 1;
        this.damage = 10;
    }
}
package Items;

public class Wand extends Weapon {
    public Wand(String name, int weight, int value, int damage) {
        super(name, weight, value,damage);
    }

    public void heal(){

    }
    @Override
    public void specialAction() {
        super.specialAction();
        heal();
    }
}

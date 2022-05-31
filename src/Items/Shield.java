package Items;

public class Shield extends Weapon{
    public Shield(String name, int weight, int value, double damage) {
        super(name, weight, value,damage);
    }
    public void stun(){
    }

    @Override
    public void specialAction() {
        super.specialAction();
        stun();
    }
}

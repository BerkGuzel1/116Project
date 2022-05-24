package Items;

import Items.Items;

public class Armor extends Items {

    public Armor(String name, int weight, int value,boolean wield) {
        super(name, weight, value,wield);
    }

    @Override
    public void specialAction() {
        super.specialAction();
        return;
    }
}

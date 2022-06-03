package Items;

import java.util.ArrayList;

public class Equipment extends ArrayList<Items> {
    @Override
    public boolean add(Items items) {
        if (this.size() < 3) {
            return super.add(items);
        }
        return false;
    }

    public void showEquipments(Equipment Equipment) {
        System.out.println("You equipped these: " + Equipment.get(0));
    }

}

import java.util.ArrayList;

public class Equipment extends ArrayList<Item> {
    @Override
    public boolean add(Item items) {
        if (this.size() < 3) {
            return super.add(items);
        }
        return false;
    }

    public void showEquipments(Equipment Equipment) {
        System.out.println("You equipped these: " + Equipment.get(0));
    }

}

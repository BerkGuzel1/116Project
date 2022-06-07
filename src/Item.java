public class Item {
    private String name;
    private int weight;
    private int value;
    private double damage;

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Item(String name, int weight, int value, double damage) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.damage = damage;
    }
    public void showInfo() {
        System.out.println("The name of this item is: " + name);

        if (weight >= 10) {
            System.out.println("This one looks a bit heavy.You must be strong to carry this. It weighs: " + weight);
        } else {
            System.out.println("Seems easy to carry. It weighs: " + weight);
        }

    }

}
package Items;

import javax.swing.text.html.HTMLDocument;

public class Items {
    private String name;
    private int weight;
    private int value;
    private boolean wield;

    public boolean isWield() {
        return wield;
    }

    public void setWield(boolean wield) {
        this.wield = wield;
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

    public Items(String name, int weight, int value,boolean wield) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.wield =wield;
    }

    public void specialAction(){

    }

}

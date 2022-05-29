package Characters;

import Items.Wand;

import java.util.Random;

public class Healer extends Character {

    public Healer(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateRandomValue(7,3), generateRandomValue(5,1), generateRandomValue(10,6), generateRandomValue(5,1));
        float maxHp = (float) (getMaxIntelligence()*0.1 + getMaxVitality()*0.7 + getMaxStrength()*0.2);
        System.out.println("Healer generated. Strength:" + getMaxStrength()+ " Vitality:"+ getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + maxHp);
        this.setWeapon(new Wand("Wand ",2,1,1));
        System.out.println("*** Healer equipped the wand ***  Wand name: " + getWeapon().getName() + " Weight: " +  getWeapon().getWeight() + " Value: " + getWeapon().getValue() + " Damage: " + getWeapon().getDamage());

    }



    public static int generateRandomValue(int upperBound, int lowerBound){
        Random rand = new Random();
        int value = rand.nextInt(upperBound-lowerBound+1) + lowerBound;
        return value;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Healer does " + (getWeapon().getDamage()*getMaxIntelligence()) + " damage.");
    }
}

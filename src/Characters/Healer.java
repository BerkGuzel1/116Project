package Characters;

import Items.Wand;

import java.math.RoundingMode;
import java.util.Random;

public class Healer extends Character {
    float maxHp = (float) (getMaxIntelligence()*0.1 + getMaxVitality()*0.7 + getMaxStrength()*0.2);

    public Healer(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateRandomValue(7,3), generateRandomValue(5,1), generateRandomValue(10,6), generateRandomValue(5,1));
        System.out.println("Healer generated. Strength:" + getMaxStrength()+ " Vitality:"+ getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + maxHp);
        this.setWeapon(new Wand("Wand ",2,1,0.6));
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
        System.out.println("Healer does " + Math.round(getWeapon().getDamage()*getMaxIntelligence()) + " damage.");
 setTakenDamage((int) (getWeapon().getDamage()*getMaxIntelligence()));

    }

    @Override
    public void takeDamage() {
        super.takeDamage();
        setMaxHP((int) maxHp - getTakenDamage());
    }
}

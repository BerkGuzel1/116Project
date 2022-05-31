package Characters;


import GameThings.Level;
import Items.Sword;

import java.util.Random;

public class Fighter extends Character {
    protected Level level1;
    float maxHp = (float) (getMaxIntelligence()*0.1 + getMaxVitality()*0.7 + getMaxStrength()*0.2);

    public Fighter(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateRandomValue(10,6), generateRandomValue(7,3), generateRandomValue(5,1), generateRandomValue(5,1));
        System.out.println("Fighter generated. Strength:" + getMaxStrength()+ " Vitality:"+ getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + maxHp);
             this.setWeapon(new Sword("Sword ",5,2,1.2));
        System.out.println("***Fighter equipped the sword ***  Sword name: " + getWeapon().getName() + " Weight: " +  getWeapon().getWeight() + " Value: " + getWeapon().getValue() + " Damage: " + getWeapon().getDamage());
    }

    public static int generateRandomValue(int upperBound, int lowerBound){
        Random rand = new Random();
        int value = rand.nextInt(upperBound-lowerBound+1) + lowerBound;
        return value;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Fighter does " + (getWeapon().getDamage()*getMaxStrength()) + " damage.");
     setTakenDamage((int) getWeapon().getDamage()*getMaxStrength());
    }

    @Override
    public void takeDamage() {
        super.takeDamage();
        setMaxHP( maxHp - getTakenDamage());
    }
}

package Characters;

import Characters.Character;

import java.util.Random;

public class Healer extends Character {

    public Healer(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateRandomValue(7,3), generateRandomValue(5,1), generateRandomValue(10,6), generateRandomValue(5,1));
        float maxHp = (float) (getMaxIntelligence()*0.1 + getMaxVitality()*0.7 + getMaxStrength()*0.2);
        System.out.println("Healer generated. Strength:" + getMaxStrength()+ " Vitality:"+ getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + maxHp);

    }



    public static int generateRandomValue(int upperBound, int lowerBound){
        Random rand = new Random();
        int value = rand.nextInt(upperBound-lowerBound+1) + lowerBound;
        return value;
    }


}

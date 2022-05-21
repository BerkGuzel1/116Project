package project;

import java.util.Random;

public class Healer extends Character {

    public Healer(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateValue3to7(), generateValue1to5(), generateValue6to10(), generateValue1to5());
        float maxHp = (float) (getMaxIntelligence()*0.1 + getMaxVitality()*0.7 + getMaxStrength()*0.2);
        System.out.println("Healer generated. Strength:" + getMaxStrength()+ " Vitality:"+ getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + maxHp);

    }

    private static int generateValue6to10(){
        Random rand = new Random();
        int upperBound = 3;
        int value = rand.nextInt(upperBound) + 6;
        return value;
    }

    private static int generateValue3to7(){
        Random rand = new Random();
        int upperBound = 4;
        int value = rand.nextInt(upperBound) + 3;
        return value;
    }

    private static int generateValue1to5(){
        Random rand = new Random();
        int upperBound = 6;
        int value = rand.nextInt(upperBound) ;
        return value;
    }


}

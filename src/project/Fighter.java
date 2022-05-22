package project;

import java.util.Random;

public class Fighter extends Character {

    /*public Fighter(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateValue6to10(), generateValue3to7(), generateValue1to5(), generateValue1to5());
        float maxHp = (float) (getMaxIntelligence()*0.1 + getMaxVitality()*0.7 + getMaxStrength()*0.2);
        System.out.println("Fighter generated. Strength:" + getMaxStrength()+ " Vitality:"+ getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + maxHp);

    }*/


    public Fighter(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateRandomValue(10,6), generateRandomValue(7,3), generateRandomValue(5,1), generateRandomValue(5,1));
        float maxHp = (float) (getMaxIntelligence()*0.1 + getMaxVitality()*0.7 + getMaxStrength()*0.2);
        System.out.println("Fighter generated. Strength:" + getMaxStrength()+ " Vitality:"+ getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + maxHp);

    }

    public static int generateRandomValue(int upperBound, int lowerBound){
        Random rand = new Random();
        int value = rand.nextInt(upperBound-lowerBound+1) + lowerBound;
        return value;
    }

    /*private static int generateValue6to10(){
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
    }*/

    @Override
    public void wield() {
        super.wield();
    }
}

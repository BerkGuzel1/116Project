package project;

import java.util.Random;

public class Tank extends Character {
    public Tank(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateRandomValue(5, 1), generateRandomValue(10, 6), generateRandomValue(7, 3), generateRandomValue(5, 1));
        float maxHp = (float) (getMaxIntelligence() * 0.1 + getMaxVitality() * 0.7 + getMaxStrength() * 0.2);
        System.out.println("Tank generated. Strength:" + getMaxStrength() + " Vitality:" + getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + maxHp);
    }



        public static int generateRandomValue(int upperBound, int lowerBound){
        Random rand = new Random();
        int value = rand.nextInt(upperBound-lowerBound+1) + lowerBound;
        return value;
    }

    /*public Tank() {
        setMaxStrength(generateRandomValue(5,1));
        setMaxVitality(generateRandomValue(10,6));
        setMaxIntelligence(generateRandomValue(7,3));
        System.out.println("A tank is generated with the values: S:" + getMaxStrength() + " V:"+ getVitality() + " I:" + getIntelligence());

    }*/

    /*public Tank(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateRandomValue(5,1), generateRandomValue(10,6), generateRandomValue(7,3), generateRandomValue(5,1));
        float maxHp = (float) (getMaxIntelligence()*0.1 + getMaxVitality()*0.7 + getMaxStrength()*0.2);
        System.out.println("Tank generated. Strength:" + getMaxStrength()+ " Vitality:"+ getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + maxHp);

    }

    public static int generateRandomValue(int upperBound, int lowerBound){
        Random rand = new Random();
        int value = rand.nextInt(upperBound-lowerBound+1) + lowerBound;
        return value;
    }*/


    //double hp =  ((getMaxIntelligence() * 0.1) + (getMaxStrength() * 0.2) + (getMaxVitality() * 0.7));







    /*public int generateVitalityValue(){
        Random rand = new Random();
        int upperBound = 6;
        int value = rand.nextInt(upperBound);
        return value;
    }*/

    /*public int generateIntelliginceValue(){
        Random rand = new Random();
        int upperBound = 6;
        int value = rand.nextInt(upperBound);
        return value;
    }*/

}

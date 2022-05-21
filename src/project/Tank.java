package project;

import java.util.Random;

public class Tank extends Character {

    public Tank(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateValue1to5(), generateValue6to10(), generateValue3to7(), generateValue1to5());
        System.out.println("Tank generated. Strength:" + getMaxStrength()+ " Vitality:"+ getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + getMaxHP());

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

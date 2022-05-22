package project;

import java.util.Random;

public class Enemy extends Character{

    public static int generateRandomValue(int upperBound, int lowerBound){
        Random rand = new Random();
        int value = rand.nextInt(upperBound-lowerBound+1) + lowerBound;
        return value;
    }

    public Enemy(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateRandomValue(1,5),generateRandomValue(1,5),generateRandomValue(1,5),generateRandomValue(1,5));
    }
}

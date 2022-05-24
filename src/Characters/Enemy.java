package Characters;

import Characters.Character;

import java.util.Random;

public class Enemy extends Character {

    private static int generateValue1to5(){
        Random rand = new Random();
        int upperBound = 6;
        int value = rand.nextInt(upperBound) ;
        return value;
    }

    public Enemy(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateValue1to5(), generateValue1to5(), generateValue1to5(), generateValue1to5());
    }
}

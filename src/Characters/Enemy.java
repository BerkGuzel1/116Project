package Characters;

import Characters.Character;
import Items.Shield;
import Items.Sword;
import Items.Wand;

import java.util.Random;

public class Enemy extends Character {


    private static int generateValue1to5() {
        Random rand = new Random();
        int upperBound = 6;
        int value = rand.nextInt(upperBound);
        return value;
    }
        public static int generateValue1to10(){
            Random rand = new Random();
            int upperBound = 10;
            int value = rand.nextInt(upperBound) +1 ;
            return value;
        }

    public Enemy(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
            super(generateValue1to5(), generateValue1to5(), generateValue1to5(), generateValue1to5());
            int rnd = generateValue1to10();
            if (rnd >=1 && rnd<9){
                this.setWeapon(new Sword("Broken Sword",5,2,4));
            }
            else if(rnd== 9){
                this.setWeapon(new Wand("Broken Wand", 2,1,1));
            }
            else if(rnd == 10){
                this.setWeapon(new Shield("Broken Shield", 6,1,2));
            }
        }
}


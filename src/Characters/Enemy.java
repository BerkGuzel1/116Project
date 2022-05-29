package Characters;


import Items.Shield;
import Items.Sword;
import Items.Wand;


import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Random;

public class Enemy extends Character {

    private static int generateValue1to5(){
        Random rand = new Random();
        int upperBound = 6;
        int value = rand.nextInt(upperBound) ;
        return value;
    }

    public static int generateValue1to10(){
        Random rand = new Random();
        int upperBound = 10;
        int value = rand.nextInt(upperBound) +1 ;
        return value;
    }
    float maxHp = (float) (getMaxIntelligence()*0.1 + getMaxVitality()*0.7 + getMaxStrength()*0.2);

    public Enemy(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateValue1to5(), generateValue1to5(), generateValue1to5(), generateValue1to5());
        System.out.println("Enemy generated. Strength:" + getMaxStrength()+ " Vitality:"+ getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + maxHp);
        int rnd = generateValue1to10();
        if (rnd >=1 && rnd<9){
            this.setWeapon(new Sword("Broken Sword",4,1,3));
            System.out.println("***Enemy equipped the sword ***  Sword name: " + getWeapon().getName() + " Weight: " +  getWeapon().getWeight() + " Value: " + getWeapon().getValue() + " Damage: " + getWeapon().getDamage());

        }
        else if(rnd== 9){
            this.setWeapon(new Wand("Broken Wand", 2,1,1));
            System.out.println("***Enemy equipped the wand ***  Wand name: " + getWeapon().getName() + " Weight: " +  getWeapon().getWeight() + " Value: " + getWeapon().getValue() + " Damage: " + getWeapon().getDamage());
        }
        else if(rnd == 10){
            this.setWeapon(new Shield("Broken Shield", 3,1,2));
            System.out.println("***Enemy equipped the shield ***  Shield name: " + getWeapon().getName() + " Weight: " +  getWeapon().getWeight() + " Value: " + getWeapon().getValue() + " Damage: " + getWeapon().getDamage());
        }
    }


    @Override
    public void attack() {
        super.attack();
        if (getWeapon().getDamage() == 1) {
            System.out.println("Enemy does " + (getWeapon().getDamage() * getMaxIntelligence()) + " damage.");

        }
        else if (getWeapon().getDamage() == 2) {
            System.out.println("Enemy does " + (getWeapon().getDamage() * getMaxVitality()) + " damage.");
        }
       else if (getWeapon().getDamage() == 1) {
            System.out.println("Enemy does " + (getWeapon().getDamage() * getMaxStrength()) + " damage.");
        }

    }

    @Override
    public void takeDamage() {
        super.takeDamage();
        setTakenDamage((int) (maxHp - getTakenDamage()));
    }
}

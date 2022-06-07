import java.util.Random;

public class Tank extends Character {
    float maxHp = (float) (getMaxIntelligence() * 0.1 + getMaxVitality() * 0.7 + getMaxStrength() * 0.2);

    public Tank(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        super(generateRandomValue(5, 1), generateRandomValue(10, 6), generateRandomValue(7, 3), generateRandomValue(5, 1));
        System.out.println("Tank generated. Strength:" + getMaxStrength() + " Vitality:" + getMaxVitality() + " Intelligence:" + getMaxIntelligence() + " HP:" + maxHp);
        this.setWeapon(new Shield("Shield ",6,1,0.4));
        System.out.println("***Tank equipped the shield ***  Shield name: " + getWeapon().getName() + " Weight: " +  getWeapon().getWeight() + " Value: " + getWeapon().getValue() + " Damage: " + getWeapon().getDamage() );
    }


    public static int generateRandomValue(int upperBound, int lowerBound) {
        Random rand = new Random();
        int value = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
        return value;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Tank does " + Math.round(getWeapon().getDamage()*getMaxVitality()) + " damage.");
    setTakenDamage(getWeapon().getDamage()*getMaxVitality());
    }
    @Override
    public void takeDamage() {
        super.takeDamage();
        setMaxHP( maxHp - getTakenDamage());
    }

    @Override
    public void examine() {
        super.examine();
        System.out.println("Enemy dropped a " );
    }
}

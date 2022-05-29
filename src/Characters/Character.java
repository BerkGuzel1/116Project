package Characters;

import Items.Items;
import Items.Weapon;


public class Character {
    private int HP;
    private int vitality;
    private int intelligence;
    private int strength;


    private int takenDamage;
    private Weapon weapon;
    private Items armor;
    private String choosenCha;


    //max values a character can have on a level
    private int maxStrength;
    private int maxVitality;
    private int maxIntelligence;
    private int maxHP;

    public Character(int maxStrength, int maxVitality, int maxIntelligence, int maxHP) {
        this.maxStrength = maxStrength;
        this.maxVitality = maxVitality;
        this.maxIntelligence = maxIntelligence;
        this.maxHP = maxHP;

    }

    public void attack() {

    }

    public void takeDamage() {

    }

    public void pick() {

    }

    public void wield() {
    }

    public void wear() {
    }

    public void examine() {
    }

    public void listInventory() {
    }

    public int getTakenDamage() {
        return takenDamage;
    }

    public void setTakenDamage(int takenDamage) {
        this.takenDamage = takenDamage;
    }

    public int getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(int maxStrength) {
        this.maxStrength = maxStrength;
    }

    public int getMaxVitality() {
        return maxVitality;
    }

    public void setMaxVitality(int maxVitality) {
        this.maxVitality = maxVitality;
    }

    public int getMaxIntelligence() {
        return maxIntelligence;
    }

    public void setMaxIntelligence(int maxIntelligence) {
        this.maxIntelligence = maxIntelligence;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Items getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Items getArmor() {
        return armor;
    }

    public void setArmor(Items armor) {
        this.armor = armor;
    }
}

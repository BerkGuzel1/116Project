package project;


import java.util.ArrayList;
import java.util.Random;

public class Character {
    private int HP;
    private int vitality;
    private int intelligence;
    private int strength;
    protected ArrayList<Items> inventory;
    private final int inventoryLimit = 10;


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

    public Character() {

    }

    public void attack(){

    }
    public void pick(){

    }
    public void wield(){}
    public void wear(){}
    public void examine(){}
    public void listInventory(){}

    /*public int generateRandomValue(int upperBound, int lowerBound){
        Random rand = new Random();
        int value = rand.nextInt(upperBound-lowerBound+1) + lowerBound;
        return value;
    }*/


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

    public ArrayList<Items> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Items> inventory) {
        this.inventory = inventory;
    }

    public int getInventoryLimit() {
        return inventoryLimit;
    }
}

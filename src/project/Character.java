package project;

import java.security.SecureRandom;

public class Character {
    private int HP;
    private int vitality;
    private int intelligence;
    private int strength;


    //max values a character can have on a level
    private int maxStrength;
    private int maxVitality;
    private int maxIntelligence;
    private int maxHP; //HP = Round(0.7*V + 0.2*S + 0.1*I)

    public void attack(){

    }
    public void specialAction(){

    }
    public void pick(){

    }
    public void wield(){}
    public void wear(){}
    public void examine(){}
    public void listInventory(){}


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

}

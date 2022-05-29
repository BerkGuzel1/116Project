package GameThings;

import Characters.Character;
import Characters.Enemy;
import Characters.Fighter;
import Characters.Healer;
import Characters.Tank;
import Items.Shield;
import Items.Sword;
import Items.Wand;
import Items.Weapon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    protected Fighter fighter;
    protected Healer healer;
    protected Tank tank;
    protected Enemy enemy;
    protected ArrayList<Level> levels;
    protected Level currentLevel;
    protected Weapon weapon;
    protected Sword sword;
    protected Shield shield;
    protected Wand wand;

    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String playerName =sc.next();
    }

    public boolean isOver(){
        if(fighter.getHP() == 0 && healer.getHP()==0 && tank.getHP()==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static int generateRandomValue(int upperBound, int lowerBound){
        Random rand = new Random();
        int value = rand.nextInt(upperBound-lowerBound+1) + lowerBound;
        return value;
    }


    public void startGame(){
        //level olusturma basta olunca karakterler levela giriyor diyor sonra karakterleri olusturuyor
        //o yuzden karakter olusturmayi basa aldim.
        System.out.println("Welcome to Cannon Fodder!");
        System.out.println("--------------------------------");
        generateTank();
        generateFighter();
        generateHealer();
        generateEnemy();
        ArrayList<Character> firstCharacters = new ArrayList<Character>();
        firstCharacters.add(this.fighter);
        firstCharacters.add(this.healer);
        firstCharacters.add(this.tank);
        firstCharacters.add(this.enemy);
        currentLevel = new Level();
        currentLevel.levelID++;
        //levels.add(currentLevel); bunda null erroru veriyor.
        //currentLevel.characterArrayList = firstCharacters;
    }

    public void runGame(){

    }


    public void generateTank(){
        tank = new Tank(generateRandomValue(5,1),
                generateRandomValue(10,6),
                generateRandomValue(7,3),
                generateRandomValue(5,1));
    }

    public void generateFighter(){
        fighter = new Fighter(generateRandomValue(10,6),
                generateRandomValue(7,3),
                generateRandomValue(5,1),
                generateRandomValue(5,1));
    }

    public void generateHealer(){
        healer = new Healer(generateRandomValue(7,3),
                generateRandomValue(5,1),
                generateRandomValue(10,6),
                generateRandomValue(5,1));
    }

    public void generateEnemy(){
        enemy = new Enemy(generateRandomValue(5,1),
                generateRandomValue(5,1),
                generateRandomValue(5,1),
                generateRandomValue(5,1));
    }



}
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
    Scanner sc = new Scanner(System.in);
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
    protected Character character;

    public void login(){
        System.out.println("Please enter your name : ");
        String playerName =sc.next();
    }

    boolean Over = true;
    public void levelUpOrFinish() {
        if (fighter.getMaxHP() <= 0 && healer.getMaxHP() <= 0 && tank.getMaxHP() <= 0) {
            System.out.println("You lose,game finished.");
            Over = false;
            System.exit(0);
        } else if (enemy.getMaxHP() <= 0) {
            System.out.println("You killed the enemies.Well done!");
            Over = false;
        }
            else{
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
        login();
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

    public void runGame() {
        while (Over) {
            currentLevel.Menu();
        String chaChoice = sc.next();
            if (chaChoice.contains("Fighter") || chaChoice.contains("fighter") || chaChoice.contains("f")) {
                System.out.println("Fighter attack Enemy" + currentLevel.levelID);
                fighter.attack();
                enemy.setMaxHP(enemy.getMaxHP() - fighter.getWeapon().getDamage() * fighter.getMaxStrength());
                System.out.println("Enemy" + currentLevel.levelID + " has " + Math.round(enemy.getMaxHP()) + " HP left.");
            } else if (chaChoice.contains("Healer") || chaChoice.contains("healer") || chaChoice.contains("h")) {
                System.out.println("Healer attack Enemy" + currentLevel.levelID);
                healer.attack();
                enemy.setMaxHP(enemy.getMaxHP() - healer.getWeapon().getDamage() * healer.getMaxIntelligence());
                System.out.println("Enemy" + currentLevel.levelID + " has " + Math.round(enemy.getMaxHP()) + " HP left.");
            } else if (chaChoice.contains("Tank") || chaChoice.contains("tank") || chaChoice.contains("t")) {
                System.out.println("Tank attack Enemy" + currentLevel.levelID);
                tank.attack();
                enemy.setMaxHP(enemy.getMaxHP() - tank.getWeapon().getDamage() * tank.getMaxVitality());
                System.out.println("Enemy" + currentLevel.levelID + " has " + Math.round(enemy.getMaxHP()) + " HP left.");
            }
            levelUpOrFinish();
        }
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
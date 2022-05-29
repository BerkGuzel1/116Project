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


    // gecen senekinden. inventory e bir seyler alip cikarma bu methodtan yazmamiz lazim
    /*protected void inventoryAction() {
        this.hero.printInventory();
        String dropItemString = "";
        if (this.hero.getInventory().size() != 0) {
            while(true) {
                System.out.println("Do you want to drop items from your inventory? ");
                dropItemString = this.input.nextLine();
                if (dropItemString.equals("yes") || dropItemString.equals("no")) {
                    break;
                }
                System.out.println("You can either say 'yes' or 'no'");
            }
        }
        String changeItemString;
        if (dropItemString.equals("yes")) {
            changeItemString = "";
            do {
                System.out.println("Write the name of the item that you want to drop: ");
                changeItemString = this.input.nextLine();
            } while(!changeItemString.equals("cancel") && !this.currentLevel.dropItem(changeItemString));
        }
        changeItemString = "";
        if (this.hero.getInventory().size() != 0) {
            while(true) {
                System.out.println("Do you want to change your current used items? ");
                changeItemString = this.input.nextLine();
                if (changeItemString.equals("yes") || changeItemString.equals("no")) {
                    break;
                }
                System.out.println("You can either say 'yes' or 'no'");
            }
        }
        if (changeItemString.equals("yes")) {
            this.hero.changeUsedItems();
        }
    } */

    /*public void changeUsedItems() {
        System.out.println("Current Items:");
        System.out.println(this.getArmor());
        System.out.println(this.getWeapon());
        System.out.println("\nItems in your inventory:");
        this.printInventory();
        System.out.println("\nWrite the name of the item you want to use from your inventory:");
        String itemName = this.input.nextLine();
        if (!itemName.equals("cancel")) {
            int indexOfItem = -1;
            for(int i = 0; i < this.getInventory().size(); ++i) {
                if (this.getInventory().get(i) != null && ((Item)this.getInventory().get(i)).getName().toLowerCase().equals(itemName.toLowerCase())) {
                    indexOfItem = i;
                    break;
                }
            }
            if (indexOfItem == -1) {
                System.out.println("There is no such item in the inventory.\nYou can write 'cancel' if you changed you mind.");
            }
            if (indexOfItem > 0) {
                Item item = (Item)this.getInventory().get(indexOfItem);
                this.getInventory().remove(indexOfItem);
                if (item instanceof Weapon) {
                    this.getInventory().add(this.getWeapon());
                    this.setWeapon((Weapon)item);
                    System.out.printf("You are now using '%s' as your weapon%n", item.getName());
                } else if (item instanceof Clothing) {
                    this.getInventory().add(this.getArmor());
                    this.setArmor((Clothing)item);
                    System.out.printf("You are now using '%s' as your armor%n", item.getName());
                }
            }
        }
    } */
}
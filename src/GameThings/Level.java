package GameThings;

import Characters.Enemy;
import Characters.Fighter;
import Characters.Healer;
import Characters.Tank;
import Items.Items;

import java.util.ArrayList;

public class Level {
    protected int levelID =-1;
    protected Fighter fighter;
    protected Tank tank;
    protected Healer healer;
    protected Enemy enemy;
    protected ArrayList<Enemy> monsters;
    protected ArrayList<Items> levelItems; //itemler levelda olsun
    int enemyNumber= (int) Math.pow(2,levelID);

    public Level() {
        System.out.println("A new level is being generated...");
        levelID++;

        System.out.println("Current Level ID:" + levelID);
        System.out.println("There are " + Math.pow(2,levelID) + " enemies in this level.");
        System.out.println(" Entering level " + levelID + "; Fighter enters. Tank enters. Healer enters. Enemy" + (levelID+1) + " enters.");
        System.out.println("--------------------------------");

    }
    public void Menu(){
        System.out.println("Which character do you choose for attack?");
    }








}

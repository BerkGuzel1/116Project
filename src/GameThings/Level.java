package GameThings;

import Characters.Enemy;
import Characters.Fighter;
import Characters.Healer;
import Characters.Tank;

public class Level {
    protected int levelID =-1;
    protected Fighter fighter;
    protected Tank tank;
    protected Healer healer;
    protected Enemy enemy;
    //3 levelde bir rastgele silah olsunint levelCounter = -1;
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

 /*  if (levelID % 3 == 2){
            System.out.println("There is a weapon or armor in this level that you can obtain after defeating all enemies.");
            //3 levelde bir silah olsun
        }

       */
}

package project;

public class Level {
    protected static int levelNum = 0;
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
        levelNum++;
        System.out.println("Current Level ID:" + levelID);
        System.out.println("There are " + Math.pow(2,levelID) + " enemies in this level.");
        if (levelID % 3 == 2){
            System.out.println("There is a weapon or armor in this level that you can obtain after defeating all enemies.");
            //3 levelde bir silah olsun
        }
        System.out.println("--------------------------------");
    }


    public void start(){
         levelCounter++;
         enemyNumber = (int) Math.pow(2,levelCounter);
         System.out.println("Creating Level " + levelCounter + " with " + enemyNumber + " enemy soldier.");
         System.out.println("Entering Level " + levelCounter + ";" );
     }





    /*public void start(){


    }*/

}

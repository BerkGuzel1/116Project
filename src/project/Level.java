package project;

public class Level {
    int levelCounter = -1;
    int enemyNumber;

     public void start(){
         levelCounter++;
         enemyNumber = (int) Math.pow(2,levelCounter);
         System.out.println("Creating Level " + levelCounter + " with " + enemyNumber + " enemy soldier.");
         System.out.println("Entering Level " + levelCounter + ";" );
     }

}

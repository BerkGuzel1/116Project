package GameThings;

import java.security.SecureRandom;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        Game game = new Game();
        System.out.println("CANNON FODDER");
        System.out.println();
        System.out.println("Press\n" +"0-START THE GAME\n1-DISPLAY SCOREBOARD\n2-EXIT");
        while (isTrue) {
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    game.startGame();
                    game.runGame();
                    break;

                case 1:
                    //Scoreboard
                    break;
                case 2:
                    System.out.println("System is closing..");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Try again!");
            }
        }

    }

}


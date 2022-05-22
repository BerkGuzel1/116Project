package project;

import java.security.SecureRandom;

public class Test {
    public static void main(String[] args) {
        int aRandom,bRandom,cRandom ;
        SecureRandom random = new SecureRandom();
        System.out.println("CANNON FODDER");
        System.out.println();
        aRandom = 1 + random.nextInt(5);
        bRandom = 6 + random.nextInt(5);
        cRandom = 3 + random.nextInt(5);

        Game game = new Game();
        game.startGame();

    }
}

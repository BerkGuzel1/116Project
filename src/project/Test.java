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
      //  Game g = new Game();
       // g.login();

        Tank tank = new Tank(1,1,1,1);
        Fighter fighter = new Fighter(1,1,1,1);
        Healer healer = new Healer(1,1,1,1);
        Level l = new Level();
       // Items i = new Items();
        l.start();

    }
}

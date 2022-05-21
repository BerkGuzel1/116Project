package project;

import java.security.SecureRandom;

public class Test {
    public static void main(String[] args) {
        int aRandom,bRandom,cRandom ;
        SecureRandom random = new SecureRandom();
        System.out.println("CANNON FODDER");
        aRandom = 1 + random.nextInt(5);
        bRandom = 6 + random.nextInt(5);
        cRandom = 3 + random.nextInt(5);
        //Tank t = new Tank(aRandom,bRandom,cRandom,0.7*bRandom + 0.2*aRandom + 0.1*cRandom);
        //Fighter f = new Fighter(bRandom,cRandom,aRandom);
        //Healer h = new Healer(cRandom,aRandom,bRandom);
        //Enemy e = new Enemy(aRandom,aRandom,aRandom);

        Tank tank = new Tank(1,1,1,1);
        Fighter fighter = new Fighter(1,1,1,1);
        Healer healer = new Healer(1,1,1,1);


    }
}

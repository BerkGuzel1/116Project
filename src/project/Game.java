package project;

import java.util.Scanner;

public class Game {
    Player player;

    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String playerName =sc.next();
        player = new Player(playerName, player.characterArrayList);
    }
}

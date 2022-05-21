package project;

import java.util.Scanner;

public class game {
    player player;

    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String playerName =sc.next();
        player = new player(playerName);
    }
}

package project;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Player {
    private String name;
    public ArrayList<Character> characterArrayList;

    public String getName() {
        return name;
    }

    public ArrayList<Character> getCharacterArrayList() {
        return characterArrayList;
    }

    public void setCharacterArrayList(ArrayList<Character> characterArrayList) {
        this.characterArrayList = characterArrayList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name,ArrayList<Character> characterArrayList) {
        this.name = name;
        this.characterArrayList = characterArrayList;
    }
    public void printPlayerInfo(){
        System.out.println("Name:" + name);
        }
     }


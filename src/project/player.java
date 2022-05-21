package project;

import java.security.SecureRandom;

public class player {
    private String name, cName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public player(String name) {
        this.name = name;
    }
    public void characterMenu(){
        System.out.println("Here is your characters : ");
        System.out.println("1- Fighter  \t Strength: ,     Vitality: ,     Intelligence: ");
        System.out.println("2- Tank     \t Strength: ,     Vitality: ,     Intelligence: ");
        System.out.println("3- Healer   \t Strength: ,     Vitality: ,     Intelligence: ");
    }
}

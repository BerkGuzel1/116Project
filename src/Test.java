import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {

    static ArrayList<Character> players = new ArrayList<>();
    static ArrayList<Enemy> currentEnemies = new ArrayList<>();
    static ArrayList<Item> droppedItems = new ArrayList<>();
    static int level = 1;
    static int round = 1;
    static boolean game = true;
    static Scanner sc = new Scanner(System.in);
    protected Fighter fighter;
    protected Healer healer;
    protected Tank tank;
    protected Enemy enemy;
    boolean isOver;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isAlive = true;
        System.out.println("CANNON FODDER");
        System.out.println();
        System.out.println("Press\n" +"0-START THE GAME\n1-DISPLAY SCOREBOARD\n2-EXIT");

        while (isAlive) {
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
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

    public void startGame(){
        //level olusturma basta olunca karakterler levela giriyor diyor sonra karakterleri olusturuyor
        //o yuzden karakter olusturmayi basa aldim.
        System.out.println("Welcome to Cannon Fodder!");
        System.out.println("--------------------------------");
        login();
        generateTank();
        generateFighter();
        generateHealer();

        //levels.add(currentLevel); bunda null erroru veriyor.
        //currentLevel.characterArrayList = firstCharacters;
    }

    public void generateTank(){
        tank = new Tank(generateValue(5,1),
                generateValue(10,6),
                generateValue(7,3),
                generateValue(5,1));
        players.add(tank);
    }

    public void generateFighter(){
        fighter = new Fighter(generateValue(10,6),
                generateValue(7,3),
                generateValue(5,1),
                generateValue(5,1));
        players.add(fighter);
    }

    public void generateHealer(){
        healer = new Healer(generateValue(7,3),
                generateValue(5,1),
                generateValue(10,6),
                generateValue(5,1));
        players.add(healer);
    }


    public void login(){
        System.out.println("Please enter your name : ");
        String playerName =sc.next();
    }

    public void initializeEnemies() {
        for (int i = 0; i < Math.pow(2, level); i++) {
             enemy = new Enemy(generateValue(1,5),generateValue(1,5),
                    generateValue(1,5),generateValue(1,5));
            currentEnemies.add(enemy);
        }
    }

    private static int generateValue(int lowerBound, int upperBound){
        Random rand = new Random();
        int value = rand.nextInt(upperBound) + lowerBound ;
        return value;
    }

    public void runGame() {
        while (isOver) {
            String chaChoice = sc.next();
            if (chaChoice.contains("Fighter") || chaChoice.contains("fighter") || chaChoice.contains("f")) {
                System.out.println("Fighter attack Enemy" );
                fighter.attack();
                enemy.setMaxHP(enemy.getMaxHP() - fighter.getWeapon().getDamage() * fighter.getMaxStrength());
                System.out.println("Enemy" + " has " + Math.round(enemy.getHP()) + " HP left.");

            } else if (chaChoice.contains("Healer") || chaChoice.contains("healer") || chaChoice.contains("h")) {
                System.out.println("Healer attack Enemy" );
                healer.attack();
                enemy.setMaxHP(enemy.getMaxHP() - healer.getWeapon().getDamage() * healer.getMaxIntelligence());
                System.out.println("Enemy" +  " has " + Math.round(enemy.getMaxHP()) + " HP left.");

            } else if (chaChoice.contains("Tank") || chaChoice.contains("tank") || chaChoice.contains("t")) {
                System.out.println("Tank attack Enemy" );
                tank.attack();
                enemy.setMaxHP(enemy.getMaxHP() - tank.getWeapon().getDamage() * tank.getMaxVitality());
                System.out.println("Enemy" +  " has " + Math.round(enemy.getHP()) + " HP left.");
            }
            System.out.println();
            levelUpOrFinish();
            //Daha enemy atağını tam yapmadım, swordu varmış farz ediyorum.
            if (isOver){
                System.out.println("Enemy" +  " attack Tank.");
                enemy.attack();
                tank.setMaxHP(tank.getMaxHP() - enemy.getWeapon().getDamage() * enemy.getStrength());
                System.out.println("Tank has " + Math.round(tank.getMaxHP()) + " HP left.");
            }
        }
    }

    public void levelUpOrFinish() {
        if (fighter.getMaxHP() <= 0 && healer.getMaxHP() <= 0 && tank.getMaxHP() <= 0) {
            System.out.println("You lose,game finished.");
            isOver = false;
            System.exit(0);
        } else if (enemy.getMaxHP() <= 0.5) {
            System.out.println("You killed the enemies.Well done!");
            System.out.println("Type next for level " );
            String choice = sc.next();
            if (choice.contains("next") || choice.contains("Next")){

            }
            else {
                System.exit(0);
            }
            isOver = false;
        }
        else{

        }

    }

    static void combat() throws InterruptedException {
        int temp;
        int enemyTemp = 0;
        boolean fighting = true;
        int numberOfEnemies = currentEnemies.size();
        int numberOfPlayers = players.size();

        System.out.println("------------LEVEL " + level + " --------------");
        System.out.println("Number of enemies are " + numberOfEnemies + "          |");
        System.out.println("The fight begins------------------");

        while (fighting) {
            boolean targeted = true;
            if (numberOfEnemies == 1) {
                temp = 0;
            } else {
                temp = random.nextInt(0, numberOfEnemies - 1);
            }
            while (targeted) {
                for (int i = 0; i < players.size(); i++) {
                    System.out.println(
                            "It is " + players.get(i).getRole() + " " + players.get(i).getName()
                                    + "'s turn.");
                    players.get(i).setTarget(currentEnemies.get(temp));
                    boolean menu = true;
                    while (menu) {
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("******************************************************");
                        System.out.println("Here are your player options");
                        System.out.println("Enter 1 to basic attack enemy");
                        System.out.println("Enter 2 to use special ability");
                        System.out.println("Enter 3 to display inventory");
                        System.out.println("Enter 4 to display character information and stats");
                        System.out.println("******************************************************");
                        int answer = sc.nextInt();
                        switch (answer) {
                            case 1:
                                players.get(i).attack();
                                menu = false;
                                break;
                            case 2:
                                System.out.println("Special Ability");
                                if (round == players.get(i).getAbility().getEndOfCooldown()) {
                                    players.get(i).getAbility().setAbilityReady(true);
                                }
                                if (players.get(i).getAbility().getabilityReady()) {
                                    if (players.get(i).getRole().equals("Healer")) {
                                        System.out.println("Please select an ally to heal");
                                        for (int j = 0; j < players.size(); j++) {
                                            System.out
                                                    .println("Enter " + j + " to heal "
                                                            + players.get(j).getName());
                                        }
                                        int caseTwoChoice = sc.nextInt();
                                        if (caseTwoChoice == 0) {
                                            players.get(i).getAbility().setAlly(players.get(0));
                                        } else if (caseTwoChoice == 1) {
                                            players.get(i).getAbility().setAlly(players.get(1));
                                        } else if (caseTwoChoice == 2) {
                                            players.get(i).getAbility().setAlly(players.get(2));
                                        }
                                    }
                                    players.get(i).getAbility().cast();
                                    players.get(i).getAbility()
                                            .setEndOfCooldown(round + players.get(i).getAbility().getCooldown());
                                } else {
                                    System.out.println("Ability not ready yet");
                                }
                                menu = false;
                                break;
                            case 3:
                                for (int j = 0; j < players.get(i).getInventory().size(); j++) {
                                    TimeUnit.SECONDS.sleep(1);
                                    System.out.println(players.get(i).getInventory().get(j).getType() + " "
                                            + players.get(i).getInventory().get(j).getName());
                                }
                                System.out.println("Enter 1 to see additional information about the items");
                                System.out.println("Enter 2 to go back to menu");
                                int caseThreeAnswer = sc.nextInt();
                                if (caseThreeAnswer == 1) {
                                    for (int j = 0; j < players.get(i).getInventory().size(); j++) {
                                        TimeUnit.SECONDS.sleep(1);
                                        players.get(i).getInventory().get(j).printItemInfo();
                                    }
                                }
                                break;
                            case 4:
                                players.get(i).characterPrintInfo();
                                break;
                            case 5:
                                int k = droppedItems.size();
                                if(k>=1){
                                    System.out.println("One of the enemies dropped" + droppedItems.get(0).getName());
                                }else{
                                    System.out.println("There is nothing to inspect at the moment");
                                }
                        }
                    }
                    TimeUnit.SECONDS.sleep(1);
                    if (players.get(i).getTarget().getHealthPoint() <= 0) {
                        players.get(i).getTarget().setHealthPoint(0);
                    }
                    System.out.println(
                            "Current health of the enemy is " + players.get(i).getTarget().getHealthPoint());
                    TimeUnit.SECONDS.sleep(1);
                    if (players.get(i).getTarget().getHealthPoint() <= 0) {
                        break;
                    }
                }

                if (currentEnemies.get(temp).getHealthPoint() <= 0) {
                    System.out.println(currentEnemies.get(temp).getName() + " is dead");
                    currentEnemies.remove(temp);
                    numberOfEnemies = currentEnemies.size();
                    droppedItems.add(new Potion(data, ""));
                    System.out.println("Enemy dropped" + droppedItems.get(droppedItems.size()-1).getName());
                    targeted = false;
                }

                for (int i = 0; i < currentEnemies.size(); i++) {
                    int enemyIndex = 0;
                    for (int j = 0; j < players.size(); j++) {
                        if (players.get(j).getRole().equals("Tank")) {
                            enemyTemp = j;
                        }
                    }
                    if (currentEnemies.get(i).getIsStunned()) {
                        System.out.println(currentEnemies.get(i).getName() + " is stunned.");
                        continue;
                    }
                    System.out.println("It is " + currentEnemies.get(i).getName() + "'s turn ");
                    TimeUnit.SECONDS.sleep(1);
                    currentEnemies.get(i).setTarget(players.get(enemyIndex));
                    currentEnemies.get(i).attack();
                    if (currentEnemies.get(i).getTarget().getHP() <= 0) {
                        currentEnemies.get(i).getTarget().setHP(0);
                    }
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Current health of the " + currentEnemies.get(i).getTarget().getName() + " is "
                            + currentEnemies.get(i).getTarget().getHP());
                    currentEnemies.get(i).setStunned(false);
                    TimeUnit.SECONDS.sleep(1);
                    if (currentEnemies.get(i).getTarget().getHP() <= 0) {
                        break;
                    }
                }

                if (players.get(enemyTemp).getHP() <= 0) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(players.get(enemyTemp).getName() + " is dead");
                    players.remove(enemyTemp);
                    numberOfPlayers = players.size();
                    targeted = false;
                }
                round++;

            }
            if (numberOfEnemies == 0) {
                fighting = false;
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("All enemies are dead..");
                System.out.println("LEVEL CLEARED");
            }
            else if (numberOfPlayers == 0) {
                fighting = false;
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("All players are dead...");
                System.out.println("GAME OVER");
                game = false;
            }
        }
    }

}


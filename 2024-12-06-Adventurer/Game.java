import java.util.Scanner;
public class Game{
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);
    Adventurer player;
    Adventurer enemy;
    //You can do the rest many times:
    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);

    System.out.println("Enter enemy name");
    //Read one line of user input
    String enemyName = userInput.nextLine();
    //Do something with the input
    System.out.println("Enemy name is: " + enemyName);

    boolean classNotValid = true;
    String adventurerClass = "";
    while (classNotValid){
      System.out.println("Play as ___; Type: CodeWarrior/Archer");
      adventurerClass = userInput.nextLine();
      if (adventurerClass.equals("CodeWarrior") || adventurerClass.equals("Archer")){
        classNotValid = false;
      }
    }
    if (adventurerClass.equals("CodeWarrior")){
      player = new CodeWarrior(userName);
      enemy = new Archer(enemyName);
    }else{
      player = new Archer(userName);
      enemy = new CodeWarrior(enemyName);
    }

    System.out.println("Player : " + getInfo(player));
    System.out.println("Enemy : " + getInfo(enemy));

    boolean gameActive = true;
    while(gameActive){
      boolean moveNotValid = true;
      String playerMove = "";
      while (moveNotValid){
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        playerMove = userInput.nextLine();
        if (playerMove.equals("a") || playerMove.equals("sp") || playerMove.equals("su") || playerMove.equals("quit")){
          moveNotValid = false;
        }
      }

      if (playerMove.equals("quit")){
        System.out.println(player.getName() + " ran away from the fight! He must be a coward...");
        break;
      }else{
        engine(playerMove, player, enemy);
      }
      System.out.println("Player : " + getInfo(player));
      System.out.println("Enemy : " + getInfo(enemy));
      // Enemy's move
      String enemyMove = enemyEngine();
      engine(enemyMove, enemy, player);
      System.out.println("Player : " + getInfo(player));
      System.out.println("Enemy : " + getInfo(enemy));

    }
  }
  public static String enemyEngine(){
    String[] arr = {"a", "sp", "su"};
    int randIndex = (int) (Math.random()*3);
    return arr[randIndex];
  }
  public static void engine(String move, Adventurer a, Adventurer b){
    if (move.equals("a")){
      System.out.println(a.attack(b));
    }else if (move.equals("sp")){
      System.out.println(a.specialAttack(b));
    }else if (move.equals("su")) {
      System.out.println(a.support());
    }
  }
  public static String getInfo(Adventurer a){
    return a + " "  + a.getHP() + "/"  + a.getmaxHP() + " HP, "  + a.getSpecial() + "/"  + a.getSpecialMax() + " " + a.getSpecialName();

  }
}

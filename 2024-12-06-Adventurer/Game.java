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
    String playerInfo = "Player: " + player.getName() + " "  + player.getHP() + "/"  + player.getmaxHP() + " HP "  + player.getSpecial() + "/"  + player.getSpecialMax() + " " + player.getSpecialName() + " " + player.getSpecial() + "/" + player.getSpecialMax();
    String enemyInfo = "Enemy: " + enemy.getName() + " "  + enemy.getHP() + "/"  + enemy.getmaxHP() + " HP "  + enemy.getSpecial() + "/"  + enemy.getSpecialMax() + " " + enemy.getSpecialName() + " " + enemy.getSpecial() + "/" + enemy.getSpecialMax();
    System.out.println(playerInfo);
    System.out.println(enemyInfo);

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
      if (playerMove.equals("a")){
        player.attack(enemy);
      }else if (playerMove.equals("sp")){
        player.specialAttack(enemy);
      }else if (playerMove.equals("su")){
        player.support();
      }else if (playerMove.equals("quit")){
        System.out.println(player.getName() + " ran away from the fight! He must be a coward...");
        break;
      }
    }
  }
}

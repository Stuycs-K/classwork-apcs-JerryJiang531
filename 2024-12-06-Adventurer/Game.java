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
    while (classNotValid){
      System.out.println("Play as ___; Type: CodeWarrior/Archer");
      String class = userInput.nextLine();
      if (class.equals("CodeWarrior") || class.equals("Archer")){
        classNotValid = false;
      }
    }
    if (class.equals("CodeWarrior")){
      player = new CodeWarrior(userName);
      enemy = new Archer(enemyName);
    }else{
      player = new Archer(userName);
      enemy = new CodeWarrior(enemyName);
    }
    System.out.println("Player: " + player.getName() + " "  + player.getHP() + "/ "  + player.getMaxHP() + "HP "  + player.getSpecial() + "/ "  + player.getSpecialMax() + " " + player.getSpecialName() + " ");
    // while(){
    //   System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    // }
  }
}

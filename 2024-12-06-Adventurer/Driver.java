public class Driver{
  public static void main(String[] args){
    Adventurer p1 = new Archer("Bob");
    Adventurer p2 = new Archer("Test Dummy", 50);
    System.out.println(p1.attack(p2));
    System.out.println(p1.support(p2));
    System.out.println(p1.support());
    System.out.println(p1.specialAttack(p2));
    System.out.println(p2.getHP());
  }
}

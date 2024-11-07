//When the getName() is overrided, the getName() in the Bird class runs the new getName() but the animal class still runs the old getName().

public class Driver{
  public static void main(String[] args){
    Animal Fred = new Animal("Baaaaa", 3, "Fred");
    Fred.speak();
    Bird Birdo = new Bird("Squaaaak", 2, "Birdo", 4.0, "pink");
    Birdo.speak();
  }
}

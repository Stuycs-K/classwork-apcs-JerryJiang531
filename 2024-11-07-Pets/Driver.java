//When the getName() is overrided, the getName() in the Bird class runs the new getName() but the animal class still runs the old getName().

public class Driver{
  public static void main(String[] args){
    Animal Fred = new Animal("Baaaaa", 3, "Fred");
    Fred.speak();
    Bird Birdo = new Bird("Squaaaak", 2, "Birdo", 4.0, "pink");
    Birdo.speak();

    Animal a1 = new Animal("meow", 3, "a1");
    Bird b1 = new Bird("woof", 2, "b1", 2.0, "light blue");
    //Bird b2 = new Animal("meow", 3, "b2"); This one don't work
    Animal a2 = new Bird("woof", 2, "a2", 2.0, "light blue");
  }
}

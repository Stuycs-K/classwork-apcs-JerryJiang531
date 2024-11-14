// When the getName() method is overridden, the getName() in the Bird class runs the new getName().
// The animal class still keeps the old get name and runs the old getName() when speak() is called.
// The new getName() in the Bird class is able to call the old getName() using super
// The third one does not work because you need 5 parameters in the Bird constructor but Animal only provides 3
// This fits the is-A relationship because the Bird class is a Animal class and therefore can store a Bird in an Animal class but not
// a Animal in a bird class
public class Driver{
  public static void main(String[] args){
    Animal Fred = new Animal("Baaaaa", 3, "Fred");
    Fred.speak();
    Bird Birdo = new Bird("Squaaaak", 2, "Birdo", 4.0, "pink");
    Birdo.speak();

    Animal a1 = new Animal("meow", 3, "a1");
    a1.speak();
    Bird b1 = new Bird("woof", 2, "b1", 2.0, "light blue");
    b1.speak();
    //Bird b2 = new Animal("meow", 3, "b2"); This one don't work
    Animal a2 = new Bird("woof", 2, "a2", 2.0, "light blue");
    a2.speak();
  }
}

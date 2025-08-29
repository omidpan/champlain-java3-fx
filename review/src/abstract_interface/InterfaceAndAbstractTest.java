package abstract_interface;

// Abstract Class
abstract class Bird {
    String name;

    // Abstract method: must be implemented by all birds
    abstract void makeSound();

    // Common behavior for all birds
    void eat() {
        System.out.println(name + " is eating.");
    }
}

interface IFlyable {
    void fly();
}

interface ISwimable {
    void swim();
}

// Concrete class: Pigeon (can fly)
class Pigeon extends Bird implements IFlyable {
    @Override
    void makeSound() {
        System.out.println("Coo! Coo!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying high in the sky.");
    }

}

// Concrete class: Penguin (can swim, not fly)
class Penguin extends Bird implements ISwimable {
    @Override
    void makeSound() {
        System.out.println("Honk! Honk!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming swiftly in the water.");
    }
}

// Main class to test
public class InterfaceAndAbstractTest {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        pigeon.name = "Peter the Pigeon";
        pigeon.eat();
        pigeon.makeSound();
        pigeon.fly();

        Penguin penguin = new Penguin();
        penguin.name = "Polly the Penguin";
        penguin.eat();
        penguin.makeSound();
        penguin.swim();
    }
}

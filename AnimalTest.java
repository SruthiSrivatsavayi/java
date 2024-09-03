class Animal1 {
    public void eat() {
        System.out.println("The animal eats.");
    }
    public void sound() {
        System.out.println("The animal makes a sound.");
    }
}
class Lion extends Animal1 {
    public void eat() {
        System.out.println("The lion eats meat.");
    }
    public void sound() {
        System.out.println("The lion roars.");
    }
}
class Tiger extends Animal1 {
    public void eat() {
        System.out.println("The tiger eats meat.");
    }
    public void sound() {
        System.out.println("The tiger growls.");
    }
}
class Panther extends Animal1 {
    public void eat() {
        System.out.println("The panther eats meat.");
    }
    public void sound() {
        System.out.println("The panther growls softly.");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Animal1 lion = new Lion();
        Animal1 tiger = new Tiger();
        Animal1 panther = new Panther();
        System.out.println("Lion:");
        lion.eat();
        lion.sound();
        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();
        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}

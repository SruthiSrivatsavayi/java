public class Dog {
    private String name;
    private String color;
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }
    public static void main(String[] args) {
        Dog myDog = new Dog("Brownie", "Black");
        myDog.print();
    }
}

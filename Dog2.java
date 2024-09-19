public class Dog{
    String name;
    String color;
    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }
    public static void main(String[] args){
        Dog myobj = new Dog("Brownie", "Brown");
        System.out.println("Dog's name is " + myobj.name);
        System.out.println("Dog's color is " + myobj.color);
    }
}

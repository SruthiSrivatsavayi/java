public class Cat {
    private String name;
    private int age;
    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.print();
    }
}

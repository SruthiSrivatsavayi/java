public class Cheetah extends Animal {
    public void move() {
        System.out.println("The cheetah runs at a very high speed.");
    }
    public static void main(String[] args) {
        Cheetah myCheetah = new Cheetah();
        myCheetah.move();
    }
}

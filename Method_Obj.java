public class Main{
    public void throttle() {
        System.out.println("The car is going way to fast");
    }
    public void speed(int maxSpeed){
        System.out.println("MAX Speed is" + maxSpeed);
    }
    public static void main(String[] args){
        Main mycar = new Main();
        mycar.throttle();     
        mycar.speed(200);  
    }
    
}

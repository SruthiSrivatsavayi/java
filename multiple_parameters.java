package Programs;

public class multiple_parameters {
    
    public void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
    public void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public static void main(String[] args) {
        multiple_parameters obj = new multiple_parameters();
        
        obj.add(5, 10);        
        obj.add(1, 2, 3);   
        obj.add(2.5, 3.5); 
    }
}

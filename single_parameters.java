package Programs;
public class single_parameters {
    
    public void display(int num) {
        System.out.println("Number: " + num);
    }

    public void display(double num) {
        System.out.println("Double number: " + num);
    }
    public void display(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        single_parameters obj = new single_parameters();
        
        obj.display(10);      
        obj.display(10.5);  
        obj.display("Hello");
    }
}


package Programs;

public class factorial {
	public static void main(String[] args) {

		        int n = 3; 
		        long fact = 1; 

		        for (int i = 1; i <= n; i++) {
		            fact *= i; 
		            if (fact < 0) {
		                System.out.println("Factorial result too large to fit in a long.");
		                return;
		            }
		        }

		        System.out.println("The factorial of " + n + " is: " + fact);
		    }

	}

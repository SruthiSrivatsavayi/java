package Programs;
import java.util.Scanner;
public class ScannerClass {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		String s = input.nextLine();
		System.out.println("Enter your age");
		String age = input.nextLine();
		System.out.println("Enter your roll number");
		String roll = input.nextLine();
		System.out.println("My name is: "+s);
		System.out.println("My age is: "+ age);
		System.out.println("My roll number is: "+roll);
		
	}

}

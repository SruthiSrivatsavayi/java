package Programs;

public class Prime {
	public static void main(String[] args) {
		int i,n = 11;
		int c = 0;
		for(i = 2;i<n;i++) {
			if(n%i == 0) {
				c = c+1;
			}
		}
		if(c==0) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}

}

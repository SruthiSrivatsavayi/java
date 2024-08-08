package Programs;

public class parameterised {
	int x;
	public parameterised(int y) {
		x = y;
	}

	public static void main(String[] args) {
		parameterised myObj = new parameterised(10);
		System.out.println(myObj.x);

	}

}

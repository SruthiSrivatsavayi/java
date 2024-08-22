package Programs;
class overiding {
	public void display() {
		System.out.println("It is a dog");
	}
}
	class Dog extends overiding{
		public void display()
		{
			System.out.println("it is a golden dog");
		}
		class Main{
			public static void main(String[]args)
			{
				Dog d1 = new Dog();
				d1.display();
			}
		}
	}

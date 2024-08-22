package Programs;

class this_keyword {
	String name;
	int age;
	this_keyword(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
	

}
public class Main{
	public static void main(String[] args) {
		this_keyword person1 = new this_keyword("Sruthi", 25);
		this_keyword person2 = new this_keyword("John", 40);
		System.out.println("Person 1 details:");
		person1.display();
		System.out.println("\nPerson 2 details:");
		person2.display();
	}
}

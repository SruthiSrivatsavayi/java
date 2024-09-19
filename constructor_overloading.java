public class Book {
    String author;
    String title;
    Double price;
    
    public Book() {
        this.title = "Unknown"; // Fixed typo "Unkown"
        this.author = "Unknown"; // Fixed typo "Unkown"
        this.price = 0.0;
    }

    // Constructors should be capitalized
    public Book(String author, String title) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    public Book(String author, String title, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("Book1 title: " + book1.title); // Corrected 'system' to 'System'
        System.out.println("Book1 author: " + book1.author);
        System.out.println("Book1 price: " + book1.price);
        
        Book book2 = new Book("Rowling", "Harry Potter");
        System.out.println("Book2 title: " + book2.title);
        System.out.println("Book2 author: " + book2.author);
        System.out.println("Book2 price: " + book2.price);
        
        Book book3 = new Book("Mimi", "Good days", 18.99);
        System.out.println("Book3 title: " + book3.title);
        System.out.println("Book3 author: " + book3.author);
        System.out.println("Book3 price: " + book3.price);
    }        
}

package class16;

public class BookTester {
    public static void main(String[] args) {
        Book b1= new Book("The Alchemist", "Paulo Coelho", "non-fiction", 10.99 );
        b1.printInfo();

        Book b2= new Book("Atomic Habits", "James CLear", "non-fiction", 9.59 );
        b2.printInfo();
    }
}

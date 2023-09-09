package review7;

public class Store {
    public static void main(String[] args) {
        Book.type="Audiobook"; //right way accessing static variables= by the class name
        Book book1= new Book();
        book1.title="Nightwork";
        book1.author= "Irwin Shaw";
        book1.year= 1975;
        book1.price=45;
        book1.title="Hardcopy"; //not right way of accessing static variable

        book1.read();
        book1.changePrice(41);
        double total= book1.totalWithTax(0.1);
        System.out.println("The price with taxes = "+total);


        Book book2=new Book();
        book2.title="Atomic Habits";
        book2.author="James Clear";
        book2.year=2018;
        book2.price=12.50;
        System.out.println(book2.type); //now all books became hard copy

    }
}

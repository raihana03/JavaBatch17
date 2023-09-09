package review7;

public class Book {
    //syntax of variables
    String title;
    String author;
    int year;
    double price;

    static int totalBooks;

    static String type;
    /*
    syntax of method
        returnType name
        ex: void read()
        I can create my own methods:
        1. with parameters or without
        2. with return or without
     */
    void read(){ //method, no parameters, no return
        System.out.println("I am reading "+ title+ " book by "+ author);
    }
void changePrice(int newPrice){ // includes parameters and no return
    System.out.println("The price of the book "+ title+ " was changed from "+ price+ " to the new price "+ newPrice);
}
double totalWithTax(double tax){
    double total=price+(price+tax);
    return total;
}
}

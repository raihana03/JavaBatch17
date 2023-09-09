package class16;

public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */

    private String bookTitle;
    private String author;
    private String genre;
    private double cost;

    public Book (String bookTitle, String author, String genre, double cost){
        this.bookTitle= bookTitle;
        this.author= author;
        this.genre=genre;
        this.cost= cost;
    }
    public void printInfo(){
        System.out.println(bookTitle+" "+ author+" "+ genre+ " "+ cost);
}}

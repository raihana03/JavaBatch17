package class19;

public class Programming {

    public Programming(){
        System.out.println("I love programming languages");
    }
    public Programming(String text){
        System.out.println("I love "+ text);
    }
    public static void main(String[] args) {
       new Programming("Java");
    }
}

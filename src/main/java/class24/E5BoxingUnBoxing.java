package class24;

public class E5BoxingUnBoxing {
    public static void main(String[] args) {
        Integer number= new Integer(10);
        Integer number2= 10;
        int d= number2.intValue(); // converting from a class to a primitive
        System.out.println(d);

        Integer c= 10; //AutoBoxing
        int f= c; //AutoUnBoxing
        System.out.println(f);
    }
}

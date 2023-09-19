package class20;

public class E7Final {
    public static void main(String[] args) {
        final int AGE= 10;
        System.out.println(AGE);
    }
}
class Parent{
    final void marry(){
        System.out.println("Take our permission first");
    }
}
class Child extends Parent{}
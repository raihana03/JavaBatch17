package replit;

public class Inheritance149 {
    public Inheritance149(){System.out.println();}
   static class A extends Inheritance149{
       public A() {System.out.println("Class A");
    }
static class B extends A{
        public B(){
            super();
            System.out.println("Class B");
        }
    }
    static class Inheritance149Tester{
        public static void main(String[] args) {
            A A= new A();
            System.out.println(A);
            B B= new B();
            System.out.println(B);
        }

}
}}

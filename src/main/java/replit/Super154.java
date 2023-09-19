package replit;

public class Super154 {

       String constructor= "Parent Constructor without argument";

       void printHello(){
           System.out.println("Hello");
       }

        Super154() {
            System.out.println("Parent Constructor without argument");
        }
        Super154(int number1) {
            System.out.println(10);

        }

    protected void test2() {
    }
}
        class Child2 extends Super154{
            void printHello(){
                System.out.println("Child Constructor without argument");
            }
            void test21(){

                System.out.println(super.constructor);
                System.out.println("Child Constructor without argument");
                System.out.println(10);
        }

    public void main(String[] args) {
        Super154 p = new Super154();
        p.test2();
    }
}

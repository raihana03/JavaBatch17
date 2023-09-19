package replit;

public class OverRiding163 {
    public static void main(String [] args){
        Parent1 p= new Parent1();
        p.method();

        Child1 c= new Child1();
        c.method();
    }}

class Parent1{
    void method(){
        System.out.println("Parent method");
    }
}
class Child1 extends Parent1{

    @Override
    void method() {
        super.method();
    }
}



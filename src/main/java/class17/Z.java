package class17;

public class Z {
    String name;
    void printName(){
        System.out.println(name);
    }
}
class Y extends Z{
    String last;
    void printLast(){
        System.out.println(last);
    }
}
class X extends Y{
    void printNameLast(){
        System.out.println(name+" "+last);
    }

    public static void main(String[] args) {
        Z z=new Z();
        z.printName();
    }}

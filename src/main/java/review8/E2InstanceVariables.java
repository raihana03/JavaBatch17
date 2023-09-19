package review8;

public class E2InstanceVariables {

    String name= "Jam";
    void printNam(){
        System.out.println(name);
    }
    static void printInfo(){
       // System.out.println(name);
    }

    public static void main(String[] args) {
        E2InstanceVariables e1= new E2InstanceVariables();
        e1.name= "jam";

        E2InstanceVariables e2= new E2InstanceVariables();
        e2.name="Scam";
    }
}

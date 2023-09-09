package replit;

public class JavaMethods114 {

    void multiplication(int num1, int num2) {
        System.out.println("Multiplication " + num1 * num2);
    }
    void addition(int num1, int num2) {
        System.out.println("Addition" + (num1 + num2));
}
    void subtraction(int num1, int num2) {
        System.out.println("Subtraction " + (num1 - num2));
    }
    public static void main(String[] args) {
        JavaMethods114 m1= new JavaMethods114();
        JavaMethods114 a1= new JavaMethods114();
        JavaMethods114 s1= new JavaMethods114();
        a1.addition(15,15);
        s1.subtraction(40,20);
        m1.multiplication(3,10);
    }
}

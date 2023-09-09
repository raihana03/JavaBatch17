package replit;

public class JavaMethods116 {
    private boolean bothEven(int num1, int num2){
        boolean isEven;
        isEven= (num1%2==0 && num2 % 2==0);
        return isEven;
    }

    public static void main(String[] args) {
        JavaMethods116 obj= new JavaMethods116();
        System.out.println(obj.bothEven(3,2));

}}

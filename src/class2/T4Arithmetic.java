package class2;

public class T4Arithmetic {
    public static void main(String[] args) {
        double number= 3;
        double number2= 14;
        double numberTotal= number+number2;
        Double numberSub= number-number2;
        double numberMulti= number*number2;
        double numberDiv= number/number2;
       double numberRemain= number%number2;
        System.out.println("The addition of 2 numbers "+ number+ " and " + number2 + " is equal to " +numberTotal);
        System.out.println("The subtraction of 2 numbers "+ number+ " and " + number2 + " is equal to " +numberSub);
        System.out.println("The multiplication of 2 numbers "+ number+ " and " + number2 + " is equal to " +numberMulti);
        System.out.println("The division of 2 numbers "+ number+ " and " + number2 + " is equal to " +numberDiv);
        System.out.println("The remainder of 2 numbers "+ number+ " and " + number + " is equal to " +numberRemain);
    }
}

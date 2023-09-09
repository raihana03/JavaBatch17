package replit;

import java.util.Scanner;

public class Scanner23 {
    public static void main(String[] args) {
        System.out.println("Input the boolean value");
        Scanner scanner=new Scanner(System.in);
        boolean bool = scanner.nextBoolean();
        System.out.println("The value is " + bool );

        System.out.println("Input the boolean value");
        Scanner scanner1=new Scanner(System.in);
        boolean bool1 = scanner1.nextBoolean();
        System.out.println("The value is "+ bool1);
    }
}

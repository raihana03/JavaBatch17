package replit;

import java.util.Scanner;

public class Scanner22 {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner input=new Scanner(System.in);
        String name= input.next ();

        System.out.println("Enter your mobile number");
        Scanner number=new Scanner(System.in);
        String number1= input.next ();

        System.out.println("Enter your age");
        Scanner input1=new Scanner(System.in);
        String age= input.next ();
        System.out.println("Your name is "+ name+ "," + " your age is "+ age + " and your mobile number is " + number1);
    }
}

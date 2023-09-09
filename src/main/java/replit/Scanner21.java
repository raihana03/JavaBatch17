package replit;

import java.util.Scanner;

public class Scanner21 {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner input=new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Your age after 10 years is "+ (age+10));

    }
}

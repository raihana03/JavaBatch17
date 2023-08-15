package Class4;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        /*
        You are DMV representative and you need to ask customer
        their age. If they are 18 and older you will issue a driver
        license to them, otherwise you will offer them to get a learners permit.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age <= 18) {
            System.out.println("We are going to issue you a drivers license");
        } else {
            System.out.println("You will get a learners permit");
        }
    }
}

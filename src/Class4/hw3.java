package Class4;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city
        and temperature. Your program should convert Fahrenheit
        into celsius and print “The temperature is the city  is ”
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your city?");
        String city= scanner.next();
        System.out.println("What is the temperature?");
        double fer = scanner.nextDouble();
        double cel= (fer-32)*5/9;
        System.out.println("The temperature "+ city + "is "+ cel );

    }
}

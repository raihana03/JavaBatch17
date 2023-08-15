package Class5;

import java.util.Scanner;

public class T4LogicalOperator {
    public static void main(String[] args) {
        /*
        ask user to enter a number and then define if number is small, medium or large
        small number is value between 1-10
        medium number is value between 11-100
        large number is value between 101-1000
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter a number");
        int number=scanner.nextInt();
        if (number>=1 && number<=10){
            System.out.println("small");
        } else if (number>=11 && number<=100) {
            System.out.println("medium");
        } else if (number>=100 && number <=1000){
            System.out.println("large");
        }
    }
}

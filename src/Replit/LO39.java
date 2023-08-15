package Replit;

import java.util.Scanner;

public class LO39 {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your mark");
        int number=scanner.nextInt();
        if (number>=1 && number<=25){
            System.out.println("Your grade is F");
        } else if (number>=25 && number<=45) {
            System.out.println("Your grade is E");
        } else if (number>=45 && number <=50){
            System.out.println("Your grade is D");
        }else if (number>=50 && number<=60) {
            System.out.println("Your grade is C");
        } else if (number>=60 && number <=80){
            System.out.println("Your grade is B");
        } else if (number>80 ) {
            System.out.println("Your grade is A");
        }else {
                System.out.println("Please enter valid mark");
    }
}}

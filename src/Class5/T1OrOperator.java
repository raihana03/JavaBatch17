package Class5;

import java.util.Scanner;

public class T1OrOperator {
    public static void main(String[] args) {
        /*
        Prompt the user to enter person heights in inches. Person should be classified
        as one of the following: short (under 60 in), medium (60-72in) tall (72 inch)
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height= scanner.nextInt();
        if (height<60){
            System.out.println("short");
    }else if(height>=60 && height <=72){
            System.out.println("Medium");
    }else{

        System.out.println("tall");
    }
}}

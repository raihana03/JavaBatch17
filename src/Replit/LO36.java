package Replit;

import java.util.Scanner;

public class LO36 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String word1= scanner.nextLine();
        String word2= scanner.nextLine();

        System.out.println("Please enter two intergers");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();

        if (num1==num2 && word1.equals(word2)){
            System.out.println("AND");
        }else if (num1!=num2 || word1.equals(word2)){
            System.out.println("OR");
        }else if (num1!=num2 && !word1.equals(word2)){
            System.out.println("NONE");
        }
    }
}

package replit;

import java.util.Scanner;

public class LO37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean question = input.nextBoolean();
        if (question == true || false) {
            System.out.println("Are you sleepy?");
            boolean question2 = input.nextBoolean();
            if (question2 == true || false) {

                if (question && question2) {
                    System.out.println("drink = water");
                } else if (question && question2) {
                    System.out.println("drink = coffee");
                } else if (!question && question2) {
                    System.out.println("drink = tea");
                } else {
                    System.out.println("Looks like you need to drink");
                }
            }
        }
    }}
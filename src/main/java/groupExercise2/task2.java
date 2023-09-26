package groupExercise2;

import java.util.Scanner;

public class task2 {
    /*
    Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
     */
    public static void main(String[] args) {

        System.out.println("Enter a string to be reversed:");
        Scanner input = new Scanner(System.in);

        String reverse = "";

        while(input.hasNextLine())
        {
            String str = input.next();
            for(int i = str.length()-1; i >= 0; i--)
            {
                reverse = reverse + str.charAt(i);
            }
            reverse += " ";
            System.out.println(reverse);
        }
    }
    }


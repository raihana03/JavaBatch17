package groupExercise2;

import java.util.Scanner;

public class task4 {
    /*
     Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
     */

    //Java program to count words in a string.

        public static void main(String args[]) {
            String text;
            int countWords = 0;

            Scanner SC = new Scanner(System.in);

            System.out.print("Enter string: ");
            text = SC.nextLine();

            //word count
            for (int i = 0; i < text.length() - 1; i++) {
                if (text.charAt(i) == ' ' && text.charAt(i + 1) != ' ')
                    countWords++;
            }

            System.out.println("Total number of words in string are: " + (countWords + 1));
            //since last word does not contain and character after that

        }
    }


package groupExercise2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

    /*
    Check if a String is Palindrome: Determine whether a given string is a
    palindrome, which means it reads the same forwards and
    backward. For example, "madam" is a palindrome.
     */
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string as an input to check whether it is palindrome or not");
    String input= scanner.nextLine();
    //checking whether palindrome or not
        if(isPalindrome(input))
    {
        System.out.println(input+" is a palindrome string");
    }
        else
    {
        System.out.println(input+" is not a palindrome string");
    }}

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

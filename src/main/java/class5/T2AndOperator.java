package class5;

import java.util.Scanner;

public class T2AndOperator {
    public static void main(String[] args) {
        /*
        write a program for user to enter his/her birth month. Based on the month define the season.
        Ex: if user is born in March, April, May-> season="Spring" if user if born in June, July,
        August->season= "summer". At the end of the program we should see 1 output as
        "You were born is season ______".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month = scanner.next();
        //if (month=("March" )|| month=("April") || month= ("May"));
        System.out.println("Spring");
    }
}

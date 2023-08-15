package Class5;

import java.util.Scanner;

public class T3AndOperator {
    public static void main(String[] args) {
        /*
        write a program that will print whether it is a weekend or weekday.
        If any day from 1-5-> "its a weekday", anyday from 6-7 -> "its a weekend"
        any other day -> output "invalid day"
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter day of the week using numbers");
        String day1= scanner.nextLine();
        int day=5;
        if (day>=1&& day <=5){
            System.out.println("It is a weekday");
        }else if (day==6 || day==7){
            System.out.println("It is a weekend");
        }else {
            System.out.println("Invalid day");

    }}
}

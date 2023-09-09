package class12;

import java.util.Scanner;

public class Hw1PrimeTester {
    public static void main(String[] args) {
        HW1Prime obj= new HW1Prime();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number= scanner.nextInt();
        boolean isPrime= obj.isPrime(number);
        if(isPrime) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }
    }


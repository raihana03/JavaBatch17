package replit;

import java.util.Scanner;

public class Switch41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age of the Child");
        int age= input.nextInt();
        switch (age){
            case 1:
                System.out.println("You can Crawl");
                break;
            case 2:
                System.out.println("You can Talk");
            case 3:
                System.out.println("You can Dance");
                break;
            case 4:
                System.out.println("You can get Trouble");
                break;
            default:
                System.out.println("I don't know how old you are");
    }}
}

package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner input=new Scanner(System.in);
        //taking an input from the user and storing in int a name variable
        String name= input.next ();
        if (name.equals("Asghar")){
            System.out.println("Java instructor");
        }else {
            System.out.println("I don't know you");
    }
}}

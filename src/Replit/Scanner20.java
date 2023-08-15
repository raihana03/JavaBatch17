package Replit;

import java.util.Scanner;

public class Scanner20 {
    public static void main(String[] args) {
        System.out.println("Please Enter First Name");
        Scanner input=new Scanner(System.in);
        String name= input.next ();
        System.out.println("Please Enter Last Name");
        Scanner input1=new Scanner(System.in);
        String name1= input.next ();
        System.out.println(name + " " + name1);
    }
}

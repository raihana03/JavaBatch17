package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scanner.next();
        if (name.equals("Jamel")){
            System.out.println("Senior SDET in 2 years");
        }else if(name.equals("Ayesha")){
            System.out.println("I live in Canada");
        }else if(name.equals("Habib")) {
            System.out.println("I jailed my wife");
        }  else if(name.equals("Giulia")){
                System.out.println("Needs a vacation");
    }
}}

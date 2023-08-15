package Class5;

import java.util.Scanner;

public class T5Switch {
    public static void main(String[] args) {
        System.out.println("enter your country");
        Scanner scanner=new Scanner(System.in);
        String country= scanner.nextLine();
country=country.toLowerCase();
        switch (country){
            case "iran":
                System.out.println("farsi");
                break;
            case "mexico":
                System.out.println("spanish");
                break;
            case "france":
                System.out.println("french");
                break;
            case "italy":
                System.out.println("italian");
                break;
            case "america":
                System.out.println("english");
                break;
            default:
                System.out.println("country no supported");
        }

    }
}

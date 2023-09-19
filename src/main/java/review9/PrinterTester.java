package review9;

import java.util.Scanner;

public class PrinterTester {
    public static void main(String[] args) {
        Printer p= new Printer();
    p.print("java");
    p.print(10,20,30,45,60);

        System.out.println();

        System.out.println(Math.abs(-15));
        Scanner scanner= new Scanner(System.in);
        scanner.nextByte();
        scanner.nextByte(2);
        String str= String.valueOf(100);
    }
}

package Class7;

public class ArrayHW {
    public static void main(String[] args) {
       // Create an array of chars and store grades into it: A,B,C,D.
        // Then print a grade B (use 2 different ways of creating an array).

        char [] grades= {'A', 'B', 'C', 'D'};
        System.out.println(grades[1]);

        char[] letters= new char[4];
        letters[0]='A';
        letters[1]='B';
        letters[2]='C';
        letters[3]='D';
        System.out.println(letters[1]);
    }
}

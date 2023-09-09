package review5;

public class Array2D {
    public static void main(String[] args) {
        int [] [] array= new int[2][4];
        //row 1
        array[0][0]= 12;
        array[0][1]= 13;
        array[0][2]= 14;
        array[0][3]= 15;
        // row 2
        array[1][0]= 1;
        array[1][1]= 2;
        array[1][2]= 3;
        array[1][3]= 4;

        System.out.println(array[0][3]);
        //how to print all elements from 2D array

        for (int i=0; i< array.length; i++){//outer loop iterates over rows
        for (int j=0; j<array[i].length; j++){
        //inner loop iterates over the columns
            // array[i].length in 2D array returns number of column from that row
            System.out.print(array[i][j]+ " ");
        }
    }
}}

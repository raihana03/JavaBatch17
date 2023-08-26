package Replit;

public class Array83 {
    public static void main(String[] args) {
//Write a program that calculates the sum of elements from each row
        // in a 2D array and adds them into array of integers

        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        int sum=0;
        for(int [] arr1D: a){
            for (int num:arr1D){
                sum=sum+num;
            }
            System.out.println(sum);
            sum=0;
        }
    }

}

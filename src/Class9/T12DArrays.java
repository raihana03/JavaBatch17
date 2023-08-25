package Class9;

public class T12DArrays {
    public static void main(String[] args) {
        //print even numbers only

        int [][] numbers= {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 11}  } ;

            for (int row= 0; row< numbers.length; row++){
                for (int col=0; col<numbers[row].length; col++){ //numbers[row] => fices us the complete 1d array
                   // if (numbers[row][col] %2==0){ //even numbers
                    if (numbers[row][col] %2!=0){ //odd numbers
                            System.out.print(numbers[row][col]+ " ");
                }

                }
                System.out.println();

        }
    }}


package Class9;

public class E72DArrays {
    public static void main(String[] args) {
        //print even numbers only

        int [][] numbers= {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 11}  } ;

      for (int row=0; row< numbers.length; row++){
          for (int col=0; col< numbers[row].length; col++){
          System.out.print(numbers[row][col]+ " ");
      }
          System.out.println();
        }
    }}


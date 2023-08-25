package Replit;

public class D2Array79 {
    public static void main(String[] args) {
        double [][] numbers= {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0 },
                {1.2, 3.1, 4.0, 1.6}  } ;

        for (double row= 0; row< numbers.length; row++){
            for (double col = 0; col<numbers[(int) row].length; col++){
                System.out.print(numbers[(int) row][(int) col]+ " ");
            }
            System.out.println();
        }

    }
}


package Class9;

public class T22DArrays {
    public static void main(String[] args) {
        //print even numbers only

        int [][] numbers= {
                {10, 20, 30, 40, 50},
                {15, 30, 35, 45, 20},
                {16, 20, 32, 22, 30}  } ;
// write a loop to get all the elements from second row one by one
        for (int row=0; row<5; row++){
            System.out.println(numbers[1][row]);

        }
    }}


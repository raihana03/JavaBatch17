package Class7;

public class ArrayHW4 {
    public static void main(String[] args) {
        //Create an array of cars and store 6 elements into it.
        // Using 2 different loops print all values from the array.
    String [] cars= {"BMW", "Honda", "Tesla", "Ford", "Nissan", "Audi" };
    for (int i=0; i< cars.length; i++){
        System.out.print(cars[i]+ " ");
        }
        System.out.println();

    int j=0;
    while (j < cars.length){
        System.out.print(cars[j]+ " ");
        j++;
    }
    }
}

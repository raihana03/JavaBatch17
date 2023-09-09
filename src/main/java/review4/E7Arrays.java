package review4;

import java.util.Arrays;

public class E7Arrays {
    public static void main(String[] args) {
        int [] salaries= {120000, 150000, 200000,};
        for(int i=0; i<salaries.length; i++){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(salaries)); // prints out value in
        System.out.println(salaries.length); //prints out total indexes
    }
}

package replit;

public class Array71 {
    public static void main(String[] args) {
        int [] numbers= {45,78, 12,  67, 55, 89, 23, 77, 88};
        int n = numbers.length;
        for (int i=0; i< n; i=i+2){
            System.out.println(numbers[i]);
        }
    }
}

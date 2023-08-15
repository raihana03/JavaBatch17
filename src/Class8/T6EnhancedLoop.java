package Class8;

public class T6EnhancedLoop {
    // any number greater than 20 convert to 0
    public static void main(String[] args) {

        int [] num={10, 23, 25, 56, 45, 20, -10, -5};
        int smallest= num[0];
        for (int n:num){
            if (n<smallest){
                smallest=n;
            }
        }
        System.out.println(smallest);
}}

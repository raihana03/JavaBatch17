package Class8;

public class T7EnhancedLoop {
    // any number greater than 20 convert to 0
    public static void main(String[] args) {
        //go through the array and replace all the negative numbers with 0
        int [] num={10, 77, 25, 56, 45, 20, -10, -5};
        for (int i=0; i< num.length; i++) {
            if (num[i] <0 ) {
                num[i] = 0;
            }
        }
        for (int i=0; i< num.length; i++){
            System.out.println(num[i]);
}}}

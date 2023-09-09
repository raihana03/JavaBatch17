package class8;

public class E6EnhancedLoop {
    // any number greater than 20 convert to 0
    public static void main(String[] args) {

        int [] num={10, 23, 25, 56, 45, 20};
       for (int i=0; i< num.length; i++) {
           if (num[i] > 20) {
               num[i] = 0;
           }
       }
       for (int i=0; i< num.length; i++){
           System.out.println(num[i]);
}}}

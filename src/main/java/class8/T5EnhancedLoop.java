package class8;

public class T5EnhancedLoop {
    public static void main(String[] args) {
        // find largest even number
        int [] num={10, 73, 25, 56, 45, 20};
        int largest= num[0];
        for (int n:num){
            if (n>largest&& n%2==0){
                largest=n;
            }
        }
        System.out.println(largest);
    }
}

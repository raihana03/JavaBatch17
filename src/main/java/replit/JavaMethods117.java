package replit;

public class JavaMethods117 {
    public static void main(String[] args) {
        System.out.println(sumEven(10));

    }
    static int sumEven(int x){
        int sum=0;
        for (int i=2; i<=x; i=i+2){
            sum=sum+1;
        }
        return sum;
    }
}

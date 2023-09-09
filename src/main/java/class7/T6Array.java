package class7;

public class T6Array {
    public static void main(String[] args) {
        int [] numbers= {20, 29, 48, 39, 60};
        for (int i=0; i< numbers.length; i++){
            if (numbers[i]%2==0){// even numbers only
                System.out.println(numbers[i]);
        }
        //for (int i=0; i< numbers.length; i=i+2){// even numbers only

        }
    }
}


package class8;

public class T2Arrays {
    public static void main(String[] args) {
        //count how many true values are present in array
        boolean [] values={true, false, true, false, true, true};
        int count=0;
       for (int i= 0; i< values.length; i++){
           if (values[i]){
               count++;
           }
       }
        System.out.println(count);
        }
    }


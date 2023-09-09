package class14;

import class12.T2Methods;

public class T2Method {
    /*
    create a method that will accept an array as parameter and will return
    a sum of all elements from that array. Method should be visibly only
    within same package and accessible by the creating an instance/object
    of the class
     */
    public static void main(String[] args) {

        T2Methods t2 = new T2Methods();
        int [] array={10,25,15};
        //System.out.println(t2.getArrSum(array));

    }
    int getArrSum(int []arr){
        int sum=0;
        for (int n:arr){
            sum=sum+n;
        }
        return sum;

    }
}
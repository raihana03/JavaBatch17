package class19;

public class Minimum {
    public int min(int num1, int num2){
        //return num1>num2?num1:num2;
        if (num1<num2) {
            return num1;
        }else {
    return num2;
            //System.out.println("The minimum number is "+num1);}
        //else {
           // System.out.println("The minimum number is "+num2);
        }}
    public double min(double num1,double num2){
        if (num1<num2) {
            return num1;
        }else{
            return num2;
        //if (numA<numB){
           // System.out.println("The minimum number is "+numA);}
       // else {
          //  System.out.println("The minimum number is "+numB);
        }
    }

    public static void main(String[] args) {
        Minimum obj= new Minimum();
        System.out.println(obj.min(10,5));

    }
}


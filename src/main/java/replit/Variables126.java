package replit;

public class Variables126 {

    static int noOfObjects=0;
    {
        noOfObjects+=1;
    }
    public Variables126(){
    }
    public Variables126(int n){

    }
    public Variables126 (String s){}

    public static void main(String[] args) {
        Variables126 t1= new Variables126();
        Variables126 t2= new Variables126(5);
        Variables126 t3= new Variables126("go");
        System.out.println(Variables126.noOfObjects);
    }
}

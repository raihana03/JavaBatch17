package class17;

public class Dee {
    static void printF(){
        System.out.println("f");
    }
}

class Eff extends Dee{
    public static void main(String[] args) {
        printF();
    }
}
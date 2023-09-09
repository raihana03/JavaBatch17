package class13;

public class E3StringBuilder {
    public static void main(String[] args) {
        String str=new String("Laila");
        String name= "habib";

        StringBuilder stringBuilder= new StringBuilder("Ebab");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(1);
        System.out.println(stringBuilder);
        stringBuilder.append("d");
        System.out.println(stringBuilder);
    }
}

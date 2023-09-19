package replit;

public class AccessModifiers137 {
    String name;
    String city;
    String schoolName;
    int batchNum;

    public static void main(String[] args) {
        AccessModifiers137 am= new AccessModifiers137();
        am.name= "John";
        am.city= "Miami.";
        am.schoolName= "Syntax";
        am.batchNum= 9;
        System.out.println("My name is "+ am.name+ " and I live in "+ am.city+ " I study at "+ am.schoolName+ " in batch "+ am.batchNum );
    }
}

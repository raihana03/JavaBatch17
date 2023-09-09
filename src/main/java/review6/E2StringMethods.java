package review6;

public class E2StringMethods {
    public static void main(String[] args) {
        String str="This is a java class";
       boolean starts=str.startsWith("T");
        System.out.println(starts);
        System.out.println(str.endsWith("class"));
        System.out.println(str.contains("java"));
        str.indexOf('a');
        int num='a'; //type casting
        System.out.println(num);
        System.out.println(str.indexOf(97));
    }
}

package class11;

public class E8StringMethods {
    public static void main(String[] args) {
        String str= "Hi there how are you. I am Good. I am driving.";
       String[] strs= str.split("[.]");
        System.out.println(strs.length);
        System.out.println(strs[0]);
}}

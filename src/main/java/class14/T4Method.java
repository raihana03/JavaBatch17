package class14;
   /*
    create a method that will accept a string as a parameter and return a new string that
    consist only of vowels. method should be available inside the class only where it was declared
    and executed by calling it by its name.
     */

public class T4Method {

    public static void main(String[] args) {

            System.out.println(getVowels("YerbolBadboy"));
        }
    private static String getVowels(String str) {
        return str.replaceAll("[]^aeiouAEIOU]", "");

    }}

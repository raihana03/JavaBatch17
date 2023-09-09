package class11;

public class T2StringMethods {
    public static void main(String[] args) {
        //print string in reverse order
        String originalStr = "Hello";
        String reversedStr = "";

        for (int i= originalStr.length()-1; i>=0; i--){
            reversedStr= reversedStr+ originalStr.charAt(i);
            // for (int i = 0; i < originalStr.length(); i++) {
            //reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed string: "+ reversedStr);

        }

    }

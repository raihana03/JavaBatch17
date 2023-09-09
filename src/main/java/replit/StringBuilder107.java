package replit;

public class StringBuilder107 {
    public static void main(String[] args) {
        String originalStr= "Hello Friends";
        String reversedStr = "";
        for (int i= originalStr.length()-1; i>=0; i--){
            reversedStr= reversedStr+ originalStr.charAt(i);

        }
        System.out.println( reversedStr);
    }
}

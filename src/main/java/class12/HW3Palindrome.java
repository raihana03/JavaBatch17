package class12;
public class HW3Palindrome {
    //Create a method that will print whether given String is palindrome or not.
    String palidrome (String word){
        String reverse = " ";
    for (int i=word.length()- 1; i>=0; i--){
        reverse= reverse+word.charAt(i);
    }
    if (word.equals(reverse)){
        return word+ " this is a palindrome";
        } else {
        return word+  " this is not a palindrome";
        }
    }
}

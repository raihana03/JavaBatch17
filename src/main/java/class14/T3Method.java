package class14;

public class T3Method {
    public static void main(String[] args) {

        System.out.println(T3Method.reverseStr("hello"));
    }
    /*
    create a method that will take a string as a parameter and returns reversed string.
    Method should be available to all classes within your project and accessible
    by class name.
     */

      public static String reverseStr(String inputStr){
            String reversed=" ";
            for (int i=inputStr.length()-1; i>0; i--){
                reversed=reversed+inputStr.charAt(i);
            }
            return reversed;

    }

    }




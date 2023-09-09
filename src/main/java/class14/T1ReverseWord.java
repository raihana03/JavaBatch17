package class14;

public class T1ReverseWord {
    /*
    reverse a string word by word. example:
    input=> this is sentence i want to reverse
    output=> siht is ecnetnes i tnaw ot esrever
     */
    public static void main(String[] args) {
       StringBuilder sb=new StringBuilder("This is the sentence I want to reverse");
      sb.reverse();
       System.out.println(sb);

        String str="This is the sentence I want to reverse";
        String[] arr= str.split(" ");
        //System.out.println(arr[0]);
        for (int i =0; i<arr.length; i++){
            String word=arr[i];
        String reversed=reverseStr(word);
            System.out.println(reversed+" ");


    }
        System.out.println(reverseStr("This"));
}
    static String reverseStr(String inputStr){
        String reversed=" ";
        for (int i=inputStr.length()-1; i>0; i--){
            reversed=reversed+inputStr.charAt(i);
        }
        return reversed;
    }

}

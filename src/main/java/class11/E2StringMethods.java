package class11;

public class E2StringMethods {
    public static void main(String[] args) {
        //write code that will count how many "a" there are in the string
        String str="Batch 17 is A great. Just kidding. Please don't take it seriously";
        int count=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) =='a'|| str.charAt(i)=='A') {//includes a & A
                count++;
            }
        }
        System.out.println(count);
    }
}

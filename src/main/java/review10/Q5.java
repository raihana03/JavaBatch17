package review10;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        // cat act => act act
        String s1= "cat";
        String s2= "act";

        char[] c1=s1.toCharArray(); //{c, a, t}
        char[] c2= s2.toCharArray(); //{a, c, t}
        Arrays.sort(c1); //{a, c, t}
        Arrays.sort(c2); //{a, c, t}
        boolean isAnaGram=Arrays.equals(c1,c2);
        System.out.println(isAnaGram);
    }
}

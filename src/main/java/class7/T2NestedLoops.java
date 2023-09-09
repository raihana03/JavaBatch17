package class7;

public class T2NestedLoops {
    public static void main(String[] args) {
        int j=0;
        while (j<4) {
            int i= 1;
            //for (i<7) {
                if(i!=3){ // skips printing 3
                System.out.print(i +" ");}
                i++;
            }
            System.out.println();
            j++;
    }
    }

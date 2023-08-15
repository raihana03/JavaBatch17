package Class7;

public class T1NestedLoops {
    public static void main(String[] args) {
        /*
        1 2 4 5 6
        1 2 4 5 6
        1 2 4 5 6
        1 2 4 5 6
         */

        for (int j=0; j<4; j++) {
            for (int i=0; i<7; i++){
                if(i!=3){ // skips printing 3
                System.out.print(i +" ");}
            }
            System.out.println();
    }
    }}

package class7;

public class E5NestedLoops {
    public static void main(String[] args) {
        int y=1;
        while (y<=3){ // 3 rows
        int x=1;
        while (x<=10){ // = 10 times
            System.out.print("=");
            x++;
        }
        System.out.println();
            y++;
        }
    }
}

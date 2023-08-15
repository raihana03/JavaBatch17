package Class7;

public class ArrayHW2 {
    public static void main(String[] args) {
        //Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).

        String [] names= {" Jamel", "Osman", "Daria", "Raihana", "Madina"};
        System.out.println(names[3]);

        String[] name= new String [5];
        name[0]="Jamel";
        name[1]="Osman";
        name[2]="Daria";
        name[3]="Raihana";
        name[4]="Madina";
        System.out.println(name[3]);
    }
}

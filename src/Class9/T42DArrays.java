package Class9;

public class T42DArrays {
    public static void main(String[] args) {

            String [] [] cars= {
                    {"Ford", "General Motors", "Tesla" },
                    {"BMW", "Mercedes", "Audi"},
                    {"Hyndai", "Kia", "Honda"},
                    {"Ferarri", "Lambo", "Fiat"}
            };

        for (String [] row:cars){
            for (String v:row){
                System.out.print(v+ " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------");
        for (int i=0; i< cars.length; i++){
            for (int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package Class9;

public class E22DArrays {
    public static void main(String[] args) {
        String [] [] names= {
                {"Hind", "Mikhail", "Ismael", "Ahmed" },
                {"John", "Bob", "Adam", "Tamim"},
                {"Joke", "Laugh", "John Ahmed", "Mohammed"},
                {"Gui", "Backend", "Front", "API"}

        };
        String [] row=names[2];
        for (String name:row){
            System.out.println(name);
        }
        //System.out.println(row[0]);
       //System.out.println(Arrays.toString(firstRow));
    }
}

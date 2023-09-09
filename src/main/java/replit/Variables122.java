package replit;

public class Variables122 {
    String country;
    String capital;
    int population;
    public static void main(String[] args) {
        Variables122 c= new Variables122();
        c.country= "USA";
        c.capital= "Washington DC";
        c.population= 330000000;
        System.out.println("The capitol of "+ c.country+ " is "+ c.capital+ " and the population is "+ c.population);

        Variables122 cc= new Variables122();
        cc.capital= "Astana";
        cc.country="Kazakhstan";
        cc.population= 18500000;
        System.out.println("The capitol of "+ cc.country+ " is "+ cc.capital+ " and the population is "+ cc.population);
    }}

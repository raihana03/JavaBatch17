package review5;

public class Array2DE1 {
    public static void main(String[] args) {
        String [][] countries= {
                {"Canada", "USA"},
                {"Ecuador", "Brazil", "Chile", "Argentina"},
                {"Romania", "France", "Italy"},
        };
        System.out.println(countries.length); // number of 1D arrays
        // prints all elements in array
        for (String[] countryArray:countries){ //outer loop iterates over 1D arrays
            for (String country:countryArray){
                System.out.println(country);
            }
    }
}}

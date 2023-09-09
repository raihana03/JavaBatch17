package class12;

public class HW4Hello {
    //Create a method that will say Hello in different language
    // based on the country that will passed when method is executed
    String country(String countryName) {
        if (countryName.equalsIgnoreCase("America")) {
            return "Hello";
        } else if (countryName.equalsIgnoreCase("Afghanistan")) {
            return "Salaam";
        } else if (countryName.equalsIgnoreCase("France")) {
            return "Bonjour";
        } else if (countryName.equalsIgnoreCase("Mexico")) {
            return "Hola";
        }else {
            return "Invalid";
        }
    }}

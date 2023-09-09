package class4;

public class T2Mortgage {
    public static void main(String[] args) {
        /*
        Create a Java program and store values of mortgage rate and mortgage price.
        First, program should check if rate is higher than 4.5 user will not buy a house,
        otherwise user will consider buying. Once user decides to buy a house, if price of
        the house is larger than 50000 than user will take a loan, otherwise user will pay cash.
         */
        double rate=3.7;
        int mortgage=8000;
        if(rate>4.5){
            System.out.println("You will not buy a house");
        }else{
            System.out.println("You will consider buying a house");
    }if (mortgage>50000){
            System.out.println("You will take a loan");
        }else {
            System.out.println("You will pay cash");
        }
    }
}

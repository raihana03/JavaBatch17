package class14;

public class BankAccount {
   private String name= "Fahim";
    private String username= "Fahim123";
    private String password="pass1234";
    private double accountBalance= 300;
    String accountNumber= "12345";
    private void printInfo(){
        System.out.println("I am Fahim from batch 17");
    }
    void printCity(){
        System.out.println("New York");
    }

    public static void main(String[]args){
        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.name);
        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAccount.accountBalance);
    }
}

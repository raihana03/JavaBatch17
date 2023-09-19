package class23;

public class BankAccount {
    private String name;
    final private long bankAccountNumber;
    private double balance;
    final private String userName;
    private String password;
   final private String accountType;

    public BankAccount (String name, long bankAccountNumber, double balance, String userName, String password, String accountType){
        // this is a constructor (name should be the same as the class name)
        this.name= name;
        this.bankAccountNumber= bankAccountNumber;
        this.balance= balance;
        this.userName= userName;
        this.password=password;
        this.accountType=accountType;
    }
    public BankAccount (long bankAccountNumber, String userName, String password, java.lang.String accountType){
        // this is a constructor (name should be the same as the class name)
        this.bankAccountNumber= bankAccountNumber;
        this.userName= userName;
        this.password=password;
        this.accountType = accountType;
    }
    public BankAccount (String userName,long bankAccountNumber, String accountType) {
        // this is a constructor (name should be the same as the class name)
        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.accountType = accountType;
    }
public String getName(){ // this is a method
        return name;
    }
    public long getBankAccountNumber(){
        return bankAccountNumber;
    }
    void setName (String name){
        this.name=name;
    }
    String getAccountType(){
        return accountType;

    }
}
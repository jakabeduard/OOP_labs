package bank;

public class BankAccount {

    //Attributes  - tulajdonsagok
    //encapsulation egysegbezaras
    private double balance;

    private String accountNumber;




    ///Methods- metodusok, viselkedes
    // Constructor
    // incializalas, lefoglalas
    // Default

   public BankAccount(){
       this.balance=0;
    }

    public BankAccount(double balance, String szamlaSzam){
       this.balance =balance;
       this.accountNumber=szamlaSzam;

    }


    /// Getters -getterek

    public double getBalance() {
        return this.balance;
    }


    // Settrers- setterek
    public void setAccountNumber(String accountNumber){
       this.accountNumber=accountNumber;

    }

    @Override
    public String toString()

        // felepitjuk a kimenetet
    /// Account  number:....., blance:.....,
    return "Account number:"+this.accountNumber+" blance:"+ this.balance+" Ron$";



}

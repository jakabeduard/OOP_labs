package bank;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();/// constructor hivasa
        BankAccount bankAccount1=new BankAccount( 233 , "3456");/// constructor hivasa
        System.out.println(bankAccount);
        System.out.println(bankAccount.getBalance());
        bankAccount.setAccountNumber("22343");

    }
}

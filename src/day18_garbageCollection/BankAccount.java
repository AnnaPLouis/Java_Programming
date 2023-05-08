package day18_garbageCollection;

public class BankAccount {

    public String accountHolder;
    public int accountNumber;
    public double balance;

    public void setInfo(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance() {

        System.out.println(balance);

    }

    public void deposit (double amount){

        balance += amount;
    }

    public void withdraw (double amount){
        balance -= amount;
    }



}

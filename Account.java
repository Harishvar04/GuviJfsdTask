package OOPS;

public class Account {
    private double balance;

    //constructor with no argument & default balance.
     public Account(){
         this.balance = 0.0;
     }
    //Constructor with argument
     public Account(double initialBalance){
         balance += initialBalance;
     }


    //method to Deposite the amount to the account.
    public void deposite(int depositeAmount)
    {
        this.balance += depositeAmount;
    }


    //method to Withdraw the amount from the account.
    public void withdraw(int withdrawAmount){
       this.balance -= withdrawAmount;
    }


    //method to display Balance
    public void displayBalance(){
        System.out.println("Balance = "+ balance);
    }
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposite(1000);
        acc.withdraw(500);
        acc.displayBalance();

        Account acc1 = new Account(1000);
        acc1.deposite(200);
        acc1.withdraw(100);
        acc1.displayBalance();


    }
    }

package banking;

public class appbank {
    private int accountNo;
    private int pin;
    private double balance;

    
    public appbank(int accountNo, int pin, double initialBalance) {
        this.accountNo = accountNo;
        this.pin = pin;
        this.balance = initialBalance;
    }
   
    public int getAccountNo() {
        return accountNo;
    }

    public int getPin() {
        return pin;
    }
    
    public double getBalance() {
        return balance;
    }


    public boolean login(int inputAccountNo, int inputPin) {
        return this.accountNo == inputAccountNo && this.pin == inputPin;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited " + amount + ". New balance: " + this.balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

  
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Successfully withdrew " + amount + ". New balance: " + this.balance);
        } else if (amount > this.balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
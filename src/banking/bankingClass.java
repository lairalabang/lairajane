package banking;

import java.util.Scanner;

public class bankingClass {
      int accountNo = 10001;
    String name;
    float initialBalance = 0;
    int pin = 1234;
    
    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accountNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    
    public int setAccount(){
        return accountNo;
    }
    
    public void viewBalance(){
    System.out.println("Current balance: " + initialBalance);
    }
     public boolean attemptLogin() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter Account Number: ");
            int inputAcc = scanner.nextInt();

            System.out.print("Enter PIN: ");
            int inputPin = scanner.nextInt();

            if (verifyAccount(inputAcc, inputPin)) {
                System.out.println("Login successful.\n");
                return true;
            } else {
                attempts++;
                System.out.println("Incorrect account number or PIN. Attempt " + attempts + " of 3.\n");
            }
        }

        System.out.println("Account locked. Too many failed login attempts.\n");
        return false;
    }
     public static void main(String[] args) {
        bankingClass user = new bankingClass();
        if (user.attemptLogin()) {
            user.viewBalance();
        }
    }
}

package laira.jane;

import banking.appbank;
import java.util.Scanner;

public class act4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        appbank[] bApp = new appbank[10];
        int accountCount = 0;
        int choice;
        char continueChoice;

        do {
            System.out.println("\nHELLO! WELCOME TO MY SYSTEM!");
            System.out.println("How are you today?");
            System.out.println("1. Banking");
            System.out.println("2. Shopping");
            System.out.println("3. Pay Bills");
   
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                   
                    int bankingChoice;
                    do {
                    
                        System.out.println("1. Register Account");
                        System.out.println("2. Sign In to Account");
                        System.out.println("3. View All Accounts");
                        System.out.print("Enter your selection: ");
                        bankingChoice = sc.nextInt();

                        switch (bankingChoice) {
                            case 1:
                               
                                if (accountCount < bApp.length) {
                                    System.out.print("Enter a new Account No: ");
                                    int newAccountNo = sc.nextInt();
                                    System.out.print("Enter a new Pin No: ");
                                    int newPinNo = sc.nextInt();
                                    System.out.print("Enter your  deposit: ");
                                    double initialDeposit = sc.nextDouble();
                                    bApp[accountCount] = new appbank(newAccountNo, newPinNo, initialDeposit);
                                    System.out.println("Account registered successfully!");
                                    accountCount++;
                                } else {
                                    System.out.println(" number of accounts reached.");
                                }
                                break;

                            case 2:
                               
                                System.out.print("Enter Account No.: ");
                                int loginAccNo = sc.nextInt();
                                System.out.print("Enter Pin: ");
                                int loginPin = sc.nextInt();

                                appbank currentAccount = null;
                                for (int i = 0; i < accountCount; i++) {
                                    if (bApp[i].getAccountNo() == loginAccNo && bApp[i].getPin() == loginPin) {
                                        currentAccount = bApp[i];
                                        break;
                                    }
                                }

                                if (currentAccount != null) {
                                    System.out.println("Login Success!");
                                    int transactionChoice;
                                    do {
                                       
                                        System.out.println("1. Deposit");
                                        System.out.print("Enter your choice: ");
                                        transactionChoice = sc.nextInt();

                                        switch (transactionChoice) {
                                            case 1:
                                                System.out.print("Enter amount deposit: ");
                                                double depositAmount = sc.nextDouble();
                                                currentAccount.deposit(depositAmount);
                                                break;
                                            case 2:
                                               
                                                break;
                                            case 3:
                                              
                                            case 4:
                                               
                                                break;
                                            default:
                                               
                                        }
                                    } while (transactionChoice != 4);
                                } else {
                                    System.out.println("Invalid Account No.");
                                }
                                break;
                            case 3:
                           
                              
                                if (accountCount == 0) {
                                   
                                } else {
                                    for (int i = 0; i < accountCount; i++) {
                                        System.out.println("Account No: " + bApp[i].getAccountNo() + ", Balance: " + bApp[i].getBalance());
                                    }
                                }
                                break;
                            case 4:
                              
                                break;
                            default:
                                System.out.println("INVALID SELECTION!");
                        }
                    } while (bankingChoice != 0);
                    break;

                case 2:
                   
                    break;
                case 3:
                    
                    break;
                case 4:
                   
                    break;
                default:
                    System.out.println("INVALID SELECTION!");
            }
        } while (choice != 0);
        sc.close();
    }
}
package laira.jane;
import java.util.Scanner;

public class labang{
  public class Main {
      public static void main (String[] args, ){
             int action
         Scanner sc = new Scanner(System.in);
           System.out.println("WELCOME TO MY SYSTEM");

           System.out.println("What do you feel like going to do today?");
           System.out.println("1 - Banking");
            System.out.println("2 - Password");
            System.out.println("3 - Pay Bills");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
         
         switch (choice) {
case 1:
bankingApp bApp[] = new bankingApp[10];
bApp[0] = new bankingApp();
bApp[1] = new bankingApp (bApp.length);

int response;
int response;
System.out.println("1 - Create Account");
System.out.println("2 - Login Account");
System.out.println("3 - Pay Bills");
System.out.print("Enter your selection: ");
switch (action) {
case 1:
System.out.print("Enter Account No.: ");
System.out.print("Enter Pin No.: ");
System.out.print("Enter a Pin Again: ");
System.out.print("Login Success!");
break;
case 2:
System.out.print("Enter Account No.: ");
System.out.print("Enter Pin: ");
bankingApp bApp = new bankingApp();
if (bApp != null) {
int attempts = 3;
while (attempts > 0) {
if (bApp.login(sc.nextInt(), sc.nextInt())) {
System.out.println("Login Success!");
System.out.println("1 - Deposit");
System.out.println("2 - Withdraw");
System.out.println("3 - Check Balance");
System.out.print("Enter your choice: ");
int option = sc.nextInt();
switch (option) {
case 1:
System.out.print("Enter amount to deposit: ");
bApp.deposit(sc.nextDouble());
break;
case 2:
System.out.print("Enter amount to withdraw: ");
bApp.withdraw(sc.nextDouble());
break;
case 3:
System.out.println("Your current balance is: " + bApp.getBalance());
break;
default:
System.out.println("INVALID OPTION");
break;
}
break;
} else {
attempts--;
System.out.println("Invalid Account No. or Pin. " + attempts + " attempts left.");
}
}
if (attempts == 0) {
System.out.println("ATTEMPTS EXHAUSTED. ACCOUNT LOCKED.");
}
} else {
System.out.println("INVALID ACCOUNT NO.");
}
break;
case 3:

break;
default:
System.out.println("INVALID SELECTION");
break;
}
break;
case 2:
break;
case 3:

break;
default:
System.out.println("INVALID SELECTION");
break;
}
System.out.print("Do you want to continue? (Y/N): ");
    char response = 0;
while (response == 'Y' || response == 'y') {

}
}

    private static class bankingApp {

        public bankingApp() {
        }
      }

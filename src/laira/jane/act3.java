
package laira.jane;

import java.util.Scanner;

public class act3 {
    
  
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

System.out.println("\n//instance 1");
System.out.println("Enter a number: " + number);

if (number == 0) {
System.out.println("Inputted number Zero");
} else if (number % 2 == 0) {
System.out.println("Inputted number is even");
} else {
System.out.println("Inputted number is odd");
}

input.close();

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

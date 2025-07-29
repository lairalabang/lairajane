
package laira.jane;

import java.util.Scanner;
public class LairaJane {

   
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Science: ");
        int science = sc.nextInt();

        System.out.print("Enter marks in History: ");
        int history = sc.nextInt();

        System.out.print("Enter marks in Math: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Soc: ");
        int soc = sc.nextInt();

        System.out.print("Enter marks in Arts: ");
        int arts = sc.nextInt();

       
        int totalMarks = science + history + math + soc + arts;
        double percentage = totalMarks / 5.0;

              String remarks;
        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage <= 75) {
            remarks = "Poor";
        } else if (percentage <= 80) {
            remarks = "Fair";
        } else if (percentage <= 85) {
            remarks = "Good";
        } else if (percentage <= 90) {
            remarks = "Good";
        } else {
            remarks = "Excellent";
        }


        System.out.println("\nOutput");
        System.out.println("Enter name: " + name);
        System.out.println("Enter marks in Science: " + science);
        System.out.println("Enter marks in History: " + history);
        System.out.println("Enter marks in Math: " + math);
        System.out.println("Enter marks in Soc: " + soc);
        System.out.println("Enter marks in Arts: " + arts);

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);
        if (percentage < 70) {
            System.out.println("Try Again " + name + ".");
        } else {
            System.out.println("Congrats " + name + " you Passed.");
        }

        sc.close();

    }
    
}

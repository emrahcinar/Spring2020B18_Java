package SelfPractice.SelfPractice_Scanner;
/*
 /*Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex
				    rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
 */
import java.util.Scanner;

public class ScannerHourlyRate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your hourly rate: ");
        int hourlyrate=scan.nextInt();
        System.out.println("Enter state tax rate: ");
       double stateTax=scan.nextDouble();
        System.out.println("Enter federal tax rate: ");
        double federalTax=scan.nextDouble();
        System.out.println("Weekly hours: ");
        double weeklyHours=scan.nextDouble();
        double gross=(hourlyrate*weeklyHours)*52;
        System.out.println("Your gross salary is: "+gross);

        double totalTax=(stateTax+federalTax)*gross;
        System.out.println("Your total tax is: "+totalTax);

        double netSalary=gross-totalTax;
        System.out.println("Your net salary is: "+netSalary);




























    }
}

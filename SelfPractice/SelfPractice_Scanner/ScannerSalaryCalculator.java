package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;

public class ScannerSalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        /*ask the user enter salary
    ask the user enter fill name
    ask the user enter company name
    ask the user enter SSN
    ask the user enter Job title
     */
        System.out.println("Enter Salary: ");
        int salary=scan.nextInt();

        System.out.println("Company name: ");
        String company=scan.next();

        System.out.println("SSN: ");
        int ssn=scan.nextInt();

        System.out.println("Job Title: ");
        String title=scan.next();

        System.out.println("Your salary is "+salary+"\n"+"Your Company name is "+company+"\n"+"Your SSN is "+ssn+"\n"+
                "Your job title is "+title);







































    }
}

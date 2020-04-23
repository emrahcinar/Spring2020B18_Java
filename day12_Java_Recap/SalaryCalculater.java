package day12_Java_Recap;

import java.util.Scanner;

public class SalaryCalculater {
    /*ask the user enter salary
    ask the user enter fill nam
    ask the user enter company name
    ask the user enter SSN
    ask the user enter Job title
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary=scan.nextDouble();//100000 Enter

        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName=scan.nextLine();

        System.out.println("Enter Company Name: ");
        String companyName=scan.nextLine();

        System.out.println("Enter your SSN: ");
        long SSN=scan.nextLong();

        scan.nextLine();
        System.out.println("Enter your job title: ");
        String jobTitle=scan.nextLine();

        System.out.println("Full name is: "+fullName);
        System.out.println("Job Title is: "+jobTitle);
        System.out.println("Company Name is: "+companyName);
        System.out.println("SSN: "+SSN);
        System.out.println("Salary is: $"+salary);







    }
}

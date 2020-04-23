package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;

public class ScannerMultiBranch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first name: ");
        String name=scan.next();
        System.out.println("Enter last name: ");
        String surname=scan.next();
        System.out.println("Employeed: ");
        boolean employeed=scan.nextBoolean();
        double salary=0;
        if(employeed==true){
            System.out.println("Enter your salary: ");
          salary=scan.nextDouble();
        }if(salary>80000){
            System.out.println("You are eligible to buy 2+1 house");
        }else if(salary>90000){
            System.out.println("You are eligible to buy 3+1 house");
        }else{
            System.out.println("You are eligible to buy 5+1 house");
        }

























    }
}

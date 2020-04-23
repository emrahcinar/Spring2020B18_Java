package replits;

import java.util.Scanner;

public class replit_78 {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String driverLicence = scan.next();
        if (driverLicence.equalsIgnoreCase("no")) {
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        if (zipCode == 20910 || zipCode == 20740) {
            premium += 60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        premium += (vehicleOwnership.equalsIgnoreCase("owned")) ? 10 : 20;
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        premium += vehicleUsage.equalsIgnoreCase("Business") ? 50 : (vehicleUsage.equalsIgnoreCase("Pleasure")) ? 10 : 20;
        //     (vehicleUsage.equalsIgnoreCase("Commute"))?20;
        if (vehicleUsage.equalsIgnoreCase("Commute")) {
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            premium += daysDrivenToWorkOrSchool * 5;
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium += milesToWorkOrSchool;
        }
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age < 25) {
            if (age <= 16) {
                System.out.println("Invalid data!");
                System.exit(0);
            } else if (age == 17) {
                premium *= 20;
            } else if (age <= 18 && age <= 21) {
                premium *= 6;
            } else if (age > 21 && age < 25) {
                premium *= 2;
            }
        }
        System.out.println("How many years you've been driving?");
        int drivingYears = scan.nextInt();
        if (drivingYears == 0) {
            System.out.println("Invalid data!");
            System.exit(0);
        }
        premium -= drivingYears * 5;
        System.out.println("Have you had any accidents in the last 5 years?");
        String doYouHaveAccident = scan.next();
        if (doYouHaveAccident.equalsIgnoreCase("Yes")) {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();

            premium += (accidentsAmount * 0.2) * premium;
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if (continuousInsurance.equalsIgnoreCase("no")) {
            premium *= 2;
        }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        education = scan.nextLine();
        if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")) {
            premium *= 0.95 ;
        } else if (education.equalsIgnoreCase("Doctors")) {
            premium *= 0.9;
        } else if (education.equalsIgnoreCase("High School")) {
            premium=premium;
        } else if (education.equalsIgnoreCase("Less than High School")) {
            premium *= 1.05 ;
        }
        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        System.out.println(("Reference number: " + (name.substring(0, 2) + age + name.substring(name.length() - 2) +
                zipCode + education.replace(" ","")).toUpperCase()));


    }
}

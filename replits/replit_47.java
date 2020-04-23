package replits;

import java.util.Scanner;

public class replit_47 {
    public static void main(String[] args) {


        int propertyPrice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");


        System.out.println("Enter your property type:");
        String houseType = scan.nextLine();

        System.out.println("How many bedrooms do you have?");
        int numberOfBedrooms = scan.nextInt();

        System.out.println("Do you have a backyard?");
        boolean backyard = scan.nextBoolean();
        if (backyard) {
            if (houseType.equalsIgnoreCase("condo")) {
                System.out.println("Backyard is not available for condo!");
            } else {
                propertyPrice += 5000;
            }
        }
        System.out.println("Do you have garage?");
        boolean garage = scan.nextBoolean();
        System.out.println("How many spots?");
        int garageSpots = scan.nextInt();
        if (garage) {
            if (garageSpots <= 10) {
                propertyPrice += (garageSpots * 20000);
            } else {
                System.out.println("Pardon, it's not a public parking!");
            }
        }
        System.out.println("How close is metro station?");
        float metroAccessibility = scan.nextFloat();
        propertyPrice += (metroAccessibility <= 1) ? +10000 : (metroAccessibility > 1 && metroAccessibility < 3) ?
                +5000 : 0;
        System.out.println("How close is highway?");
        float highwayAccessibility = scan.nextFloat();
        propertyPrice += (highwayAccessibility <= 1) ? +15000 : (highwayAccessibility > 1 && highwayAccessibility < 5)
                ? +8000 :
                (highwayAccessibility >= 5 && highwayAccessibility <= 20) ? +4000 : 0;
        System.out.println("What's the rating of nearest school?");
        float schoolScore = scan.nextFloat();
        propertyPrice += (schoolScore <= 10 && schoolScore >= 8) ? +45000 : (schoolScore < 8 && schoolScore >= 4)
                ? +20000 : (schoolScore < 4) ? 5000 : 0;
        System.out.println("Does any of your family members smoking?");
        boolean smoking = scan.nextBoolean();
        if (smoking) {
            propertyPrice -= 5000;
        }

        propertyPrice += (numberOfBedrooms * 30000);
        propertyPrice += houseType.equalsIgnoreCase("condo") ? +50000 : houseType.equalsIgnoreCase("townhouse") ? +75000 :
                houseType.equalsIgnoreCase("single family home") ? +95000 : 0;
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");

    }

    }


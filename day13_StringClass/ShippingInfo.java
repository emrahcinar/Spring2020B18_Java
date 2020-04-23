package day13_StringClass;
/*
2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */
import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your building number");
        String buildingNum=scan.next();     //112A Enter

        scan.nextLine();

        System.out.println("Enter your street adress");
        String streetAdress=scan.nextLine();

        System.out.println("Enter your city name");
        String cityName=scan.nextLine();

        System.out.println("Enter your state");
        String stateName=scan.next();

        System.out.println("Enter your zip code");
        String zipCode=scan.nextLine();

        scan.nextLine();//Enter
        System.out.println("Enter your Full Name");
        String fullName=scan.nextLine();

        String result="Ship To: "+fullName+"\n\t\t"+buildingNum+" "+streetAdress+"\n\t\t"+cityName+", "+stateName+" "+zipCode;
        System.out.println(result);




































    }
}

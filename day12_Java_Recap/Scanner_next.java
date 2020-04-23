package day12_Java_Recap;

import java.util.Scanner;

public class Scanner_next {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
     //   String str=scan.next();
       // System.out.println(str);
        String fullAdres="";
        System.out.println("Enter the number of building:");
        short Bnumber=scan.nextShort();
            fullAdres+=Bnumber+" "; //

        System.out.println("Enter the street name");
        String streetName=scan.next();
        fullAdres+=streetName+" ";

        System.out.println("Enter the type of the road");
        String roadType=scan.next();
        fullAdres+=roadType+", ";

        System.out.println("Enter city name, state, zipcode");
        String cityName =scan.next();
        fullAdres+=cityName+" ";
        String state=scan.next();
        fullAdres+=state+", ";

        int zipCode=scan.nextInt();
        fullAdres+=zipCode;

        System.out.println("Adress is: "+fullAdres);






























    }
}

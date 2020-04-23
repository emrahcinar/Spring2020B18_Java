package day10_Switch_Scanner;
import java.util.Scanner;
public class RateCalculator {
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = scan.nextInt();

        System.out.println("How many hours do you work per week");
        byte weeklyHours=scan.nextByte();

        System.out.println("How many weeks do you work in a year");
        byte numberofWeeks=scan.nextByte();

        //hourlyRate=(salary/numberofWeeks)/weeklHours

        int hourlyRate=(salary/numberofWeeks) / weeklyHours;

        System.out.println("Your hourly rate is: $"+hourlyRate);






    }
}

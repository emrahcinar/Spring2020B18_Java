package officeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int max=-2147483648;
        int min=2147483647;
        int i=1;
        while(i<=5){
            System.out.println("Enter a number");
            int num=scan.nextInt();

            if(num>max){  //whichever the userprint is larger, will be assignt max
                max=num;
            }
            if (num<min){ //whichever the userprint is smaller, will be assignt min
                min=num;
            }
            i++;
        }
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);









































    }
}

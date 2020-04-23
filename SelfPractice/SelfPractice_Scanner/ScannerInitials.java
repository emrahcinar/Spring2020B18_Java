package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;

public class ScannerInitials {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;
        System.out.println("enter name");
        String firstname=scan.next();


        scan.nextLine();
        String lastname=scan.nextLine();


        String initials=firstname.substring(0,1).concat(".")+lastname.substring(0,1);
        initials=initials.toUpperCase();
        System.out.println("Initial is:"+initials);
























    }
}

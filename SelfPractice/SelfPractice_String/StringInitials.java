package SelfPractice.SelfPractice_String;



import java.util.Scanner;

public class StringInitials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("first name:");
        String firstName=scan.next();

        System.out.println("last name");
        String lastname=scan.next();

      //  String initials=firstName.substring(0,1).toUpperCase()+lastname.substring(0,1).toUpperCase();

        String initials=""+firstName.charAt(0)+lastname.charAt(0);
        initials=initials.toUpperCase();
        System.out.println(initials);











    }



}

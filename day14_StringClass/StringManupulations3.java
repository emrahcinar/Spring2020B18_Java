package day14_StringClass;

import javax.print.DocFlavor;

public class StringManupulations3 {
    public static void main(String[] args) {

//equals

        String str="CYBERTEK";
        String str2="cybertek";

        System.out.println(str.equals(str2));//false

        System.out.println(str.equalsIgnoreCase(str2));// true

        String s1="Cybertek School";
      boolean r1=  s1.contains("School"); // true

        System.out.println(r1);

        String s3 ="United States";
        System.out.println(s3.startsWith("U"));//true

        String s4="Cybertek school";
        System.out.println(s4.endsWith("l"));//true
        System.out.println(s4.endsWith("school"));//true

/*
Everysingle gmail adress ends with @gmail.com

 */
        String email="CybertekSchool@Yahoo.com";

        if(email.endsWith("@gmail.com")){
            System.out.println("valid Gmail");
        }else{
            System.out.println("Invalid gmail");
        }
















    }
}

package SelfPractice.SelfPractice_String;

import java.util.Scanner;

public class StringManupulation {
    public static void main(String[] args) {

//charAt(index)
        String str="Besiktas";
        char ch=str.charAt(2);
        System.out.println(ch);

        String team="Trabzonspor";
        char ts=team.charAt(4);
        System.out.println(ts);


//length()
        int totalLength=str.length();
        System.out.println(totalLength);

        System.out.println(totalLength>9);

        String str2="Today is great day, Java is Fun";

        int maxIndexNumber=str2.length();
        System.out.println(maxIndexNumber-1);

//concat()

        String s1="Cybertek";
       s1=s1.concat(" School");
        System.out.println(s1);

        String s2="Java";
               s2=s2.concat(" is programing language");
       // System.out.println(s2.concat(" is programing language"));
        System.out.println(s2);

//toLowerCase

        String name1="EMRAH";
        name1=name1.toLowerCase();
        System.out.println(name1);

String lower="SAMPIYON";
lower=lower.toLowerCase();
        System.out.println(lower);

//yoUppercase
        String upper="sampiyon";
        upper=upper.toUpperCase();
        System.out.println(upper);

//trim
        String tab="        Sampiyon Besiktas.";
        tab=tab.trim();
        System.out.println(tab);


//substring

        String str1="Cybertek school is the best";
        //           012345678
        String schoolName=str1.substring(0,8);
        System.out.println(schoolName);

        String fullName="Kuzzat Altay";
        //               0123456789..

        String firstName=fullName.substring(0,6);
        String LastName=fullName.substring(7,12);

        System.out.println(firstName);
        System.out.println(LastName);

        //gmail:lastname_firstname@gmail.com

        String Emrah="Emrah Cinar";
        //            0123456789
        String firstname=Emrah.substring(0,5);
        String lastname=Emrah.substring(6,11);
        System.out.println(firstname);
        System.out.println(lastname);
     //   String gmail=lastname.concat("_").concat(firstname).concat("@gmail.com");
        String gmail=lastname+"_"+firstname+"@gmail.com";
        System.out.println(gmail);


        String S1="I love Java Programming Language";
        //         0123456789
        String className=S1.substring(7);
        System.out.println(className);

        String S2="I like C# Programming";
              S2=  S2.replace("C#","Java");
        System.out.println(S2);

//replace

        String name= "COVID 18";
        name=name.replace("8","9");
        System.out.println(name);

        String r1="I like C#, C#, is fun, C# is cool";
        r1=r1.replaceFirst("C#","Java");
        System.out.println(r1);

        String r2="Tomorrow is Monday,Tomorrow is Tuesday";
        r2=r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);

 //indexOf

        String ctr="I like Java programming John";
        int num1=ctr.indexOf("John");
        System.out.println(num1);

        String ctr2="Cybertek School is awsome";
        //           0123456789

        int firstS=ctr2.indexOf("e");
        int secondS=ctr2.indexOf("is")+1;
        System.out.println(firstS);
        System.out.println(secondS);

        int maxindenumber="Cybertek".length()-1;
        System.out.println(maxindenumber);

        String names="Muhtar";
           int a1= names.indexOf("Good guy");
        System.out.println(a1);

        String fullname="Rahman Abdalla";
        String firstname1=fullname.substring(0,fullname.indexOf(" "));
        String lastname1= fullname.substring(fullname.indexOf(" ")+1);

        System.out.println(firstname1);
        System.out.println(lastname1);


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName3=scan.nextLine();

        String firstname3=fullName3.substring(0,fullName3.indexOf(" "));
        String lastName3=fullName3.substring(fullName3.indexOf(" ")+1);

        firstname3=firstname3.substring(0,1).toUpperCase()+firstname3.substring(1).toLowerCase();
        
        lastName3=lastName3.substring(0,1).toUpperCase()+lastName3.substring(1).toLowerCase();
        System.out.println("Your first name is: "+firstname3);
        System.out.println("Your last name is: "+lastName3);








    }
}

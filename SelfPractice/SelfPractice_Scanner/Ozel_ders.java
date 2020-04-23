package SelfPractice.SelfPractice_Scanner;



public class Ozel_ders {
    public static void main(String[] args) {
/*
        double value1=20;
        double value2=80;
        double value3=value1+value2*25;//100*25=2500
        double value4=value3%40;//2500/

        System.out.println(value4 == 20);


        byte age=22;
        if (age>18){
            System.out.println("You are eligable to vote");
        }

        byte number1=4;
        byte number2=8;
        byte number3=1;

        if(number1>number2 && number1>number3){
            System.out.println("The greatest number is: "+number1);
        }
        if(number2>number3 && number2>number1){
            System.out.println("The greatest number is: "+number2);}
        if(number3>number2 && number3>number1){
            System.out.println("The greatest number is: "+number3);}

            int num1=150;
            int num2=150;
            if(num1==num2 && num2==num1){
                System.out.println(num1+ " is equal to " +num2);
            }

            double hour = 10.35;
            if(hour<=12){
                System.out.println("Good Morning");
            }
            if(hour>=12&&hour<=15){
                System.out.println("Good Afternon");
            }
            if(hour>=15){
                System.out.println("Good Evening");
            }

        int num1= 10;
        int num2= 20;
        int num3= 30;
        int num4= 40;
        int num5= 50;
        int avarage=(num1+num2+num3+num4+num5)/5;
        System.out.println(avarage);

           200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable
 */

        int Year=2020;
        boolean Leapyear= Year %4==0;
        if(Leapyear){
            System.out.println("Year "+Year+" is the Leap Year");
        }else{
            System.out.println("Year "+Year+" is not Leap Year");
        }

        System.out.println("======================================================");

        int grade=88;
        boolean A=grade>=90&&grade<=100;
        boolean B=grade>=80&&grade<=89;
        boolean C=grade>=70&&grade<=79;
        boolean D=grade>=60&&grade<=69;
        boolean ValidGrade= grade>=0 && grade<=100;

        if(ValidGrade) {
            //if order to multi-branch if gets executed, first validgrade
            if (A) {
                System.out.println("You made A");
            } else if (B) {
                System.out.println("You made B");
            } else if (C) {
                System.out.println("You made C");
            } else if (D) {
                System.out.println("You made D");
            } else {
                System.out.println("You made F");
            }
            }else{
            System.out.println("Invalid Grade");

        }

        System.out.println("============================================");

      int age=20;
      boolean GoodPerson=true;

      if(age>=25){
          if(GoodPerson){
              System.out.println("Alcohol bad for your health");
          }
          else{//goodperson=false&&age>=18
              System.out.println("You can buy cigarettes");
          }if(age>=21){
              System.out.println("You can buy Hookah");
          }
          if(age>=25) {
              System.out.println("You can buy Alcohol");
          }
      }else{
          System.out.println("buy milk");
      }










































        }
}

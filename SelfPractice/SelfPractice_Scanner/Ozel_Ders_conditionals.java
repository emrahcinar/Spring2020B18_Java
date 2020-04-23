package SelfPractice.SelfPractice_Scanner;

public class Ozel_Ders_conditionals {
    public static void main(String[] args) {
      /*

        int statuscode=403;
        boolean Ok = statuscode==200;
        boolean Created= statuscode==201;
        boolean Accepted=statuscode==202;
        boolean MovedPermanently=statuscode==301;
        boolean Seeother=statuscode==303;
        boolean NotModified=statuscode==304;
        boolean TemporaryRedirect=statuscode==307;
        boolean BadRequest=statuscode==400;
        boolean Unauthorized=statuscode==401;
        boolean Forbidden=statuscode==403;
        boolean NotFound=statuscode==404;
        boolean Gone=statuscode==410;
        boolean InternalServerError=statuscode==500;
        boolean ServiceUnavailable=statuscode==503;

        if(Ok){
            System.out.println("Ok");
        }else if(Created){
            System.out.println("Created");
        }else if(Accepted){
            System.out.println("Accepted");
        }else if(MovedPermanently){
            System.out.println("MovedPermanently");
        }else if(Seeother){
            System.out.println("Seeother");
        }else if(NotModified){
            System.out.println("NotModified");
        }else if(TemporaryRedirect){
            System.out.println("TemporaryRedirect");
        }else if(BadRequest){
            System.out.println("BadRequest");
        }else if(Unauthorized){
            System.out.println("Unauthorized");
        }else if(Forbidden){
            System.out.println("Forbidden");
        }else if(NotFound){
            System.out.println("NotFound");
        }else if(Gone){
            System.out.println("Gone");
        }else if(InternalServerError){
            System.out.println("InternalServerError");
        }else if(ServiceUnavailable){
            System.out.println("ServiceUnavailable");  }

       */
/*
        byte day=-5;
        String weekDays="";

        weekDays= (day==1)?"Monday":(day==2)?"Tuesday":(day==3)?"Wednesday":(day==4)?"Thursday":(day==5)?"Friday":
                (day==6)?"Saturday":(day==7)?"Sunday-Funday":"Invalid Entry";
        System.out.println(weekDays);

            switch(day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wedneday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday-Funday");
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
            */

                    int num=30;

                    boolean divis2=num%2==0;
                    boolean divis3=num%3==0;
                    boolean divis5=num%5==0;

                    String result=num+" is visible by 2 "+divis2;
                    String result1=num+" is visible by 3 "+divis3;
                    String result2=num+" is visible by 5 "+divis5;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

        System.out.println("=================================================");

        System.out.println(35/25);



    }


}

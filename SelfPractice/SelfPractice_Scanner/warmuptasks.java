package SelfPractice.SelfPractice_Scanner;

public class warmuptasks {
    public static void main(String[] args) {
        /*
        age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)

         */
        /*
                    int age=-34;

                if(age>=0&&age<=3){
                    System.out.println("baby");
                } if(age >= 3&&age<=5){
                     System.out.println("Toddler");
                  }else if(age>=6&&age<=9){
                  System.out.println("Kid");
                    }else if(age>=10&&age<=12){
            System.out.println("Pre-teen");
                    }else if(age>=13&&age<=17){
            System.out.println("Young Adult");
                    }else if(age>=21&&age<=39){
            System.out.println("Adult");
                    }else if(age>=40&&age<=49){
            System.out.println("Young Middle-Aged Adult");
        }else if(age>=50&&age<=54){
            System.out.println("Middle-Aged Adult");
        }else if(age>=55&&age<=64){
            System.out.println("Very Young Senior Citizen");
        }else if(age>=65&&age<=74){
            System.out.println("Young Senior Citizen");
        }else if(age>=75&&age<=84){
            System.out.println("Senior Citizen");
        }else if(age>=85&&age<119){
            System.out.println("Old Senior Citizen");
        }else {
            System.out.println("invalid age");
        }
        *//*
int age=47;

            String result=(age>=0&&age<=3)?"Baby":(age>=5&&age<=5)?"Toddler":(age>=6&&age<=9)?"Kid":(age>=10&&age<=12)?"Pre teen":
                    (age>=13&&age<=17)?"Teenager":(age>=18&&age<=20)?"Young Adult":(age>=21&&age<=39)?"Adult":
                            (age>=40&&age<=49)?"Young Middle-Aged Adult":(age>=50&&age<=54)?"Middle-Aged Adult":
                                    (age>=55&&age<=64)?"Middle-Aged Adult":(age>=55&&age<=64)?"Very Young Senior Adult":
                                            (age>=65&&age<=74)?"Young Senior Citizen":(age>=75&&age<=84)?"Senior Citizen":
                                                    (age>85)?"Old SeniorCitizen":"Invalid entry";
        System.out.println(result);
         */

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

 *//*
        int statuscode=01;

        String codes=(statuscode==200)?"OK":(statuscode==201)?"Created":(statuscode==202)?"Accepted":(statuscode==301)?"MovedPermanently":
                (statuscode==303)?"Seeother":(statuscode==304)?"NotModified":(statuscode==307)?"TemporaryRedirect":(statuscode==400)?
                        "BadRequest":(statuscode==401)?"Unauthorized":(statuscode==403)?"Forbidden":(statuscode==404)?"NotFound":
                        (statuscode==410)?"Gone":(statuscode==500)?"InternalServerError":(statuscode==503)?"ServiceUnavailable":"InvalidEntry";
        System.out.println(codes);
        *//*
        int num1 =650;
        int num2 =700;
        int num3 =600;

        String large=(num1>num2&&num1>num3)?"Largest number "+num1:(num2>num1&&num2>num3)?"Largest number "+num2:
                "Largest number "+num3;

        System.out.println(large);
        */

        byte day = 9;
        String weekDays = day == 1 ? "Monday" : day == 2 ? "Tuesday" : day == 3 ? "Wednesday" : day == 4 ? "Thursday" : day == 5 ? "Friday" :
                day == 6 ? "Saturday" : day == 7 ? "Sunday" : "Invalid Entry";

        System.out.println(weekDays);


        byte num = 5;
        String words = num == 0 ? "Zero" : num == 1 ? "One" : num == 2 ? "Two" : num == 3 ? "three" : num == 4 ? "Four" : num == 5 ? "Five" : num == 6 ? "Six" :
                num == 7 ? "Seven" : num == 8 ? "Eight" : num == 9 ? "Nine" : "Invalid Entry";
        System.out.println(words);


        byte month = 3;
        String days = "";
        if (month >= 1 || month <= 12) {
            if (month == 2) {
                days = "28 days";
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = "30 days";
            } else {
                days = "31 days";
            }
        } else {
            days = "Invalid Entry";
        }
        System.out.println(days);

    }}



































































































































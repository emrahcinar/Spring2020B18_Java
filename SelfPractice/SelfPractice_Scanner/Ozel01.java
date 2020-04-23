package SelfPractice.SelfPractice_Scanner;


public class Ozel01 {
    public static void main(String[] args) {

        /*
        int kg=10;
        double pound=kg*2.240;
        System.out.println(pound);

        double pound=0.453;
        double kg=pound*10;
        System.out.println(pound);

        double gallons;
        double liters;

        gallons = 44;
        liters = gallons * 3.7854; */
        /*
        System.out.println("There are "+gallons+" gallons in "+liters+" liter");

        double pound;
        double kg;

        pound=0.456;
        kg=10;
        System.out.println(kg/pound);
       */
         /*
        double lira=1;
        double dollar=6.5*lira;
        System.out.println(1000*dollar+" lira");
          */

         /*
         int a=10;
         int b=15;

         a=a+b; //a=25;
         b=a-b; //25-15=10;  b=10;
         a=a-b; // 25-10=15; a=15

        System.out.println(a+"\n"+b); // 15,10

         int city1=2345673;
         int city2=5688944;
         int city3=16189445;
        System.out.println(city1+" "+city2+" "+city3);
          */
        //  System.out.println(12.8/3L);
        //System.out.println(10.5%3);

        // int p=50;
        //  p=--p + p++ + p-- + p++; //
        //   49+ 49+   50+    49
        // System.out.println(p);
        // int a=1;
        // a=-a-- + a++ / -a-- * --a;
        //  a= -1 +  0  /  -1  * -1;
        //  a= -1 + 0  *-1 ;
        //  a=-1+0;
        //  a=0;
        // System.out.println(a);

        //year = 2020 output:
        // 2020 is leap year: true

        // double kg ;
        // double pounds ;
/*
        double kg=10;
        double pounds= kg*2.456;
        System.out.println(pounds);


        double liter= 45;
        double gallons=liter/3.45;
        System.out.println(gallons);


            int age=30;
            boolean Goodperson=false;

            if(age>=18) {
                System.out.println("You can buy milk");
                if (Goodperson) {
                    System.out.println("Alcohol is bad for your health");
                } else {//Good person= false, && age >=18
                    System.out.println("You can buy cigarette");
                }
                if (age >= 21) {
                    System.out.println("You can buy hookah");
                }
                 if (age >= 25) {
                     System.out.println("You can buy alcohol");

                }
            }else {
                System.out.println("buy milk");
            }

 */
    /* number of days in a month
    (assume that feb has 28 days)
   int mont=0~12;
   1     2    3    4   5   6   7    8   9   10   11  12
   jan  feb  march apr may jun jul agu sept oct nov dec
   31   28   31    30  31  30  31  31  30  31  30  31

  must use nested if
            28 days:2
            30 days:4 6 9 11
            31 days: 1 3 5 7 8 10 12

            even number of 30 days:4 & 6
            odd number of 30 days:9 & 11

            even number of 31 days: 8,10,12
            odd number of 31 days:1,3,5,7


         int month =11;
         if (month >0 && month<13){

             if(month==1){
                 System.out.println("31");
             }else if(month==2){
                 System.out.println("28");
             }else if(month==3){
                 System.out.println("31 days");
             }else if(month==4){
                 System.out.println("30 days");
             }else if(month==5){
                 System.out.println("31 days");
             } else if (month == 6) {
                 System.out.println("30 days");
             }else if(month==7){
                 System.out.println("31 days");
             }else if(month%2==0){
                 System.out.println("31 days");
             }else{
                 System.out.println("30 days");
             } }
                else{
             System.out.println("Invalid Entry");
         }


/*    28 days: 2
      30 days:4,6,9,11
 */
        // int Month2=5;
//
        // if(Month2==2){
        //     System.out.println("28 days");
        // }else if(Month2==4||Month2==6) {
        //     System.out.println("30 days");
        //  }else if (Month2==9 || Month2==11){
        //      System.out.println("30 days");
        // }else{
        //     System.out.println();
        // }
/*
        double grade=-55;
      boolean Agrade= grade>=90&&grade<=100;
      boolean Bgrade= grade>=80&&grade<=90;
      boolean Cgrade= grade>=70&&grade<=80;
      boolean Dgrade= grade>=60&&grade<=70;
      boolean Fgrade= grade>=0&&grade<=60;
      boolean ValidGrade= grade>=0&&grade<=100;


      if(ValidGrade) {
          if (Agrade) {
              System.out.println("A");
          } else if (Bgrade) {
              System.out.println("B");
          } else if (Cgrade) {
              System.out.println("C");
          } else if (Dgrade) {
              System.out.println("D");
          } else {
              System.out.println("F");
          }
      }else {
          System.out.println("Invalid entry");
      }

 */
/*
        byte age = 11;
        boolean GoodPerson = false;

        if (age >= 18) {
            if (GoodPerson) {
                System.out.println("alcohol bad for your health");
            } else {
                System.out.println("You can buy cigarettes");
                if (age >= 21) {
                    System.out.println("You can buy hookah");
                }if (age >= 25) {
                    System.out.println("You can buy Alcohol");
                }
            }
        } else {
            System.out.println("buy milk");
        }

 */ int month=4;
    if (month>0&&month<13) {
    if(month==1){
                System.out.println("31 days");
            }else if(month==2){
                System.out.println("28 days");
        }else if(month==3){
            System.out.println("31 days");
        }else if(month==4) {
        System.out.println("30 days");
        }else if(month==5) {
        System.out.println("31 days");
        } else if(month==6) {
        System.out.println("30 days");
        }  else if(month==7) {
        System.out.println("31 days");
        }else if(month%2==0) {
        System.out.println("31 days");
        }else {
        System.out.println("30 days");
    }} else {
        System.out.println("Invalid entry");

    }

        int month2=2;
        int year=2005;

        if(month2>0&&month2<13){  //1~12
        if(month2==2) {//month 2=2
            if (year % 4 == 0) {//condition for leap year
                System.out.println("29 days");
            } else {// condition for regular year
                System.out.println("28 days");
            }
        }else if(month2==4||month2==6){
            System.out.println("30 days");
        } else if (month2==9 || month2==11){
            System.out.println("30 days");
        }else {
            System.out.println("31 days");
        }}else{
            System.out.println("invalid entry");
        }

        if(true){
            System.out.println("hello");
        }else{
            System.out.println("batch 12");
        }

        if (true) {
            System.out.println("hello");
        }else if(false){
            System.out.println("Batch 12");
        }
            else{//Never get executed
            System.out.println("Cybertek");
        }














    }
    }


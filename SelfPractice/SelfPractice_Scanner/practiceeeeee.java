package SelfPractice.SelfPractice_Scanner;

public class practiceeeeee {
/*
    public static void main(String[] args) {

        int quantity=55;
        double bottle=1.5;
        String name= ("Full case is " );
        String name2=("Half case is ");
        String name3=(" Lt ");
        double full= bottle*55;
        double half=full/2.5;
        System.out.println(full);
        System.out.println(name+full+name3+name2+half+name3);

}
 */

   // public static void main(String[] args) {

       // double lira = 1000;
        //double liraindolar = lira / 6.15;
       // System.out.println(liraindolar);
        //double gallon = 300;
        //double galloninliter= gallon/2.225;
        //System.out.println(galloninliter);
        //double dollar= 2000;
        //double poundindollar=dollar/1.20;
        //System.out.println(poundindollar);

        //double HourlyRate = 55;
        //double stateTaxRate = 0.04;
        //double federalTaxRate= 0.22;
        //byte weeklyHours = 40;
        //byte totalWeeksinAYear=52;

        //double salary=HourlyRate*weeklyHours*totalWeeksinAYear;
        //double Federaltaxrate=salary*federalTaxRate;
        //double Statetaxrate=salary*stateTaxRate;
        //double total=salary-(Federaltaxrate-Statetaxrate);
        //String term="My gross salary is $";
        //System.out.println(term+total );


       //boolean r1=true;
       //boolean r2=false;

        //System.out.println(77>=55);

    public static void main(String[] args) {

        //1 gallon = 3.785 liters
        //1 litter = 1/3.785

      // double gallon=3.785;
        //double litter=1/3.785;

      //  int a = 200;
        //int b = -a++ + - --a * a-- % 2;
            //= -200 + 200*200%2
            //=-200 +4000%2
           //=-200+ 0
          //  b=-200;

        //int x = 300;
       // int y = 400;
       // int z = x + y - x * y +x / y;
       // System.out.println(z);
        //      300+400-300*400+300/400
        //         700 - 12000+300/400

        double num1 =30;
        double num2 =300;
        double num3 =30000;

        boolean num1EqualNum2 = num1==num2 && num1!=num3;
        boolean num1EqualNum3 = num1==num3 && num1!=num2;
        boolean num2EqualNum3 = num2==num3 && num2!= num1;
        boolean AllEqual = num1==num2 && num1==num3;

        if(num1EqualNum2){
            System.out.println("num1  is equal to num2");
        }else if(num1EqualNum3){
            System.out.println("num1 is equal to num3");
        }else if(num2EqualNum3){
            System.out.println("num2 is equal to num3 ");
        }else if(AllEqual){
            System.out.println("All is equal.");
        }else{
            System.out.println("None of them are equal.");
        }
    }
}


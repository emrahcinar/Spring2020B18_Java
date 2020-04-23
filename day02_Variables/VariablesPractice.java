package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {
        /*
        salary, federal tax, state tax, loan, ssn
         */

        int salary = 100000;
        double federalTax = 0.18;
        float stateTax = 0.065f;
        //salary after tax = salary(1-sum of taxes)
        double sumtaxes = federalTax + stateTax;
        double salaryaftertax = salary * (1 - sumtaxes);

        System.out.println(salaryaftertax);

        System.out.println("==================================");

        //area of the circle = r * r * pi

        double r = 5.5;
        double area = r * r * 3.14;
        System.out.println(area);

        System.out.println("===========================");

        int kg = 90;
        double pound = kg * 2.25;
        System.out.println(pound);

        System.out.println("===========================");

        double lira = 1000;
        double liraindolar = lira / 6.15;
        System.out.println(liraindolar);

        System.out.println("===========================");

        double rupi = 1000000;
        double rupiindollar = rupi * 0.014;
        System.out.println(rupiindollar);

        System.out.println("===========================");


        double liter = 10000;
        double gallons = liter / 3.7;
        System.out.println(gallons);

    }




}

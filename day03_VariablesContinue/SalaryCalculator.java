package day03_VariablesContinue;

public class SalaryCalculator {
    /*Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex
				    rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
			        then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD
*/
    public static void main(String[] args) {
        //DAtaType variableName = Data;

        double HourlyRate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate= 0.22;
        byte weeklyHours = 40;
        byte totalWeeksinAYear=52;
        //salary=hourlyrate*weeklyhours*52

        double salary= HourlyRate*weeklyHours*totalWeeksinAYear;
        //Salary before tax
       //stateTax=salary*stateTaxRate
        double stateTax = salary*stateTaxRate;
        //federal Tax = salary*federalTaxRate

        double federalTax=salary*federalTaxRate;
        //salaryAfterTax=salary-stateTax-federalTax;

        //totalTax=stateTax + federalTax
        double totalTax = stateTax + federalTax;

        //salaryAfterTax = salary - stateTax -federalTax ;

        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary is: $" + salary );//concatination
        System.out.println("State tax is: $" + stateTax );
        System.out.println("Federal tax is: $"+ federalTax);
        System.out.println("Total tax is: $" + ( federalTax + stateTax ) );
        System.out.println("Salary After Tax is: $"+salaryAfterTax);
        //                                        string +stateTax
        // System.out.println("9"+ 3);//concatination
        //System.out.println(9 +"3");//conc
        //System.out.println(9+3);//addition


    }
}

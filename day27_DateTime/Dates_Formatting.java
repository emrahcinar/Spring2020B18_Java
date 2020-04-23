package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {
//day_month_year

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yy");


        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));


        /*
        create a date called birthDay:month/Days/year
        ex:2020 04 23
            Aprl/23/20
         */
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE MMMM/dd/yy");

        LocalDate date2 = LocalDate.of(1985, 10, 04);
        String str1=date2.format(dtf2);
        System.out.println(str1);
        LocalDate date3=LocalDate.now();
        System.out.println(date3.format(dtf2));
    }

}

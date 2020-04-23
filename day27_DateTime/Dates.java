package day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 10, 25);
        System.out.println(date1);

        LocalDate birthday = LocalDate.of(2020, 12, 25);
        System.out.println(birthday);

//isAfter(date2)
        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1);

//isBefore(date)

        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);
//isEqual(dste2)
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);

//isLeap(date2)
        boolean result4 = birthday.isLeapYear();
        System.out.println(result4);

        System.out.println("===========================================================");

        LocalDate now = LocalDate.now();//2020-04-23
        System.out.println("Today is: " + now);


      //  LocalDate birthDay = LocalDate.of(1990, 04, 25);
     //   int month = birthDay.getMonthValue();
      //  int days = birthDay.getDayOfMonth();


        String str=now.toString();
        System.out.println(str.replace("-"," "));


//month/day/year













    }
}

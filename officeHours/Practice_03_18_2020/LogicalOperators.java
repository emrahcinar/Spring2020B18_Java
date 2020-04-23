package officeHours.Practice_03_18_2020;

public class LogicalOperators {
    public static void main(String[] args) {

        // \\ , && , !

        boolean r1 = "Muhtar" == "Bad Guy"; // false
        System.out.println(r1);

        boolean r2 = "Muhtar" != "Good Guy"; // true
        System.out.println(r2);

        boolean r3 = 10>=9; // true
        System.out.println(r3);
        boolean r4 = !false ==!true;
                //     ture ==  false; ==> false
        System.out.println(r4);

        // || : as long as one condition is true ==> true


        boolean result1 = 9 != 8 || 9==8;
                        //  ture or false ==> true
        System.out.println(result1);//true

        boolean result2 = 'a' == 'A' || 'A' == 'b';
                    //          false ||  false    ==>  false
        System.out.println(result2);//false

        // && : as long as one condition is false ==>  false

        boolean result3 = 6 > 5 && 6 < 4;
                //          true &&  fale ==> false
        System.out.println(result3); //false

        boolean result4= !false != false && !true == false;
                    //     true != false &&   false== false
                    //          ture      &&       true  ==> true
        System.out.println(result4);//true

        //Single if statement :

















    }
}

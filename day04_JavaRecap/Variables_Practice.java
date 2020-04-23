package day04_JavaRecap;

public class Variables_Practice {
    public static void main(String[] args) {
    //DataType variableName = Data;
    //1.    Must be started with letters
        //2.    Must be Unique
        //3.    Cannot be Java Reserved Words
        //4.    Cannot contains special character other than these two: $ and _

        byte num1=127;
        short num2=num1; // double>float>long>int>short>byte

        int num4=num2;  //int is prefered by compiler
        long num5= 99999999l;

        float num6 = 100L;
        System.out.println(num6);//100.0
        float num7 =0.5f;
        System.out.println(num7);

        double num0 = 9999999L;
        double num10=100.5;
        System.out.println(num10);
        char ch1 = '$'; //every single character has its own corresponding numbe
        System.out.println(ch1);
        char ch2=4500; //0~ 65565
        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1); //56(from ascii table) (' ')

        int a2= 'z';
        System.out.println(a2);
        double d1= 'z' + '8';
        System.out.println(d1);  // 178.0

        char ch3 = 178;
        System.out.println(ch3);
        char ch4 ='z'+'8';
        System.out.println(ch4);
        //               > : greater
        //				>= : greater or equal
        //				< : less
        //				<= : less or equal
        //				== : equal
        //				!= : not equal
        //				! : opposite


        boolean bool1=true;
        boolean bool2 = false;
        System.out.println(9>10);//false

        System.out.println(9>=9);//true
        System.out.println(9 != 10); // true
        System.out.println('a' == 'b'); //false
        System.out.println('a' == 'b' -1);
        //System.out.println('a' == "a"); //"does not mach"

        System.out.println('a'=='b'-1);
                        //  97==98 -1
                        //  97==97 ==>true

        System.out.println("Muhtar" == "Good Guy");//false "2 difret text"
                           //Bad Guy==Good Guy ==>false
        System.out.println("Muhtar" != "Good Guy");//true

        System.out.println("Muhtar" == " muhtar");//false "uppercase and lovercase

        //System.out.println("Cybertek" == 10000);

        boolean r1 = !true;//false
        System.out.println(r1);// false
        System.out.println(!r1);//true
        System.out.println(!true == false);//true
        System.out.println(!true !=!false);//true



























    }
}

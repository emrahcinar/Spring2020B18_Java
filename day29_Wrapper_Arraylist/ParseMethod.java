package day29_Wrapper_Arraylist;

public class ParseMethod {
    public static void main(String[] args) {

        String str="123";

        int a1=Integer.parseInt(str);//123

        System.out.println(str+1);//text
        //                  123+1  ==>"1231"

        System.out.println(a1+1);//number
        //                  123+1 ==>124

     byte b1=   Byte.parseByte(str);        //byte=123

        System.out.println(b1+5);//128

       Integer I1=(int)Byte.parseByte(str);    //AutoBoxing
      // Integer=(int)byte;
      // Integer = int;

        String str2="12.5";

      float f1=  Float.parseFloat(str2);//float 12.5
        System.out.println(f1+1);//number ==>13.5

       double f2= Double.parseDouble(str2);//double 12.5
        System.out.println(f2);//number ==>13.5


        String str3="3147483647";

      double num1=  Long.parseLong(str3);   //3147483647L
        System.out.println(num1+2);//==>3.147483649E9

        Long num2=Long.parseLong(str3);//autoboxing
        System.out.println(num2+2);  //3147483649

        String result1="false";//if the string is not true or false its ==>false //like"Today is monday"

        boolean r1=Boolean.parseBoolean(result1); //boolean
        System.out.println(!r1);    //true

        String result2="fALsE";// "false"   keysensivity always return false
        boolean r2=Boolean.parseBoolean(result2);

        System.out.println(r2);





    }
}

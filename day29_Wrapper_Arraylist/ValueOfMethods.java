package day29_Wrapper_Arraylist;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str="123";
        Integer a=Integer.valueOf(str);//Integer,123

        System.out.println(a);

        double b=Integer.valueOf(str);  //unboxing
        //double=Integer

        System.out.println(b);

        String str2="15.5";

        double d1=Double.parseDouble(str2);
        //double=double

        double d2=Double.valueOf(str2);  //  15.5
        //   double  = Double  //  Unboxing

        System.out.println(d1);//15.5
        System.out.println(d2);//15.5

        System.out.println(d1==d2);  //true
        System.out.println("============================================================");

            int z1=2000;
           // Long L1=z1; doesnt accept any other primitives except for long

        Short sh1=3000;
        int z2=sh1;


        String r1="TruE";//true, valueofMethods return wrapper class values
        Boolean t1=Boolean.valueOf(r1);//Boolean, true
                //Boolean=Boolean //none

        boolean t2=Boolean.valueOf(r1); //Boolean,true
        //boolean =Boolean //unboxing

        System.out.println(t1);
        System.out.println(t2);
        System.out.println("====================================================================");

        int maxNum=Integer.MAX_VALUE;//2147483647
        System.out.println(maxNum);

        double maxNum2=Double.MAX_VALUE;
        System.out.println(maxNum2);//1.7976931348623157E308

        int minNum=Integer.MIN_VALUE;
        System.out.println(minNum);//-2147483648

        byte maxNum3=Byte.MAX_VALUE;
        System.out.println(maxNum3);//127

        byte minNum3=Byte.MIN_VALUE;
        System.out.println(minNum3);//-128
        System.out.println("====================================================================");

        boolean[] arr=new boolean[3];
        System.out.println(Arrays.toString(arr));

        Integer[]arr2=new Integer [3];
        System.out.println(Arrays.toString(arr2));













    }
}

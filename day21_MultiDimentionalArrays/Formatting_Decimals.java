package day21_MultiDimentionalArrays;

import java.text.DecimalFormat;

public class Formatting_Decimals {
    public static void main(String[] args) {

        DecimalFormat DF=new DecimalFormat("0.00");//rounding the decimals

        double a=10.0/3.0;
        System.out.println(a);///3.3333333333333335

        System.out.println(DF.format(a) );//3.33


        System.out.println(2.3467899);//2.3467899
        System.out.println(DF.format(2.3467899));//2.35





































    }
}

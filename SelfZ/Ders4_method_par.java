package SelfZ;

import java.util.Scanner;

public class Ders4_method_par {

    public static double ikikatHesapla(double num) {
        double res = num * 2;
        return res;
    }

    public static void main(String[] args) {
        double y=8;
        double x = ikikatHesapla(y);
        System.out.println(x);

        x = ikikatHesapla(5);
        System.out.println(x);
    }

}

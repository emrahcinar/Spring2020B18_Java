package SelfZ;

import java.util.Scanner;

public class Ders5_method_par {

    public static double convFah2Cel(double fah) {
        //fah=59 -> cel = (fah-32)*(5/9) -> (59.0-32)*(5/9) -> 27.0 * (5/9) -> 27.0 * 0 -> 0
        //fah=59 -> cel = (fah-32)*5/9 -> (59.0-32)*5/9 -> 27.0 * 5/9 ->135.0 / 9 -> 15

        double cel = (fah - 32) * 5 / 9;

        return cel;

        //return (fah-32)*5/9;
    }

    public static double convFah2Kelv(double fah) { // K = C + 273.15

        double cel = convFah2Cel(fah);//
        double kel = cel+273.15;

        return kel;

        //return (fah-32)*5/9;
    }

    public static double feet2yard(double feet){
        double yard=feet/3;
        return yard;

    }

    public static double feet2cm(double feet){
        double inch=12*feet;
        double cm=inch*2.54;

        return cm;

    }

    public static double cylindirVolume(double r ,double h){

        double volume=Math.PI*Math.pow(r,2)*h;

        return volume;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(feet2cm(50));

        double v = cylindirVolume(5,5);
    }
}

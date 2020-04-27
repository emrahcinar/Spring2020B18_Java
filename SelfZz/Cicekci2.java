package SelfZz;

import java.util.Scanner;

public class Cicekci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int papatya = 5;
        double karanfil = 7;
        double gul = 10;
        double orkide = 15;

        String tur="";
        double fiyat =0;
        System.out.println("1. Papatya");
        System.out.println("2. Karanfil");
        System.out.println("3. Gul");
        System.out.println("4. Orkide");
        System.out.println("Cicek turu giriniz: ");
        int cicekTur=scan.nextInt();
        System.out.println("Adet giriniz: ");
        double adet=scan.nextInt();

        if (cicekTur==1){
            tur="papatya";
            if (adet<=49){
                fiyat=adet*papatya;
            }if(adet>=50&&adet<=100){
                fiyat=papatya*adet*0.01;
            }else if (adet>100&&adet<=200){
                fiyat=papatya*adet*0.025;
            }else{
                fiyat=papatya*adet*0.03;
            }

        }else if(cicekTur==2){
            tur="karanfil";
            if (adet>=40&&adet<=80){
                fiyat=karanfil*adet*0.05;
            }else if (adet>=80&&adet<=150){
                fiyat=karanfil*adet*0.1;
            }else{
                fiyat=karanfil*adet*0.2;
            }
            fiyat=adet*karanfil;
        }else if(cicekTur==3){
            tur="gul";
            if (adet>=30&&adet<=60){
                fiyat=gul*adet*0.05;
            }else if (adet>=60&&adet<=100){
                fiyat=gul*adet*0.1;
            }else{
                fiyat=gul*adet*0.15;
            }
            fiyat=adet*gul;
        }else if(cicekTur==4) {
            tur = "orkide";
            if (adet>=20&&adet<=50){
                fiyat=orkide*adet*0.05;
            }else{
                fiyat=orkide*adet*0.1;
            }
            fiyat = adet * orkide;
        }

        if(cicekTur==-1) {
            System.out.println("Hatali secim");
        }else {
            System.out.println(fiyat);

        }

    }
}

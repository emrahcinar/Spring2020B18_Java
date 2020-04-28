package SelfZz;

import java.util.Scanner;

public class Cicekci2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double papatyaFiyat = 5;
        double karanfilFiyat = 7;
        double gulFiyat = 10;
        double orkideFiyat = 15;

        String tur = "";
        double fiyat = 0;
        System.out.println("1. Papatya");
        System.out.println("2. Karanfil");
        System.out.println("3. Gul");
        System.out.println("4. Orkide");
        System.out.println("Cicek turu giriniz: ");
        int cicekTur = scan.nextInt();
        int sayac=0;
        while(cicekTur>4||cicekTur<=0){
            System.out.println(3-sayac+" hakkiniz kaldi");
            System.out.println("Hatali Secim");
            System.out.println("Cicek turunu tekrar girini");
            cicekTur=scan.nextInt();
            sayac++;
            if(sayac==3){
                break;
            }
        }
        System.out.println(sayac+". hakinizi girdiniz");
        System.exit(0);

        System.out.println("Adet giriniz: ");
        double adet = scan.nextInt();

        if (cicekTur == 1) {
            tur = "papatya";
            if (adet <= 49) {
                fiyat = adet * papatyaFiyat;
            } else if (adet >= 50 && adet <= 100) {
                fiyat = papatyaFiyat * adet * 0.90;
            } else if (adet > 100 && adet <= 200) {
                fiyat = papatyaFiyat * adet * 0.75;
            } else {
                fiyat = papatyaFiyat * adet * 0.30;
            }

        } else if (cicekTur == 2) {
            tur = "karanfil";
            if (adet >= 39) {
                fiyat = adet * karanfilFiyat;
            } else if (adet >= 40 && adet <= 80) {
                fiyat = karanfilFiyat * adet * 0.95;
            } else if (adet >= 80 && adet <= 150) {
                fiyat = karanfilFiyat * adet * 0.90;
            } else {
                fiyat = karanfilFiyat * adet * 0.80;
            }

        } else if (cicekTur == 3) {
            if (adet < 30) {
                fiyat = adet * gulFiyat;
            } else if (adet >= 30 && adet <= 60) {
                fiyat = gulFiyat * adet * 0.95;
            } else if (adet >= 60 && adet <= 100) {
                fiyat = gulFiyat * adet * 0.90;
            } else {
                fiyat = gulFiyat * adet * 0.85;
            }

        } else if (cicekTur == 4)
            if (adet < 20) {
                fiyat = adet * orkideFiyat;
            } else if (adet >= 20 && adet <= 50) {
                fiyat = orkideFiyat * adet * 0.95;
            } else {
                fiyat = orkideFiyat * adet * 0.90;
            }
        System.out.println(fiyat);

}}

package SelfZz;

import java.util.Scanner;

public class Cicekci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int papatya = 5;
        double karanfil = 7;
        double gul = 10;
        double orkide = 15;
        double indirim = 0;
        double fiyat = 0;
        double toplam;

        String tur = "";
        System.out.println("1. Papatya");
        System.out.println("2. Karanfil");
        System.out.println("3. Gul");
        System.out.println("4. Orkide");
        System.out.println("Cicek turu giriniz: ");
        int cicekTur = scan.nextInt();
        System.out.println("Adet giriniz: ");
        double adet = scan.nextInt();

        if (cicekTur == 1) {
            tur = "Papatya";
            if (adet <= 49) {
                fiyat = adet * papatya;
            } else if (adet >= 50 && adet <= 100) {
                fiyat = papatya * adet;
                indirim = fiyat * 0.1;

            } else if (adet > 100 && adet <= 200) {
                fiyat = papatya * adet;
                indirim = fiyat * 0.25;

            } else {
                fiyat = papatya * adet;
                indirim = fiyat * 0.30;

            }

        } else if (cicekTur == 2) {
            tur = "Karanfil";
            if (adet >= 40 && adet <= 80) {
                fiyat = karanfil * adet;
                indirim = fiyat * 0.05;

            } else if (adet >= 80 && adet <= 150) {
                fiyat = karanfil * adet;
                indirim = fiyat * 0.1;

            } else {
                fiyat = karanfil * adet;
                indirim = fiyat * 0.2;

            }

        } else if (cicekTur == 3) {
            tur = "Gul";
            if (adet >= 30 && adet <= 60) {
                fiyat = gul * adet;
                indirim = fiyat * 0.05;

            } else if (adet >= 60 && adet <= 100) {
                fiyat = gul * adet;
                indirim = fiyat * 0.1;

            } else {
                fiyat = gul * adet;
                indirim = fiyat * 0.15;

            }

        } else if (cicekTur == 4) {
            tur = "Orkide";
            if (adet >= 20 && adet <= 50) {
                fiyat = orkide * adet;
                indirim = fiyat * 0.05;

            } else {
                fiyat = orkide * adet;
                indirim = fiyat * 0.1;

            }

        }

        double aratoplam = fiyat - indirim;
        double tax = aratoplam * 0.18;
        toplam = aratoplam + tax;

        if (cicekTur == -1) {
            System.out.println("Hatali secim");
        } else {
            System.out.println("^*^*^*^*^*^*Cicek Sepeti A.S.*^*^*^*^*^*^");
            System.out.println("-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Urun= " + tur);
            System.out.println("Urun adeti= " + (int) adet);
            System.out.println("Ara toplam= " + aratoplam);
            System.out.println("indirim= " + indirim);
            System.out.println("KDV= " + tax);
            System.out.println("Toplam= " + toplam);
            System.out.println("-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Alisveris yaptiginiz icin tesekkur ederiz...");

        }

    }
}

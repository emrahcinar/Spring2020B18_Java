package SelfZz;

import java.util.Scanner;

public class Kuyumcu_Par {

    public static double piramitHacim(double en, double boy, double yukseklik) {

        double hacim = en * boy * yukseklik / 3;
        return hacim;
    }

    public static double koniHacim(double r, double h) {

        double hacim = Math.PI * r * r * h / 3;
        return hacim;
    }

    public static double silindirHacim(double r, double h) {

        double hacim = Math.PI * r * r * h;
        return hacim;
    }

    public static double madenIsmiHesapla(String maden) {
        double ozgulAgirlik;

        if (maden.equalsIgnoreCase("altin")) {
            ozgulAgirlik = 19.3;
        } else if (maden.equalsIgnoreCase("gumus")) {
            ozgulAgirlik = 10.42;
        } else if (maden.equalsIgnoreCase("platin")) {
            ozgulAgirlik = 21.37;
        } else {
            ozgulAgirlik = -1;

        }

        return ozgulAgirlik;
    }

    public static void main(String[] args) {
        //0. Maden fiyatlarını gir
        //1. cisim ne?
        //2. a, b, h?
        //3. hacmi hesapl

        //4. Maden cinsi?
        //5. özgül ağırlığı seç     - fiyat çeç
        //6. ağırlığı hesapla
        //7. Tutar hesapl
        //8. Ekrana yazdır

        // - TL tutarını yaz.

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Piramit");
        System.out.println("2. Koni");
        System.out.println("3. Silindir");
        System.out.println("Bir Secim Yapiniz");
        int secim = scan.nextInt();
        String cisim = "";

        double hacim = 0;

        if (secim == 1) {
            cisim = "Piramit";
            System.out.print("a:");
            double a = scan.nextDouble();

            System.out.print("b:");
            double b = scan.nextDouble();

            System.out.print("h:");
            double h = scan.nextDouble();

            hacim = piramitHacim(a, b, h);

        } else if (secim == 2) {
            cisim = "Koni";
            System.out.print("r:");
            double r = scan.nextDouble();

            System.out.print("h:");
            double h = scan.nextDouble();
            hacim = koniHacim(r, h);
        } else if (secim == 3) {
            cisim = "Silindir";
            System.out.print("r:");
            double r = scan.nextDouble();

            System.out.print("h:");
            double h = scan.nextDouble();
            hacim = silindirHacim(r, h);
        } else {
            System.out.println("Hatalı seçim.");
            System.exit(0);
        }

        System.out.println("Maden cinsini giriniz..");
        String maden = scan.next();

        double ozgulAgirlik = madenIsmiHesapla(maden);
        if (ozgulAgirlik == -1) {
            System.out.println("Hatali bir giris yaptiniz.");
            System.exit(0);
        }


        double agirlik = hacim * ozgulAgirlik;

        double fiyat = 0;
        if (maden.equalsIgnoreCase("altin")) {
            fiyat = agirlik * 384.66;
        } else if (maden.equalsIgnoreCase("gumus")) {
            fiyat = agirlik * 3.5;
        } else if (maden.equalsIgnoreCase("platin")) {
            fiyat = agirlik * 170.71;
        }

        System.out.println("Cisim= " + cisim);
        System.out.println("Hacim= " + hacim + "cm3");
        System.out.println("Maden= " + maden);
        System.out.println("Ozgul Agirlik= " + ozgulAgirlik + " gr/cm3");
        System.out.println("Agirlik= " + agirlik + " gr");
        System.out.println("Fiyat= " + fiyat + " TL");

    }
}

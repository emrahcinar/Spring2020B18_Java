package SelfZz;

import java.util.Scanner;

/*
Bir hasta, kendi ölçtüğü, ateş, tansiyon ve kan şekeri değerlerine göre insülin almaktadır.
 Bu değerleri girerek alması gereken insülin miktarını hesaplayacak bir programa ihtiyacı vardır.
 Program adım adım geliştirilecek. Her adım için hesaplama kuralları ise şöyledir.
  Her adım ayrı bir program olarak yapılacak.
1. Soru: Hastanın kan şekeri 131-150 aralığında ise 100mg, 151-200 aralığında ise 140mg,
201-300 aralığında ise 175mg, 301 ve üzeri ise hasta acilen hastaneye gitmelidir.
2. Soru: Hastanın tansiyon ve ateş değerleri verilen baz şeker değerlerini şöyle etkilemektedir.
Hastanın tansiyonu 13’ün altındaysa ve ateşi 35.5-36 arasındaysa değerler değişmemektedir.
 Ateş, 36.1-37 aralığında ise insülin miktarı %10, 37.1-38 aralığındaysa %15 azaltılmalıdır.
  38.1’in üstündeyse hasta haneye başvurmalıdır.
Hastanın tansiyonu 13-15 arasındayken ateşi 35.5-37 arasındaysa %10 artırılmalı
, 37.1-39 aralığındaysa %20 artmalı, 39.1 ve üzeri ateşi varsa hasta acilen hastaneye başvurmalıdır.
Hastanın tansiyonu 15-18 arasındayken ateşi 35.5-36.5 arasındaysa %5 azaltılmalı,
 36.6-38 aralığındaysa %10 azaltılmalı, 38.1 ve üzeri ateşi varsa hasta acilen hastaneye başvurmalıdır.
18 üzeri tansiyonda hasta hastaneye başvurmalıdır.


 */
public class Kan_Sekeri_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kanSekeri = 0;

        double ates = 0;
        int insulin = 0;

        System.out.print("Kan sekeri:");
        kanSekeri = Integer.parseInt(sc.nextLine());
        if (kanSekeri > 131 && kanSekeri < 150) {
            insulin = 100;
        } else if (kanSekeri > 151 && kanSekeri < 200) {
            insulin = 140;
        } else if (kanSekeri > 201 && kanSekeri < 300) {
            insulin = 175;
        } else {
            System.out.println("Acil hastaneye gidilmeli");
        }
        System.out.println("Tansiyonu giriniz..");
        String maden = sc.next();
        double tansiyon = 0;
        if (tansiyon < 13) {
            if (ates > 35.5 && ates < 36) {
                System.out.println(insulin);
            }
            if (ates > 36.1 && ates < 37) {
                System.out.println(insulin * 0.1);
            }
            if (ates > 37.1 && ates < 38) {
                System.out.println(insulin * 0.15);
            }
            if (ates > 38) {
                System.out.println("Acil hastaneye gidilmeli");
            }
        }
        if (tansiyon < 13 && tansiyon > 15) {
            if (ates > 35.5 && ates < 37) {
                System.out.println(insulin * 0.1);
            }
            if (ates > 37.1 && ates < 39) {
                System.out.println(insulin * 0.2);
            }
            if (ates > 39) {
                System.out.println("Acil hastaneye gidilmeli");
            }
        }


        if (tansiyon < 15 && tansiyon > 18) {
            if (ates > 35.5 && ates < 36.5) {
                System.out.println(insulin / 0.05);
            }
            if (ates > 36.6 && ates < 38) {
                System.out.println(insulin / 0.1);
            }
            if (ates > 38.1) {
                System.out.println("Acil hastaneye gidilmeli");
            }
        }

    }
}

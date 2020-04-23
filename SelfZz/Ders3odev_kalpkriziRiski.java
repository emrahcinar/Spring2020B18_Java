package SelfZz;

import javax.swing.*;
import java.util.Scanner;

public class Ders3odev_kalpkriziRiski {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int risk = 0;

        System.out.println("sigara iciyormu?");
        String sigara = scan.next();
        System.out.println("Yasi 40 uzerindemi");

        String yasStr = scan.nextLine().trim();
        int yas = Integer.parseInt(yasStr);

        System.out.println("Alkol kullaniyormu?");
        String alkol = scan.next();

        System.out.println("Ailesinde kalp krizi geciren varmi");
        String kalpKrizi = scan.next();

        System.out.println("Koronavirüse yakalandınız mı?");
        String korona = scan.next();

        if (sigara.equalsIgnoreCase("evet")) {
            if (yas>40) {
                risk = 30;
            } else {
                if (alkol.equalsIgnoreCase("evet")) {
                    risk = 90;
                } else {
                    risk = 60;
                }
            }
        } else {
            if (kalpKrizi.equalsIgnoreCase("evet")) {
                risk = 70;
            } else {
                if (alkol.equalsIgnoreCase("evet")) {
                    if (korona.equalsIgnoreCase("evet")) {
                        risk =30;
                    }
                    else {
                        risk = 20;
                    }
                } else {
                    risk = 1;
                }
            }
        }

        System.out.println(risk);


    }
}


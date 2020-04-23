package SelfZ;

import java.util.Scanner;

public class Ders2_if_2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        double kazanc,vergi=0;

        System.out.print("Kazanç=");
        kazanc = sc.nextDouble();

        //500 altı vergi yok
        //500-1000 %5
        //1001-5000 %10
        //5001-10000 %15
        //10001 üstü  %20

        if (kazanc<=500) {
            vergi = 0;
        }
        else if (kazanc<=1000) { //kazanc>500 biliyorum ama 1000'den küçük mü?
            //501-1000 aralığındadır

            vergi = kazanc*0.05;
        }
        else  if (kazanc<=5000){ //(x>1000)
            //5001 - 10000
            vergi = kazanc*0.1;
        } else if (kazanc <= 10000) {
            vergi = kazanc*0.15;
        }
        else { //kazanc>10000
            vergi = kazanc*0.2;
        }

        double indirim=0;
        if (vergi>=1000) {
            indirim =  vergi*0.1;
        }

        if (vergi != 0) {
            System.out.println("Verig Ödenecek...");
        }
        vergi = vergi - indirim;
        System.out.println("Vergi=" + vergi);
        System.out.println("İndirim=" + indirim +"TL");
    }
}

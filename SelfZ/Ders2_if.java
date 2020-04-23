package SelfZ;

import java.util.Scanner;

public class Ders2_if {


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        double kazanc,vergi=0;

        System.out.print("Kazanç=");
        kazanc = sc.nextDouble();

        if (kazanc<=1000) {
            vergi = kazanc/10;
        }
        else  { //(x>1000)
            vergi = kazanc/8;
        }

        double indirim=0;
        if (vergi>=1000) {
            indirim =  vergi*0.1;
        }

        vergi = vergi - indirim;
        System.out.println("Vergi=" + vergi);
        System.out.println("İndirim=" + indirim +"TL");

    }


}

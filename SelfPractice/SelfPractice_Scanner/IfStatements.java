package SelfPractice.SelfPractice_Scanner;

public class IfStatements {
    public static void main(String[] args) {
       //String isim= "Levin";

        //System.out.println("Merhaba " + isim);
        //System.out.println("Nasilsin " + isim + "?");
        //System.out.println("Ne yapiyorsun " + isim+ "?");

        int a=70;
        int b=64;
        int c=56;
        boolean med1= (a>b && a<c) || (a<b && a>c);
        boolean med2= (b>c && b<a) ||(b<c && b>a);
        boolean med3= (c>a && c<b) ||(c<a && c>b);

        if(med1){
            System.out.println(a+" is true");
        }
        if(med2){
            System.out.println(b+" is true");
        }
        if(med3){
            System.out.println(c+" is true");
        }

    }
}

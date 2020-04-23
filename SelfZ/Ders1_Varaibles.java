package SelfZ;

import java.util.Scanner;

public class Ders1_Varaibles {
    public static void main(String[] args) {

        int i;
        System.out.println("Integer");

        //"789" -> 55, 56, 47
        //"Emrah" -> 69, 109,114, 97, 104

        char ch ='E';
        System.out.println((int) ch );

        int s = 789; // convert to binary -> 1100010101
        System.out.println("789" + 5);//7895
        int a = Integer.parseInt("789"); //Conversion from string to int
        System.out.println(a + 5);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.TYPE);


        double b = 789; // convert to binary -> 1100010101
        System.out.println("789" + 5.0);//7895.0
        double c = Double.parseDouble("789"); //Conversion from string to int
        System.out.println(c + 5);//794.0
        System.out.println(Double.BYTES);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.TYPE);

        System.out.println("---------------------------------");
        int x=69;
        int y=12;

        //%, *, -, /, +, =
        int z = (x + y);//81
        System.out.println(z);

        double p=5.5;

        double k = (p + y);//17.5
        System.out.println(k);

        //Öncelik /Precedence
        //() -> (casting)-> *,/ -> +,-

        int t =  (int) (p + y);//17
        System.out.println(t);

        t =  (int) p + y; //17
        System.out.println(t);

        double u, q = 5.7;
        u =  (int) p + q;   //10.7
        System.out.println(u);


        u =  (int) (p + q*6 - 10);//29.0 int e cast yaptigi icin
        System.out.println(u);

        double g=10, yy;
        yy =  g / 99 / p / q * 10 ;
        System.out.println(u);

        yy =  g * 10 / p / q / 99 ;
        System.out.println(yy);

        yy =  (int) p + q*6 + (Math.sin(Math.PI) - 10);
        System.out.println("->" + yy);
        yy =  (int) (p + q*6) + (Math.sin(Math.PI) - 10);
        System.out.println("->" + yy);

        String val = String.valueOf(u);
        System.out.println(val.charAt(0) + " % " + val.charAt(1));
        System.out.println((int) val.charAt(0) + " % " + (int) val.charAt(1));
        System.out.println(val);

        Scanner sc  =new Scanner(System.in);
        int a1, a2;
        int a3;

        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = a1*a2;
        System.out.println(a3);

    }
}

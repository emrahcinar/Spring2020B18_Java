package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int x=20;
        x +=10;//x = x=10+30
        System.out.println(x);

        x +=60;// x= x+60=90
        System.out.println(x);

        String schoolname="Cybertek";
        schoolname+=12345;// schoolname= schoolname+12345
        System.out.println(schoolname);

        System.out.println('a' + 'b');

        char ch1='a';
            ch1+='b';
        System.out.println(ch1);//character''

        int num='z'; //num=122
            num+='x';// num=num+120
                    // num= 122+120=242
        System.out.println(num);

        int A=100;
            A-=90;//10
        System.out.println(A);

        int B=200;
            B-=A;//  B = B-A=190
        System.out.println(B);

        System.out.println("==========================================================");

        int a=2;
        a*=3;

        System.out.println(a);//6

        int b= a*+10;
        //b= a=a*10=60
        System.out.println(b);//60
        System.out.println(a);//60

        int a1=100;
        int b1= (a1*=2)  + ++a1;
        //  b1 = 200 + 201;
        //  b1 = 401
        System.out.println(b1);

        int x1=10;
        int y = x1+=10*2; // x1= x1+20
                // x1 +=20; ==> 30
        System.out.println(y);

        int q=20;
        int p= q*=20*3;
            // q*=60;// q = q * 60;
        System.out.println(p);
        int num1=300;
        num1 /= 2;  //num1 = num1 /2
        System.out.println(num1);//150


        int num2=400;
            num2 /= 20+10;// num2=num2 / 30
                            // num2 = 400 / 30
                            //num2 = 13
        System.out.println(num2);//13


        //int a=100;
          //  a%=10;//a = a % 10 = 0

        int num3=300;
        num3 %=10+20; // num3 %=30
                    // num3 = num3 % 30
                    //  num3 = 300 % 30
                    //num3=0
        System.out.println(num3);

        int n1=400;
            n1 %= 3 * 5;// n1 %= 15
                        // n1 = n1 % 15
                        // n1 = 400 % 15
                        //400 / 15=26.66666
              //          reminder: 400 - ( 15 * 26)=10
        System.out.println(n1);






















    }
}

package officeHours.Practice_03_18_2020;

public class ShortHandOperators_Practice {
    public static void main(String[] args) {
        //+=: addition assignment
        int a=100;
        //a=a+200;
        a+=200; a=300;
        System.out.println(a);//300

        a+=200*3;//  a=900 (first carpma than toplama)
        System.out.println(a);//900

        // -= subtraction assigment
        //a=a-400;
        a-=400;//500
        System.out.println(a);//500

        int b=300;
        b -= 3*40;// b = 180
        // b-= 120; ==>180
        System.out.println(b);

        //*= : multiplication assigment

        int x = 5;
       //     x=x*3// 15
        x *= 3;// x=15
        System.out.println(x);//15

        x *=2+1;  //  x*=3;  x=x*3==>45
        System.out.println(x);//45

        // /=: division assigment:

        int n= 900;
        //n=n/3;
         n /= 3; // 300
        System.out.println(n);//300

        n /= 3 *5;// n= n/15==>20
        System.out.println(n);//20

        //  % = : remeainder assignment
        //   remainder: numarator-(denominator*wholenumber for result)

        int m=10;
        // m = m % 3; // 1

        m %= 3; // m=1
        System.out.println(m); // 1

        int y=300;
        y %= 3*5;  //y %=15 ==> y= y%=15 ==> y=0
        System.out.println(y);

        int t= 400;
            t%=10*2; // t %= 20 ==> t = t % 20; ==> 0
        System.out.println(t); // 0
































    }
}

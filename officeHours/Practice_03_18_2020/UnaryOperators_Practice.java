package officeHours.Practice_03_18_2020;

public class UnaryOperators_Practice {
    public static void main(String[] args) {
        //post: first passes the current value then increases by 1
        int a = 20;
        System.out.println(a++); //20
        System.out.println(a);

            int b= 30;
            int c= b--; // c=30, b=29
        System.out.println(b); // 29
        System.out.println(c); // 30

        int d=40;
        int e= d++; // e= 40, d= 41
        System.out.println(d);//41
        System.out.println(e);//40

        // pre :changes the value immediatelly by 1

        int x = 200;
        System.out.println(--x);//199
        System.out.println(x);//199

        int z = 100;
          z=z++ + --z - z-- + ++z;
        //z=100 + 100 - 100 +  100; ==>200
        System.out.println(z);//200

        int u= 900;
        int r = - ++u + ++u + -u++;
        //  r = - 901 + 902 + -902;
        // r = 1 + -902
        // r = 1-902 ==> -901
        System.out.println(r);//901
        System.out.println(u);//903






























    }
}

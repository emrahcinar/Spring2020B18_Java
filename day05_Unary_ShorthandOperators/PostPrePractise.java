package day05_Unary_ShorthandOperators;

public class PostPrePractise {
    public static void main(String[] args) {
        int a =50;

        a=--a + a++ + a-- + a++;
        // 49 + 49  + 50 +  49 = 197
        System.out.println(a);//197
        System.out.println(++a);//198
        System.out.println(a++);//198
        System.out.println(a);//199

        int x=4;
        int y= x * 4 - x++ ;
            //4  *  4 - 4 ;
        System.out.println(y);//12

        int b=1; //0
        b= -b-- + b++ / -b-- * --a ;
      //b=  -1  +  0  /  -1  *  -1 ;
      //     -1 + 0 * -1
      //       -1 + 0 = -1

        System.out.println(b);









    }
}

package day05_Unary_ShorthandOperators;

public class PrimitiveCastings {
    public static void main(String[] args) {

        //implicit casting : done automaticly
        int a=10;
        long b=a; // implicit casting is done automaticlly
                // b = 10L;
        //int c=b ; // b is still long datatype
        int a1=100;
        long b1=(long) a1; // manually doing the implicit casting

        //Explicit casting
            int Inum=100;
            byte Bnum=(byte)Inum;

            short Snum=(byte)Inum;

            double Dnum=5.5;
           // float Fnum=(float)Dnum; // 5.5
            float Fnum=(int) Dnum;
                //Fnum=(int) 5.5
                //Fnum=5
               // Fnum= 5.0
           System.out.println(Dnum);//5.0

        double D1 = 10.5;
        long L1 = (long) ((float) D1);
        System.out.println(L1);//10

        float F1 = 60.5f;
        int I1=(int)F1; // prefered
        System.out.println(I1);//60

        long largeNumber=99999999999L;
        int intNum=(int)largeNumber;
        System.out.println(intNum);//it gives diffrent number because 999999999999 is out of int range
                                    //1215752191
        char ch1= 'a';
        short sh1 = (short) ch1;//97
        System.out.println(sh1);
        char ch2= 23456;
        double dbl1=ch2;// 23456.0
        System.out.println(dbl1);

        int z1 = 10;
        double t1b=z1; //10.0
        short y1=(short)z1;





    }
}

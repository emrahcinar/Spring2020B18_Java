package SelfZ;

public class Ders3_method_3 {
    //method
        //1. ne değer alır(parameter) ve verir (return value;), işi vardır yapar.
        //2. değer alır ama vermez. Parametreli ama returnsüz
        //3. değer almaz lamaz ama verir. Parametresiz returnlü
        //4. Hem değer laıp hemde verenler,hem parametreli hemde returnlü

    static void d1(){
        System.out.println("       *");
        System.out.println("      ***");
    }
    static void d2(){
        System.out.println("       *");
        System.out.println("      ***");
        System.out.println("     *****");
    }
    static void d3() {
        System.out.println("       *");
        System.out.println("      ***");
        System.out.println("     *****");
        System.out.println("    *******");
    }

    static void g1(){
        System.out.println("      ***");
        System.out.println("      ***");
        System.out.println("      ***");
    }
    static void g2() {
        System.out.println("      ***  *");
        System.out.println("      ******");
    }

    static void govde(){
        g1();
        g2();
        g1();
    }

    static void dal(){
        d1();
        d2();
        d3();
    }

    static public void zemin1(){
        System.out.println("#########################################");
    }
    static public void zemin2(){
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # ");
    }

    //1354,5.6
    //7895, 0x1ab12, sum
    //
    //Assembly: SUM, 5,6;
    //          LOAD a,sum;
    //Java: a = 5 + 6;

    static void agac1(){
        dal();
        govde();
        zemin1();
    }

    static void agac2(){
        d2();
        dal();
        govde();
        zemin2();
    }

    public static void main(String[] args) {

        agac1();
        System.out.println();

        agac2();
        System.out.println();

    }

}

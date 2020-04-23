package day23_Methods;
//
public class Methods {
    /*
    step1:Hello Cybertek
    step2:Hello world 5 times
    Step3:Hello Batch18
    Step 4:Hello world 5 times
    Step5:Hello Saim
     */
    public static void main(String[] args) {

        System.out.println("Hello Cybertek");
        printHello5();
        System.out.println("Hello Batch18");
        printHello5();
        System.out.println("Hello Saim");
        printHello5();
        System.out.println("=====================================================");

        evenNumbers1_100();
        OddNumbers1_100();
    }


    public static void printHello5() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }

    public static void evenNumbers1_100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
        System.out.println();

    }
        public static void OddNumbers1_100(){
            for (int i=1; i<=100;i++){
                if (i%2!=0) {
                    System.out.print(i + " ");
        }

}
}}

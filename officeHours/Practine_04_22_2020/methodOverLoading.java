package officeHours.Practine_04_22_2020;

public class methodOverLoading {
    public static void main(String[] args) {
        double num1 = method1(20);
        System.out.println(num1);
    }

    public static void method1() {
        System.out.println("Hello world");
    }

    public static double method1(int a) {
        System.out.println("Hello Cybertek");
        return 10;
    }

    public static void method1(int a, int b) {
        System.out.println("Hello Batch 18");
    }
}

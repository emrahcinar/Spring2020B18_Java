package day26_MethodOverloading;

public class MethodOverLoading4 {
    public static void main(String[] args) {//only original one will execute
        System.out.println("String");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(int[] args) {
        System.out.println("int");
    }
}

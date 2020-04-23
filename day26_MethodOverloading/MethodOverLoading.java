package day26_MethodOverloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        method(10);//"original method"
        method(10.0);//
    }
    public static void method(int a){
        System.out.println("Original method");
    }
    public static void method(double a){
        System.out.println("Overloaded method");
    }
}

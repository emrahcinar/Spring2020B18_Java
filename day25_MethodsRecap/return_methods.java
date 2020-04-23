package day25_MethodsRecap;

public class return_methods {
    public static void main(String[] args) {
        System.out.println(  max(10,9));
        System.out.println(  max2(10,9));
    }
    public static int max(int a, int b){

        int max=0;
        if (a>=b){
            max=a;
        }else{
            max=b;
        }

        return max;
    }

    public static int max2(int a, int b){
        if (a>=b){
            return a;
        }

        return b;
    }
}

package SelfPractice.SelfPractice_Scanner;

public class ScannerStringClass {
    public static void main(String[] args) {


        String str="Cybertek";
        String A="Cybertek";
        String B="Cybertek";
        System.out.println(A==B);//true both String literals are stored at String pool


       String str2=new String("Cybertek");
        System.out.println(str==str2);//false  Diffrent memory location

        String str3=new String("Cybertek");
        System.out.println(str2==str3);//false
























    }
}

package SelfZ;

import java.util.Scanner;

public class Ders3_method {

    //void: değer döndürmeyen yönetem
    static void  hi(){
        System.out.println("Wellcome, TestMaster v1.");
    }

    static void  bye(){
        System.out.println("Bye bye");
    }

    static int yasSor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yaşınız:");
        int yas = sc.nextInt();

        return yas;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        hi();

        int yas = yasSor();

        if (yas<18) {
            System.out.println("Yaşınız bu site için uygun değil.");
            bye();
            return;
        }

        System.out.println("Sisteme açıldı...");
        sc.nextLine();

        bye();
    }
}

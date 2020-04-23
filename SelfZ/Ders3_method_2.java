package SelfZ;

import java.util.Scanner;

public class Ders3_method_2 {

    static void hi(){
        System.out.println("Wellcome, TestMaster v1.");
    }

    static void bye(){
        System.out.println("Bye bye bye");
    }

    static int login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcıadı:");
        String  kuladi = sc.nextLine();

        System.out.print("Şifre:");
        String  sifre = sc.nextLine();

        int id;
        if (kuladi.equals("ali") && sifre.equals("1234"))
            id=1;
        else if (kuladi.equals("veli") && sifre.equals("789"))
            id=2;
        else
            id=-1;

        return id;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id;
        hi();
        id=login();

        if (id==-1) {
            System.out.println("Login başarısız.");
            bye();
            return;
        }
        else {
            if (id == 1)
                System.out.println("Kullanici:ali");
            else if (id==2)
                System.out.println("Kullanici:veli");
            else {
                System.out.println("Hatalı id:" + id);
                bye();
                return;
            }
        }

        System.out.println("Sisteme açıldı...");
        sc.nextLine();

        bye();
    }
}

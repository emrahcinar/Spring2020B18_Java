package replits;

import java.util.Scanner;

public class replit_Arrays_Printfirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        for (int i=0;i<=words.length-1;i++){
            words[i]=words[i].charAt(0)+""+words[i].substring(words[i].length()-1);
            System.out.println(words[i]);
        }

















/*
for (int i=0;i<=words.length;i++){
    words[i]=words[i].charAt(0)+""+words[i].substring(words[i].length()-1);
    System.out.println(words[i]);
}

 */
























        }
    }

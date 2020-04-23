package replits;

import java.util.Scanner;

public class replit_90 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

int count =0;
for (int i=0;i<word.length()-3;i++){
    if (word.substring(i).startsWith("jav")&&word.charAt(i+3)=='a')
        count++;
}
        System.out.println(count);




















        }}

























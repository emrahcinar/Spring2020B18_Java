package replits;

import java.util.Scanner;

public class replit_64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

int numOfCharacters=word.length();
String middle="";
if(numOfCharacters%2!=0&&numOfCharacters>=3){
    middle=""+word.charAt(numOfCharacters/2);
    System.out.println(middle);
}else if(numOfCharacters==1){
    middle=""+word.charAt(0);
    System.out.println(middle+middle+middle);
}else if(numOfCharacters%2==0&&numOfCharacters>=4){
    middle+=word.substring(numOfCharacters/2-1,numOfCharacters/2+1);
    System.out.println(middle);
}else if(numOfCharacters==2) {
    middle += word.substring(0, 2);
        System.out.println(middle + middle);
    }
}}
















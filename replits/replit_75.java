package replits;

import java.util.Scanner;

public class replit_75 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String word=scan.next();

        String result="";
        boolean endWithX=(""+ word.charAt(word.length()-1)).equalsIgnoreCase("x");
        boolean startWithx=(""+ word.charAt(0)).equalsIgnoreCase("x");

        if (endWithX&&startWithx){
            result=word.substring(1,word.length()-1);
        }else if(endWithX){
            result=word.substring(0,word.length()-1);
        }else if(startWithx){
            result=word.substring(1);
        }else{
            result=word;
        }
        System.out.println(result);

































    }
}

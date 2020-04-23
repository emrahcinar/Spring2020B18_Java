package replits;

import java.util.Scanner;

public class replit_65 {
    public static void main(String[] args) {

               Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String midCharacter="";

        int wholeword=word.length();
        int midnumber=wholeword/2;

        if (wholeword%2!=0&&wholeword>=5){
            midCharacter=midCharacter+word.charAt(midnumber-1)+word.charAt(midnumber)+word.charAt(midnumber+1);
        }else{
            midCharacter="invalid";
        }


        System.out.println(midCharacter);


































    }
}

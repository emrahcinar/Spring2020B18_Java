package replits;
import java.util.*;
public class replit_113 {
    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        int longestword=words[0].length();
        String longest="";

        for(int i = 0; i < words.length;i++){

            if(words[i].length()>longestword){
                longestword=words[i].length();
                longest=words[i];
            }
        }

        System.out.println(longest);






    }
}

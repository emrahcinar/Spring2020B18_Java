package replits;
import java.util.*;
/*
Given a String variable sentence, write code to type each word in separate lines.
sentence -> "Java is fun"
Print
Java
is
fun
 */
public class replit_106 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

String[]str=sentence.split(" ");
for (String each:str){
    System.out.println(each);
}

























    }
}

package replits;
import java.sql.SQLOutput;
import java.util.*;
public class replit_105 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


for (int i=0; i<5;i++) {
    String first = words[i].substring(0, 1);
    String last = words[i].substring(words[i].length() - 1);
    words[i] = first + last;
}
    System.out.print(Arrays.toString(words));

}









    }


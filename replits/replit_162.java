package replits;
/*
This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
It returns true only if both a and b are true or c is true.
https://en.wikipedia.org/wiki/Truth_table
 */
public class replit_162 {
    public static void main(String[] args) {
    boolean x=    threeLocks(false,true,true);
        System.out.println(x);
    }

    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        return (a && b) || (c);

    }//end threeLocks
}

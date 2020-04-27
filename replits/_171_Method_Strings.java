package replits;
/*
 This method gets a string and an int, it returns a string.
what it dose is limit the inputted string to a cretin number of characters.
for example:
limit("abcd",2)
returns "ab"
limit("bla bla",3)
returns "bla"
 */
public class _171_ {
    public static void main(String[] args) {

        System.out.println(limit("abcd",2));

    }
    public static String limit(String text, int maxLength) {

return text.substring(0,maxLength);



    }
}

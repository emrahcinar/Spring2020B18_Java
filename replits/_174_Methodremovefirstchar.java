package replits;
/*
The method gets a string and returns a string minus the first letter.
for example:
removeFirst("aaa")
returns "aa"
 */
public class _174_Methodremovefirstchar {
    public static void main(String[] args) {

        System.out.println(removeFirst("selcuk"));
    }
    public static String removeFirst(String target) {

return target.substring(1,target.length());

    }

}

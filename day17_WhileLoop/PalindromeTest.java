package day17_WhileLoop;

/*
write a program that can check if a string
 */
public class PalindromeTest {
    public static void main(String[] args) {

        String str = "Level";

        String reversedStr = "";//store the reversed version of str

        int index = str.length() - 1; //last index number

        while (index >= 0){
            reversedStr+=str.charAt(index);
            index--;
        }
        System.out.println(reversedStr);

        boolean palindrome=reversedStr.equalsIgnoreCase(str);
        System.out.println(palindrome);

    }
}

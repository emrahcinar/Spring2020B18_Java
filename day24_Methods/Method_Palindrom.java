package day24_Methods;

/*
  1. write a methods that can return the maximum number between two numbers
            Ex: Max(10, 20) ==> 20

 */
public class Method_Palindrom {
    public static void main(String[] args) {
        String word = "Cybertek";
        Max(word);
    }
    public static void Max(String word) {
        String reserved = "";
        int index = word.length() - 1;
        while (index >= 0) {
            reserved += word.charAt(index);
            index--;
        }
        System.out.println(reserved);

        boolean palindrome = reserved.equalsIgnoreCase(word);
        System.out.println(palindrome);

    }


}

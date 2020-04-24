package replits;

import java.util.Scanner;

public class _154 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE

        int a = 10000001;

        String numStr=""+num;
        String result="";
        for (int i =numStr.length()-1; i >=0 ; i--) {
            result+=numStr.charAt(i);
        }
        boolean resultBoolean=true;
        if(numStr.equalsIgnoreCase(result)){
            resultBoolean=true;
        }else {
            resultBoolean=false;
        }
        System.out.println(resultBoolean);
    }
}


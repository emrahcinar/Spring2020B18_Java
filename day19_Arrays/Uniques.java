package day19_Arrays;

public class Uniques {
    public static void main(String[] args) {

        /*
        1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
		String alpha="AABCC";
String result1="";
int find=alpha.indexOf("B");

for (int i=find; i>=alpha.indexOf("B"); i--) {
    result1 += alpha.charAt(i) ;
}
        System.out.println(result1);
         */

        String str = "AABCCDDEF";
        String result = "";

        for (int j = 0; j <= str.length() - 1; j++) {
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {//if unique
                result += str.charAt(j);
            }
        }

        System.out.println(result); //BEF
        System.out.println("================================================================================");





















    }
}


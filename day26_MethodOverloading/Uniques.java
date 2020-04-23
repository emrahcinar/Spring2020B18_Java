package day26_MethodOverloading;

public class Uniques {
    public static void main(String[] args) {
        String str = "ABBCDB";
        String result = "";//A
        //A
        for (int i = 0; i < str.length(); i++) {
            int num = Frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);

        String str2="Cybertek";
        String result2=uniques(str2);

        System.out.println(result2);


    }
public static String uniques(String str){

    String result = "";
    //A
    for (int i = 0; i < str.length(); i++) {
        int num = Frequency(str, str.charAt(i));
        if (num == 1) {
            result += str.charAt(i);
        }
    }
        return  result;

}




    public static int Frequency(String str, char ch) {//count the ch's frequency
        char[] arr = str.toCharArray(); // [A,A,A]

        int count = 0;
        for (char each : arr) {//3 times occur in the string
            if (each == ch) { // each:A,B,B
                count++;
            }
        }
        return count;
    }
}

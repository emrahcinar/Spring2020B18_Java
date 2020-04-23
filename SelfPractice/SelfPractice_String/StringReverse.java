package SelfPractice.SelfPractice_String;
/*
String=Java
output=avaj
 */
public class StringReverse {
    public static void main(String[] args) {


        String str="Java";
                //  0123
        String reserve1=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        String reserve2=str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);

        System.out.println(reserve1);










    }
}

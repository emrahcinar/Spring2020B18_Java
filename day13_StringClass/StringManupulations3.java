package day13_StringClass;

public class StringManupulations3 {
    public static void main(String[] args) {

 //indexOf(Value): returns the index number of the first occured chracter as an int
       // if the value is not exist in the string,it will return negative number

        String str="I like Java programming";
        //          01234567
        int num1=      str.indexOf("J");

        System.out.println(num1);

        String str2="Cybertek school is awesome";
        //           0123456789
        int firstS=str2.indexOf("s");//9
        int secondS=str2.indexOf("is")+1;
        //          str2.indexOf("is")==>returns the index number of i
        System.out.println(firstS);
        System.out.println(secondS);

        int maxIndexnumber="Cybertek".length() -1 ;//8 -1
        System.out.println(maxIndexnumber);

        String names="Muhtar";
      int a1=  names.indexOf("Good Guy");
        System.out.println(a1);

        String fullname="Kuzzat Altay";
        String firstName=fullname.substring(0,fullname.indexOf(" "));
        String lastName=fullname.substring(fullname.indexOf(" ")+1);

        System.out.println(firstName);
        System.out.println(lastName);


























    }
}

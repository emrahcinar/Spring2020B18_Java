package day13_StringClass;

public class StringLiteralsPractice {
    public static void main(String[] args) {

        String str1="Cat";
        String str2=new String("Cat");// Java Heap

        System.out.println(str1+" : "+str2);

        System.out.println(str1==str2);//two diffrent object, false

        String str3 = "Cat";   //String pool

        System.out.println(str1==str3);//true

        String str4=new String("Cat");
        System.out.println(str2==str4);// two independen object, false

        String s1="Java";//String pool.immutable we cannot modified
        s1="javaScript";//new object will be created in memory

        System.out.println(s1);

        String s2="Java";//no new object will be created in the memory

        System.out.println(s1==s2);//false
              //   "Javascript=="Java"==>false




























    }
}

package officeHours.Practice_04_01_2020;

public class litteral_new {
    public static void main(String[] args) {
        String s1="java";//String literal
        String s2="java";//String literal

        String s3=new String("Java");
        String  s4=new String("Java");

        System.out.println(s1==s2);//true , same objects
        System.out.println(s1==s3);//false, different object at different memory
        System.out.println(s3==s4);//false, different objects













    }
}

package SelfPractice.SelfPractice_Loop;

public class LoopPractice2 {
    public static void main(String[] args) {


for (int i =1; i<=100; i++){
   if (i%3==0&&i%5==0)
    System.out.print(i+", ");
}
        System.out.println("=======================================================================================");



String name="anna";
String result="";

int lastindex=name.length()-1;
for (int i=lastindex;i>=0;i--){
    result+=name.charAt(i);
}
        System.out.println(result);
if(name.equalsIgnoreCase(result)){
    System.out.println(name+" is palindrome");
}else{
    System.out.println(name+" isnt palindrome");
}


        System.out.println("========================================================================");
/*
        1. write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"
        2. write a program that can return the frequency of the characters ina string
        Ex: "AABCBCA" ==> "A3B2C2"
        Hint: You need nested loops
        Collapse
 */


String alpha="AABCC";
String result1="";
int find=alpha.indexOf("B");

for (int i=find; i>=alpha.indexOf("B"); i--) {
    result1 += alpha.charAt(i) ;
}
        System.out.println(result1);





















    }
}

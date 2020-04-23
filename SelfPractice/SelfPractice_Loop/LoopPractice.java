package SelfPractice.SelfPractice_Loop;

public class LoopPractice {
    public static void main(String[] args) {
/*
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world "+i);
        }
 */
        for (int i = 1; i <=10; i++) { // 1,2,3,4,5,6,7,8,9,10
                  //            i+=2         1,3,5,7,9,11
            System.out.println(i+" : "+(i*i));
    }
    System.out.println("=======================================================================================");

        /*
        odd  numbers 1~100 in a signle line seperated by space
                    1 3 5 7 9 ......
         */

        String resultOdd="";
        for (int number = 1 ;number<=100 ; number+=2){
           // System.out.print(number+" ");
            resultOdd+=number+" ";

        }
        System.out.println(resultOdd);

/*
even numbers 1~100 in a signle line seperated by space
 */
String resultEven=" ";

        for (int number=2; number<=100;number+=2){
            resultEven+=number+" ";
        }

        System.out.println(resultEven);

        System.out.println("=======================================================================================");
String str="java is fun";

String reverse1=""+str.charAt(3)+str.charAt(2)+str.charAt(2)+str.charAt(0);

String reverse2="";
int maxIndex=str.length()-1;
for (int i=maxIndex;  i>=0 ; i--){
 //   System.out.print( str.charAt(i));
reverse2+=str.charAt(i);
}
System.out.println(reverse2);











































































































































}}

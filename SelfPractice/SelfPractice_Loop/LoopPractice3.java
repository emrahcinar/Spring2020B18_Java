package SelfPractice.SelfPractice_Loop;


import java.util.Scanner;

public class LoopPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*

        System.out.println("Enter a word");
        String word=scan.nextLine();
        String result="";
        for (int i=word.length()-1;i>=0;i--){
            result+=word.charAt(i);
        }
        System.out.println(result);

        boolean palindrome=word.equalsIgnoreCase(result);
        System.out.println(palindrome);


        System.out.println("==============================================================");

        System.out.println("Enter first name");
        String name=scan.next();

        System.out.println("Enter last name");
        String lastName=scan.next();

        String result1=""+name.charAt(0)+lastName.charAt(0);
        System.out.println(result1.toUpperCase());

String upperCase="";
String lowerCase="";

for (char ch='A'; ch<='Z';ch++){
    upperCase+=ch;
}
        System.out.print(upperCase);
        System.out.println();
        for (char ch='a'; ch<='z';ch++){
            lowerCase+=ch;
        }
        System.out.print(lowerCase);
        System.out.println();
        String result="";
        for (int i=0; i<=upperCase.length()-1;i++){
            result+=""+upperCase.charAt(i)+lowerCase.charAt(i)+" ";
        }
        System.out.println(result);
System.out.println("==============================================================");
String word=scan.next();
String result="";
for (int i=word.length()-1; i>=0 ;i--){
    result+=word.charAt(i);
}
        System.out.println(result);
boolean palin= word.equalsIgnoreCase(result);
        System.out.println(palin);

        String upperCase="";
        String lowerCase="";
for (char ch='A'; ch<='Z';ch++){
    upperCase+=ch;
}
        System.out.print(upperCase);
        System.out.println();

for (char ch='a'; ch<='z'; ch++){
   lowerCase+=ch;
}

        System.out.print(lowerCase);
        System.out.println();
String result1="";

for (int i=0; i<=upperCase.length()-1;i++){
    result1+=""+upperCase.charAt(i)+lowerCase.charAt(i)+" ";

}
        System.out.println(result1);
        */

        int sum1=0;
        int sum2=0;

        for (int i=0; i<=100; i++){
            if (i%2==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println("enter number");
        int num=scan.nextInt();
        int sum=0;
        for (int i=1; i<=100; i++){
            sum+=i;
        }


        System.out.println(sum);






















































    }
}

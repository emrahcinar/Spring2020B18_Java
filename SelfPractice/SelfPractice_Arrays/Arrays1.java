package SelfPractice.SelfPractice_Arrays;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        int num[]={10,20,30,40,50};

        int max=num[0];
        int min=num[0];

for (int i=1;i<num.length;i++){
    if (max<num[i]){
        max=num[i];
    }else if (min>num[i]){
        min=num[i];
    }
}
        System.out.println(max);
        System.out.println(min);


        System.out.println("====================================================================");


int[] number={15,25,35,45,55,65,75};
int result=0;
for (int i=0;i<number.length-1;i++){
    if (number[i]>result){
        result+=number[i];
    }
}
        System.out.println(result);








    }
}

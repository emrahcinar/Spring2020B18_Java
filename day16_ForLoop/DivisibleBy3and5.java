package day16_ForLoop;
/*
1. write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5
2. write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5
 */
public class DivisibleBy3and5 {
    public static void main(String[] args) {

        for (int i=1 ; i <= 100 ; i++){

            //if( i % 2 == 0 ){  30 60 90
            if( i % 2 != 0 ){ // 15 45 75
                if ( i%3==0 && i %5==0){
                    System.out.print(i + " ");
                }
                }
        }



















    }
}

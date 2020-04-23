package day07_Ifstatements;
/*
3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)

 */
public class MinNumber {
    public static void main(String[] args) {

        double a=600;
        double b=500;
        double c=400.5;

        boolean aMin= a<b && a<c;//if a is less than both b and c , then a is minimum
        boolean bMin= b<a && b<c;//if b is less than both a and c , then b is minimum
        boolean cMin= c<a && c<b;//if c is less than both a and b , then c is minimum

        if(aMin){
            System.out.println(a+ " is the mininmum number");
        }
        if(bMin){
            System.out.println(b+ " is the mininmum number");
        }
        if(cMin){
            System.out.println(c+ " is the mininmum number");
        }

































    }
}

package day10_Switch_Scanner;

public class switchStatement_Practice2 {
    public static void main(String[] args) {

        int num=0; // became 2+10-5=7
        switch(3){
            case 1:
                num+=3;
            case 2:
                num +=2;
                break;
            case 3:
                num +=10;
            default:
                num-=5;
                break;
        }
        System.out.println(num);























    }
}

package day18_nestedLoops;

public class do_While_Practice {
    public static void main(String[] args) {
        /*
        Print all the even numbers 0~100 in the same line seperated by a space
         */

        int num = 0;
        do {
            if (num % 2 != 0) {

                System.out.print(num + " ");
            }
            num++;
        } while (num <= 100);
        System.out.println();
        System.out.println("============================================================================");

        int i = 1;
        do {

            System.out.println(i);
            i++;
        } while (i <= 5);

        System.out.println("============================================================================");


        int z=1;
        do{

            System.out.println(z);
            if(z==3){
                break;
            }
            z++;
        }while(z<=5);
        System.out.println("============================================================================");

int y=1;
    do{
        if(y==3){
        y++;// need to make sure that the iterator is not skipping, so that the condition will eventually be false
                continue;
        }
        System.out.println(y);
        y++;
    }while (y<=5);

        System.out.println("============================================================================");

int t=1;
do{
    if (t%2!=0){
        t++;// to make sure that the iterator (increament) is not skipping
        continue;
    }
    System.out.print(t+" ");
    t++;
}while (t<=100);




























    }
}

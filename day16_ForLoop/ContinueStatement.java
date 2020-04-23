package day16_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i=1; i<=5 ; i++){  //   i=1,2,3,4,5
            if(i==3){
                continue;
            }

            System.out.println(i);
        }

        for (int i=0; i<=20 ; i++){
            if ( i%2!=0 ){  //if ( i%2!=0 )for odd numbers
                continue;// skips all the odd numbers,prints even number
            }
            System.out.print(i+" ");
        }






















    }
}

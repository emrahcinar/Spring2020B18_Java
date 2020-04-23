package replits;

import java.util.Scanner;
/*
Create a method called plus_minus that gets an array of ints (int[]),
 it outputs how many negative , positive and zero numbers are in the array.
for example:
plus_minus (new int[]{1,2,55,-9,-2,0});
output:positives:3, negatives:2, zeros:1
 */

class Main {
    public static int[] plus_minus(int[] abc) {

int [] arr1={0,0,0};

        for (int i=0;i<=abc.length-1;i++){
            if (abc[i]>0){
               arr1[0]++;//1 2 55
            }else if (abc[i] == 0) {
              arr1[1]++; // 0
            } else {  //-9 -2
               arr1[2]++;

            }
        }
       // System.out.println("positives:"+poscount+", negatives:"+negcount+", zeros:"+zerocount);
return arr1;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }
        int[] arr2={0,0,0};
        arr2=plus_minus(arr);
        System.out.println("positives:"+arr2[0]+", negatives:"+arr2[1]+", zeros:"+arr2[2]);
      //  plus_minus(arr);
    }//end main


}
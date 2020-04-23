package officeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray {
    public static void main(String[] args) {
//REVERSE ARRAY
        int a = 100;
        int[] arr = {100, 200, 300};
        //         0   1   2

        System.out.println(arr[1]);//200


        for (int i = 0; i < 3; i++) {//i:index num of elements
            //  System.out.println(i);   // 0 1 2
            int num = arr[i];
            System.out.println(num);//100 200 300
        }
        System.out.println("=============================================================");
        int j = 0;
        while (j < 3) {
            int num = arr[j];
            System.out.println(num);//100 200 300
            j++;
        }
        System.out.println("=============================================================");

        String[] names = {"John", "Aaron", "Luosie","Muhtar"};//3(size)

        int lenght = names.length;//3
        String[] namesRev = new String[lenght];//{null,null,null}
        //                                      0     1    2
     /*       //   i          k
        namesRev[0] = names[2];
        namesRev[1] = names[1];
        namesRev[2] = names[0];
      */
/*
        int k =lenght-1;
        for (int i = 0; i < lenght; i++) {
            namesRev[i] = names[k];
            k--;
     }
 */
            int i=10;
            int k=lenght-1;
            while(i<lenght){
                namesRev[i] = names[k];
                i++;
                k--;
            }

        System.out.println(Arrays.toString(namesRev));//[Luosie, Aaron, John]
    }
}

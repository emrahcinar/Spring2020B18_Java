package day22_Arrays_Loops;

public class NestedLoops {
    public static void main(String[] args) {


//                 0   1     0   1   2     0   1   2
        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H'}};
        //          0           1               2
//each inde in arr2D must be single dimensional array

        /*    j  i
        arr2D[0][0]
        arr2D[0][1]

        arr2D[1][0]
        arr2D[1][1]
        arr2D[1][2]

        arr2D[2][0]
        arr2D[2][1]
        arr2D[2][2]
        arr2D[2][3]
         */



        //arr2D[0]==>{'A','B'}

        for (int i = 0; i < arr2D[0].length; i++) {
            System.out.println(arr2D[0][i]);//A B
        }

//arr2D[1]==>{'C','D','E'}

        for (int i = 0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[1][i]);  // C D E
        }

        //arr2D[2]==>{'F', 'J', 'H'}
        for (int i = 0; i < arr2D[2].length; i++) {
            System.out.println(arr2D[2][i]);  // F J H
        }

        System.out.println("=================================================================");

        for (int j=0;j<arr2D.length;j++) {// j:index number of 1D array
            for (int i = 0; i < arr2D[j].length; i++) {  //arr2D[0] , arr2D[1] , arr2D[2]
                System.out.println(arr2D[j][i]);
            }
        }




















    }
}

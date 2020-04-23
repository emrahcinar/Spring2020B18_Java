package officeHours.Practice_04_15_2020;

public class NestedLoops {
    public static void main(String[] args) {
        char[][]arr2D={  {'A','B'} , {'C','D','E'} ,{'F','J','H'}  };
        //                   0              1             2

        for (int j=0;j<arr2D.length;j++) {
            //arr2D[0]
            for (int i = 0; i < arr2D[j].length; i++) {
                System.out.println(arr2D[j][i]);// A B
            }
        }
        System.out.println("=============================================================================");

        //arr2D={  {'A','B'} , {'C','D','E'} ,{'F','J','H'}  };
        //             0              1             2

for ( char[] each1DArray   :  arr2D ){
   for (char eachElement : each1DArray){
       System.out.println(eachElement);
   }
}











    }
}

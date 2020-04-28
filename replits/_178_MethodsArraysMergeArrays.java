package replits;
/*
mergR merges two arrays into one.
it gets two int arrays and returns an int array
for example:
mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]
mergR([1,2],[6,8])
returns [1,2,6,8]
hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).
loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).
do the same for the second array.
*/

import java.util.Arrays;

public class _178_MethodsArraysMergeArrays {
    public static int[] mergR(int[] a,int[] b) {

int[]arr=new int[a.length+b.length];

for (int i=0;i<a.length;i++){
    arr[i]=a[i];//i=0,arr[0]=a[0];i=1,arr[1]=a[1];i=2,arr[2]=a[2];i=3,arr[3]=a[3];
}
for (int i=0;i<b.length;i++){
    arr[a.length+i]=b[i];//i=0,arr[4]=b[0];i=1,arr[5]=b[0];i=2,arr[6]=b[2];i=3,arr[7]=b[3];
    //  -------------              -               -               -               -
}
return arr;
    }//end mergR

    public static void main(String[] args)
    {
int[] a={3,4,5};
int[] b={6,7,8,9,1};
        System.out.println(Arrays.toString(mergR(a,b)));


}
}



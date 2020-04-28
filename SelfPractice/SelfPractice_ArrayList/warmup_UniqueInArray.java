package SelfPractice.SelfPractice_ArrayList;

import java.util.ArrayList;

/*
write a program that can print out the unique elements from an int array
           HINT: store all the unqie elemenbts of array into a list of integers
           Ex: array==> {1,1,2,3,3,4,5}
               output: {2,4,5}
 */
public class warmup_UniqueInArray {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

     for (int each: list) {
         int count = 0;
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i)==each){
                 count++;
             }
         }
         if (count==1){
             System.out.print(each+" ");
         }
     }



    }
}

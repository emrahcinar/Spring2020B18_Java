package SelfPractice.SelfPractice_ArrayList;
import java.util.ArrayList;
/*
 write a program that can find the unique elements from an
  ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
 */
public class warmup_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
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

        ArrayList<Integer> each=(ArrayList<Integer>)list.clone();
        System.out.println(each);
    }
}

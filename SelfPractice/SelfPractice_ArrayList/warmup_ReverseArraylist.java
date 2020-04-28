package SelfPractice.SelfPractice_ArrayList;

import officeHours.Practice_03_11_2020.Practice_EscapeSequences;

import java.util.ArrayList;
import java.util.Collection;

/*
2. write a program that can reverse the list of integers
		ex:
			list=> {1,2,3,4,5}
			output: {5,4,3,2,1}

 */
public class warmup_ReverseArraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int reverse=list.size()-1;
        System.out.println(list);
        for (int i=reverse;i>=0;i--){

            System.out.print(list.get(i)+" ");

        }


    }

}

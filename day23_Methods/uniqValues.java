package day23_Methods;
//FINDING UNIQUE ALPHABET

/*
warmup task:
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
public class uniqValues {
    public static void main(String[] args) {


        String[]arr = {"A", "B", "A","C","D"};//3 times executed: A B C
                    //  0    1    2

        for(String each:arr) {      //for(int j=0; j<arr.length;j++)

            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(each)) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(each);
            }
        }

        System.out.println("=========================================================================");
//Solution 2:
        for (String each2:arr) {// 4 times executed

            //"A"
            int count = 0;
            for (String each : arr) {
                if (each.equals(each2)) {
                    count++;
                }
            }
            if (count == 1) {// if the character is unique
                System.out.println(each2);
            }
        }
/*
String str="AABBCC"==>A3B2C2

[A,A,A,B,B,C,C]



 */



















































    }
}

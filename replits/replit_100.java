package replits;

import java.util.Scanner;

/*The code provided in your main method will take in five Strings
and save them into an array called arr.
  Print out the first three letter of each element of arr, one per line.
   You can assume that every element
   of arr is at least 3 letters long.
   Example:
arr -> ["apple", "banana"]
 prints: app
         ban
 */
public class replit_100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();

        //   for(int i=0 ; i<arr.length ;i++ ){
               System.out.println(arr[i].substring(0,3));

        }

}



    }


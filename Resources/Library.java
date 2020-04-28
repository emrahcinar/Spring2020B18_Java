package Resources;


import java.util.ArrayList;

import java.util.Arrays;



public class Library {



    public static int[] sortDesending(int[] arr){

        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};

        int[] RevArr = new int[arr.length] ;



        int j = arr.length-1;

        for(int i =0; i < arr.length; i++ ){

            RevArr[i] = arr[j];

            j--;

        }



        return RevArr;



    }



    public static String Reverse(String str){  // can reverse a string and returns string

        String Reverse = "";



        for(int i = str.length()-1; i >= 0; i-- ){

            Reverse  += str.charAt(i);

        }



        return  Reverse;

    }



    // remove duplicates from string



    // Frequency of string



    // merge two array and return third one



    // max number from array



    // min number from array



    public static String RemoveDuplicates(String str){

        String result =  "";      //AB



        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i); //B

            if( !result.contains(""+ch) ){

                result += ch;

            }



        }



        return result;

    }





    public static int Frequency(String str1, String str2){

        int count = 0 ;

        while(str1.contains(str2)){

            count++;

            str1 = str1.replaceFirst(str2, "");

            // we need to make that we are not counting the same index over again

        }

        return count;

    }





    public static String FrequencyOfChars(String str){

        String NonDup =  Library.RemoveDuplicates(str)  ;             //ABC

        String result = ""; //coantisn the frequency of chars



        for(int i =0; i < NonDup.length();i++){

            String ch = ""+NonDup.charAt(i);//  "A"

            int num =  Library.Frequency(str, ch);

            result += ch+num;

        }



        return result;

    }



    public static int Frequency(String str, char ch){ // counts the ch' frequency

        char[] arr =  str.toCharArray(); // [A, B, B]



        int count = 0; //1

        for(char each  : arr ){ //3   each: A , B, B

            if(each == ch){

                count++;

            }

        }



        return count;

    }



    public static String uniques(String str){ // "AABCDCD"

        String result = ""; //ACD

        for(int i=0; i < str.length(); i++){

            int num = Frequency(str, str.charAt(i) );

            if( num == 1){

                result += str.charAt(i);

            }

        }



        return result;

    }





    public static int max(ArrayList<Integer> list){  // returns the mxmum number from arraylist

        int maximum = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i++){



            if(list.get(i) > maximum ){

                maximum = list.get(i);

            }



        }



        return maximum;

    }









}
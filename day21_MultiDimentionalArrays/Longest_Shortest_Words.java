package day21_MultiDimentionalArrays;

public class Longest_Shortest_Words {
    public static void main(String[] args) {

        String[] names={"Reem","Omer","Muhtar","Emraaaaaaaaaaaaaaaaah","Mohammed","Ana"};

        int maxLenghtString=names[0].length();
        int minLenghtString=names[0].length();
        String longestWord="";
        String shortestWord="";
        for (int i=0;i<=names.length-1;i++){
                if (names[i].length()>maxLenghtString){
                    maxLenghtString=names[i].length();
                    longestWord=names[i];
                }
                if (names[i].length()<minLenghtString){
                    minLenghtString=names[i].length();
                    shortestWord=names[i];

                }
        }
        System.out.println(shortestWord);
        System.out.println(longestWord);









































    }
}

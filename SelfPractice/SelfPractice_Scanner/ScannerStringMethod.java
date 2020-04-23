package SelfPractice.SelfPractice_Scanner;

public class ScannerStringMethod {
    public static void main(String[] args) {

        String str="Cybertek";
  //    index num = 01234567

        //charAt(index):

        System.out.println(str.charAt(4));//r


        //charAt(index):
        char ch=str.charAt(4);
        System.out.println(ch);//r

            String str2="Em rah";
//          index num=   012345
        System.out.println(str2.charAt(1));

        //lenght():
        String name="Donald J Trump";//counts total number of character
        int n =name.length();
        System.out.println(name.length());//14
        int HighestIndexNum= name.length()-1;//start with 0(zero)1,2,3,4,5,6.......
        System.out.println(HighestIndexNum);
        /*
        lenght() method returns the total
       number of character in the String as an int value
         */

         //concat(str):
            String s1="Cybertek";
                    s1.concat(" School");//attempt tp modify String s1
        System.out.println(s1);  //Cybertek,  string is immutable

        s1=s1.concat(" School");
        System.out.println(s1);// Cybertek School


        //touppercase:
                String N="cybertek";
                N.toUpperCase();
        System.out.println(N);//cybertek ,    string is immutable

            N=N.toUpperCase();
        System.out.println(N);//CYBERTEK


//toLoweCase():

        String name1="KERIMCAN";
        name1.toLowerCase();
        System.out.println(name1);
        name1=name1.toLowerCase();
        System.out.println(name1);




































    }
}

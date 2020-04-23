package officeHours.Practice_04_01_2020;

public class StringMethods {
    public static void main(String[] args) {

        //charAt(indexnumber): returns the char at the given index, char primitive

        String str1 = "Java";
        //           0123

        char ch1 = str1.charAt(3);
        System.out.println(ch1); //a

        // char ch2=str1.charAt(4);//error  because index start with 01234

        System.out.println("==============================================================");

 //length():returns total number of chars,
 //lenght-1 returns last index

        String str2 = "Cybertek School";

        int total = str2.length();
        System.out.println(total);

        int maxIndex = str2.length() - 1;

        char ch3 = str2.charAt(maxIndex);//returns you last index
        System.out.println(ch3);
        System.out.println("==============================================================");

//concat(string): concatenation, returns new string

        String str3 = "Cybertek";
        str3 = str3.concat(" School");//"Cybertek School
        System.out.println(str3);

        String str4 = "Java";
        str4 = str4.concat(" is fun");// " java is fun"
        System.out.println(str4);


        System.out.println("==============================================================");

//toLowerCase() & toUpperCase(): change the case of the strings to upper or lower cases
        // returns new string

        String str5 = "CYBERTEK SCHOOL";
        str5 = str5.toLowerCase();
        System.out.println(str5);

        String str6 = "muhtar";
        str6 = str6.toUpperCase();//"MUHTAR'
        System.out.println(str6);

        System.out.println("==============================================================");

//trim():removes unused(white) spaces from the string

        String str7 = "           Cybertek";
        str7 = str7.trim();
        System.out.println(str7);//"Cybertek" (Space been removed)
        System.out.println(str7.length());//8(Space been removed)

        String str8 = "           ";
        str8 = str8.trim();

        System.out.println(str8.length()); //0
        System.out.println("==============================================================");

//substring(beginning index, ending index):creates substring starting from beginning index till ending index
        String sentence1 = "I like Java";
//                012345678910

        String word1 = sentence1.substring(7, sentence1.length());// "Java"
        String word2 = sentence1.substring(2, 6);

        String word3 = sentence1.substring(2, 6) + sentence1.substring(7, sentence1.length());
        System.out.println(word1);//Java
        System.out.println(word2);//like
        System.out.println(word3);//likeJava


//substring(beginning index):creates the sub string from beginning index till the end of the string.
        // returns new string

        String sentence2 = "I like to learn Java";
        //                 0123456789

        String r1 = sentence2.substring(10);//"learn Java";
        System.out.println(r1);

        String r2 = "Java";//JaVa;
        //           0123
        String r3 = r2.substring(0, 2);//Ja
        //Ja
        String r4 = r2.substring(2, 3);//V
        r4 = r4.toUpperCase();//V
        String r5 = r2.substring(3);//a

        String result = r3 + r4 + r5;//JaVa
        System.out.println(result);

        System.out.println("==============================================================");


//replace(old str,new str):replace all the matching ones,returns new string
        String str = "I like C#, C# is cool";

        str = str.replace("C#", "Java");//I like Java, Java is cool

        System.out.println(str);

        //replaceFirst(old str, new str):replace the first matching one,returns new string

        String t1 = "Java is fun, Java is good";
        t1 = t1.replaceFirst("Java", "C#");
        System.out.println(t1);

//indexOf(str):returns the index of first matching caracter , as an int
        String y1 = "Today w is wednesday";
        int a1 = y1.indexOf("w");//6  first "w" index number
        int a2 = y1.indexOf("wed");//11 second "w" index number
        System.out.println(a1);
        System.out.println(a2);

        //lastIndexOf(str):returns he index of last matching caracter , as an int

        String y2 = "Cybertek School, School";
        int a3 = y2.lastIndexOf("S");//17  last "S" index number
        System.out.println(a3);


    }
}

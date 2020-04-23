package SelfPractice.SelfPractice_String;

/*
Write a program that will print out first character of the word.
 */
public class ALL_STRINGS {
    public static void main(String[] args) {

        String s1 = "Java";  // String literal
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");
        System.out.println(s1 == s2);//true same objects
        System.out.println(s1 == s3);//false , diffrent objects diffrent memory
        System.out.println(s3 == s4);//false , diffrent objects
        System.out.println("========================================================================================");

        //charAt(indexNumber):returns char at the given index ,char primitive

        String str1 = "Java";
//                   0123

        char ch1 = str1.charAt(3);//a
        System.out.println(ch1);
        System.out.println("========================================================================================");
//lenght(): returns the total numbers of chars, int

        String str2 = "Cybertek School";

        int total = str2.length();
        System.out.println(total);

        int maxIndex = str2.length() - 1;//last index number

        char ch3 = str2.charAt(maxIndex);
        System.out.println(ch3);
        System.out.println("========================================================================================");
//concat():concatination,returns new string,+ also does concatination

        String str3 = "Cybertek";
        str3 = str3.concat(" School");//"Cybertek School"
        System.out.println(str3); //"Cybertek School"

        String str4 = "Java";
        str4 = str4.concat(" is fun");//"Java is fun"
        System.out.println(str4);
        System.out.println("========================================================================================");

        //toLowerCase() & toUppeCase():

        String str5 = "CYBERTEK SCHOOL";

        str5 = str5.toLowerCase();//cybertek school
        System.out.println(str5);

        String str6 = "cybertek school";
        str6 = str6.toUpperCase();//CYBERTEK SCHOOL
        System.out.println(str6);

        System.out.println("========================================================================================");

        //trim(): removes unused (white) spaces from the string

        String str7 = "       Cybertek";
        str7 = str7.trim();//"Cybertek"

        System.out.println(str7);
        System.out.println(str7.length());


        String str8 = "           ";
        str8 = str8.trim();
        System.out.println(str8.length());//0
        System.out.println("========================================================================================");

//substring(beginning index, endin index):starts to creat substring starting from beginning index till ending index
        // (ending index is excluded)

        String sentence1 = "I like java";
        //                  0123456789...

        String word1 = sentence1.substring(7, sentence1.length() - 1 + 1);//"Java"
        String word2 = sentence1.substring(2, 6);//"like"

        String word3 = sentence1.substring(2, 6) + " " + sentence1.substring(7, sentence1.length() - 1 + 1);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);//"like java"


//substring(beginning index):creates the sub string from beginning index till the end of th string.return new string

        String sentence2 = "I like to learn java";
        // 0123456789.......
        String r1 = sentence2.substring(10);//"learn java"
        System.out.println(r1);

        String r2 = "JaVa";
        String r3 = r2.substring(0, 2); //Ja
        String r4 = r2.substring(2, 3); // v
        r4 = r4.toUpperCase();//V
        String r5 = r2.substring(3);//a
        String result = r3 + r4 + r5;//JaVa
        System.out.println(result);
        System.out.println("========================================================================================");

        //replace(old str,new str):replaces all matching ones, returns new string

        String str = "I like C#, C# is cool";
        str = str.replace("C#", "Java");//"I like Java, Java is cool"
        System.out.println(str);

        //replacefirst(old str,new str)replace the first matching one , returns new string

        String t1 = "Java is fun,Java is good";
        t1 = t1.replaceFirst("Java", "C#");//C# is fun,Java is good
        System.out.println(t1);
        System.out.println("========================================================================================");

        //indexOf(str):returns the index of first matching character, as an int

        String y1 = "Today W is Wednesday";
        int a1 = y1.indexOf("W");//first W index num (6)
        int a2 = y1.indexOf("We");//second W index num (11) "We" we made it uniqe
        System.out.println(a1);
        System.out.println(a2);


        //lastIndexOf(str):returns the index of last matching character, as an int

        String y2 = "Cybertek School, School";
        int a3 = y2.lastIndexOf("S");//last "S" index number
        System.out.println(a3);

        System.out.println("========================================================================================");
//isEmpty():checks if the string is empty,returns boolean
        String st1 = "        ";
        boolean w1 = st1.isEmpty();//false
        boolean w2 = !str1.isEmpty();//true
        System.out.println(w1);
        System.out.println(w2);
        System.out.println("========================================================================================");
//equals(str):checks if the two string text are equal or not, returns boolean
//equalsignorecase(str):checks if the two strongs of text are equal or not(without case sensivity),returns boolean

        String p1 = "cat";
        String p2 = new String("cat");
        String p3 = "Cat";

        System.out.println(p1 == p2);//false
        System.out.println(p1.equals(p2));//true
        System.out.println(p3.equals(p1));//false,case sensitivity
        System.out.println(p3.equalsIgnoreCase(p1));//true
        System.out.println("========================================================================================");

//contains(str): checks if the str included in the string,returns boolean

        String sentnce = "i like to learn Java";
        System.out.println(sentnce.contains("Java"));//true
        String sentnce2 = "Top 3 Viruses are: 1.Corona, 2.Hanta, 3.Ebola";
        System.out.println(sentnce2.contains("Java"));//false
        System.out.println("========================================================================================");
        //startWith(str):checks if the string started with str

        String webAdress = "www.amazon.com";
        System.out.println(webAdress.startsWith("www"));//true
        System.out.println(webAdress.startsWith("wwww"));//false

        //endWith(str):checks if the string ended with str

        String gmail = "CybertekSchool@gmail.com";
        System.out.println(gmail.endsWith("@gmail.com"));//true
        System.out.println(gmail.endsWith("@hotmail.com"));//false
    }
}



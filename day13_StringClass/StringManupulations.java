package day13_StringClass;

public class StringManupulations {
    public static void main(String[] args) {

        String str="Cybertek";
        //index num 01234567

        //charAt() it returns the char at the given index

        char ch1=str.charAt(5);//t
        System.out.println(ch1);
            //             't'=='A'  //false
        System.out.println(ch1=='T');
        //                  t == 'T' ==> case sensitive,false

        //lenght()

          int totalLenght= str.length();
        System.out.println(totalLenght);//8 (alphabet number)

        System.out.println(totalLenght>250);//false

        String str2="Today is great day, Java is fun";
        int maxIndexNum= str2.length()-1;
        System.out.println(maxIndexNum);

        //concat(Value):Concatination

        String s1="Cybertek";
              s1=  s1.concat("School");
        System.out.println(s1); // "Cybertek School"

        String s2 = "Java";
        s2.concat(" is  programming language");
        System.out.println(s2.concat(" is  programming language"));//Java is  programming language
        System.out.println(s2);//Java

        s2= s2.concat(" is  programming language");//Java is  programming language
        System.out.println(s2);

        String r1="Java is fun";
               r1= r1.concat(", and it's easy");

        System.out.println(r1);

        //toLowerCase():Converts to lower case returns to new String value

        String name1="CYBERTEK";
                name1=name1.toLowerCase();
        System.out.println(name1);

        //toUpperCase():Coverts to uppercase and returns you new string

        String name2="cybertek school";
       name2= name2.toUpperCase();
        System.out.println(name2);

        //trim():removed unsued space and return new String

        String A1="         Today is a great day";
            A1=A1.trim();// takes of extra empty space
        System.out.println(A1);












    }
}

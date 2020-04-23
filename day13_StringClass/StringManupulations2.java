package day13_StringClass;

public class StringManupulations2 {
    public static void main(String[] args) {

        String str="Cybertek School is the best";
        //          0123456789
//Substring (begining index, ending index)

        String schoolName=str.substring(0,8);

        System.out.println(schoolName);

        String fullName="Kuzzat ALtay";
        //               0123456789.....
        String firstName=fullName.substring(0,6);
        String lastName= fullName.substring(7,11+1);

        System.out.println(firstName);
        System.out.println(lastName);

//fullname=firstname lastname
//gmail:lastName_firstnamegmail.com

        String Murtaza="Murtaza Nazeeri";
        //              0123456789

        String firstname=Murtaza.substring(0, 6+1);
        String lastname=Murtaza.substring(8,14+1);
        System.out.println(firstname);
        System.out.println(lastname);
        // String gmail=lastname+"_"+firstname+@gmail    , same lice concat
        String gmail=lastname.concat("_").concat(firstname).concat("@gmail.com");

        System.out.println(gmail);

            String s1="I love Java Programming Language";
            //         01234567
        String className=s1.substring(7);

        System.out.println(className);//Java Programming Language


  //replace(old Value, new Value):new value will be replaced with ALL the given old value
        //and return new string

        String s2="I like C# programming";
        s2=s2.replace("C#","Java");
        System.out.println(s2);

         String name="COVID 18";
         name=name.replace("8","9");
        System.out.println(name);
//replacefirst()
        String r1="I like C#,C# is fun,C# is cool";
        r1=r1.replaceFirst("C#","java");
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2=r2.replace("Tomorrow","Today");

        System.out.println(r2);














    }
}

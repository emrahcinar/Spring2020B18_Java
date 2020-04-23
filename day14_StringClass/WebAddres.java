package day14_StringClass;

public class WebAddres {
    public static void main(String[] args) {
        /* write program that can validate if a web adress is valid
        valid web adress:
        Must start with www.
        must ends with  .com , .edu , .net or .gov
                */

        String website="www.cybertek.gov";
         website=  website.toLowerCase();

         boolean validEnding=website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov");

         if(website.startsWith("www.")&&validEnding){
             System.out.println("Valid address");
             }else{
             System.out.println("Invalid Address");
        }




















































































    }
}

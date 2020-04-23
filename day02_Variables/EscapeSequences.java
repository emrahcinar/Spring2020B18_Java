package day02_Variables;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("\t\tHello");
        // \t means a paragraph space(Tab)
        System.out.println("Cybertek\nSchool");
        System.out.println("\nMy\nName\nIs\nEmrah");
        // \n means new line ,starts with the new line
        // print: My favourite TV show is "Game of Thrones"
        System.out.println("My Favourite Tv Show is \"Game Of Thrones\"");
        System.out.println("My Favourite Book is \"Brain\"");
        //  \"it means double quote, prints double quote to the console
        System.out.println("\\");
        // \\ pritns single slash on console
        System.out.println("/");
        System.out.println("My favourite book is \'Java\' ");
        // \'  means single quotes
        System.out.println("My favourite book is 'Java' ");
        // ' means single quotes

        System.out.println("My favourite soccer team is \"BJK\"");
        System.out.println("MY goal is to learn \"JAVA\"");
        System.out.println("The best movie is \'The God Father\'");
        System.out.println("Most popular soccer teams are \'JUVE\' , \'R.Madrid\' and \'Milan\'");

    }
}

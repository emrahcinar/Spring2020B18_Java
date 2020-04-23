package officeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {

        /*
        print all the numbers between 0~100 that can be divisible by 3 or 5
         */

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("==================================================================");

        String name = "Hannah";
                 //    012345
        String result="";
        int lastindex = name.length() - 1;

        for (int i=lastindex; i>=0;i--){
         //   result+=name.charAt(i);
       result+= name.substring(i,i+1);
        }

        System.out.println(result);

        if (name.equalsIgnoreCase(result)){
    System.out.println(name+" is palindrome");
}else{
    System.out.println(name+" is not palindrome");
}

















































    }
}

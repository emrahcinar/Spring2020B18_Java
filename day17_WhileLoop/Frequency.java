package day17_WhileLoop;

public class Frequency {
    public static void main(String[] args) {

        String str="Java Java Java Java";// can do alphabet also//can do.toLowerCase for same alphabet

        String result="";//"Java".toLowerCase()
        int count=0;//  +1+1

        while(str.contains("Java")){
            count++;
            str=str.replaceFirst("Java","");//after counting the first jana, we need to remove it from the str
        }
        System.out.println(count);














    }
}

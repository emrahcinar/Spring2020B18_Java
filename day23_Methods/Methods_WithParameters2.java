package day23_Methods;
/*Reverse Method

 */
public class Methods_WithParameters2 {
//3.create a function that can reverse any string

    //"Muhtar"==>rathuM ,     "Cybertek"==> "ketrebyC"
    public static void main(String[] args) {
        String name1="Emrah";
        ReverseString(name1);
        String name2="Cybertek School";
        ReverseString(name2);
    }

    public static void ReverseString(String str){
       for (int i=str.length()-1;i>=0;i--){
           System.out.print(str.charAt(i));
       }
        System.out.println();

    }


}

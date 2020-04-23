package officeHours.Practice_03_18_2020;

public class SingleIf_Practice {
    public static void main(String[] args) {
        int a = 200;
        int b = 200;

        boolean aGreater= a > b;
        boolean bGreater = b > a;
       // boolean aEqualb = a==b;
        //boolean aEqualb= aGreater == false && bGreater == false;
                            //if a is not greater than b and b is not graeter than a, that means a==b

        boolean aEqualb = aGreater == bGreater;


        if(aGreater) {
            System.out.println(a + " is greater number");
        }
        if(bGreater) {
            System.out.println(b + " is greater number");
        }
        if(aEqualb) {
            System.out.println(a + " is equal to " + b);
        }











    }
}

package day24_Methods.Warmup;

/*
 2. write a method called GalonsToLitters, that can convert gallons to litters
                   1 G = 3.75 L

 */
public class GallonstoLitter {
    public static void main(String[] args) {


        GalonsToLitters(2);
    }

    public static void GalonsToLitters(double galon) {

        double liter = galon * 3.75;

        System.out.println((int)galon + " G = " + liter + " L ");

        System.out.println();
    }


}

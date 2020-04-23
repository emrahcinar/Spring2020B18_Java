package officeHours.Practice_03_11_2020;

public class Practice_Variables {

        /*
        brand
        year
        price
        model
        miles
         */
        public static void main(String[] args) {
            String brand = "BMW";
            short year = 2020;
            float price = 50000.50F;
            String model = "X6";
            short maximumMiles = 32767;

            System.out.println( brand );
            System.out.println( "brand" );
            /*variables that are declaired in a block'
            must be initilazied before use*/
            /*
            output:
            The vehicle 2020 BMW X6, 32767 miles, price is 50000.50 USD*\
             */

            System.out.println("The vehicle "+ year +" "+brand+ " "+ model+ ", has "+maximumMiles
                                + " miles, price is "+price + " USD ");


     /*
       System.out.println( 9 + 10); //19 addition :both left and right side of the + are numbers
            System.out.println( "9" + "10"); //910
            System.out.println( "9" + 10 ); //910
*/


        }





}

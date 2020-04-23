package officeHours.Practice_03_18_2020;

public class SingleIfPracticee2 {
    public static void main(String[] args) {

        byte age = 22;
        boolean eligibletobuy= age>21 || age == 21; // age>=21 (same)

        //if(eligibletobuy) can work  \
        //if(!eligibletobuy)          /  BOOLEAN


        if(age>=21){
            System.out.println("Here is your Vodka");
        }
        if(age<21){
            System.out.println("Go drink your milk");
        }

        boolean feeling = false;
        if(feeling == false){
            System.out.println("dont be sad");
        }
        if(feeling == true){
            System.out.println("Stay happy");
        }
















    }
}

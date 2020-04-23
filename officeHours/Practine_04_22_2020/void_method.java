package officeHours.Practine_04_22_2020;

public class void_method {
    public static void main(String[] args) {
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");

        System.out.println("====================================================");

        print();
        print();

        System.out.println("====================================================");

        boolean UScitizen = true;
        int age = 21;
        Vote(age, UScitizen);


        System.out.println("====================================================");

            EligibleToBuyCig(17);

    }

    public static void print() {

        System.out.println("Hello Batch 18");
    }

    public static void Vote(int age, boolean USCitizen) {
        //write a function that can identify if a person is elligible to vote
        //must know: age,UScitizen

        boolean eligibleToVote = age >= 18 && USCitizen == true;
        if (eligibleToVote) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }

    public static void EligibleToBuyCig(int age) {

//write a method if a person is eligible to buy cigarette
        //Must know :age

        if (age>18){
            System.out.println("Eligible to buy");
        }else{
            System.out.println("not eligible to buy");
        }



    }
}
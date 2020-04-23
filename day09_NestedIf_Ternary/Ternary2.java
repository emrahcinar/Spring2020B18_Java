package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {

        //ternary : ? means if, : else
            String result="";
        if (9 > 10) {
           result= "9 is greater";
        }else{
            result="10 is greater";
        }

        String result2=(9>10)?"9 is greater":"10 is greater";
        System.out.println(result);
        System.out.println(result2);

        System.out.println("==================================================================");

        int age=25;

        boolean eligibility= (age>=21) ? true: false ;
        /*
        if(age>=21){
            eligibility=true;
        }else{
            eligibility=false;
       }
         */
        System.out.println(eligibility);

        System.out.println("====================================================================");

        int ageOfPerson=20;
        String eligibleToVote="";

        if(ageOfPerson>=18){
            eligibleToVote = "YES";
        }else{
            eligibleToVote = "NO";
        }

        String eligibletovote2=(ageOfPerson>=18)?"YES":"NO";
        System.out.println(eligibletovote2);
        System.out.println(eligibleToVote);













    }
}

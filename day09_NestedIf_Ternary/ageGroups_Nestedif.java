package day09_NestedIf_Ternary;

public class ageGroups_Nestedif {
    public static void main(String[] args) {
        /*
        write a program that can define the age groups of a person
             age groups are:
                        Teenager(<21)
                        Adult   (>=21&&<55)
                        Senior  (>55)
                        age cannot be negtive or greater than 150
         */

        int age =5;
        String ageGroup="";
        if(age>0&&age<150){
            if(age<21){
                ageGroup="Teenager";
            }else if(age<55){
                ageGroup="Adult";
            }else{
                ageGroup = "Senior";
            }
        }else{
            ageGroup="Invalid Entry";
        }
        System.out.println(ageGroup);

        /*
        if(age>0&&age<150){
            ageGroup=(age<=21)?"Teenager":(age<=55)?"Adult":"Senior";
        }else{
            System.out.println("Invalid");
        }
        System.out.println(ageGroup);
 */

        System.out.println("=====================================================");

        int age2=45;
        String ageGroup2="";

            if (age<150&&age>0){
                ageGroup2=(age2<21)?"Teenager":(age<55)?"Adult":"Senior";
            }else{
                ageGroup2="Invalid Entry";
            }
        System.out.println(ageGroup2);






    }
}

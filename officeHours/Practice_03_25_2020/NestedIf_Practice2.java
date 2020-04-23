package officeHours.Practice_03_25_2020;

public class NestedIf_Practice2 {
    public static void main(String[] args) {

        /*
        fo the loan:
        if the person has a jobthat pays > 50000==>might be eligible
        if the person has good credit
        if the person job history more or equal to 2 year ==> than eligible
        */
            int salary=450000;
            int creditscore=750;
            byte jobHistory=1;

            if(salary>50000){//might be eligible
                if(creditscore>650){// might be eligible
                    if(jobHistory>=2){//elligible for loan
                        System.out.println("You are qualified");
                    }else{//not eligible due to jon history
                    }
                    System.out.println("You dont have enough job history");
                }else {//not eligible
                    System.out.println("You dont have good credit score");
                }
            }else{
                System.out.println("You need have a job that pays $50000");
            }

















    }
}

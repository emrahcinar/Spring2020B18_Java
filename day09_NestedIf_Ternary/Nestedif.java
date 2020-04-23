package day09_NestedIf_Ternary;

public class Nestedif {
    public static void main(String[] args) {

        boolean UScitizen=true;
        int age=17;


        if(UScitizen){
            if(age>17){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You Must be 18 or older to be able to vote");
            }
        }else{
            System.out.println("Only the US citizens are eligible to for vote for Donald Trump");
        }
        System.out.println("============================================");

        int score=80;
        String grade="";

        if(score>=0&&score<=100){
            if(score>=90){
                grade="A";
            }else if(score>=80){
                grade="B";
            }else if(score>=70){
                grade="C";
            }else if(score>=60){
                grade="D";
            }else{
                grade="F";
            }
        }else{           //score is less than zero or greater than 100
            grade="Invalid";
        }
        System.out.println(grade);

        int score2=75;
        String grade2="";

        if(score2>=0&&score2<=100){
            grade2=(score2>=90)?"A":(score2>=80)?"B":(score2>=70)?"C":(score2>=60)?"D":"F";
        }else{
            grade="invalid";
        }






















































    }
}

package day08_IfStatements;

public class daysInMonth_MultiBranchIf {
    public static void main(String[] args) {

        byte months=8;
        String result= " ";

        if (months==1){
            result="January has 31 days";
        }else if(months==2){
            result="Februray has 28 days or 29 days";
        }else if(months==3){
            result="March has 31 days";
        }else if(months==4){
            result="April has 30 days";
        }else if(months==5) {
            result = "May has 31 days";
        }else if(months==6){
            result="June has 30 days";
        }else if(months==7){
            result="July has 31 days";
        }else if(months==8){
            result="August has 31 days";
        }else if(months==9){
            result="September has 30 days";
        }else if(months==10) {
            result = "October has 31 days";
        }else if (months==11) {
            result = "November has 30 days";
        }else if(months==12){
            result="December has 31 days";
        }else{
            result="Invalid Entry";
        }
        System.out.println(result);





































    }
}

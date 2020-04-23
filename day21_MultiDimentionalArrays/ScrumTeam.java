package day21_MultiDimentionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {

        String[] DevTeam = {"Zeynep", "Haider", "Jovid","Muhtar"};
        String[] TestersTeam = {"Rahman", "Aishan", "Osman", "Ali"};
        String[] PO={"Barzy","Donald"};
        String[] TesterTeam2={"Ilham","Zarina","Aizhan","Asiman"};


        String[][] ScrumTeam = {DevTeam, TestersTeam,PO};
        //                          0        1        2


        ScrumTeam[0][3]="Jean";
        ScrumTeam[1]=TestersTeam;//re initilaiz

        System.out.println(ScrumTeam[0][3]);
        String info=ScrumTeam[1][2];

        System.out.println(info);
        System.out.println("============================================================");

        for (   String eachEmployee  : ScrumTeam[2]   ){
            System.out.println(eachEmployee);
        }


        System.out.println("============================================================");
        System.out.println(ScrumTeam[2][1]);













    }
}

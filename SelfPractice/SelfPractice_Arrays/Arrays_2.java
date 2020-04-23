package SelfPractice.SelfPractice_Arrays;

public class Arrays_2 {
    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[5];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

 */

        System.out.println("=====================================================================");

        /*write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
         */

        int[] arr1 = {4, 5, 6, 7, 8, 10, 20, 30, 0};
       int sum=0;

       for (int i=0;i<arr1.length;i++){
           sum=sum+arr1[i];
       }
       int avarage=sum/arr1.length;
        System.out.println(avarage);


        System.out.println("===========================================================");
/*
2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array


 */

String[] lineUp={"Fabri","Gokhan","Pepe","Adriano","Atiba","Talisca","Quaresma","CenkTosun"};
int result=0;
int longest=lineUp[0].length();
for (int i=1;i<lineUp.length;i++){
    if (lineUp[i].length()>longest){
        result=i;longest=lineUp[i].length();
    }
}
        System.out.println(lineUp[result]);

        String[] lineup1={"Fabri","Gokhan","Pepe","Adriano","Atiba","Talisca","Quaresma","CenkTosun"};
        int result1=0;
        int shortest=lineup1[0].length();
        for (int i=1;i<lineup1.length;i++){
            if (lineup1[i].length()<shortest){
                result=i;shortest=lineup1[i].length();
            }
        }
        System.out.println(lineup1[result]);








    }
}

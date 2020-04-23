package day21_MultiDimentionalArrays;

/*
warmup tasks:
	1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
	2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
 */
public class AvarageNumber {
    public static void main(String[] args) {

int[]arr={10,20,30,40,50};

int lenght=arr.length;
int sum=0;
for (int i=0;i<lenght;i++){
    int eachNum=arr[i];
    sum+=eachNum;
}
        System.out.println(sum/lenght);




















    }
}

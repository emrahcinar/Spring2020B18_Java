package day16_ForLoop;
/*
5. Write a program that will print out all letters in English alphabet in ascending order
	6. Write a program that will print out all letters in English alphabet in descedning order

 */
public class EnglishAlpahabet {
    public static void main(String[] args) {

        for (char ch= 'A'; ch <= 'Z'; ch++){
            System.out.print(ch+" ");//AtoZ
        }
        System.out.println();
        for (char ch='Z'; ch>='A'; ch--) {
            System.out.print(ch + " ");//ZtoA
        }
            System.out.println();

            for(char ch ='a';ch<='z'; ch++){
                System.out.print(ch+" ");//a to z
            }

        }

















    }


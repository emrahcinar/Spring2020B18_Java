package SelfZz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifProject2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

      /*in blackjack after the player asks to keep the house 4 things may happen.
1) if the card total is bigger then 21 the player busts.
2)if the house score is bigger then the player, the player loses .
3)if the player score is equal to the house then thers a draw.
4)if the player score is bigger then the house the player wins.
player and house scores are represented by  player and house int variables.
check them using ifs to determine the result.
for example:

player  = 21        house = 8      output: bust

player  = 7          house =10       output: player loss

player  = 4         house = 4      output: its a tie

player  = 12        house = 7      output: player wins
  */
        System.out.println("===CEASER PALACE===");
        System.out.println("======CASINO=======");

        System.out.println("BlackJack house Score");
        int house = scan.nextInt();
        System.out.println("Blackjack player Score");
        int player = scan.nextInt();

        String result="";
        int r=-1;

        // 0->player wins, 1->house wins, 2-> tie, 3-> both loose
        if (player>21) {
            if (house<=21) {
                r=1;
            }
            else {
                r=3;
            }
        }
        else if (house>21) {
            r=0;
        }
        else if (player > house) {
            r=0;
        } else if (house > player) {
            r=1;
        } else { //if (house == player) {
            r=2;
        }


        if (r==0)
            System.out.println("player wins");
        else if (r==1)
            System.out.println("house wins");
        else if (r==2)
            System.out.println("tie");
        else
            System.out.println("both loose");

    }

}

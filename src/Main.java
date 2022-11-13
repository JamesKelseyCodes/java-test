import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Random;

class RollingDoubles {

    public static void main(String args[]) {
        boolean playAgain = true;

        while (playAgain == true) {
            Scanner keyboard = new Scanner(in);
            Random myRandom = new Random();
            int die1, die2;

            out.println("Welcome to the backgammon table. What's your name, buckaroo? ");
            String name = keyboard.nextLine();
            out.println("The aim is to roll in the range of 8-12, then you win");
            out.println("Get ready to roll! Press any key");
            keyboard.nextLine();

            die1 = myRandom.nextInt(10) + 1;
            die2 = myRandom.nextInt(10) + 1;

            int dieCombined = die1+die2;

            out.println("You have rolled a " + die1 + " and a " + die2 + ", which gives a total of " + dieCombined);

            if (die1 == 1 && die2 == 1) {
                out.println("...furthermore you rolled a SNAKE EYES!");
            } else if (dieCombined >= 8 && dieCombined <= 12) {
                out.println("You win, buckeroo! Collect your prize.");
            } else {
                out.println("Sorry partner, you lose this one!");
            }

            out.println("Do you want to play again? [1 for yes / 2 for no]");
            int reply = keyboard.nextInt();

            if (reply == 2) {
                playAgain = false;
            }

        }

    }
}
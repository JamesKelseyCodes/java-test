import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

class Blackjack {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Random myRandom = new Random();
        out.println("Welcome to black jack!");

        /* int dice = myRandom.nextInt(6) + 1; */
        int counter = 0;
        int score = 0;
        int roll = 0;

        while (score < 21) {
            roll = myRandom.nextInt(13) + 1;
            keyboard.nextLine();

            switch (roll) {
                case 1:
                    roll = 10;
                    score += roll;
                    out.println("you rolled an ace     Total: " + score);
                    break;
                case 11:
                    roll = 10;
                    score += roll;
                    out.println("you rolled a a jack     Total: " + score);
                    break;
                case 12:
                    roll = 10;
                    score += roll;
                    out.println("you rolled a queen     Total: " + score);
                    break;
                case 13:
                    roll = 10;
                    score += roll;
                    out.println("you rolled a king     Total: " + score);
                    break;
                default:
                    score += roll;
                    out.println("you rolled a " + roll + "     Total: " + score);
                    break;
            }
            if (score == 21) {
                 out.println("You win!");
             }
            if ( score > 21 ) {
                 out.println("You lose!");
             }

            }
        }
}


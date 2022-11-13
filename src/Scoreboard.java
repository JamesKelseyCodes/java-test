import java.util.Scanner;

import static java.lang.System.out;

public class Scoreboard {

    enum WhoWins {home, visitor, neither}

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int crows, port;
        WhoWins who;

        out.print("Hankees and Socks scores? ");
        crows = keyboard.nextInt();
        port = keyboard.nextInt();
        out.println();

        if (crows > port) {
            who = WhoWins.home;
        } else if (port > crows){
            who = WhoWins.visitor;
        } else {
            who = WhoWins.neither;
        }

        out.println("Wow, that was quite a game!");

        if (who == WhoWins.home) {
            out.println("Crows win");
        } else if (who == WhoWins.visitor) {
            out.println("Port win");
        } else {
            out.println("neither win");
        }
    }
}

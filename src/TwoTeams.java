import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

class TwoTeams {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(in);
        int hankees, socks;

        out.println("Hankees and socks scores? ");
        hankees = keyboard.nextInt();
        socks = keyboard.nextInt();

        if (hankees == socks) {
            out.println("it's a draw, baby!");
        } else if (hankees > socks) {
            out.println("Hankees: " + hankees);
            out.println("Socks: " + socks);
            out.println("Hankees win");
        } else {
            out.println("Socks: " + socks);
            out.println("Hankees: " + hankees);
            out.println("Socks win");
        }

        keyboard.close();

    }
}
import java.util.Scanner;

class countingChange {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int twoDollars, dollars, fiftyCents, twentyCents, fiveCents, whatsLeft, total;

        System.out.print("How many cents do you have? (enter an integer) ");
        total = keyboard.nextInt();

        twoDollars = total / 200;
        whatsLeft = total % 200;

        dollars = whatsLeft / 100;
        whatsLeft = whatsLeft % 100;

        fiftyCents = whatsLeft / 50;
        whatsLeft = whatsLeft % 50;

        twentyCents = whatsLeft / 20;
        whatsLeft = whatsLeft % 20;

        fiveCents = whatsLeft / 5;
        whatsLeft = whatsLeft % 5;

        System.out.println("From a total of " + total + "c you get: ");
        System.out.println(twoDollars + " two dollar coins");
        System.out.println(dollars + " dollar coins");
        System.out.println(fiftyCents + " fifty cent coins");
        System.out.println(twentyCents + " twenty cent coins");
        System.out.println(fiveCents + " five cent coins");

        keyboard.close();
    }

}
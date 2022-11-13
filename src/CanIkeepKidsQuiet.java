import java.util.Scanner;

class CanIkeepKidsQuiet {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        int gumballs;
        int kids;
        int gumballsPerKid;
        boolean eachKidGetsTen;

        System.out.println("The kids are hungry, they want at least 10 gumballs each. How many gumballs do you have?");
        gumballs = keyboard.nextInt();
        System.out.println("Ok, and how many kids are there?");
        kids = keyboard.nextInt();
        gumballsPerKid = gumballs / kids;

        System.out.print("True or false?");
        System.out.println("Each kid gets 10 gumballs.");
        eachKidGetsTen = gumballsPerKid >= 10;
        System.out.println(eachKidGetsTen);

        keyboard.close();
    }
}
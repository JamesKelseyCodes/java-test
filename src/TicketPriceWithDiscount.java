import java.util.Scanner;

class TicketPriceWithDiscount {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        double price = 0.00;
        char reply;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        System.out.print("Have a coupon? (Y/N) ");
        reply = keyboard.findWithinHorizon(".", 0).charAt(0);

        if (age >= 12 && age < 65) {
            price = 9.25;
        }
        if (age < 12 || age >= 65) {
            price = 5.25;
        }
        if (reply == 'y' || reply == 'Y') {
            price -=2.00;
        }
        if (reply != 'y' && reply != 'Y' && reply != 'n' && reply != 'N') {
            System.out.println("Huh?");
        }

        System.out.println(price);
    }
}
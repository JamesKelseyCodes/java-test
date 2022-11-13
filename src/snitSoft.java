import java.util.Scanner;
class snitSoft {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double cdPrice, shippingAndHandling = 25.00, total;

        System.out.print("What's the price of a CD-ROM? ");

        cdPrice = keyboard.nextDouble();
        total = cdPrice + shippingAndHandling;

        System.out.print("We will charge $" + total + " to your credit card");

        keyboard.close();
    }
}

import java.util.Scanner;
import java.util.Random;

class YesOrNo {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Random myRandom = new Random();

        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter your age: ");
        int age = keyboard.nextInt();

        int randomNumber = myRandom.nextInt(10) + 1;

        if (randomNumber == 7) {
            System.out.println("Well done " + name + " you are the lucky winner");
        } else {
            System.out.println("Sorry, better luck next time, try again later you're only " + age + " years old.");
        }

        keyboard.close();

    }
}
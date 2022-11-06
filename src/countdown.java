import java.util.Scanner;

public class countdown {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to count down!");
        System.out.println("Please choose a number to count down from: ");
        String name = "James";
        Scanner myInt = new Scanner(System.in); // creating a scanner object
        int x = myInt.nextInt(); // read user input
        System.out.println("Hello " + name + ", the initial number is: " + x);
        double d = Math.random();
        //this is a test comment
        while (x > 1) {
            System.out.println("the number is now: " + x);
            if (x % 10 == 0) {
                System.out.println("Wow, " + x + " is a milestone!");
            }
            x = x - 1;
            Thread.sleep(200);
        }
        System.out.println("Well, that's the end of the list!");
    }
}
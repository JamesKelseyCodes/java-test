/* This little java script calculates the area of a circle after prompting user for radius
 * @author james
 */

import java.util.Scanner;

public class circleRadius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is the radius of the circle? ");
        double radius = scanner.nextDouble();
        
        System.out.println("The area of the circle is: " + radius * radius * 3.14159);
    }
}

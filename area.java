
import java.util.Scanner;
import java.text.*;


public class area {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextDouble()) { // load input
            double radius = scanner.nextDouble();
            double total = scanner.nextDouble();
            double circle = scanner.nextDouble();
            double round = (Math.PI * radius * radius); //calculate area of the circle
            
            DecimalFormat df = new DecimalFormat("#.########"); //decimal formatting

            if (radius != 0 && total != 0 && circle != 0) { //check for last line
               System.out.print(df.format(round)); 
                System.out.print(" "); //space
                System.out.printf(df.format((circle / total) * (2 * radius) * (2 * radius))); // calculate percentage circle: square
                System.out.println("");

            }
        }
    }
}

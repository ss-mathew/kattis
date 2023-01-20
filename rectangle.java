import java.util.Scanner;

public class rectangle {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int lines = scanner.nextInt();
            if (lines == 0) // check for last line
                break;
            int totalArea = 0;
            boolean[][] grid = new boolean [500][500]; // temp grid
            for (int x = 0; x < lines; x++) { //parse input
                int a = scanner.nextInt();
                int  b = scanner.nextInt();
                int c = scanner.nextInt();
                int d = scanner.nextInt();
                for (int cols = a; cols < c; cols++) {
                    for (int row = b; row < d; row++) {
                        if (grid[row][cols] != true) { //check that it's not already filled
                            totalArea++; //add to filled gridspace
                            grid[row][cols] = true;
                        }
                    }
                }
            }
            System.out.println(totalArea);
        }
    }
}

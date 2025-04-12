public class diamondPattern {
    public static void diamondPattern(int rows) {
        // // outer loop for rows
        // for (int i = 1; i <= rows; i++) {
        // // inner loop for xpace
        // for (int j = 1; j <= rows - 1; j++) {
        // System.out.print(" ");
        // }
        // // inner loop for stars
        // for (int j = 1; j <= (2 * i) - 1; j++) {
        // System.out.print("*");
        // }

        // System.out.println(); // next line
        // }
        // System.out.println(); // next line
        // upper half of diamond
        for (int i = 1; i <= rows; i++) {
            // print space
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("A");
            } // print star..
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // next line
        }
        // System.out.println(); // next line

        // lower part of diamond
        for (int i = rows - 1; i >= 1; i--) {
            // print space
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("A");
            } // print star..
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // next line
        }
        System.out.println(); // next line

    }

    public static void main(String[] args) {
        int rows = 10; // Number of rows for the rhombus
        diamondPattern(rows);
    }
}

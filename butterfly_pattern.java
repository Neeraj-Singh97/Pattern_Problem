public class butterfly_pattern {
    public static void butterfly_pattern(int row) {
        // 1st half of the butterfly
        for (int i = 1; i <= row; i++) {
            // Print stars for the left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }
            // Print stars for the right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // 2nd half of the butterfly
        for (int i = row; i >= 1; i--) {
            // Print stars for the left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }
            // Print stars for the right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        butterfly_pattern(20); // Number of rows for the butterfly
    }
}
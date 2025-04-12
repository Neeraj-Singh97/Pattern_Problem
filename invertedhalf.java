public class invertedhalf {

    public static void invertedhalf_pattern(int rows) {
        for (int i = rows; i >= 1; i--) { // Outer loop for rows
            // Inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        invertedhalf_pattern(7); // Number of rows for the pattern
    }
}
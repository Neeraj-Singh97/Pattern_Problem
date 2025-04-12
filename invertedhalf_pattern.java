public class invertedhalf_pattern {
    public static void invertedhalf_pattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // inner number
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        invertedhalf_pattern(7); // Number of rows for the pattern
    }
}

public class Zero_OnePattern {

    public static void zero_one_pattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print 0 and 1 in the pattern
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        zero_one_pattern(20); // Number of rows for the pattern
    }
}

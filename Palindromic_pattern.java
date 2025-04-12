public class Palindromic_pattern {
    public static void Palindromic_pattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        Palindromic_pattern(5);
    }
}
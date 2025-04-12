public class floyed_tringle {
    public static void floyed_tringle(int rows) {
        int counter = 1; // Initialize counter to 1
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " "); // Print the current counter value
                counter++; // Increment the counter
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        floyed_tringle(6); // Number of rows for the pattern
    }
}

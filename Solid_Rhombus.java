public class Solid_Rhombus {
    // // {
    // Method to print a solid rhombus pattern
    public static void Solid_rhombus(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        int rows = 5; // Number of rows for the rhombus
        Solid_rhombus(rows);
    }
}

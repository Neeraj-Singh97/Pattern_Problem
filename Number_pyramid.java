public class Number_pyramid {
    public static void Number_pyramid(int rows) {
        // // outer loop
        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= rows - 1; j++) {
        // System.out.print(" ");
        // }
        // // number....
        // for (int j = 1; j <= (2 * i) - 1; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println(); // next line
        // }
        // // print space
        // // print star
        for (int i = 1; i <= rows; i++) {
            // print space
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" " + " ");
            } // print star..
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // next line
        }
    }

    public static void main(String[] args) {
        Number_pyramid(6);
    }
}

// public class Hollow_Rhombus {
//     public static void Hollow_Rhombus(int rows) {
//         // ourter loop for rows
//         for (int i = 1; i <= rows; i++) {
//             // inner loop for space..
//             for (int j = 1; j <= (rows - 1); j++) {
//                 System.out.print(" ");
//             }
//             // star..
//             for (int j = 1; j <= rows; j++) {
//                 // condition for firts row and last row
//                 if (i == 1 || i == rows || j == 1 || j == rows) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(); // next line

//         }
//     }

//     public static void main(String[] args) {
//         int rows = 5; // Number of rows for the rhombus
//         Hollow_Rhombus(rows);
//     }

// }
public class Hollow_Rhombus {
    public static void Hollow_Rhombus(int rows) {
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            // Inner loop for stars and spaces
            for (int j = 1; j <= rows; j++) {
                // Print '*' for the border, otherwise print space
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" 0");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int rows = 5; // Number of rows for the rhombus
        Hollow_Rhombus(rows);
    }
}

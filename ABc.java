import java.util.Scanner;

import javax.swing.plaf.TreeUI;

import java.io.*;
import java.util.*;
// A B
// A B C
// A B C D
// A B C D E
// A B C D E F
// A B C D E F G
// A B C D E F G H
// Pattern1............................

// public class ABc {
// public static void main(String[] args) {
// char ch = 'A';
// for (int i = 1; i <= 7; i++) {
// // char print here..
// for (char innerCh = 'A'; innerCh <= 'A' + i; innerCh++) {
// System.out.print(innerCh + " ");
// }
// System.out.println();
// }
// }
// }
// Pattern2.....................
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// class ABc {
// public static void main(String[] args) {
// int n = 6;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();

// }

// }
// }
// Pattern3.........................
// A
// A B
// A B C
// A B C D
// A B C D E
// class ABc {
// public static void main(String[] args) {
// char ch = 'A';
// int n = 6;
// // Outer loop...
// for (int i = 1; i <= n; i++) {
// // innner loop...

// for (int chars = 1; chars <= i; chars++) {
// System.out.print(ch + " ");
// ch++;
// }
// System.out.println();

// }

// }

// }
// Pattern4.....................
// Enter the number A:
// 5
// Enter the number B:
// 6
// The sum of A and B is: 11

// class ABc {
// public static void CalculationSum() {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number A: ");
// int a = sc.nextInt();
// System.out.println("Enter the number B: ");
// int b = sc.nextInt();
// int Sum = a + b;
// System.out.println("The sum of A and B is: " + Sum);
// }
// public static void main(String[] args) {
// CalculationSum();
// }
// }
// Pattern5....................
// Write the program to swap two numbers without using third variable
// class ABc {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number A: ");
// int a = sc.nextInt();
// System.out.println("Enter the number B: ");
// int b = sc.nextInt();
// int Sum = a + b;
// // int a = 11;
// // int b = 22;
// System.out.println("Before swapping: a= " + a + " b= " + b);
// // swapping
// int temp = a;
// a = b;
// b = temp;
// System.out.println("a=" + a);
// System.out.println("b=" + b);
// }
// }
// Pattern6....................
// write the java multiplycation program using method
// public class ABc {
// public static int Product(int a, int b) {
// int product = a * b;
// return product;
// }

// public static void main(String[] args) {
// // Product(3, 9);
// System.out.println("The product of A and B is: " + Product(50, 90));
// }

// }
// write the java program to find the factorial of a number using method
// public class ABc {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number: ");
// int n = sc.nextInt();
// System.out.println("The factorial of " + n + " is: " + factorial(n));
// }

// // method to find the factorial of a number
// public static int factorial(int n) {
// int f = 1;
// for (int i = 1; i <= n; i++) {
// f = f * i;
// }
// return f;
// }
// }

// to check the number is prime or not using method
// public class ABc {
// public static boolean isPrime(int n) {
// if (n <= 1) {
// return true;
// }
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// return true;
// }
// }
// return false;
// }

// public static void main(String[] args) {
// System.out.println(isPrime(18)); // false
// System.out.println(isPrime(12)); // true

// }
// }
// to check the number is prime or not using method

// *********
// * *
// * *
// * *
// * *
// * *
// * *
// *********
// hollow rectangle pattern...............
// public class ABc {
// public static void hollow_rect(int rows, int colm) {
// for (int i = 1; i <= rows; i++) {
// for (int j = 1; j <= colm; j++) {
// if (i == 1 || i == rows || j == 1 || j == colm) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {

// hollow_rect(8, 9);
// }
// }
// *********
// *********
// *********
// *********
// *********
// *********
// *********
// public class ABc {
// public static void Shallow_rectangle(int rows, int colm) {
// for (int i = 1; i < rows; i++) {
// // space....
// for (int j = 1; j <= colm - 1; j++) {
// System.out.print(" ");
// }
// // star....
// for (int j = 1; j <= colm; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// }

// public static void main(String[] args) {
// Shallow_rectangle(8, 9);
// }
// }
// public class ABc {
// // solid rhombus pattern
// public static void Solid_rhombus(int row) {
// for (int i = 1; i <= row; i++)
// ;
// // inner loop
// // for (int j = 1; j <= colm - 1; j++) {
// // space
// for (int j = 1; j <= row - 1; j++) {
// System.out.print(" ");
// }
// // star
// for (int j = 1; j <= row; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int row = 5;
// Solid_rhombus(row);
// }

// }
// public class ABc {
// *****
// *****
// *****
// *****
// *****
// // Method to print a solid rhombus pattern
// public static void Solid_rhombus(int rows) {
// for (int i = 1; i <= rows; i++) {
// // Print leading spaces
// for (int j = 1; j <= rows - i; j++) {
// System.out.print(" ");
// }
// // Print stars
// for (int j = 1; j <= rows; j++) {
// System.out.print("*");
// }
// System.out.println(); // Move to the next line
// }
// }

// public static void main(String[] args) {
// int rows = 5; // Number of rows for the rhombus
// Solid_rhombus(rows);
// }
// }
// public class ABc {
// public static void Solid_rhombus(int n) {
// for (int i = 1; i <= n; i++) {
// // space....
// for (int j = 1; j <= n - 1; j++) {
// System.out.print(" ");
// }
// // star....
// for (int j = 1; j <= n; j++) {
// System.out.print("*");
// }
// System.out.println(); // Move to the next line

// }
// }

// public static void main(String[] args) {
// int n = 5;
// Solid_rhombus(n);
// }
// }
// public class ABc {
// // Method to print a solid rhombus pattern
// public static void Solid_rhombus(int rows) {
// for (int i = 1; i <= rows; i++) {
// // Print leading spaces
// for (int j = 1; j <= rows - i; j++) {
// System.out.print(" ");
// }
// // Print stars
// for (int j = 1; j <= rows; j++) {
// System.out.print("*");
// }
// System.out.println(); // Move to the next line
// }
// }

// public static void main(String[] args) {
// int rows = 5; // Number of rows for the rhombus
// Solid_rhombus(rows);
// }
// }
public class ABc {
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

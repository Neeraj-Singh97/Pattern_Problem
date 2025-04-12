import java.util.*;
import java.io.*;

public class main {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        System.out.println("Enter the character: ");
        ch = sc.next().charAt(0);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
        sc.close();

    }
}

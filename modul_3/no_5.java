package modul_3;

import java.util.Scanner;

public class no_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===Program Fibonacci===");
        System.out.print("Input : ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        sc.close();
    }
}

package uts;

import java.util.Scanner;

public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Input nomor not midi p :");
        int p = sc.nextInt();

        double pangkat = (p - 69)/12.0;
        double f = 440 * Math.pow(2, pangkat);

        System.out.printf("Frekuensi: %.2f Hz%n",f);

        sc.close();
    }
}

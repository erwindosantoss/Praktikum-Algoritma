package modul_4;

import java.util.Scanner;

public class no_2 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");

        while (true) {
            getInput(input);
        }
    }
    public static void getInput(Scanner input) {
        System.out.print("Masukkan angka pertama (desimal maksimal 4 angka di belakang koma): ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua (desimal maksimal 4 angka di belakang koma): ");
        double angka2 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %, ^): ");
        char operator = input.next().charAt(0);

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%' || operator == '^') {
            double hasil = hitung(operator, angka1, angka2);
            System.out.println("Hasil: " + hasil);
        } else {
            System.out.println("Operator yang dimasukkan tidak valid. Program berhenti.");
            System.exit(0);
        }
    }

    public static double hitung(char operator, double angka1, double angka2) {
        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = penjumlahan(angka1, angka2);
                break;
            case '-':
                hasil = pengurangan(angka1, angka2);
                break;
            case '*':
                hasil = perkalian(angka1, angka2);
                break;
            case '/':
                hasil = pembagian(angka1, angka2);
                break;
            case '%':
                hasil = modulus(angka1, angka2);
                break;
            case '^':
                hasil = perpangkatan(angka1, angka2);
                break;
        }

        return hasil;
    }

    public static double penjumlahan(double angka1, double angka2) {
        return angka1 + angka2;
    }

    public static double pengurangan(double angka1, double angka2) {
        return angka1 - angka2;
    }

    public static double perkalian(double angka1, double angka2) {
        return angka1 * angka2;
    }

    public static double pembagian(double angka1, double angka2) {
        return angka1 / angka2;
    }

    public static double modulus(double angka1, double angka2) {
        return angka1 % angka2;
    }

    public static double perpangkatan(double angka1, double angka2) {
        return Math.pow(angka1, angka2);
    } 
}

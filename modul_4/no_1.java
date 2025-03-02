package modul_4;

import java.util.Scanner;

public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Menu ====\n"
                + "1. Persegi\n"
                + "2. Persegi Panjang\n"
                + "3. Lingkaran\n"
                + "4. Segitiga");
        System.out.print("Input Pilihan : ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                hitungLuaspersegi();
                hitungKelilingpersegi();
                break;
            case 2:
                hitungLuasPersegipanjang();
                hitungKelilingpersegipanjang();
                break;
            case 3:
                hitungLingkaran();
                break;
            case 4:
                hitungSegitiga();
                break;
            default:

        }
        sc.close();
    }

    public static void hitungLuaspersegi() {
        double sisi = 4;
        double luas = sisi * sisi;

        System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + luas);
    }

    public static void hitungKelilingpersegi() {
        double sisi = 8;
        double keliling = 4 * sisi;
        System.out.println("Keliling persegi dengan sisi " + sisi + " adalah " + keliling);
    }

    
    public static void hitungLuasPersegipanjang() {
        double panjang = 3, lebar = 6;
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);

    }

    public static void hitungKelilingpersegipanjang() {
        double panjang = 3, lebar = 6;
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang: " + keliling);

    }

   
    public static void hitungLingkaran() {
        double jariJari = 14;

        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }

   
    public static void hitungSegitiga() {
        double alas = 3;
        double tinggi = 10;
        double sisiMiring = 5;

        double luas = 0.5 * alas * tinggi;
        double keliling = alas + sisiMiring + sisiMiring;

        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);
    }
}

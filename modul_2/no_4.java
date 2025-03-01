package modul_2;

import java.util.Scanner;

public class no_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===Hotel Erwin===");
        System.out.print(
            "--Jenis Kamar--\n" +
            "Deluxe\n"+
            "Executive\n"+
            "Suite\n"+
            "Masukan Jenis Kamar : ");
        String jenisKamar = sc.next().toLowerCase();
        System.out.print("Masukan Lama Inap : ");
        int lamaInap = sc.nextInt();
        System.out.print("Masukan Harga Kamar : ");
        int hargaKamar = sc.nextInt();

        double total = 0;

        switch (jenisKamar) {
            case "deluxe":
            total = (lamaInap * hargaKamar) + 0.08;
                break;
            case "executive":
            total = (lamaInap * hargaKamar) + 0.12;
                break;
            case "suite":
            total = (lamaInap * hargaKamar) + 0.18;
                break;
            default:
            System.out.println("Input yang anda masukan salah");
                break;
        }

        System.out.println("Total harga yang mesti anda bayar : " + total);
        sc.close();
    }
}

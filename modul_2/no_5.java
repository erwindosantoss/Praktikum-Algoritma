package modul_2;

import java.util.Scanner;

public class no_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===Program Parkir===");
        System.out.print(
            "---Jenis Kendaraan---\n"+
            "Motor\n"+
            "Mobil\n"+
            "Masukan Jenis Kendaraan : "
        );
        String jenisKendaraan = sc.next().toLowerCase();
        System.out.print("Masukan Jam Masuk : ");
        int jamMasuk = sc.nextInt();
        System.out.print("Masukan Menit Masuk : ");
        int menitMasuk = sc.nextInt();
        System.out.print("Masukan Jam Keluar : ");
        int jamKeluar = sc.nextInt();
        System.out.print("Masukan Menit Keluar : ");
        int menitKeluar = sc.nextInt();

        int selisihJam = jamKeluar - jamMasuk;
        int selisihMenit = menitKeluar - menitMasuk;
        int tarif = 0;

        switch (jenisKendaraan) {
            case "motor":
                if(selisihJam <= 1){
                    tarif = 1500;
                }else if (selisihJam > 1 || selisihMenit > 30){
                    tarif = 3000;
                }
                break;
            case "mobil":
                if(selisihJam <= 1){
                    tarif = 2000;
                }else if (selisihJam > 1 || selisihMenit > 30){
                    tarif = 4000;
                }
                break;
            default:
            System.out.println("Input yang anda masukan salah");
                break;
        }

        System.out.println("Tarif yang mesti anda bayar sebesar : " + tarif);
        sc.close();
    }
}

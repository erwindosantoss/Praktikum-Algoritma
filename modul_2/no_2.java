package modul_2;

import java.util.Scanner;

public class no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaMahasiswa = 2000;
        int biayaUmum = 3000;
        
        
        System.out.print("Apakah anda mahasiswa / pegawai ITHB : ");
        String status = sc.next();
        
        //masuk
        System.out.print("Input Jam Masuk : ");
        int jam_masuk = sc.nextInt();
        System.out.print("Input Menit Masuk : ");
        int menit_masuk = sc.nextInt();
        
        //keluar
        System.out.print("Input Jam Keluar : ");
        int jam_keluar = sc.nextInt();
        System.out.print("Input Menit Keluar : ");
        int menit_keluar = sc.nextInt();
        
        if(jam_masuk > jam_keluar){
            System.out.println("Input Eror");
        }
        
        int durasi = (jam_keluar - jam_masuk) * 60 + (menit_keluar - menit_masuk);
        if(durasi < 15){
            System.out.println("Tidak dikenai biaya parkir");
        }
        
        int jumlahJam = durasi / 60;
        int jumlahMenit = durasi % 60;

        
        int biayaParkir = 0;
        if (status.equals("y")) {
          biayaParkir = biayaMahasiswa * jumlahJam;
          System.out.println("Anda adalah mahasiswa/pegawai ITHB.");
        } else {
          biayaParkir = biayaUmum * jumlahJam;
          System.out.println("Anda adalah umum.");
        }
        System.out.println("Anda harus membayar sejumlah " + biayaParkir + " selama " + jumlahJam + " jam dan " + jumlahMenit + " menit.");

        sc.close();
    }
}

package modul_5;

import java.util.ArrayList;
import java.util.Scanner;

class Pasien {
    String nama;
    String alamat;
    String telepon;
    int usia;
    int gender;
    String keluhan;
    boolean penggunaBpjs;

    public Pasien(String nama, String alamat, String telepon, int usia, int gender, String keluhan, boolean penggunaBpjs) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.usia = usia;
        this.gender = gender;
        this.keluhan = keluhan;
        this.penggunaBpjs = penggunaBpjs;
    }
}

public class no_3 {
    public static Pasien inputPasien(Scanner scanner) {
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();

        System.out.print("Masukkan Telepon: ");
        String telepon = scanner.nextLine();

        System.out.print("Masukkan Usia: ");
        int usia = scanner.nextInt();

        System.out.print("Masukkan Gender (1=Laki-laki, 2=Perempuan): ");
        int gender = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Masukkan Keluhan: ");
        String keluhan = scanner.nextLine();

        System.out.print("Apakah pengguna BPJS? (true/false): ");
        boolean penggunaBpjs = scanner.nextBoolean();
        scanner.nextLine(); 
        return new Pasien(nama, alamat, telepon, usia, gender, keluhan, penggunaBpjs);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pasien> daftarPasien = new ArrayList<>();
        
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\nMasukkan data pasien:");
            daftarPasien.add(inputPasien(scanner));
            
            System.out.print("Apakah ingin menambahkan pasien lagi? (ya/tidak): ");
            String jawaban = scanner.nextLine().toLowerCase();
            lanjut = jawaban.equals("ya");
        }
        
        System.out.println("\nData Pasien yang telah dimasukkan:");
        for (Pasien pasien : daftarPasien) {
            System.out.println("Nama: " + pasien.nama + ", Alamat: " + pasien.alamat + ", Telepon: " + pasien.telepon + ", Usia: " + pasien.usia + ", Gender: " + (pasien.gender == 1 ? "Laki-laki" : "Perempuan") + ", Keluhan: " + pasien.keluhan + ", BPJS: " + (pasien.penggunaBpjs ? "Ya" : "Tidak"));
        }
        
        scanner.close();
    }
}

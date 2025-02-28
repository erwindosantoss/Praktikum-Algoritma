package modul_1;

import java.util.Scanner;

public class no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukan Alamat : ");
        String alamat = sc.nextLine();
        System.out.print("Masukan Telepon : ");
        String telepon = sc.nextLine();
        System.out.print("Masukan Gender : ");
        String gender = sc.nextLine();
        System.out.print("Masukan Usia : ");
        int usia = sc.nextInt();
        System.out.print("Status (true/false) : ");
        boolean status = sc.nextBoolean();
        System.out.print("Masukan Penghasilan : ");
        double penghasilan = sc.nextDouble();

        System.out.println("Nama saya " + nama + ", seorang " + gender + " tinggal di "+ alamat + ", dan Telepon "+ telepon +". Tahun ini usia saya " + usia + ", " + status + " , dan Penghasilan saya " + penghasilan + ".");

        sc.close();
    }
}

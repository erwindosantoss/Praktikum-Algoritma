package modul_3;

import java.util.Scanner;

public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Jumlah Mahasiswa : ");
        int mhs = sc.nextInt();
        int total = 0;
        for(int i = 1; i <= mhs; i++){
            System.out.print("Masukan nilai mahasiswa " + i + " : ");
            int nilai = sc.nextInt();
            total += nilai;
        }

        int rata = total / mhs;
        System.out.println("Nilai rata - rata untuk "+ mhs + " adalah " + rata);
        sc.close();
    }
}

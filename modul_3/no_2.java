package modul_3;

import java.util.Scanner;

public class no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Jumlah Pemilih : ");
        int jumlahPemilih = sc.nextInt();

        int pointPaslon1 = 0;
        int pointPaslon2 = 0;
        int pointPaslon3 = 0;

        for(int i = 1; i <= jumlahPemilih; i++){
            System.out.print("Masukan Jenis Pemilih " + i + " : ");
            String jenis = sc.next();
            System.out.print("Masukan Paslon Pilihan Pemilih (1/2/3) " + i + " : ");
            int paslon = sc.nextInt();

            

            if(jenis.equalsIgnoreCase("Mahasiswa")){
                switch (paslon) {
                    case 1:
                    pointPaslon1 += 1;
                        break;
                    case 2:
                    pointPaslon2 += 1;
                        break;
                    case 3:
                    pointPaslon3 += 1;
                        break;
                    default:
                        break;
                }
            }else if (jenis.equalsIgnoreCase("Dosen")){
                switch (paslon) {
                    case 1:
                    pointPaslon1 += 5;
                        break;
                    case 2:
                    pointPaslon2 += 5;
                        break;
                    case 3:
                    pointPaslon3 += 5;
                        break;
                    default:
                        break;
                }
            }

        }
        int pemenang = Math.max(pointPaslon1, Math.max(pointPaslon2, pointPaslon3));
    
        if(pemenang == pointPaslon1){
            System.out.println("Paslon pemenang adalah Paslon 1 dengan skor " + pointPaslon1);
        }else if (pemenang == pointPaslon2){
            System.out.println("Paslon pemenang adalah Paslon 2 dengan skor " + pointPaslon2);
        }else if (pemenang == pointPaslon3){
            System.out.println("Paslon pemenang adalah Paslon 3 dengan skor " + pointPaslon3);
        }
    }
}

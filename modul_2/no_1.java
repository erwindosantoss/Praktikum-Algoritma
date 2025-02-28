package modul_2;

import java.util.Scanner;

public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan banyak angka yang di input : ");
        int n = sc.nextInt();

        int genap = 0;
        int ganjil = 0;

        for(int i = 1; i <= n; i++){
            System.out.print("Masukan angka " + i + " : ");
            if(sc.hasNextInt()){
                int angka = sc.nextInt();
                if(angka % 2 == 0 ){
                    genap++;
                }else {
                    ganjil++;
                }
            }else {
                System.out.println("Input yang anda masukan salah program nanya menerima angka");
            }
        }

        if(genap > ganjil){
            System.out.println("Hasil = Dominan Genap");
        }else {
            System.out.println("Hasil = Dominan Ganjil");
        }
        sc.close();
    }    
}

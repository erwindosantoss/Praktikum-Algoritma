package modul_3;

import java.util.Scanner;

public class no_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean ulang = true;
        int max = 0;
        int count = 0;
        int total = 0;

        while (ulang) {
            System.out.print("Input angka = ");
            int angka = sc.nextInt();
            total += angka;
            count++;

            System.out.print("Masih mau input ? ");
            String inputLagi = sc.next().toLowerCase();

            if(angka > max){
                max = angka;
            }

            if(inputLagi.equals("t")){
                ulang = false;
            }
        }
        double rata = total/count;
        System.out.println("===================");
        System.out.println("Nilai Max : " + max);
        System.out.println("Nilai Rata - rata : " + rata);
        sc.close();
    }
}

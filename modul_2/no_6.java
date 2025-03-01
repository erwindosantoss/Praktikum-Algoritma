package modul_2;

import java.util.Scanner;

public class no_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Batas Atas : ");
        int batasAtas = sc.nextInt();
        System.out.print("Masukan Batas Bawah : ");
        int batasBawah = sc.nextInt();

        int total = 0;
        for(int i = batasAtas; i <= batasBawah; i+=5){
            System.out.print(i + ", ");
            total += i;
        }
        System.out.println("Totalnya adalah " + total);


        sc.close();
    }
}

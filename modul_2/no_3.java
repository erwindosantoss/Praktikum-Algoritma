package modul_2;

import java.util.Scanner;

public class no_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Segitiga Checker : ");
        System.out.print("Input Sisi A : ");
        int a = sc.nextInt();
        System.out.print("Input Sisi B : ");
        int b = sc.nextInt();
        System.out.print("Input Sisi C : ");
        int c = sc.nextInt();

        double segitiga = Math.pow(a, 2) + Math.pow(b, 2);
        double pangkatC = Math.pow(c, 2);


        if(pangkatC == segitiga){
            System.out.println("Segitiga Siku - Siku");
        }else if (pangkatC < segitiga){
            System.out.println("Segitiga Lancip");
        }else {
            System.out.println("Segitiga Tumpul");
        }
        sc.close();
    }
}

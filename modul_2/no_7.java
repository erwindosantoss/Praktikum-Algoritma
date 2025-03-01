package modul_2;

import java.util.Scanner;

public class no_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input 1: ");
        String planet1 = sc.nextLine();
        System.out.print("Input 2: ");
        String planet2 = sc.nextLine();

        int jarak = 0;

        if (planet1.equals("Mercury") && planet2.equals("Venus")) {
            jarak = 108;
        } else if (planet1.equals("Venus") && planet2.equals("Mercury")) {
            jarak = 108;
        } else if (planet1.equals("Venus") && planet2.equals("Earth")) {
            jarak = 162;
        } else if (planet1.equals("Earth") && planet2.equals("Venus")) {
            jarak = 162;
        } else if (planet1.equals("Earth") && planet2.equals("Mars")) {
            jarak = 225;
        } else if (planet1.equals("Mars") && planet2.equals("Earth")) {
            jarak = 225;
        } else {
            System.out.println("Jarak antara " + planet1 + " dan " + planet2 + " tidak ditemukan.");
        }

        System.out.println("Total = " + jarak + "jt km");
        
        sc.close();
    }
}

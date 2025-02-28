package modul_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class no_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Pajak : ");
        double pajak = sc.nextDouble();

        System.out.print("Masukan Gaji : ");
        int gaji = sc.nextInt();

        System.out.print("Masukan Bonus : ");
        int bonus = sc.nextInt();

        System.out.print("Masukan Denda : ");
        int denda = sc.nextInt();

        double penghasilan = gaji + bonus - denda;
        double total = penghasilan - (penghasilan * pajak);

        JOptionPane.showMessageDialog(null, total);

        sc.close();

    }
}

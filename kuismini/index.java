package kuismini;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Parkir Masuk Jam : ");
        double masuk = sc.nextInt();

        System.out.print("Parkir Keluar Jam : ");
        double keluar = sc.nextInt(); 

        double jumlahJam = keluar - masuk;

        System.out.print("Main biliard berapa jam : ");
        int jamBiliard = sc.nextInt();
        double total = 0;
        int temp = 0;

        if(jamBiliard < 3){
            for(double i = 0; i < jamBiliard; i++){
                temp += 60000;
                total = temp + 0.10;
            }
        }else if((jamBiliard % 3) == 0){
            temp = jamBiliard / 3;
            double harga = temp * 150000;
            total = harga + 0.10;
        }else {
            temp = jamBiliard % 3;
            int sum = 0;
            for(int i = 0; i < temp; i++){
                sum += 60000;
            }
            int hehe = (jamBiliard / 3) * 150000;
            total = sum + hehe + 0.10;
            
        }

        System.out.println(total);

        System.out.print("Beli Makanan : ");
        boolean makanan = sc.nextBoolean();
        
        if(makanan == true){
            System.out.print(
                "--Menu Makanan-- \n"+
                "1. Sate ayam 10.000\n"+
                "2. Soto ayam 5.000\n"+
                "Masukan Pilihan : ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    double sate = 10000 + 0.5;
                    break;
                case 2 :
                    double soto = 5000 + 0.5;
                default:
                    break;
            }
        }
        

        sc.close();

    }
}

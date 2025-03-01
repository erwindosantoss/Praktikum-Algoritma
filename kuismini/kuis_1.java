package kuismini;

import java.util.Scanner;

public class kuis_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Parkir Masuk Jam : ");
        int masuk = sc.nextInt();

        System.out.print("Parkir Keluar Jam : ");
        int keluar = sc.nextInt(); 

        int jamParkir = keluar - masuk;

        int biayaParkir = 0;

        if(jamParkir == 1){
            biayaParkir = 3000;
        }else if (jamParkir > 1) {
            int temp = 0;
            for(int i = 1; i < jamParkir; i++){
                temp += 1500;
                biayaParkir = 3000 + temp;
            }
        }

        System.out.print("Main biliard berapa jam : ");
        int jamBiliard = sc.nextInt();
        double total = 0;
        int temp = 0;

        if(jamBiliard < 3){
            for(int i = 0; i < jamBiliard; i++){
                temp += 60000;
                total = temp + 0.10;
            }
        }else if((jamBiliard % 3) == 0){
            temp = jamBiliard / 3;
            int harga = temp * 150000;
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

        System.out.print("Beli Makanan : ");
        boolean makanan = sc.nextBoolean();
        double biayaMakan = 0;
        
        if(makanan == true){
            System.out.print(
                "--Menu Makanan-- \n"+
                "1. Sate ayam 10.000\n"+
                "2. Soto ayam 5.000\n"+
                "Masukan Pilihan : ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    biayaMakan = 10000 + 0.5;
                    break;
                case 2 :
                    biayaMakan = 5000 + 0.5;
                default:
                System.out.println("Eror");
                    break;
            }
        }
        System.out.println(
            "Harga Biliar : " + total + "\n" +
            "Harga Parkir : " + biayaParkir + "\n" +
            "Harga Makanan : " + biayaMakan
        );

        sc.close();
    }
}

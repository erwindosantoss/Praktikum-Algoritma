package modul_5;

class Karyawan {
    String nama;
    String jabatan;
    String alamat;
    int penghasilan;

    public Karyawan (String nama, String jabatan, String alamat, int penghasilan){
        this.nama = nama;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.penghasilan = penghasilan;
    }

    public String printKaryawan(){
        return "Nama : " + nama + ", Jabatan : " + jabatan + ", Alamat : " + alamat + ", Penghasilan : " + penghasilan;
    }
}

class Alamat {
    String jalan;
    String kota;
    String provinsi;

    public Alamat (String jalan, String kota, String provinsi){
        this.jalan = jalan;
        this.kota = kota;
        this.provinsi = provinsi;
    }

    public String printAlamat(){
        return "Jalan : " + jalan + ", Kota : " + kota + ", Provinsi : " + provinsi;
    }
}

class Penghasilan {
    int gaji;
    int tunjanganTransport;
    int tunjanganMakan;

    public Penghasilan (int gaji, int tunjanganTransport, int tunjanganMakan){
        this.gaji = gaji;
        this.tunjanganTransport = tunjanganTransport;
        this.tunjanganMakan = tunjanganMakan;
    }

    public String printPenghasilan(){
        return "Gaji : " + gaji + ", Tunjangan Transport : " + tunjanganTransport + ", Tunjangan Makan : " + tunjanganMakan;
    }
}

public class no_2 {
    public static void main(String[] args) {
        Karyawan karyawan [] = new Karyawan [3] ;
        Alamat alamat [] = new Alamat [3];
        Penghasilan penghasilan [] = new Penghasilan[3];

        //Dummy Karyawan
        karyawan [0] = new Karyawan("Erwin Dosantos", "Presiden", "Bandung", 60000);
        karyawan [1] = new Karyawan("Mario Dosantos", "Wakil Presiden", "Bandung", 40000);
        karyawan [2] = new Karyawan("Farhan Dosantos", "Mensesneg", "Bandung", 20000);

        //Dummy Alamat
        alamat [0] = new Alamat("Jln. Terusan Bojongsoang", "Bandung", "Jawa Barat");
        alamat [1] = new Alamat("Jln. Merkarsari", "Bandung", "Jawa Barat");
        alamat [2] = new Alamat("Jln. Oepoi", "Kupang", "Nusa Tenggara Timur");

        //Dummy Penghasilan
        penghasilan [0] = new Penghasilan(50000, 5000, 5000);
        penghasilan [1] = new Penghasilan(30000, 5000, 5000);
        penghasilan [2] = new Penghasilan(10000, 5000, 5000);


        System.out.println("Data Karyawan PT. Erwin Sentosa : ");
        //Print Data
        for(int i = 0; i < 3; i++){
            //Print Karyawan
            System.out.println(karyawan[i].printKaryawan());
            //Print Alamat
            System.out.println(alamat[i].printAlamat());
            //Print Penghasilan
            System.out.println(penghasilan[i].printPenghasilan());
            System.out.println();
        }
    }
}

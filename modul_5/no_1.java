package modul_5;

class City {
    String nama;
    String provinsi;
    double latitude;
    double longitude;

    public City (String nama, String provinsi, double latitude, double longitude){
        this.nama = nama;
        this.provinsi = provinsi;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String toString(){
        return "Kota : " + nama + ", Provinsi : " + provinsi + ", latitude : " + latitude + ", longitute : " + longitude;
    }
}

public class no_1 {
    public static void main(String[] args) {
        City kotaBandung = new City("Bandung", "Jawa Barat", -6.9175, 107.6191);

        System.out.println(kotaBandung);
    }
}

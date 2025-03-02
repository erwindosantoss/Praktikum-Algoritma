package uts;

public class no_2 {
    public static void main(String[] args) {
        double t0 = 0.0; 
        double t2 = 300.0; 
        double tInterval = 10.0; 
        
        for(double i = t0; i <= t2; i += tInterval){
            double y = 10 * Math.pow(0.5, i / 25.0 );
            System.out.println("t = " + i + " Tahun, massa = " + y + " gram " );
        }
    }
}

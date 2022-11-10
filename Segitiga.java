public class Segitiga extends BangunDatar {
    int alas, tinggi;
    double miring;

    public Segitiga(int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas(){
        return (float) (0.5 * this.alas * this.tinggi);
    }
    
   
    static double pitagoras(double a, double b){
        double c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2) );
        return c;
    }

    public float keliling(){
        return (float) (this.alas + this.tinggi + pitagoras(alas, tinggi));
    }
}

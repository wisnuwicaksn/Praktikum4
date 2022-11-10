public class Persegi extends BangunDatar {
    int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }

    public float luas(){
        return this.sisi * sisi;
    }

    public float keliling(){
        return this.sisi * 4;
    }
}

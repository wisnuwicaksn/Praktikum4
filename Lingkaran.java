public class Lingkaran extends BangunDatar{
    private float pi = (float) 3.14;
    int r;

    public Lingkaran(int r){
        this.r = r;
    } 

    public float luas(){
        return (float) (this.pi * r * r);
    }

    public float keliling(){
        return (float) (2 * this.pi * r);
    }
}

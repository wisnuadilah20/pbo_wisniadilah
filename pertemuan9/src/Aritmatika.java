class Aritmatika {
    private int a, b;
    public Aritmatika(int x, int y)
    {
        this.a = x;
        this.b = y;
    }
    public int kali()
    {
        return a * b;
    }
    public void hasil(){
        System.out.println("Nilai A = " + this.a);
        System.out.println("Nilai B = " + this.b);
    }
}
class Perhitungan extends Aritmatika{
    protected int z;
    public Perhitungan(int z, int x, int y)
    {
        super(x, y);
        this.z = z;
    }
    public int Hitung()
    {
        return z + super.kali();
    }
    public void hasil(){
        System.out.println("Nilai Z = " + this.z);
        super.hasil();
    }
}

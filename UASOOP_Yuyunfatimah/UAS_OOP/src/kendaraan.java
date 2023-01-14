public abstract class kendaraan {
    protected String warna;
    protected int tahunProduksi;

    public kendaraan(String name, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    public abstract void getInfo();
}
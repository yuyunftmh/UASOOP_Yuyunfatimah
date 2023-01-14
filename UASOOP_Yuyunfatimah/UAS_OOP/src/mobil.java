public class mobil extends kendaraan{
    protected int grade;

    public mobil(String warna, int PlatNomor, int tahunProduksi){
        super(warna,tahunProduksi);
        this.tahunProduksi = tahunProduksi;
    }

    @Override
    public void getInfo(){
        System.out.println("warna : " + warna);
        System.out.println("tahunProduksi : " + tahunProduksi);
    }
}

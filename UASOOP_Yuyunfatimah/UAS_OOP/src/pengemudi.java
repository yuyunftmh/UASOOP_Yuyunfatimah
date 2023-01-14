public class pengemudi {
    private String name;
    private int usia;
    private kendaraan kendaraan;

    public pengemudi(String name, int usia){
        this.name = name;
        this.usia = usia;
    }

    public void setKendaraan(kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    public String getName(){
        return name;
    }

    public int getUsia(){
        return usia;
    }

    public kendaraan getKendaraan(){
        return kendaraan;
    }
}
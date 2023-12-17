package pertemuan4;

public class Handphone extends abstrack_Handphone implements tanggal {
//    atribut

    String nama, Imei, Merk, model, spesifikasi, Os, tanggal, versi;
//    atribut privat
    private double harga;
    private String Jenis_Handphone;

    @Override
    String notice() {
        return "Data telah dimasukkan";
    }

    String notice(String merk) {
        return "isi data lengkap";
    }
//    method

    void getmerk(String merk) {
        this.Merk = merk;
    }
//    static polimorphysme

    @Override
    void getmodel(String Model) {
        this.model = Model;
    }
//    static polimorphysme

    @Override
    void getspek(String spek) {
        this.spesifikasi = spek;
    }

    void getos(String versi) {
        this.Os = versi;
    }

    void getversi(String vers) {
        this.versi = vers;
    }

    public void setHarga(double price) {
        this.harga = price;
    }

    @Override
    public void gettanggal(String tgl, String bln, String thn) {
        tanggal = tgl + " / " + bln + " / " + thn;
    }

    String cetakmerk() {
        return Merk;
    }

    String cetakmodel() {
        return model;
    }

    String cetakspek() {
        return spesifikasi;
    }

    String cetakos() {
        return Os;
    }

    String cetaktanggal() {
        return tanggal;
    }

    String cetakversi() {
        return versi;
    }

    boolean Cek(String cetak) {
        if (cetak.equals(cetaktanggal())) {
            notice();
            return true;
        } else {
            notice();
            return false;
        }
    }
}
//    public String getJenis_Handphone() {
//        return Jenis_Handphone="Jenis Operasi : ";
//    }
//    konstruktor
//    public Handphone(){
//    this.nama= "Septa Ardiansyah";
//    this.Imei= "2218073";
//    this.Merk="Merk : ";
//    this.model="Model : ";
//    this.spesifikasi="Spesifikasi sistem : ";
//    this.Os="versi Os : ";
//    }
//    abstract method
//    }
//    method untuk menampilan notice
//    boolean Cek(String pilihos){
//        if(pilihos.equals(getos(versi))){
//        notice();
//        return true;
//    }

package pertemuan4;
public class Iphone extends Handphone{
    private String merek;
    private String model;
    private String spesifikasi;
    private double harga;
    private int stok;
    // Constructor
    public Iphone(String merek, String model, String spesifikasi, double harga, int stok) {
        this.merek = merek;
        this.model = model;
        this.spesifikasi = spesifikasi;
        this.harga = harga;
        this.stok = stok;
    }
    public String getmerk(){
        return merek;
    }
    public String getmodel(){
        return model;
    }
    public String getspek(){
        return spesifikasi;
    }
    public double getharga(){
        return harga;
    }
    public int getstok(){
        return stok;
    }
}
    
    // Metode untuk menampilkan informasi handphone
//    public void displayInfo() {
//        System.out.println("Merek: " + merek);
//        System.out.println("Model: " + model);
//        System.out.println("Spesifikasi: " + spesifikasi);
//        System.out.println("Harga: " + harga);
//        System.out.println("Stok: " + stok);
//    }
//}


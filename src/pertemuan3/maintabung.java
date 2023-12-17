/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Septa
 */
public class maintabung {
    public static void main(String[] args) {
    lingkaran lkr = new lingkaran(7);
    lkr.deskripsi();
        System.out.println("hasilnya adalah : "+lkr.hitluas());
        System.out.println("==================");
        tabung tbg = new tabung(7,20);
        tbg.keterangan();
        System.out.println("volumenya adalah : "+tbg.hitvolum());
    }
}

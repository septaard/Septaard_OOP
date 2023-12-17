/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7polimorphisme.casting;

/**
 *
 * @author Septa
 */
class S0001 extends pembayaran {

    public String nama, alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;

    public S0001() {
        this.nama = "septa ardiansyah";
        this.kode = "S0001";
        this.saldo = 500000;
        this.alamat = "malang,Wagir";
    }

    public double hasil() {
        return diskon;
    }
    @Override
    double cekKode(String input){
        if(input.compareTo(kode)==0){
            diskon=0.1;
        }else{
            diskon=0;
        }
        return diskon;
    }
    @Override
    double hitpembayaran(double bayar){
        diskon = bayar*diskon;
        total = bayar - diskon;
        return total;
    }
    double potsaldo(){
        return this.saldo-total;
    }
    @Override
    void tampilkanMember(){
        System.out.println("Member S0001 dengan diskon 10%");
    }
}

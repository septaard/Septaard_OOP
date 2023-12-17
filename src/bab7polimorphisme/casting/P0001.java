/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7polimorphisme.casting;

/**
 *
 * @author Septa
 */
class P0001 extends pembayaran{
    public String nama, alamat;
    public int saldo;
    public String kode;
    public double diskon, bayar, total;

    public P0001() {
        this.nama = "septa ardiansyah";
        this.kode = "P0001";
        this.saldo = 3000000;
        this.alamat = "malang,Wagir";
    }
    @Override
    double cekKode(String input){
        if(input.compareTo(kode)==0){
            diskon=0.3;
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
        System.out.println("Member P0001 dengan diskon 30%");
    }
}

    


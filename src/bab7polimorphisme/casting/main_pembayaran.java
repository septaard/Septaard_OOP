/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7polimorphisme.casting;

/**
 *
 * @author Septa
 */
public class main_pembayaran {
    public static void main(String[] args) {
        pembayaran payment;
        payment = new P0001();
        payment.tampilkanMember();
        if (payment instanceof P0001){
            P0001 p0001 = (P0001)payment;
            System.out.println("jenis member : "+p0001.member(p0001));
            System.out.println("total Pembelian : "+p0001.hitpembayaran(500000));
            System.out.println("Sisa Saldo : "+p0001.potsaldo());
        }
    }
}

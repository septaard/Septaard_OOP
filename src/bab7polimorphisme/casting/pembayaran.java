/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7polimorphisme.casting;

/**
 *
 * @author Septa
 */
public abstract class pembayaran {

    abstract double hitpembayaran(double bayar);

    abstract double cekKode(String input);

    abstract void tampilkanMember();

    String member(G0001 member) {
        return "gold";
    }

    String member(P0001 member) {
        return "platinum";
    }

    String member(S0001 member) {
        return "Silver";
    }
}

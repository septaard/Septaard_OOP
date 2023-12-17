/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Septa
 */
public class lingkaran {
    int r;
    double ph,luas;
    public lingkaran(int r){
//        r=7;
    this.r=r;
    ph=3.14;
    }
    void deskripsi(){
        System.out.println("Ini adalah hasil Menghitung");
    }
    double hitluas(){
        luas  =(ph*r*r);
        return luas;
    }
}

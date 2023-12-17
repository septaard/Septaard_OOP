/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3.latihan;

/**
 *
 * @author Septa
 */
public class penilaian {
    String NIM,Nama,kode_mk;
    int np1,np2,np3,nilaiprak,uts,uas;
    Double nilaiproses(){
        return ((np1*0.1)+(np2*0.2)+(np3*0.1)+(uts*0.2)+(nilaiprak*0.4));
    }
    double nilaiakhir(){
        return (nilaiproses()*0.6)+(uas*0.3);
    }
    double tampilNA(){
        return nilaiakhir();
    }
    double nilaikeaktifan(){
        return 0;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3.latihan;

/**
 *
 * @author Septa
 */
public class keaktifanmahasiswa extends penilaian{
    int nilai_keaktifan;
    public keaktifanmahasiswa(){
        this.nilai_keaktifan=0;
    }
    @Override
    double nilaikeaktifan(){
        return ((nilai_keaktifan*0.1)+nilaiakhir());
    }
}

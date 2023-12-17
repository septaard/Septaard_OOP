/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Septa
 */
public class tabung extends lingkaran{
//    int  = 10;
//    double phi = 3.14;
//    int t = 4;
//    double volum;
    int t;
    double volum,luaspermukaan;
    public tabung(int r,int t){
//        t = 20;
super(r);
     }
    void keterangan(){
        deskripsi();
        System.out.println("menghitung volume tabung");
    }
    double hitvolum(){
//     volum= ((phi*r*r)*t);
    volum=(hitluas()*t);
        return volum;
    }
}

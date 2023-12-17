/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3.satu;

/**
 *
 * @author Septa
 */
public class limassegitiga extends segitiga{
    double tinggilimas,vol;
    double volumelimas(){
        vol = ((0.333*Luas())*tinggilimas);
        return vol;
    }
   
}

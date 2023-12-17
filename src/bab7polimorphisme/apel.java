/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7polimorphisme;

/**
 *
 * @author Septa
 */
public class apel extends Buah{
    public  apel(){
        this.nama="apel";
    }
//    implementasi makanBuah() Khusus untuk apel
    void makanBuah(){
        System.out.println(nama+"dimakan dengan dikupas atau langsung di gigit");
    }
}

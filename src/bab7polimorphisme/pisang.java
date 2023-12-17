/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7polimorphisme;

/**
 *
 * @author Septa
 */
public class pisang extends Buah{
    public pisang(){
        this.nama="pisang";
    }
//    imlementasi makanbuah() khusus untuk pisang
    void makanbuah(){
        System.out.println(nama+"dimakan dengan di kupas kulit nya");
    }
}

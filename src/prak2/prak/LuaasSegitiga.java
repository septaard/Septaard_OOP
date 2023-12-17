/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak2.prak;

/**
 *
 * @author Septa
 */
public class LuaasSegitiga {
//    int alas,tinggi;
    double luas,alas,tinggi;;
    
//    menginisialisasikan nilai alas
    public LuaasSegitiga(){
        this.alas=10;
    }
    public double gettinggi(double tinggi){
        return this.tinggi=tinggi;
    }
    public double Luas(){
        luas=0.5*(alas*tinggi);
        return luas;
    }
    
}

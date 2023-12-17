package bab8;

import java.util.Scanner;
//public class trycatch2 {

public class throwException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlKaki;
        System.out.println("Berapa Jumlah kaki kerbau ?");

        try {
            System.out.println("Jumlah Kaki : ");
            jmlKaki = input.nextInt(); //Mendapatkan Input Dari User
            if (jmlKaki != 4) {
                //Jika jumlah kaki kerbau lebih atau kurang dari 4, maka akan terjad error throw new NullPointerException( s: "Terjadi Kesalahan Nih!");
                throw new NullPointerException("terjadi Kesalahan Nih");
            } else {
                System.out.println("Benar Jumlah kaki kerbau 4");
            }
        } catch (NullPointerException e) {
//Menampilkan Pesan Kesalahan e.printStackTrace ();
            e.printStackTrace();
        }
    
    }
}

package bab8;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lat_Exception {

    public static void main(String[] args) {
        try {
            int a, b, hasil;
//            membuat scanner baru
            Scanner keyboard = new Scanner(System.in);
            System.out.println("=====Program Pembagian=====");
            System.out.println("Masukkan angka 1 = ");
            a = Integer.parseInt(keyboard.next());
            System.out.println("Masukkan angka ke 2 = ");
            b = Integer.parseInt(keyboard.next());
            hasil = a / b;
            System.out.println(Integer.toString(hasil));
        } catch (ArithmeticException c) {
            JOptionPane.showMessageDialog(null, "nilai pembagi tidak boleh 0!!", "warning", 2);
        } catch (NumberFormatException d) {
            JOptionPane.showMessageDialog(null, "Input yang anda masukkan huruf bukann angka !!", "warning", 2);
        } finally {
            System.out.println("Terimakasih sudah menjalankan Program");
        }
    }
}

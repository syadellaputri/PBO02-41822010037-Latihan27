/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.pbo02.latihan27;
import java.util.Scanner;
/**
 *
 @author DelDel
 * Nama : Syadella Putri
 * NIM  : 41822010037
 * Nama : Anastasya Azami
 * NIM  : 41822010081
 */
public class PBO0241822010037Latihan27 {
 public static String hurufBesar(String kalimat){
        return kalimat.toUpperCase();
    }
    public static String hurufKecil(String kalimat){
        return kalimat.toLowerCase();
    }
    public static void main(String[] args) {
        System.out.println("FOrmat Latihan PBO");
        
        Scanner input=new Scanner(System.in);
        System.out.println("======= Program Perbandingan Nilai ======");
        System.out.print("Masukkan Kalimat : ");
        String kalimat=input.nextLine();
        String besar=hurufBesar(kalimat);
        String kecil=hurufKecil(kalimat);
        System.out.println("Huruf Besarr : "+besar);
        System.out.println("Huruf Besarr : "+kecil);
    }
}

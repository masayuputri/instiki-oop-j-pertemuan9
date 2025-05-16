/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan9;

/**
 *
 * @author masayu
 * TGL; 16 Mei 2025
 */
public class Pertemuan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mhsturunan rahma = new mhsturunan ();
        rahma.setNIM ("2301010443");
        rahma.setJKEL ("P");
        rahma.setNAMA ("Masayu Pradewi");
        
        System.out.println("Data Mahsiswa");
        System.out.printf("Nama : %s\n",rahma.nama);
        System.out.printf("NIM : %s\n",rahma.getNIM());
        System.out.printf("Jenis Kelamin : %s\n",rahma.getJKEL());
    }
    
}

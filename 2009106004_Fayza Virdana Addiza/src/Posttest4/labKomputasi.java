/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

/**
 *
 * @author Acer
 */
public class labKomputasi extends barangLab {
    public labKomputasi(String namaPeminjam, String barang, String tempat, Long banyak, String kondisi) {
        super(namaPeminjam, barang, tempat, banyak, kondisi);
    }
    
    @Override
    public void barangLabIn(String barang) {
        System.out.println(barang + "merupakan barang Laboratorium Komputasi.");
    }
    
}

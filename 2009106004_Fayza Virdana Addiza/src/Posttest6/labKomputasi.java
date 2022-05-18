/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest6;

/**
 *
 * @author Acer
 */
public class labKomputasi extends barangLab implements Peminjam {
    public labKomputasi(String namaPeminjam, String barang, String tempat, Long banyak, String kondisi) {
        super(namaPeminjam, barang, tempat, banyak, kondisi);
    }
    
    @Override
    public void barangLabIn(String barang) {
        System.out.println(barang + "merupakan barang Laboratorium Komputasi.");
    }
    
    @Override
    public void namaPeminjam (String namaPeminjam) {
        System.out.println("Nama Peminjam : " +namaPeminjam);
    }

    @Override
    public void barang(String barang) {
        System.out.println("Barang : "+barang);
    }

    @Override
    public void banyak(Long banyak) {
        System.out.println("Banyak : "+banyak);
    }
    
    public String getPeminjam(){
        return Peminjam;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan31.perkenalanmahasiswa;

/**
 *
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program perkenalan mahasiswa berbasis object
 */
public class PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10118052";
        mhs1.nama = "Bagus Syibro Malisi";
        mhs1.perkenalkanDiri();
        
        mhs1.nim = "10110270";
        mhs1.nama = "Indra Tiola";
        mhs1.perkenalkanDiri();
        
        mhs1.nim = "10110271";
        mhs1.nama = "Robi Tanzil Ganefi";
        mhs1.perkenalkanDiri();
        
        mhs1.nim = "10110269";
        mhs1.nama = "Muhammad Nur Awaludin";
        mhs1.perkenalkanDiri();
    }
    
}

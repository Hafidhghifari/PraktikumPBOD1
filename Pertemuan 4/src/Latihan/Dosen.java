/* 
 * Nama File    : Dosen.java
 * Deskripsi    : berisi class Dosen sebagai turunan dari class Pegawai
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 14 Maret 2026
 */

package Latihan;

import java.time.LocalDate;

abstract class Dosen extends Pegawai {
    
    protected String fakultas;
    
    public Dosen(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok); 
        this.fakultas = fakultas;
    }
}
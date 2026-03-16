/* 
 * Nama File    : Pegawai.java
 * Deskripsi    : berisi class Pegawai sebagai induk dari seluruh pegawai
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 14 Maret 2026
 */

package Latihan;

import java.time.LocalDate;

abstract class Pegawai {
    /* ATRIBUT */
    protected String nip, nama;
    protected LocalDate tglLahir, tmt;
    protected double gajiPokok;
    protected LocalDate tglSekarang = LocalDate.of(2025, 3, 14);

    /* METHOD */
    public Pegawai(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip; 
        this.nama = nama; 
        this.tglLahir = tglLahir; 
        this.tmt = tmt; 
        this.gajiPokok = gajiPokok;
    }

    public abstract void printInfo();
}


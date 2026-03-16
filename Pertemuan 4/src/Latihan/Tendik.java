/* 
 * Nama File    : Tendik.java
 * Deskripsi    : berisi class Tendik sebagai turunan dari class Pegawai
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 14 Maret 2026
 */

package Latihan;

import java.time.LocalDate;
import java.time.Period;

class Tendik extends Pegawai {
    private String bidang;
    
    public Tendik(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    public void printInfo() {
        Period masaKerja = Period.between(tmt, tglSekarang);
        LocalDate tglPensiun = tglLahir.plusYears(55).plusMonths(1).withDayOfMonth(1);
        double tunjangan = 0.01 * masaKerja.getYears() * gajiPokok;

        System.out.println("--- Data Tendik ---");
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir);
        System.out.println("TMT             : " + tmt);
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + tglPensiun);
        System.out.println("Gaji Pokok      : Rp " + gajiPokok);
        System.out.println("Tunjangan       : Rp " + tunjangan + "\n");
    }
}
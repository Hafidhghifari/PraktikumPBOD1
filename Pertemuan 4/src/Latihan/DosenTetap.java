/* 
 * Nama File    : DosenTetap.java
 * Deskripsi    : berisi class DosenTetap sebagai turunan dari class Dosen
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 14 Maret 2026
 */

package Latihan;

import java.time.LocalDate;
import java.time.Period;

class DosenTetap extends Dosen {
    
    private String nidn;
    
    public DosenTetap(String nip, String nidn, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }
    
    @Override
    public void printInfo() {
        Period masaKerja = Period.between(tmt, tglSekarang);
        LocalDate tglPensiun = tglLahir.plusYears(65).plusMonths(1).withDayOfMonth(1);
        double tunjangan = 0.02 * masaKerja.getYears() * gajiPokok;

        System.out.println("--- Data Dosen Tetap ---");
        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir);
        System.out.println("TMT             : " + tmt);
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + tglPensiun);
        System.out.println("Gaji Pokok      : Rp " + gajiPokok);
        System.out.println("Tunjangan       : Rp " + tunjangan + "\n");
    }
}
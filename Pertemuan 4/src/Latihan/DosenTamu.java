/* 
 * Nama File    : DosenTamu.java
 * Deskripsi    :  berisi class DosenTamu sebagai turunan dari class Dosen
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 14 Maret 2026
 */

package Latihan;

import java.time.LocalDate;
import java.time.Period;

class DosenTamu extends Dosen {
    
    private String nidk;
    private LocalDate tglAkhirKontrak;
    
    public DosenTamu(String nip, String nidk, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate tglAkhirKontrak) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk; 
        this.tglAkhirKontrak = tglAkhirKontrak;
    }
    
   
    @Override
    public void printInfo() {
        Period masaKerja = Period.between(tmt, tglSekarang);
        int sisaKontrak = (int) Period.between(tglSekarang, tglAkhirKontrak).toTotalMonths();
        double tunjangan = 0.025 * gajiPokok;

        System.out.println("--- Data Dosen Tamu ---");
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir);
        System.out.println("TMT             : " + tmt);
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Sisa Kontrak    : " + Math.max(0, sisaKontrak) + " bulan");
        System.out.println("Gaji Pokok      : Rp " + gajiPokok);
        System.out.println("Tunjangan       : Rp " + tunjangan + "\n");
    }
}
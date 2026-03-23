/*
Nama File   : PNS.java
Deskripsi   : Berisi atribut dan method dalam class PNS
Pembuat     : Muhammad Hafidh Al-Ghifari
Tanggal     : 20 Maret 2026
*/
package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    /* ATRIBUT */
    private String nip;
    private static int counterPNS = 0;
    
    /* METHOD */
    public PNS() {
        super();
        counterPNS++;
    }

    public PNS(String nama, String tgl_mulai, double pendapatan, String nip) {
        this(nama, tgl_mulai, "-", pendapatan, nip);
    }

    public PNS(String nama, String tgl_mulai, String alamat, double pendapatan, String nip) {
        super(nama, alamat, tgl_mulai, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai, LocalDate.now()).getYears() + 3;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Jumlah PNS: " + counterPNS);
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }
}
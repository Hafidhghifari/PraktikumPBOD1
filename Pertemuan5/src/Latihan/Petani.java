/*
Nama File   : Petani.java
Deskripsi   : Berisi atribut dan method dalam class petani
Pembuat     : Muhammad Hafidh Al-Ghifari
Tanggal     : 20 Maret 2026
*/

package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    /* ATRIBUT */
    private String asal_kota;
    private static int counterPetani = 0;

    /* METHOD */
    public Petani(String nama, String alamat, String tgl_mulai, double pendapatan, String asal_kota) {
        super(nama, alamat, tgl_mulai, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai, LocalDate.now()).getYears() + 1;
    }

    @Override
    public double hitungPajak() {
        return 0.0; 
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Jumlah Petani: " + counterPetani);
    }
}
/*
Nama File   : Pengusaha.java
Deskripsi   : Berisi atribut dan method dalam class pengusaha
Pembuat     : Muhammad Hafidh Al-Ghifari/24060124140133
Tanggal     : 20 Maret 2026
*/

package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    /* ATRIBUT */
    private String npwp;
    private static int counterPengusaha = 0;
    
    /* METHOD */
    public Pengusaha() {
        super();
        counterPengusaha++;
    }

    public Pengusaha(String nama, String alamat, String tgl_mulai, double pendapatan, String npwp) {
        super(nama, alamat, tgl_mulai, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai, LocalDate.now()).getYears() + 3;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan; 
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Jumlah Pengusaha: " + counterPengusaha);
    }
}
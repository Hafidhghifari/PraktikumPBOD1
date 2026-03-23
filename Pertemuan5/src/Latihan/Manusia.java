/*
Nama File   : Manusia.java
Deskripsi   : Berisi atribut dan method dalam class manusia
Pembuat     : Muhammad Hafidh Al-Ghifari/24060124140133
Tanggal     : 20 Maret 2026
*/
package Latihan;
import java.time.LocalDate;

public abstract class Manusia {
    /* ATRIBUT */
    protected String nama, alamat;
    protected LocalDate tgl_mulai;
    protected double pendapatan;
    protected static int counterMns = 0; 

    /* METHOD */
    public Manusia() {
        counterMns++;
    }

    public Manusia(String nama, String alamat, String tgl_mulai, double pendapatan) {
        this.nama = nama;
        this.alamat = alamat;
        this.tgl_mulai = LocalDate.parse(tgl_mulai); 
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public LocalDate getTglMulai() {
        return tgl_mulai;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTglMulai(String tgl_mulai) {
        this.tgl_mulai = LocalDate.parse(tgl_mulai);
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tgl Mulai: " + tgl_mulai);
        System.out.println("Pendapatan: " + pendapatan);
    }
}
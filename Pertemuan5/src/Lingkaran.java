/* 
 * Nama File    : Lingkaran.java
 * Deskripsi    : berisi class utama untuk menjalankan Lingkaran
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 17 Maret 2026
 */
public class Lingkaran extends BangunDatar implements IResize{
    /* ATRIBUT */
    private double jari;
    
    /* METHOD */
    public Lingkaran() {
        jari = 0;
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return jari * jari * Math.PI;
    }

    public double getKeliling() {
        return Math.PI * jari * 2;
    }

    @Override
    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari: " + getJari());
        System.out.println("Diameter: " + getJari() * 2); 
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }
}
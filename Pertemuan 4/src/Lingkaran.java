/* 
 * Nama File    : Lingkaran.java
 * Deskripsi    : berisi class utama untuk menjalankan Lingkaran
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 10 Maret 2026
 */
public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;

    public Lingkaran() {
        this.jariJari = 0;
    }

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public Lingkaran(double jariJari, String warna, String border) {
        super(warna, border);
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void zoomIn() {
        jariJari = jariJari * 1.1;
    }

    @Override
    public void zoomOut() {
        jariJari = jariJari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jariJari = jariJari * percent / 100.0;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis     : Lingkaran");
        System.out.println("Jari-jari : " + jariJari);
        System.out.println("Luas      : " + getLuas());
        System.out.println("Keliling  : " + getKeliling());
    }
}
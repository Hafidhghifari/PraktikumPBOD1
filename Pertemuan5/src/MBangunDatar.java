/* 
 * Nama File    : MBangunDatar.java
 * Deskripsi    :berisi class utama untuk menjalankan MBangunDatar
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 17 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        // Objek Persegi
        Persegi p1 = new Persegi(10, "Kuning", "Hijau");
        Persegi p2 = new Persegi(8, "Merah", "Hitam");

        // Objek Lingkaran
        Lingkaran l1 = new Lingkaran(7, "Hitam", "Biru");
        Lingkaran l2 = new Lingkaran(6, "Putih", "Ungu");

        // ====== IResize ======
        IResize resizePersegi = p1;
        IResize resizeLingkaran = l1;

        System.out.println("=== SEBELUM RESIZE ===");
        System.out.println("Luas p1: " + p1.getLuas() + ", Keliling p1: " + p1.getKeliling());
        System.out.println("Luas l1: " + l1.getLuas() + ", Keliling l1: " + l1.getKeliling());

        resizePersegi.zoom(20);    // p1 diperbesar 20%
        resizeLingkaran.zoom(20);  // l1 diperbesar 20%

        System.out.println("\n=== SESUDAH RESIZE (20%) ===");
        System.out.println("Luas p1: " + p1.getLuas() + ", Keliling p1: " + p1.getKeliling());
        System.out.println("Luas l1: " + l1.getLuas() + ", Keliling l1: " + l1.getKeliling());

        // ====== isEqualLuas & isEqualKeliling ======
        System.out.println("\n=== PERBANDINGAN PERSEGI ===");
        System.out.println("p1 isEqualLuas p2: " + p1.isEqualLuas(p2));
        System.out.println("p1 isEqualKeliling p2: " + p1.isEqualKeliling(p2));

        System.out.println("\n=== PERBANDINGAN LINGKARAN ===");
        System.out.println("l1 isEqualLuas l2: " + l1.isEqualLuas(l2));
        System.out.println("l1 isEqualKeliling l2: " + l1.isEqualKeliling(l2));
    }
}
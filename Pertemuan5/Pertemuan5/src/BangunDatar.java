/* 
 * Nama File    : BangunDatar.java
 * Deskripsi    : berisi class utama untuk menjalankan BangunDatar
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 17 Maret 2026
 */

public abstract class BangunDatar {
   /* Atribut */
   private int jmlSisi;
   private String warna, border;
   private static int counterBangunDatar = 0;

   /* Method */
   public BangunDatar() {
    counterBangunDatar++;
   }

   public BangunDatar(int jmlSisi, String warna, String border) {
    this.jmlSisi = jmlSisi;
    this.warna = warna;
    this.border = border;
    counterBangunDatar++;
   }

   public int getJmlSisi() {
    return jmlSisi;
   }

   public void setJmlSisi(int jmlSisi) {
    this.jmlSisi = jmlSisi;
   }

   public String getWarna() {
    return warna;
   }

   public void setWarna(String warna) {
    this.warna = warna;
   } 

   public String getBorder() {
    return border;
   }

   public void setBorder(String border) {
    this.border = border;
   }

   public void printInfo() {
    System.out.println("Jumlah Sisi: " + jmlSisi);
    System.out.println("Warna: " + warna);
    System.out.println("Border: " + border);
   }

   public static void counterBangunDatar() {
    System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
   }

   public abstract double getLuas();
   
   public abstract double getKeliling();

   public boolean isEqualLuas(BangunDatar X) {
    return this.getLuas() == X.getLuas();
   }

   public boolean isEqualKeliling(BangunDatar X) {
    return this.getKeliling() == X.getKeliling();
   }

}
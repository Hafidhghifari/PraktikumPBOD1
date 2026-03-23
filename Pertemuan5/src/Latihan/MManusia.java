/*
Nama File   : MManusia.java
Deskripsi   : Berisi main class untuk menjalankan program
Pembuat     : Muhammad Hafidh Al-Ghifari/24060124140133
Tanggal     : 20 Maret 2026
*/
package Latihan;

public class MManusia {
  public static void main(String[] args) {
    PNS p1 = new PNS("Satriyo", "2006-04-01", "Jl. Seroja", 15000000, "198302032006041002");
    Pengusaha pe1 = new Pengusaha("Adhy", "Jl.Air", "2000-01-01", 55000000, "000-556-773-212-000-5");
    Petani pt1 = new Petani("Nugraha", "Jl. Bunga 9 Tembalang", "1977-01-09", 5000000, "Wonogiri");

    PNS p2 = new PNS("Panji", "2010-04-01", 10000000, "198004212010041002");

    p2.setAlamat("Jl. Panorama 111 Tembalang");
    
    System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
    System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
    System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
    System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
    
    System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
    System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
    System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
    
    System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
    System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
    System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

    p1.cetakInfo();
    pe1.cetakInfo();
    pt1.cetakInfo();
  }
}
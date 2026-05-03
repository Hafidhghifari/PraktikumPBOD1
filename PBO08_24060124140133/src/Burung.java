/*
 * File         : Burung.java
 * Deskripsi    : Class Burung
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 3 Mei 2026
 */

public class Burung extends Anabul {
  public Burung(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println(nama + " bergerak terbang");
  }

  @Override
  public void bersuara() {
    System.out.println(nama + " bersuara cuit");
  }
}
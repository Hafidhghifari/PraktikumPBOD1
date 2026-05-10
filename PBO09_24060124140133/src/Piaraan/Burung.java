/*
 * File         : Burung.java
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 10 Mei 2026
 */

package Piaraan;

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
/*
 * File         : Anjing.java
 * Deskripsi    : Subclass Anjing
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 26 April 2026
 */

package Soal3;
public class Anjing extends Anabul {
  public Anjing(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println(nama + " bergerak melata");
  }

  @Override
  public void bersuara() {
    System.out.println(nama + " bersuara guk-guk");
  }
}
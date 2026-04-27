/*
 * File         : Civitasakademika.java
 * Deskripsi    : Superclass Civitas Akademika
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 26 April 2026
 */

package Soal4;
public abstract class Civitasakademika {
  protected String nama;

  public Civitasakademika(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  public abstract String getNomor();
}
/*
 * File         : Dosen.java
 * Deskripsi    : Subclass Dosen
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 26 April 2026
 */

package Soal4;
public class Dosen extends Civitasakademika {
  private String nip;

  public Dosen(String nama, String nip) {
    super(nama);
    this.nip = nip;
  }

  public String getNomor() {
    return nip;
  }
}
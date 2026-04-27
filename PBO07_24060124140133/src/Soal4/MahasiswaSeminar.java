/*
 * File         : MahasiswaSeminar.java
 * Deskripsi    : Subclass Mahasiswa
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 26 April 2026
 */

package Soal4;
public class MahasiswaSeminar extends Civitasakademika {
  private String nim;
  private Dosen dosenWali;

  public MahasiswaSeminar(String nama, String nim) {
    super(nama);
    this.nim = nim;
  }

  public String getNomor() {
    return nim;
  }
  
  public void setWali(Dosen d) {
    this.dosenWali = d;
  }

  // j. menampilkan info data mahasiswa
  public void tampilDataMahasiswa() {
    System.out.println("NIM   : " + nim);
    System.out.println("Nama  : " + nama);
    System.out.println("Wali  : " + (dosenWali != null ? dosenWali.getNama() : "-"));
    System.out.println();
  }
}

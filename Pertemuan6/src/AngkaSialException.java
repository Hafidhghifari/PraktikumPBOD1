/* Nama File    : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 30 Maret 2026 
 */

public class AngkaSialException extends Exception {
  public AngkaSialException(){
    super("jangan memasukkan angka 13 karena angka sial !!!");
  }
}
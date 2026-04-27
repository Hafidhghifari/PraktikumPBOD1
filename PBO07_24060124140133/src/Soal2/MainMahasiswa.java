/*
 * File         : MainMahasiswa.java
 * Deskripsi    : Program utama Overloading Mahasiswa
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 26 April 2026
 */

package Soal2;
public class MainMahasiswa {
    public static void main(String[] args) {

    Mahasiswa m1 = new Mahasiswa();
    m1.setProgramStudi();
    m1.tampil();

    Mahasiswa m2 = new Mahasiswa();
    m2.setProgramStudi("Informatika");
    m2.tampil();

    Mahasiswa m3 = new Mahasiswa();
    m3.setProgramStudi(m2);
    m3.tampil();

    Mahasiswa m4 = new Mahasiswa("240600124140011", "Hadi", "Artificial Intelligence");
    m4.tampil();

    Mahasiswa m5 = new Mahasiswa(m4);
    m5.tampil();
  }
}

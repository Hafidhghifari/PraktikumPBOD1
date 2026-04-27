/*
 * File         : MainAnabul.java
 * Deskripsi    : File main Anabul
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 26 April 2026
 */

package Soal3;
public class MainAnabul {
  public static void main(String[] args) {
    Anabul kucing = new Kucing("Kucing");
    Anabul anjing = new Anjing("Anjing");
    Anabul burung = new Burung("Burung");

    kucing.gerak();
    kucing.bersuara();

    System.out.println();

    anjing.gerak();
    anjing.bersuara();

    System.out.println();

    burung.gerak();
    burung.bersuara();
  }
}

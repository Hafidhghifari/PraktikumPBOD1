/* 
 * Nama File    : Main.java
 * Deskripsi    : berisi class utama untuk menjalankan program
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 14 Maret 2026
 */

package Latihan;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dosenBambang = new DosenTetap(
            "197912052008021001",
            "0005127902",
            "Prof. Bambang Suryadi",
            LocalDate.of(1979, 12, 5),
            LocalDate.of(2008, 2, 1),
            9100000.0,
            "Fakultas Hukum"
        );

        DosenTamu dosenLaila = new DosenTamu(
            "198808142021091014",
            "DT2025014",
            "Dr. Laila Azzahra",
            LocalDate.of(1988, 8, 14),
            LocalDate.of(2021, 9, 1),
            5750000.0,
            "Fakultas Psikologi",
            LocalDate.of(2026, 12, 31)
        );

        Tendik tendikRizky = new Tendik(
            "199301252019051021",
            "Rizky Anugerah",
            LocalDate.of(1993, 1, 25),
            LocalDate.of(2019, 5, 1),
            3980000.0,
            "Keuangan"
        );

        dosenBambang.printInfo();
        dosenLaila.printInfo();
        tendikRizky.printInfo();
    }
}
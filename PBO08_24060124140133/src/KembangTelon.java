/*
 * File         : KembangTelon.java
 * Deskripsi    : Subclass Kucing
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 3 Mei 2026
 */

public class KembangTelon extends Kucing {
    public KembangTelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public String toString() {
        return "Kembangtelon: " + this.getNama() + " (" + this.getBobot() + " kg)";
    }
}
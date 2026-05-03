/*
 * File         : Datum.java
 * Deskripsi    : Class Datum
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 3 Mei 2026
 */

public class Datum<T> {
    private T isi;

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    public T getIsi() {
        return this.isi;
    }
}
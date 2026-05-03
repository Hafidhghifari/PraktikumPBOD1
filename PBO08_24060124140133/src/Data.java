/*
 * File         : Data.java
 * Deskripsi    : Class Data
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 3 Mei 2026
 */

public class Data<T> {
    private T[] ruang;

    private int banyak;

    public Data() {
        this.ruang = (T[]) new Object[100];
        this.banyak = 0;
    }

    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Parameter harus dalam rentang 1..100.");
        }

        return ruang[posisi - 1];
    }

    public void setIsi(int posisi, T obj) {
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Parameter harus dalam rentang 1..100.");
        }

        this.ruang[posisi - 1] = obj;
        this.banyak++;
    }

    public int getSize() {
        return this.banyak;
    }
}
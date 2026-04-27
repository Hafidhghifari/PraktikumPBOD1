/*
 * File         : Seminar.java
 * Deskripsi    : Class Seminar
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 26 April 2026
 */
package Soal4;
public class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakpeserta = 0;
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void registrasi(Civitasakademika peserta) {
        if (banyakpeserta < pesertas.length) {
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
        } else {
            System.out.println("Registrasi gagal. Kapasitas penuh.");
        }
    }

    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        System.out.println("=======================");

        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". "
                    + pesertas[i].getNomor()
                    + " - "
                    + pesertas[i].getNama());
        }
        System.out.println();
    }

    public int countMahasiswa() {
        int jumlah = 0;

        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof MahasiswaSeminar) {
                jumlah++;
            }
        }
        return jumlah;
    }
}

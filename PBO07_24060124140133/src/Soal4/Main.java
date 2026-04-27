/*
 * File         : Main.java
 * Deskripsi    : Program utama Seminar
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 26 April 2026
 */

package Soal4;
public class Main {
    public static void main(String[] args) {
        Seminar seminar = new Seminar();

        Dosen dosen1 = new Dosen("Dr.Danar", "12345678901");
        Dosen dosen2 = new Dosen("Prof.Hadi", "12345678902");

        MahasiswaSeminar mhs1 = new MahasiswaSeminar("24060124130001", "Bagas");
        MahasiswaSeminar mhs2 = new MahasiswaSeminar("24060124140002", "Rizki");
        MahasiswaSeminar mhs3 = new MahasiswaSeminar("24060124120003", "Syahrul");
        MahasiswaSeminar mhs4 = new MahasiswaSeminar("24060124130004", "Luthfi");
        MahasiswaSeminar mhs5 = new MahasiswaSeminar("24060124140005", "Halimawan");

        mhs1.setWali(dosen1);
        mhs2.setWali(dosen1);
        mhs3.setWali(dosen2);
        mhs4.setWali(dosen2);
        mhs5.setWali(dosen1);

        seminar.registrasi(dosen1);
        seminar.registrasi(dosen2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);
        seminar.registrasi(mhs4);
        seminar.registrasi(mhs5);

        System.out.println("Jumlah peserta seminar: " + seminar.countPeserta());
        System.out.println("Jumlah peserta mahasiswa: " + seminar.countMahasiswa());
        System.out.println();

        System.out.println("Daftar peserta seminar:");
        seminar.tampilPeserta();
        System.out.println();

        System.out.println("Data mahasiswa:");
        mhs1.tampilDataMahasiswa();
        mhs2.tampilDataMahasiswa();
        mhs3.tampilDataMahasiswa();
        mhs4.tampilDataMahasiswa();
        mhs5.tampilDataMahasiswa();
    }
}
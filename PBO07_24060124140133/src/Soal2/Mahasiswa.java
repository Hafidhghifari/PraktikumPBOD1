/*
 * File         : Mahasiswa.java
 * Deskripsi    : Class Mahasiswa (Overloading)
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 26 April 2026
 */

package Soal2;

public class Mahasiswa {
 
    // Atribut
    private String nim;
    private String nama;
    private String programStudi;
 
    // (c) Konstruktor default
    public Mahasiswa() {
        this.nim          = "-999";
        this.nama         = "n/a";
        this.programStudi = "n/a";
    }
 
    // (d) Konstruktor tiga parameter
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim          = nim;
        this.nama         = nama;
        this.programStudi = programStudi;
    }
 
    // (e) Konstruktor kloning dari objek Mahasiswa lain
    public Mahasiswa(Mahasiswa lain) {
        this.nim          = lain.nim;
        this.nama         = lain.nama;
        this.programStudi = lain.programStudi;
    }
 
    // (a) Overloading setProgramStudi — tiga varian
    // Varian 1: tanpa parameter
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }
 
    // Varian 2: satu parameter String
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }
 
    // Varian 3: satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa lain) {
        this.programStudi = lain.programStudi;
    }
 
    // menampilkan data mahasiswa
    public void tampil() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + programStudi);
    }
}
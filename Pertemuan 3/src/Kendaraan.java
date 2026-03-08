/*
 * Nama File    : Kendaraan.java
 * Deskripsi    : Class Kendaraan dengan atribut nomor plat dan jenis
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 6 Maret 2026
 */
public class Kendaraan {

    /*************** ATRIBUT ***************/
    private String noPlat;
    private String jenis;

    /*************** METHOD ****************/
    //Konstruktor tanpa parameter
    public Kendaraan() {
        this(" ", " ");
    }

    //Konstruktor dengan Parameter
    public Kendaraan(String noPlat ,String jenis) {
        this.noPlat = noPlat;
        if (jenis == "motor" || jenis == "mobil" || jenis == "") {
            this.jenis = jenis;
        }
    }

    //Selektor
    public String getnoPlat() {
        return this.noPlat;
    }

    public String getJenis() {
        return this.jenis;
    }

    //Mutator
    public void setnoPlat(String newNoPlat) {
        this.noPlat = newNoPlat;
    }

    public void setJenis(String newJenis) {
        if (newJenis == "motor" || newJenis == "mobil") {
            this.jenis = newJenis;
        }
    }

}

/*
 * Nama File    : Dosen.java
 * Deskripsi    : Class Dosen dengan atribut NIP, nama, dan program studi
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 6 Maret 2026
 */
public class Dosen {

    /*************** ATRIBUT ***************/
    private String nip;
    private String nama;
    private String prodi;
    
    /*************** METHOD ****************/
    //Konstruktor tanpa parameter
    public Dosen() {
        this(" ", " ", " ");
    }

    //Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Selektor
    public String getnip() {
        return this.nip;
    }

    public String getnama() {
        return this.nama;
    }

    public String getprodi() {
        return this.prodi;
    }

    //Mutator
    public void setnip(String newNip) {
        this.nip = newNip;
    }

    public void setnama(String newNama) {
        this.nama = newNama;
    }

    public void setprodi(String newProdi) {
        this.prodi = newProdi;
    }

}

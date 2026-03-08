/*
 * Nama File    : MataKuliah.java
 * Deskripsi    : Class MataKuliah dengan atribut ID mata kuliah, nama, dan jumlah SKS
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 6 Maret 2026
 */
public class MataKuliah {

    /*************** ATRIBUT ***************/
    private String idMatkul;
    private String nama;
    private int sks;
    
    /*************** METHOD ****************/
    //Konstruktor tanpa parameter
    public MataKuliah () {
        this(" ", " ", 0);
    }

    //Konstruktor dengan parameter
    public MataKuliah(String idMatkul ,String nama ,int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks =sks;
    }

    //Selektor
    public String getidMatkul() {
        return this.idMatkul;
    }

    public String getNama() {
        return this.nama;
    }

    public int getSks() {
        return this.sks;
    }

    //Mutator
    public void setidMatkul(String newIdMatkul) {
        this.idMatkul = newIdMatkul;
    }

    public void setnama(String newNama) {
        this.nama = newNama;
    }

    public void setsks(int newSks){
        this.sks = newSks;
    }

}

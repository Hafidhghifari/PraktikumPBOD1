/*
 * Nama File    : Mahasiswa.java
 * Deskripsi    : Class Mahasiswa dengan atribut NIM, nama, dan program studi
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 6 Maret 2026
 */
import java.util.ArrayList;

public class Mahasiswa {
   /*************** ATRIBUT ***************/
    
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali; 
    private Kendaraan kendaraan;

    /*************** METHOD ****************/
    //Konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa(){
        this(" ", " ", " ");
    }
    //Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    //Selektor
    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    } 

    public String getProdi() {
        return this.prodi;
    }

    public Dosen getDosenWali() {
        return this.dosenWali;
    }

    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

     public int getJumlahMatKul(){
        return listMatkul.size();
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for(int i=0; i<listMatkul.size(); i++){
            totalSKS += listMatkul.get(i).getSks();
        }
        return totalSKS;
    }

    //Mutator
    public void setNim(String newNim) {
        this.nim = newNim;
    }

    public void setNama(String newNama) {
        this.nama = newNama;
    }

    public void setProdi(String newProdi) {
        this.prodi = newProdi;
    }

    public void setDosenWali(Dosen newDosenWali) {
        this.dosenWali = newDosenWali;
    }

    public void setKendaraan(Kendaraan newKendaraan) {
        this.kendaraan = newKendaraan;
    }

    public void addMatkul(MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: " + dosenWali.getnama());

        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println("Nama Mata Kuliah ke-" + (i + 1) + ": " + listMatkul.get(i).getNama());
        }

        System.out.println("No Plat: " + kendaraan.getnoPlat());
        System.out.println("Jenis Kendaraan: " + kendaraan.getJenis());
    }
}

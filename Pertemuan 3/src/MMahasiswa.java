/*
 * Nama File    : MMahasiswa.java
 * Deskripsi    : Program main mahasiswa
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 6 Maret 2026
 */
public class MMahasiswa {  
public static void main(String[] args) {
    MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
    MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
    Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
    Dosen D1 = new Dosen("123", "Andi", "informatika");
    Kendaraan K1 = new Kendaraan("H1234AB", "motor");

    M1.setDosenWali(D1);
    M1.setKendaraan(K1);
    M1.addMatkul(PBO);
    M1.addMatkul(MBD);


    MataKuliah STD = new MataKuliah("STD", "Struktur Data", 3);
    MataKuliah BDT = new MataKuliah("BDT", "Basis Data", 3);
    Mahasiswa M2 = new Mahasiswa("235", "Budi", "Informatika");
    Dosen D2 = new Dosen("002", "Sari", "Informatika");
    Kendaraan K2 = new Kendaraan("H5678CD", "mobil");

    M2.setDosenWali(D2);
    M2.setKendaraan(K2);
    M2.addMatkul(STD);
    M2.addMatkul(BDT);

    System.out.println("===== Mahasiswa 1 =====");
    M1.printDetailMhs();
    System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
    System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    
    System.out.println("===== Mahasiswa 2 =====");
    M2.printDetailMhs();
    System.out.println("Jumlah Mata Kuliah = " + M2.getJumlahMatKul());
    System.out.println("Jumlah SKS Mata Kuliah = " + M2.getJumlahSKS());

}
}
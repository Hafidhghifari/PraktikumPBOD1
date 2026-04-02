/* Nama File    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
                  pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 30 Maret 2026 
 */

public class AngkaSial{

  public void cobaAngka(int angka) throws AngkaSialException{
    if(angka==13) {
      throw new AngkaSialException();
    }
    System.out.println(angka+" bukan angka sial");
  }

  public static void main(String[] args){
    AngkaSial as = new AngkaSial();
    try{
      as.cobaAngka(10);
      as.cobaAngka(13);
      as.cobaAngka(12);
    }catch(AngkaSialException ase){
      //method getMessage() telah ada pada kelas "Exception"
      System.out.println(ase.getMessage());
      System.out.println("hati-hati memasukkan angka!!!");
    }
  }
}

/* 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? */

/* TIDAK dieksekusi ketika eksepsi terjadi. Saat angka == 13, perintah throw new AngkaSialException() 
langsung menghentikan eksekusi method, sehingga baris 12 tidak pernah dicapai. */

/* Apakah baris 21 pada AngkaSial.java di atas dieksekusi? */

/* DIEKSEKUSI. Ketika eksepsi dilempar dari cobaAngka(13), kontrol program langsung melompat 
keluar dari blok try dan masuk ke blok catch di baris 21 untuk menangkap dan menampilkan pesan error. */
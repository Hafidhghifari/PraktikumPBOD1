/* Nama File    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi uang akan menolak input
                  jari-jari lingkaran yang bernilai nol
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 30 Maret 2026 
 */

// class Lingkaran
 class Lingkaran {
  private double jariJari;

  public Lingkaran(double jariJari){
    this.jariJari = jariJari;
  }

  public double hitungKeliling(){
    double keliling = 2*Math.PI*jariJari;
    return keliling;
  }
}

// class Asersi2
public class Asersi2{
  public static void main(String[] args){
    double jariJari = 0;
    assert (jariJari > 0):"jari jari tidak boleh nol!!!";
    
    Lingkaran l = new Lingkaran(jariJari);
    double kelilingLingkaran = l.hitungKeliling();
    System.out.println("keliling lingkaran = " + kelilingLingkaran);
  }
}

/* Secara konsep, apakah ada yang kurang tepat pada program Asersi2 di atas? */

/* assert seharusnya digunakan untuk mendeteksi bug internal, bukan untuk memvalidasi input pengguna.
Untuk memvalidasi jariJari yang bernilai 0, seharusnya menggunakan Exception, bukan assert, karena assert 
bisa dinonaktifkan saat runtime. */


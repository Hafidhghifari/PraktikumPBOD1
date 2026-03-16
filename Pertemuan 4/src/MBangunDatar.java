public class MBangunDatar {
    public static void main(String[] args) {
        Persegi p1 = new Persegi(5.0, "Merah", "Hitam");

        Lingkaran l1 = new Lingkaran(7.0, "Biru", "Putih");

        System.out.println("===Persegi===");
        System.out.println("Luas Persegi: " + p1.getLuas());
        System.out.println("Keliling Persegi: " + p1.getKeliling());
        System.out.println("Diagonal Persegi: " + p1.getDiagonal());
        p1.printInfo();
        System.out.println();

        System.out.println("===Lingkaran===");
        System.out.println("Luas Lingkaran: " + l1.getLuas());
        System.out.println("Keliling Lingkaran: " + l1.getKeliling());
        l1.printInfo();
        System.out.println();

        BangunDatar.printCounterBangunDatar();

        /* Bagian 1
        Apakah konstruktor berparameter pada kelas persegi dapat direalisasikan seperti berikut? Mengapa?
        public Persegi(double sisi, String warna, String border){
            this.jmlSisi = 4;
            this.warna = warna;
            this.border = border;
            this.sisi = sisi;
        } 
        tidak bisa karena atribut-atribut tersebut di class bangun datar masih private sehingga tidak bisa diakses
        langsung oleh subclass persegi

        Bagian 3
        Coba lakukan overriding pada method printCounterBangunDatar(). Bagaimana hasilnya?
        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterBangunDatar();

        Hasil percobaan menunjukkan bahwa method static tidak mengalami overriding seperti instance method, 
        melainkan method hiding. Karena itu, method yang dipanggil ditentukan oleh class yang memanggilnya.

        Bagian 4
        Modifikasilah atribut class BangunDatar dengan access modifier protected. Setelah modifikasi
        tersebut, apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
        Mengapa? 
    
        public Persegi(double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
        }
        Konstruktor tersebut dapat direalisasikan setelah atribut superclass diubah menjadi protected, karena access
        modifier protected memberikan hak akses kepada subclass untuk mengakses atribut superclass secara langsung.
    
        Bagian 5
        Lakukan eksperimen penggunaan keyword final seperti berikut:

        1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
        Persegi dan Lingkaran?

        Penambahan keyword final pada class BangunDatar menyebabkan class tersebut tidak dapat dijadikan superclass, sehingga 
        Persegi dan Lingkaran tidak dapat mewarisinya dan program akan menghasilkan error.

        2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada
        method printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method
        printInfo() pada kelas Persegi dan Lingkaran?

        Jika printInfo() pada BangunDatar diberi keyword final, maka Persegi dan Lingkaran tidak boleh lagi membuat override terhadap method tersebut


        */
    }
}

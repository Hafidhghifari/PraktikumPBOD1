/* * Nama File    : MTitik.java
 * Deskripsi    : berisi class utama untuk menjalankan Titik
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 24 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        T1.printTitik();        // mencetak koordinat T1 ke layar

        T1.setAbsis(3);         // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);       // mengubah ordinat T1 dengan nilai 4
        T1.printTitik();        // mencetak koordinat T1 ke layar

        T1.geser(3, 4);         // menggeser T1 sejauh (3,4)
        T1.printTitik();        // menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;    
        System.out.println("\nObject Reference");
        T2.printTitik();

        T1.setAbsis(10);
        T1.setOrdinat(10);

        System.out.println("T1 Setelah diubah:");
        T1.printTitik();

        System.out.println("T2 Setelah T1 diubah:");
        T2.printTitik();

        Titik T3 = new Titik(5, 5);
        System.out.println("\nOverloading Constructor:");
        T3.printTitik();

        System.out.println("\nJumlah objek Titik = " + Titik.getCounterTitik());

        System.out.println("\nMethod tambahan:");
        System.out.println("Kuadran T3 = " + T3.getKuadran());
        System.out.println("Jarak T3 ke pusat = " + T3.getJarakPusat());
        System.out.println("Jarak T1 ke T3 = " + T1.getJarak(T3));

        System.out.println("Refleksi X dari T3:");
        Titik RX = T3.getRefleksiX();
        RX.printTitik();

        System.out.println("Refleksi Y dari T3:");
        Titik RY = T3.getRefleksiY();
        RY.printTitik();

        System.out.println("T3 direfleksi terhadap sumbu X:");
        T3.refleksiX();
        T3.printTitik();
    }
}

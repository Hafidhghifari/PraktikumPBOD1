/*
 * File         : Main.java
 * Deskripsi    : Main class untuk menguji penggunaan generik pada class, operator, dan data
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 3 Mei 2026
 */

public class Main {

    public static void main(String[] args) {

        // Kamus Lokal

        Datum<Kucing> d1;
        Datum<Kucing> d2;
        Datum<Anabul> d3;
        Datum<Integer> a, b;
        Datum<String> s1, s2;
        Data<Anabul> kelompokAnabul;
        Data<Kucing> kelompokKucing;

        // Inisialisasi

        d1 = new Datum<>();
        d2 = new Datum<>();
        d3 = new Datum<>();
        a = new Datum<>();
        b = new Datum<>();
        s1 = new Datum<>();
        s2 = new Datum<>();
        kelompokAnabul = new Data<>();
        kelompokKucing = new Data<>();

        // Generik pada Class

        System.out.println("\n=== Bagian I: GENERIK PADA CLASS ===");
        d1.setIsi(new Anggora("Milo", 4.8));
        d2.setIsi(new KembangTelon("Luna", 5.6));
        d3.setIsi(new Burung("Rio"));
        System.out.println(d1.getIsi().toString());
        System.out.println(d2.getIsi().toString());
        System.out.println(d3.getIsi().getNama());

        // Generik pada Operator
        System.out.println("\n=== Bagian II: GENERIK PADA OPERATOR ===");

        // Tukar Integer

        a.setIsi(12);
        b.setIsi(25);
        System.out.println("Integer - Sebelum Tukar: a=" + a.getIsi() + ", b=" + b.getIsi());

        OperatorGenerik.Tukar(a, b);
        System.out.println("Integer - Sesudah Tukar: a=" + a.getIsi() + ", b=" + b.getIsi());

        // Tukar String

        s1.setIsi("PBO");
        s2.setIsi("Generik");

        System.out.println("String - Sebelum Tukar: a=" + s1.getIsi() + ", b=" + s2.getIsi());
        OperatorGenerik.Tukar(s1, s2);
        System.out.println("String - Sesudah Tukar: a=" + s1.getIsi() + ", b=" + s2.getIsi());

        // Tukar Sesama Keluarga Anabul

        System.out.println("Kucing - Sebelum Tukar: a=" + d1.getIsi().getNama() + ", b=" + d2.getIsi().getNama());
        OperatorGenerik.Tukar(d1, d2);
        System.out.println("Kucing - Sesudah Tukar: a=" + d1.getIsi().getNama() + ", b=" + d2.getIsi().getNama());

        // Bobot dari dua kucing

        double totalBobot = OperatorGenerik.Bobot2(
                d1.getIsi(),
                d2.getIsi());
        System.out.println(
                "Total bobot " + d1.getIsi().getNama() + " dan " + d2.getIsi().getNama() + ": " + totalBobot + " kg");

        // Generik pada Data

        System.out.println("\n=== Bagian III: GENERIK PADA DATA ===");
        kelompokAnabul.setIsi(1, new Anggora("Nala", 3.9));
        kelompokAnabul.setIsi(2, new KembangTelon("Oren", 4.4));
        kelompokAnabul.setIsi(3, new Anjing("Bruno"));
        kelompokAnabul.setIsi(4, new Burung("Kiki"));

        System.out.println("Isi Data (Anabul) di posisi 1: " + kelompokAnabul.getIsi(1));
        System.out.println("Isi Data (Anabul) di posisi 2: " + kelompokAnabul.getIsi(2));
        System.out.println("Isi Data (Anabul) di posisi 3: " + kelompokAnabul.getIsi(3).getNama());
        System.out.println("Isi Data (Anabul) di posisi 4: " + kelompokAnabul.getIsi(4).getNama());
        System.out.println("Total isi Data Anabul: " + kelompokAnabul.getSize());
        
        kelompokKucing.setIsi(1, new Anggora("Coco", 5.1));
        kelompokKucing.setIsi(2, new KembangTelon("Mochi", 4.7));
        System.out.println("\nIsi Data (Kucing) di posisi 1: " + kelompokKucing.getIsi(1));
        System.out.println("Isi Data (Kucing) di posisi 2: " + kelompokKucing.getIsi(2));
        System.out.println("Total isi Data Kucing: " + kelompokKucing.getSize());

        // Bobot dari dua kucing di Data

        double totalBobotKucing = OperatorGenerik.Bobot2(
                kelompokKucing.getIsi(1),
                kelompokKucing.getIsi(2));
        System.out.println("Total bobot kucing di Data: " + totalBobotKucing + " kg");
        
    }

}

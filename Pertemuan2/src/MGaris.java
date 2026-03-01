/*
 * Nama File    : MGaris.java
 * Deskripsi    : Main class class Garis
 * Pembuat      : Muhammad Hafidh Al Ghifari
 * Tanggal      : 1 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik A = new Titik(0, 0);
        Titik B = new Titik(4, 4);
        Garis G1 = new Garis(A, B);

        Titik C = new Titik(1, 2);
        Titik D = new Titik(5, 6);
        Garis G2 = new Garis(C, D);

        Titik E = new Titik(0, 4);
        Titik F = new Titik(4, 0);
        Garis G3 = new Garis(E, F);

        System.out.println("GARIS G1");
        G1.printGaris();
        System.out.println("Panjang G1 = " + G1.getPanjang());
        System.out.println("Gradien G1 = " + G1.getGradien());
        System.out.print("Titik tengah G1 = ");
        G1.getTitikTengah().printTitik();
        System.out.println("Persamaan G1 = " + G1.getPersamaanGaris());

        System.out.println("\nGARIS G2");
        G2.printGaris();
        System.out.println("Panjang G2 = " + G2.getPanjang());
        System.out.println("Gradien G2 = " + G2.getGradien());
        System.out.println("Persamaan G2 = " + G2.getPersamaanGaris());

        System.out.println("\nGARIS G3");
        G3.printGaris();
        System.out.println("Gradien G3 = " + G3.getGradien());
        System.out.println("Persamaan G3 = " + G3.getPersamaanGaris());

        System.out.println("\nPENGECEKAN");
        System.out.println("G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("G1 tegak lurus G3? " + G1.isTegakLurus(G3));

        System.out.println("\nJumlah objek Garis = " + Garis.getCounterGaris());
    }
}
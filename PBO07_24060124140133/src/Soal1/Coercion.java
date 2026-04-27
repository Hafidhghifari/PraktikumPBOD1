/*
 * Nama File   : Coersion.java
 * Deskripsi   : Berisi atribut dan method dalam class Coersion
 * Pembuat     : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal     : 26 April 2026
 */

package Soal1;
public class Coercion {
    public static void main(String[] args) {
        // 1.a
        int nilai = 65;

        System.out.println("Integer: " + nilai);
        System.out.println("Char: " + (char) nilai);
        System.out.println("Double: " + (double) nilai);
        
        // 1.b
        int nilaiInt = 67;
        double nilaiReal = (double) nilaiInt;
        int nilaiIntBaru = (int) nilaiReal;
        System.out.println("Integer awal: " + nilaiInt);
        System.out.println("Jadi real: " + nilaiReal);
        System.out.println("Balik ke int: " + nilaiIntBaru);

        // 1.c
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("X = " + X + ", Y = " + Y);
        System.out.println("S (konkatenasi) = " + S);
        System.out.println("Z (penjumlahan) = " + Z);

        // 1.d
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("P = " + P + ", Q = " + Q);
        System.out.println("R (konkatenasi) = " + R);
        System.out.println("D (penjumlahan) = " + D);

        // 1.e
        Integer A = Integer.parseInt(S);
        System.out.println("A (konversi dari S) = " + A);

        // 1.f
        String T = Integer.toString(A);
        System.out.println("T (konversi dari A) = " + T);
    }
}

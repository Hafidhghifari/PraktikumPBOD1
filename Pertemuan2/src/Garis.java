/*
 * Nama File    : Garis.java
 * Deskripsi    : Class Garis dengan atribut titik awal dan titik akhir
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 1 Maret 2026
 */

public class Garis {
    /*************** ATRIBUT ***************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;
    /*************** METHOD ****************/
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    /*************** GETTER ***************/
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    /*************** SETTER ***************/
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }


    // panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // gradien garis
    public double getGradien() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        if (x2 - x1 == 0) {
            return Double.POSITIVE_INFINITY; 
        }

        return (y2 - y1) / (x2 - x1);
    }

    // titik tengah
    public Titik getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    // cek sejajar
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // cek tegak lurus
    public boolean isTegakLurus(Garis G) {
        double m1 = this.getGradien();
        double m2 = G.getGradien();

        
        if ((m1 == Double.POSITIVE_INFINITY && m2 == 0) ||
            (m2 == Double.POSITIVE_INFINITY && m1 == 0)) {
            return true;
        }

        return m1 * m2 == -1;
    }

    // print garis
    public void printGaris() {
        System.out.print("Garis: ");
        titikAwal.printTitik();
        System.out.print("       ");
        titikAkhir.printTitik();
    }

    // persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();

    
        if (m == Double.POSITIVE_INFINITY) {
            return "x = " + titikAwal.getAbsis();
        }

        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double c = y1 - (m * x1);

        if (c > 0) {
            return "y = " + m + "x + " + c;
        } else if (c < 0) {
            return "y = " + m + "x - " + Math.abs(c);
        } else {
            return "y = " + m + "x";
        }
    }
}

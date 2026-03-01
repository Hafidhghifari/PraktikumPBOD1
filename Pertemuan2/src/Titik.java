/* 
 * Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Muhammad Hafidh Al-Ghifari
 * Tanggal      : 24 Februari 2026
 */

public class Titik {
    /*************** ATRIBUT ***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0; 

    /*************** METHOD ****************/
    // konstruktor untuk membuat titik (0,0)
    public Titik (double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    public Titik() {
        this(0,0);

    }
    //mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
    // mencetak nilai counterTitik
    public void printCounterTitik() {
        System.out.println(this.counterTitik);
    }
    // mengembalikan nilai kuadran dari titik
    public int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        }
        else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        }
        else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        }
        else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        }
        else {
            return 0;
        }
    }
    
    // mengembalikan jarak titik ke pusat koordinat (0,0)
    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // mengembalikan jarak titik ke titik T
    public double getJarak(Titik T) {
        double deltaX = this.absis - T.getAbsis();
        double deltaY = this.ordinat - T.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // merefleksikan titik terhadap sumbu X
    public void refleksiX() {
    this.ordinat = -this.ordinat;
    }

    // merefleksikan titik terhadap sumbu Y
    public void refleksiY() {
    this.absis = -this.absis;
    }

    // mengembalikan objek Titik baru yang merupakan hasil refleksi terhadap sumbu X
    public Titik getRefleksiX() {
    return new Titik(absis, -ordinat);
    }

    // mengembalikan objek Titik baru yang merupakan hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
    return new Titik(-absis, ordinat);
    }
    
} // end class Titik

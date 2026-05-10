/*
 * File         : MTeman.java
 * Pembuat      : Muhammad Hafidh Al-Ghifari / 24060124140133
 * Tanggal      : 10 Mei 2026
 */

public class MTeman {
    public static void main(String[] args) {

        Teman t = new Teman();

        t.addNama("Budi");
        t.addNama("Ani");
        t.addNama("Citra");
        t.addNama("Budi"); 

        t.showTeman();

        System.out.println("Jumlah teman: " + t.getNbelm()); 

        System.out.println("Indeks ke-1: " + t.getNama(1)); 

        t.setNama("Dewi", 1);
        System.out.println("Setelah setNama: " + t.getNama(1)); 

        System.out.println("Apakah Citra ada? " + t.isMember("Citra")); 
        System.out.println("Apakah Ani ada? " + t.isMember("Ani"));     

        t.gantiNama("Citra", "Clara");
        t.showTeman();

        // h. countNama
        System.out.println("Budi muncul: " + t.countNama("Budi") + "x"); 

        t.delNama("Budi"); 
        t.showTeman();
    }
}
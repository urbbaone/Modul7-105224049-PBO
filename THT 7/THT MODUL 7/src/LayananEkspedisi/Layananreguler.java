// File: Layananreguler.java
package LayananEkspedisi;

public class Layananreguler extends Layananekspedisi {
    public Layananreguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // Cara 1: Hitung ongkir standar (Rp15.000/Kg)
    @Override
    public double hitungOngkir() {
        return hitungBeratEfektif() * 15000;
    }

    // Cara 2 (Overloading): Hitung ongkir kalau ada diskon member dan biaya jarak
    public double hitungOngkir(boolean isMember, int jarakKm) {
        double tarifDasar = hitungOngkir();
        double tarifSetelahDiskon = isMember ? (tarifDasar * 0.90) : tarifDasar; // Diskon 10% buat member
        double surcharge = 500.0 * jarakKm; // Tambahan biaya jarak
        return tarifSetelahDiskon + surcharge;
    }
}
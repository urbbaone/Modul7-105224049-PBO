// File: Layananexpress.java
package LayananEkspedisi;

public class Layananexpress extends Layananekspedisi {
    // Panggil constructor dari induknya biar gak ngetik ulang
    public Layananexpress(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // Override ongkir: khusus express, tarifnya Rp30.000 per Kg
    @Override
    public double hitungOngkir() {
        return hitungBeratEfektif() * 30000;
    }

    // Fitur tambahan: ngecek klaim asuransi berdasarkan nilai barang
    public void klaimAsuransi(double nilaiBarang) {
        if (nilaiBarang > 1000000) {
            System.out.printf("Klaim Asuransi VIP Rp%.0f untuk resi %s sedang diproses prioritas.\n", nilaiBarang, nomorResi);
        } else {
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja.");
        }
    }
}
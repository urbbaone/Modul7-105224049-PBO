// File: Layananinternasional.java
package LayananEkspedisi;

public class Layananinternasional extends Layananekspedisi {
    private String negaraTujuan;
    private double nilaiBarangUSD;

    // Constructor plus input tambahan buat negara dan nilai barangnya
    public Layananinternasional(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    // Hitung ongkir inter: Rp200.000 per Kg + Pajak 20% kalo harga barang di atas $50
    @Override
    public double hitungOngkir() {
        double ongkirDasar = hitungBeratEfektif() * 200000;
        double pajak = (nilaiBarangUSD > 50) ? (ongkirDasar * 0.20) : 0;
        return ongkirDasar + pajak;
    }

    // Method unik buat nampilin daftar manifest internasional
    public void cetakManifest() {
        System.out.printf("Manifest Internasional ke %s - Deklarasi Nilai: $%.2f\n", negaraTujuan, nilaiBarangUSD);
    }
}
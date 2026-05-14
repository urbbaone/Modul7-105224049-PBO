// File: Layananekspedisi.java
package LayananEkspedisi;

public class Layananekspedisi {
    // Variabel buat simpan data dasar paket kayak nomor resi dan dimensinya
    protected String nomorResi;
    protected double beratAktualKg, panjang, lebar, tinggi;

    // Constructor buat masukin data paket pas pertama kali dibuat
    public Layananekspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Fungsi buat bandingin berat asli vs berat volume, diambil mana yang paling berat
    public double hitungBeratEfektif() {
        double beratVolumetrik = (panjang * lebar * tinggi) / 6000;
        return Math.max(beratAktualKg, beratVolumetrik);
    }

    // Buat nampilin informasi dasar resi di layar
    public void cetakResi() {
        System.out.println("==========================================");
        System.out.println("Nomor Resi          : " + nomorResi);
        System.out.printf("Berat Efektif       : %.2f Kg\n", hitungBeratEfektif());
        System.out.println("==========================================");
    }

    // Method dasar hitung ongkir, nanti bakal di-override sama kelas anaknya
    public double hitungOngkir() {
        return 0.0;
    }
}
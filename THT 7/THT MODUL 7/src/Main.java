// File: Main.java
import LayananEkspedisi.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Bikin list buat nampung semua jenis layanan (Layananekspedisi)
        ArrayList<Layananekspedisi> daftarLayanan = new ArrayList<>();

        // Masukin data paket reguler, express, dan internasional ke list
        daftarLayanan.add(new Layananreguler("REG-11", 2, 50, 50, 50));
        daftarLayanan.add(new Layananexpress("EXP-22", 5, 10, 10, 10));
        daftarLayanan.add(new Layananinternasional("INT-33", 3, 20, 20, 20, "Korea", 100));

        double totalPendapatanPerusahaan = 0.0;

        // Looping buat ngeproses setiap paket di dalam list
        for (Layananekspedisi layanan : daftarLayanan) {
            layanan.cetakResi(); // Nampilin resi
            double ongkirDasar = layanan.hitungOngkir(); // Hitung ongkir masing-masing
            totalPendapatanPerusahaan += ongkirDasar;
            System.out.printf("Ongkir Dasar    : Rp%.2f\n", ongkirDasar);

            // Cek tipe layanan pakai 'instanceof' buat panggil fungsi spesifik tiap kelas
            if (layanan instanceof Layananreguler reguler) {
                // Khusus reguler, kita coba hitung pakai tarif member dan jarak
                double hargaMember = reguler.hitungOngkir(true, 25);
                System.out.printf("[REGULER] Harga Member (diskon 10%% + jarak 25km): Rp%.2f\n", hargaMember);
            } else if (layanan instanceof Layananexpress express) {
                // Khusus express, panggil fungsi klaim asuransi
                express.klaimAsuransi(1500000);
            } else if (layanan instanceof Layananinternasional internasional) {
                // Khusus internasional, panggil cetak manifest
                internasional.cetakManifest();
            }
            System.out.println();
        }

        // Output akhir total pendapatan dari semua paket
        System.out.println("=====================================================");
        System.out.printf("TOTAL PENDAPATAN KESELURUHAN PERUSAHAAN: Rp%.2f\n", totalPendapatanPerusahaan);
        System.out.println("=====================================================");
    }
}







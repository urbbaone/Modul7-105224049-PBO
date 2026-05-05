public class KartuKredit extends MetodePembayaran {
    @Override
    public void bayar(double nominal) {
        System.out.println("Mencetak tagihan Kartu Kredit sebesar Rp" + nominal + "...");
    }

    // Metode spesifik KartuKredit
    public void verifikasiPIN() {
        System.out.println("Memverifikasi PIN Kartu Kredit... BERHASIL!");
    }
}
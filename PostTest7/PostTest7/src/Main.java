import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList dengan konsep Upcasting
        ArrayList<MetodePembayaran> daftarPembayaran = new ArrayList<>();

        // Memasukkan objek ke dalam array
        daftarPembayaran.add(new EWallet());
        daftarPembayaran.add(new KartuKredit());

        System.out.println("=== PROSES PEMBAYARAN ===");

        // Menggunakan perulangan (looping) untuk menelusuri array
        for (MetodePembayaran m : daftarPembayaran) {
            // Memanggil metode bayar (Demonstrasi Runtime Polymorphism)
            m.bayar(100000);

            // Cek jika objek adalah EWallet (Downcasting untuk Overloading)
            if (m instanceof EWallet) {
                EWallet ew = (EWallet) m;
                ew.bayar(100000, "085218934004");
            } 
            // Cek jika objek adalah KartuKredit (Downcasting untuk metode spesifik)
            else if (m instanceof KartuKredit) {
                KartuKredit kk = (KartuKredit) m;
                kk.verifikasiPIN();
            }
            System.out.println("-------------------------");
        }
    }
}
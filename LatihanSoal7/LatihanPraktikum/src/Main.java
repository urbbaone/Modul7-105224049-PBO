import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // --- JAWABAN SOAL 3 ---
        // Koleksi menggunakan Upcasting (PerangkatPintar sebagai referensi)
        ArrayList<PerangkatPintar> daftarPerangkat = new ArrayList<>();
        daftarPerangkat.add(new LampuPintar());
        daftarPerangkat.add(new AcPintar());

        System.out.println("=== STATUS AKTIVASI PERANGKAT (Soal 3) ===");
        for (PerangkatPintar perangkat : daftarPerangkat) {
            // Polymorphism: Memanggil aktifkan() sesuai objek aslinya
            perangkat.aktifkan(); 

            // --- JAWABAN SOAL 4 ---
            // Menggunakan instanceof untuk deteksi AC dan Downcasting
            if (perangkat instanceof AcPintar) {
                AcPintar ac = (AcPintar) perangkat;
                ac.aturSuhu(20);
            }
        }

        System.out.println("\n=== PERBAIKAN KODE JUNIOR (Soal 5) ===");
        // --- JAWABAN SOAL 5 ---
        PerangkatPintar alat1 = new LampuPintar();
        
        // Perbaikan: Melakukan Downcasting agar metode aturKecerahan bisa terpanggil
        if (alat1 instanceof LampuPintar) {
            LampuPintar lampu = (LampuPintar) alat1;
            lampu.aturKecerahan(75, "Putih");
        }
    }
}


//==========Analisis Soal 3: Kenapa pesan yang muncul berbeda?============
//  Meskipun variabelnya bertipe sama (PerangkatPintar), pesan yang muncul berbeda karena adanya Dynamic Method Binding (atau Runtime Polymorphism). 
//Di Java, saat program berjalan, sistem tidak melihat tipe variabelnya, melainkan melihat objek aslinya di memori. 
//Karena objek yang kita buat adalah LampuPintar dan AcPintar, maka metode yang dijalankan adalah hasil override dari masing-masing kelas tersebut.



//==========Analisis Soal 5: Kenapa muncul error "Cannot find symbol"?===============
//Penyebab: Java Compiler bekerja dengan mengecek tipe referensi variabel. Karena alat1 dideklarasikan sebagai PerangkatPintar, kompilator hanya akan mencari metode yang ada di dalam kelas PerangkatPintar. 
//          Metode aturKecerahan tidak ada di kelas induk, sehingga dianggap tidak ditemukan.

//Cara Memperbaiki: Kamu harus melakukan Downcasting secara eksplisit agar kompilator tahu bahwa alat1 adalah sebuah LampuPintar.

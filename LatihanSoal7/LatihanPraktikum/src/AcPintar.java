public class AcPintar extends PerangkatPintar {
    @Override
    public void aktifkan() {
        System.out.println("AC menyala dan mulai mendinginkan ruangan.");
    }

    // Metode unik untuk Soal 4
    public void aturSuhu(int suhu) {
        System.out.println("Suhu ruangan diatur menjadi " + suhu + " derajat.");
    }
}
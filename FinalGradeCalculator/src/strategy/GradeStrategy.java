package strategy;

/**
 * Interface {@code GradeStrategy} mendefinisikan kontrak
 * untuk berbagai strategi perhitungan nilai akhir mahasiswa.
 * 
 * <p>
 * Pola desain <b>Strategy</b> digunakan untuk memisahkan logika perhitungan nilai
 * dari kelas utama, sehingga memudahkan penggantian algoritma perhitungan
 * tanpa perlu memodifikasi kode inti.
 * </p>
 * 
 * <p>
 * Contoh implementasi dapat dilihat pada:
 * {@link strategy.StandardGradeStrategy}
 * </p>
 * 
 * @author Monica Hardi
 * @version 1.0
 */
public interface GradeStrategy {

    /**
     * Menghitung nilai akhir berdasarkan nilai tugas, UTS, dan UAS.
     * 
     * @param assignment nilai tugas mahasiswa
     * @param mid nilai ujian tengah semester (UTS)
     * @param fin nilai ujian akhir semester (UAS)
     * @return nilai akhir mahasiswa setelah dihitung menggunakan strategi tertentu
     */
    double calculate(double assignment, double mid, double fin);
}

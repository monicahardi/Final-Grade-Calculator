import model.Student;
import service.GradeCalculator;
import strategy.StandardGradeStrategy;

/**
 * Kelas utama {@code Main} berfungsi sebagai titik masuk program.
 * 
 * <p>Program ini menghitung nilai akhir mahasiswa berdasarkan
 * bobot penilaian yang ditentukan oleh {@link StandardGradeStrategy}.</p>
 * 
 * @author Monica Hardi
 * @version 1.0
 */

public class Main {
   /**
     * Metode utama untuk menjalankan program perhitungan nilai.
     * 
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        // Membuat data mahasiswa
        Student student = new Student("Monica Hardi", 85, 78, 90);

        // Membuat kalkulator nilai dengan strategi perhitungan standar
        GradeCalculator calculator = new GradeCalculator(new StandardGradeStrategy());

        // Menghitung nilai akhir
        double finalGrade = calculator.calculateFinalGrade(student);

        // Menentukan status kelulusan
        String status = calculator.getStatus(finalGrade);

        // Menampilkan hasil
        System.out.println("=== HASIL NILAI MAHASISWA ===");
        System.out.println("Nama Mahasiswa : " + student.getName());
        System.out.println("Nilai Akhir    : " + String.format("%.2f", finalGrade));
        System.out.println("Status         : " + status);
        System.out.println("==============================");
    } 
}

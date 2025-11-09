package service;

import model.Student;
import strategy.GradeStrategy;

/**
 * Kelas {@code GradeCalculator} bertanggung jawab untuk
 * menghitung nilai akhir mahasiswa dan menentukan status kelulusan.
 * 
 * <p>
 * Kelas ini menerapkan pola desain <b>Strategy</b>, yang memungkinkan
 * berbagai cara perhitungan nilai dapat diterapkan secara fleksibel
 * tanpa mengubah kode utama.
 * </p>
 * 
 * Contoh strategi perhitungan dapat ditemukan pada:
 * {@link strategy.StandardGradeStrategy}
 * 
 * @author Monica Hardi
 * @version 1.0
 */
public class GradeCalculator {
    private GradeStrategy strategy;

    /**
     * Membuat objek {@code GradeCalculator} dengan strategi tertentu.
     * 
     * @param strategy strategi perhitungan nilai
     */
    public GradeCalculator(GradeStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Menghitung nilai akhir mahasiswa berdasarkan strategi yang digunakan.
     * 
     * @param student objek mahasiswa yang akan dihitung nilainya
     * @return nilai akhir mahasiswa
     */
    public double calculateFinalGrade(Student student) {
        return strategy.calculate(
            student.getAssignmentScore(),
            student.getMidExamScore(),
            student.getFinalExamScore()
        );
    }

    /**
     * Menentukan status kelulusan mahasiswa berdasarkan nilai akhir.
     * 
     * @param finalGrade nilai akhir mahasiswa
     * @return "Lulus" jika nilai akhir ≥ 60, selain itu "Tidak Lulus"
     */
    public String getStatus(double finalGrade) {
        return finalGrade >= 60 ? "Lulus" : "Tidak Lulus";
    }
}
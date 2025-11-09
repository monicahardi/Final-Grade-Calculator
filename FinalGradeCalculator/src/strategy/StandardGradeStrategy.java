package strategy;

/**
 * Implementasi standar dari {@link GradeStrategy}
 * dengan bobot tetap:
 * <ul>
 *   <li>Tugas = 30%</li>
 *   <li>UTS = 30%</li>
 *   <li>UAS = 40%</li>
 * </ul>
 * 
 * <p>Pola ini memudahkan perubahan strategi tanpa
 * harus mengubah kelas utama.</p>
 * 
 * @see GradeStrategy
 * @version 1.1
 */
public class StandardGradeStrategy implements GradeStrategy {

    private static final double ASSIGNMENT_WEIGHT = 0.3;
    private static final double MID_WEIGHT = 0.3;
    private static final double FINAL_WEIGHT = 0.4;

    /**
     * Konstruktor default untuk {@code StandardGradeStrategy}.
     * <p>Tidak membutuhkan parameter karena bobot sudah ditetapkan.</p>
     */
    public StandardGradeStrategy() {
        // Konstruktor default
    }

    /**
     * Menghitung nilai akhir berdasarkan bobot standar.
     *
     * @param assignment nilai tugas
     * @param mid nilai UTS
     * @param fin nilai UAS
     * @return nilai akhir mahasiswa
     */
    @Override
    public double calculate(double assignment, double mid, double fin) {
        return (assignment * ASSIGNMENT_WEIGHT)
             + (mid * MID_WEIGHT)
             + (fin * FINAL_WEIGHT);
    }
}
    
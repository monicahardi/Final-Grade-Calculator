package model;

/**
 * Kelas {@code Student} merepresentasikan data mahasiswa
 * yang memiliki nama dan nilai dari beberapa komponen penilaian.
 * <p>
 * Komponen nilai meliputi:
 * <ul>
 *   <li>Nilai Tugas</li>
 *   <li>Nilai UTS</li>
 *   <li>Nilai UAS</li>
 * </ul>
 * 
 * Kelas ini digunakan untuk menyimpan data mahasiswa yang kemudian
 * akan diproses oleh kelas layanan untuk menghitung nilai akhir.
 * 
 * @author Monica Hardi
 * @version 1.0
 */
public class Student {
    private String name;
    private double assignmentScore;
    private double midExamScore;
    private double finalExamScore;

    /**
     * Konstruktor untuk membuat objek mahasiswa baru.
     * 
     * @param name nama mahasiswa
     * @param assignmentScore nilai tugas mahasiswa
     * @param midExamScore nilai UTS mahasiswa
     * @param finalExamScore nilai UAS mahasiswa
     */
    public Student(String name, double assignmentScore, double midExamScore, double finalExamScore) {
        this.name = name;
        this.assignmentScore = assignmentScore;
        this.midExamScore = midExamScore;
        this.finalExamScore = finalExamScore;
    }

    /**
     * Mengembalikan nama mahasiswa.
     * 
     * @return nama mahasiswa
     */
    public String getName() {
        return name;
    }

    /**
     * Mengembalikan nilai tugas mahasiswa.
     * 
     * @return nilai tugas mahasiswa
     */
    public double getAssignmentScore() {
        return assignmentScore;
    }

    /**
     * Mengembalikan nilai UTS mahasiswa.
     * 
     * @return nilai UTS mahasiswa
     */
    public double getMidExamScore() {
        return midExamScore;
    }

    /**
     * Mengembalikan nilai UAS mahasiswa.
     * 
     * @return nilai UAS mahasiswa
     */
    public double getFinalExamScore() {
        return finalExamScore;
    }
}

public class StudentGrader {

    public double calculateGrade(String type, double score) {

        if ("TUGAS".equals(type)) {
            return score * 0.3;

        } else if ("UTS".equals(type)) {
            return score * 0.3;

        } else if ("UAS".equals(type)) {
            return score * 0.4;

        } else {
            throw new IllegalArgumentException(
                "Tipe penilaian tidak dikenali"
            );
        }
    }

    public static void main(String[] args) {

        StudentGrader grader = new StudentGrader();

        System.out.println(
            grader.calculateGrade("UAS", 90)
        );
    }
}
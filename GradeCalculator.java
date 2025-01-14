public class GradeCalculator {
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        int[] scores = {95, 82, 74, 59, 100, 67};
        System.out.println("Grades for the given scores:");
        for (int score : scores) {
            System.out.println("Score: " + score + " -> Grade: " + calculateGrade(score));
        }
    }
}

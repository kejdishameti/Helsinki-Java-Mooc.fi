
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradePoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradePoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.gradePoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        int sum = 0;
        double avg = 0;
        if (grades.isEmpty()) {
            return -1;
        } else {
            int totalNumberOfGrades = grades.size();

            for (int grade : grades) {
                sum = sum + grade;
            }
            avg = 1.0 * sum / totalNumberOfGrades;
        }
        return avg;
    }

    public double averageOfPoints() {
        int sum = 0;
        double avg = 0;
        if (gradePoints.isEmpty()) {
            avg = -1;
        } else {
            int totalNumOfGrades = gradePoints.size();

            for (int point : gradePoints) {
                sum = sum + point;
            }
            avg = 1.0 * sum / totalNumOfGrades;
        }
        return avg;
    }
}

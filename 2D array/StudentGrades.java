import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int subjects = sc.nextInt();

        int[][] grades = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                grades[i][j] = sc.nextInt();
            }
        }

        System.out.println("Student Averages:");
        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < subjects; j++) {
                sum += grades[i][j];
            }
            double avg = (double) sum / subjects;
            System.out.printf("Student %d: %.2f\n", i + 1, avg * 100);
        }

        System.out.println("\nSubject Averages:");
        for (int j = 0; j < subjects; j++) {
            int sum = 0;
            for (int i = 0; i < students; i++) {
                sum += grades[i][j];
            }
            double avg = (double) sum / students;
            System.out.printf("Subject %d: %.2f\n", j + 1, avg * 100);
        }
    }
}

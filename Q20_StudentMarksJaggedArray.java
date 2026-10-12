import java.util.Scanner;

public class Q20_StudentMarksJaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        if (students <= 0) {
            System.out.println("Number of students must be positive.");
        } else {
            int[][] marks = new int[students][];
            for (int i = 0; i < students; i++) {
                System.out.print("How many subjects for student " + (i + 1) + "? ");
                int subjects = sc.nextInt();
                if (subjects <= 0) {
                    System.out.println("Subject count must be positive. Using 1 subject.");
                    subjects = 1;
                }
                marks[i] = new int[subjects];
                for (int j = 0; j < subjects; j++) {
                    System.out.print("Enter mark for subject " + (j + 1) + ": ");
                    marks[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < students; i++) {
                System.out.print("Student " + (i + 1) + " marks: ");
                for (int mark : marks[i]) System.out.print(mark + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}
